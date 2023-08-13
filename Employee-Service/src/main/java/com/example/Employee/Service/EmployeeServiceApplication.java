package com.example.Employee.Service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeServiceApplication {
	@Bean
	public ModelMapper getModel(){
		return new ModelMapper();
	}
	@Bean
	public RestTemplate getRest(){return new RestTemplate();}
	@Bean
	public WebClient getWeb(){
		return WebClient
				.builder()
				.baseUrl("http://localhost:8081")
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
