package com.mytion.vaccination.service;

import java.util.List;

import com.mytion.vaccination.model.entity.VaccinationEvent;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.mytion.vaccination.model.entity.VaccinationEvent;
import com.mytion.vaccination.service.VaccinationEventService;
import com.mytion.vaccination.dao.VaccinationEventRepository;

@Service
public class VaccinationEventServiceImpl  implements VaccinationEventService{

	private final VaccinationEventRepository vaccinationEventRepository;

	@Autowired
	public VaccinationEventServiceImpl(VaccinationEventRepository vaccinationEventRepository){
		this.vaccinationEventRepository = vaccinationEventRepository;
	}

	@Override
	public VaccinationEvent register(VaccinationEvent vaccinationEvent){
		return this.vaccinationEventRepository.save(vaccinationEvent);
	}
	@Override
	public List<VaccinationEvent> getAll(){
		return this.vaccinationEventRepository.findAll();
	}
}