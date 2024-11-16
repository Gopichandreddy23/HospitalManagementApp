package com.vedait.hospitalmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
	
	private Integer admin_id;

	private String admin_username;

	private String admin_password;
	
	private String admin_email;
	
	private String admin_role;

}
