package com.vedait.hospitalmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name ="Doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorEntity {
	@Id
	@Column(name = "DOCTOR_ID")
	private Integer doctor_id;
	@Column(name= "DOCTOR_NAME")
	private String doctor_name;
	@Column(name="DOCTOR_PHNO")
	private String doctor_phno;
	@Column(name="DOCTOR_SPECIALIZATION")
	private String doctor_specialization;
	

}
