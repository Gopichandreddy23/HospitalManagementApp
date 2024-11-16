package com.vedait.hospitalmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ADMIN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminEntity {
	@Id
	@Column(name="ADMIN_ID")
	private Integer admin_id;
	@Column(name="ADMIN_USERNAME")
	private String admin_username;
	@Column(name="ADMIN_PASSWORD")
	private String admin_password;
	@Column(name="Admin_EMAIL")
	private String admin_email;
	@Column(name="ADMIN_ROLE")
	private String admin_role;

}
