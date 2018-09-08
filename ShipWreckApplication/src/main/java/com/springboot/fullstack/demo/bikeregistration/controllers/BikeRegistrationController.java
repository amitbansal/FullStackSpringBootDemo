package com.springboot.fullstack.demo.bikeregistration.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.fullstack.demo.bikeregistration.BikeRegistrationApp;
import com.springboot.fullstack.demo.bikeregistration.models.BikeRegistration;
import com.springboot.fullstack.demo.bikeregistration.repositories.BikeRegistrationRepository;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeRegistrationController {
	@Autowired
	private BikeRegistrationRepository bikeRepository;
	@GetMapping
	public List<BikeRegistration> listBikeRegitrations(){
		//List<BikeRegistration> bikeRegistrations = new ArrayList<>();		
		//return bikeRegistrations;
		return bikeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody BikeRegistration bikeRegistration){
		bikeRepository.save(bikeRegistration);
	}
	
	@GetMapping("/{id}")
	public BikeRegistration get(@PathVariable("id") long id){
		return bikeRepository.getOne(id);
	}
	
}
