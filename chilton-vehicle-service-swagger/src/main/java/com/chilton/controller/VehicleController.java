package com.chilton.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	/*
	 * @Value("${vehicle.greeting}") private String greeting;
	 */

	@GetMapping("/greeting")
	public String getGreeting() {
		return "Hellow from swagger";
	}

}
