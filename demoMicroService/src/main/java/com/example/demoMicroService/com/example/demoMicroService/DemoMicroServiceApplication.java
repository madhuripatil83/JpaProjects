package com.example.demoMicroService.com.example.demoMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroServiceApplication.class, args);
	}

}
