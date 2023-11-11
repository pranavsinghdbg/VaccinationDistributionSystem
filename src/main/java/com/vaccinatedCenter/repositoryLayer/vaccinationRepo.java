package com.vaccinatedCenter.repositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccinatedCenter.entities.vaccinationCenter;

public interface vaccinationRepo extends JpaRepository<vaccinationCenter, Integer>{

}
