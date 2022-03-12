package com.chilton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ChiltonConfigServerApplicationTests {

	
	

		@LocalServerPort
		private int port;

		@Autowired
		private TestRestTemplate restTemplate;

		@Test
		void defaultConfigurationAvailable() {
			ResponseEntity<Environment> entity = restTemplate.getForEntity("http://localhost:" + port + "/application/default", Environment.class);
			assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
			System.out.println(entity.getBody().getPropertySources().get(0).getSource().get("vehicle.greeting"));
			//assertThat(entity.getBody().getPropertySources().get(0).getSource().get("vehicle.greeting")).isEqualTo("Hello Config");
			assertThat(entity.getBody().getPropertySources().get(0).getSource().get("vehicle.greeting")).isEqualTo("Hello from folder application");	
		}
	}


