package com.vedait.hospitalmanagement.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicaitonConfig {

	@Bean
	GroupedOpenApi api() {
		return GroupedOpenApi.builder().group("doctor").pathsToMatch("/doctor**/**").build();

	}

	@Bean
	GroupedOpenApi api1() {
		return GroupedOpenApi.builder().group("admin").pathsToMatch("/admin**/**").build();

	}
	@Bean
	GroupedOpenApi api2() {
		return GroupedOpenApi.builder().group("user").pathsToMatch("/user**/**").build();
	}
}