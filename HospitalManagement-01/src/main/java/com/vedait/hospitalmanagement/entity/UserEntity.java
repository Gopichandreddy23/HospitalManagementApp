package com.vedait.hospitalmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	@Id
	@Column(name="USER_ID")
	private Integer user_id;
	@Column(name="USER_NAME")
	private String user_name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ROLE")
	private String role;
}
