package com.vehicle.search.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleRest 
{
   @GetMapping("/vehicle")
   public String getVehicle()
   {
	   return "Your Vehicle is Ready To Start";
   }
}
