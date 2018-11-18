package com.mertakl.springboot.webservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.mertakl.springboot.webservice.exception.ResourceNotFoundException;
import com.mertakl.springboot.webservice.model.User;
import com.mertakl.springboot.webservice.payload.UserIdentityAvailability;
import com.mertakl.springboot.webservice.payload.UserProfile;
import com.mertakl.springboot.webservice.payload.UserSummary;
import com.mertakl.springboot.webservice.repository.UserRepository;
import com.mertakl.springboot.webservice.security.CurrentUser;
import com.mertakl.springboot.webservice.security.UserPrincipal;


@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	/**
	 * Created by mertakl 14 Eki 2018 flight-reservation getCurrentUser
	 */
	@GetMapping("/user/me")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
		UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(),
				currentUser.getFirst_name(), currentUser.getLast_name());
		return userSummary;
	}

	/**
	 * Created by mertakl 14 Eki 2018 flight-reservation checkUsernameAvailability
	 */
	@GetMapping("/user/checkUsernameAvailability")
	public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
		Boolean isAvailable = !userRepository.existsByUserName(username);
		return new UserIdentityAvailability(isAvailable);
	}

	/**
	 * Created by mertakl 14 Eki 2018 flight-reservation checkEmailAvailability
	 */
	@GetMapping("/user/checkEmailAvailability")
	public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
		Boolean isAvailable = !userRepository.existsByEmail(email);
		return new UserIdentityAvailability(isAvailable);
	}

	/**
	 * Created by mertakl 14 Eki 2018 flight-reservation getUserProfile
	 */
	@GetMapping("/users/{username}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
		User user = userRepository.findByUserName(username)
				.orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

		UserProfile userProfile = new UserProfile(user.getId(), user.getUserName(), user.getFirstName(),
				user.getLastName(), user.getCreatedAt());

		return userProfile;
	}
	
	@GetMapping("/users")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}