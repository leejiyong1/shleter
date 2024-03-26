package com.animal.shelter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.animal.shelter.mapper")
public class ShelterProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(ShelterProject2Application.class, args);
	}

}
