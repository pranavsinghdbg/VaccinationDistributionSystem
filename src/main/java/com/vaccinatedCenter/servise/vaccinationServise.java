package com.vaccinatedCenter.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccinatedCenter.repositoryLayer.vaccinationRepo;

@Service
public class vaccinationServise { 

	@Autowired
	private vaccinationRepo vaccinationRepo;
	
	public void addVaccine() {
		
	}
	
	
	
}
