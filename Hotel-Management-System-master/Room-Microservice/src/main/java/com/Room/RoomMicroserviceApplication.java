package com.Room;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoomMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceApplication.class, args);
	}

}
