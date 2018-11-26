package com.mertakl.springboot.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mertakl.springboot.webservice.enums.RoleName;
import com.mertakl.springboot.webservice.exception.AppException;
import com.mertakl.springboot.webservice.model.Role;
import com.mertakl.springboot.webservice.model.User;
import com.mertakl.springboot.webservice.payload.ApiResponse;
import com.mertakl.springboot.webservice.payload.JwtAuthenticationResponse;
import com.mertakl.springboot.webservice.payload.LoginRequest;
import com.mertakl.springboot.webservice.payload.SignUpRequest;
import com.mertakl.springboot.webservice.repository.RoleRepository;
import com.mertakl.springboot.webservice.repository.UserRepository;
import com.mertakl.springboot.webservice.security.JwtTokenProvider;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	JwtTokenProvider tokenProvider;

	/**
	 * Created by mertakl 14 Eki 2018
	 */
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

	/**
	 * Created by mertakl 14 Eki 2018
	 */
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
		if (userRepository.existsByUserName(signUpRequest.getUserName())) {
			return new ResponseEntity(new ApiResponse(false, "Username is already taken!"), HttpStatus.BAD_REQUEST);
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"), HttpStatus.BAD_REQUEST);
		}

		// Creating user's account
		User user = new User(signUpRequest.getFirstName(), signUpRequest.getLastName(), signUpRequest.getUserName(),
				signUpRequest.getEmail(), signUpRequest.getPassword());

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		Role userRole = roleRepository.findByName(signUpRequest.getRoles())
				.orElseThrow(() -> new AppException("User Role not set."));

		user.setRoles(Collections.singleton(userRole));

		User result = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{username}")
				.buildAndExpand(result.getUserName()).toUri();

		return ResponseEntity.created(location).body(new ApiResponse(true, "Kullanıcı başarıyla kaydedildi!"));
	}

	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestParam(value = "userId") Long userId) {

		User foundUser = userRepository.findById(userId).get();
		userRepository.delete(foundUser);
		return ResponseEntity.ok("Kullancı başarıyla silindi!");
	}

}