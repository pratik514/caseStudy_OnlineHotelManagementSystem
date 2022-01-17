package com.Guest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GuestMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestMicroserviceApplication.class, args);
	}

}
