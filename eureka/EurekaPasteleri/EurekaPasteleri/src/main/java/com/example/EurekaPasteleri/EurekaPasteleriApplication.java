package com.example.EurekaPasteleri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaPasteleriApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPasteleriApplication.class, args);
	}

}
