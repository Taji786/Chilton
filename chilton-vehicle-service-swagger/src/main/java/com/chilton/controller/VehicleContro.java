package com.chilton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chilton.model.Vehicle;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(description ="Vehicle Search Management", name = "VehicleController")
public class VehicleContro
{

	@PostMapping("/search")
	@Operation(summary = "searches the vehicle in chilton")
	public String getVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicle.getVid()+" "+vehicle.getVname()+" "+"From Swagger";
	}
	
	@GetMapping("/getvehicle/{vid}")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200",description = "Successfully found the car by id"),
			@ApiResponse(responseCode = "401",description ="You are not authorized to view the vehicle inventory" ),
			@ApiResponse(responseCode = "403",description = "Accessing the vehicle inventory you were trying to reach is forbidden"),
			@ApiResponse(responseCode = "404",description = "The vehicle detail you were trying to reach is not found"),
	})
	
	public String getVehicle(@PathVariable int vid)
	{
		return "your vehicle with vid "+vid+" "+"is successfull";
	}
	
}
