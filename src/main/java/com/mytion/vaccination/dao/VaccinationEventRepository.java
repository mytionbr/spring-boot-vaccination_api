package com.mytion.vaccination.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytion.vaccination.model.entity.VaccinationEvent;

public interface VaccinationEventRepository extends JpaRepository<VaccinationEvent, Long>{
	
}
