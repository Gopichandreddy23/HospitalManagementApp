package com.vedait.hospitalmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorModel {
	
	private Integer doctor_id;
	
	private String doctor_name;
	
	private String doctor_phno;

	private String doctor_specialization;
}
