package com.Staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StaffMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffMicroserviceApplication.class, args);
	}

}
