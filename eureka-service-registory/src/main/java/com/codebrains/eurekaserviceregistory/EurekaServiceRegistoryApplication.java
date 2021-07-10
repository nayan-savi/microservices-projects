package com.codebrains.eurekaserviceregistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistoryApplication.class, args);
	}

}
