package com.example.Address.Service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressServiceApplication {
	@Bean
	ModelMapper getModule(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
