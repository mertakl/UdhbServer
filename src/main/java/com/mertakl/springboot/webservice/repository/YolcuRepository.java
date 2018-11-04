package com.mertakl.springboot.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mertakl.springboot.webservice.model.Yolcu;

public interface YolcuRepository extends JpaRepository<Yolcu, Long>{

}
