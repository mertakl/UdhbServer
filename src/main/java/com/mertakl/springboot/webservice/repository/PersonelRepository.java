package com.mertakl.springboot.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mertakl.springboot.webservice.model.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Long> {

	List<Personel> findAllBySeferId(Long seferId);

	@Query("select p from Personel p where p.sefer.id != ?1 OR p.sefer = NULL")
	List<Personel> getAllPersonelWithoutSeferId(Long seferId);

}
