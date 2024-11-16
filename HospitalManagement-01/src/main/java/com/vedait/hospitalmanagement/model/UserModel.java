package com.vedait.hospitalmanagement.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	private Integer user_id;
	
	private String user_name;

	private String email;
	
	private String role;

}
