package com.example.TrainAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class TrainApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainApiGatewayApplication.class, args);
		System.out.println("API gateway");
	}

}
