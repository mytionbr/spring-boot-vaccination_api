package com.mytion.vaccination.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vaccination_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationEvent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "vaccine_name")
	private String vaccineName;
	@Column(name = "user_email")
	private String userEmail;
	@Column(name= "date_event")
	@Type(type = "timestamp")
	private Date dateEvent;
	
}
