package com.springboot.fullstack.demo.bikeregistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.fullstack.demo.bikeregistration.models.BikeRegistration;

public interface BikeRegistrationRepository extends JpaRepository<BikeRegistration, Long>{

}
