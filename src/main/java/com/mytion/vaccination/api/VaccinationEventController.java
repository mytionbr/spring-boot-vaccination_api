package com.mytion.vaccination.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;


import com.mytion.vaccination.model.entity.VaccinationEvent;
import com.mytion.vaccination.service.VaccinationEventService;

@RestController
public class VaccinationEventController extends ApiController {

	private final VaccinationEventService vaccinationEventService;

	@Autowired
	public VaccinationEventController (VaccinationEventService vaccinationEventService){
		this.vaccinationEventService = vaccinationEventService;
	}

	@PostMapping(value="/vaccination")
	public ResponseEntity<VaccinationEvent> registerVaccinationEvent(@RequestBody VaccinationEvent vaccinationEvent){
		VaccinationEvent responseVaccinationEvent = this.vaccinationEventService.register(vaccinationEvent);
		return new ResponseEntity<>(responseVaccinationEvent,HttpStatus.CREATED);
	}

	@GetMapping(value="/vaccination")
	public ResponseEntity<List<VaccinationEvent>> getAllVaccinationEvent(){
		List<VaccinationEvent> responseListVaccinationEvents = this.vaccinationEventService.getAll();
		return new ResponseEntity<>(responseListVaccinationEvents,HttpStatus.OK);
	}
}