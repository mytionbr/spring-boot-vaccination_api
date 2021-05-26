package com.mytion.vaccination.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name = "email",unique = true)
	private String email;
	@Column(name = "cpf", unique = true)
	private String cpf;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "birth_date")
	private Date birthDate;
}
