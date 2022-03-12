package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
public class ChiltonGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChiltonGatewayServiceApplication.class, args);
	}

}
