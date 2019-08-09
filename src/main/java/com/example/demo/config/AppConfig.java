package com.example.demo.config;

import org.springframework.context.annotation.Bean;

import com.example.demo.Employee;


public class AppConfig {

	@Bean
	public Employee employee() {

		return new Employee(101,"Ramesh");
	}
}
