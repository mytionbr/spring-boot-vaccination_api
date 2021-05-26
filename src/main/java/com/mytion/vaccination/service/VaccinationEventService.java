package com.mytion.vaccination.service;

import com.mytion.vaccination.model.entity.VaccinationEvent;
import java.util.List;

public interface VaccinationEventService{

	VaccinationEvent register(VaccinationEvent vaccinationEvent);

	List<VaccinationEvent> getAll();
}