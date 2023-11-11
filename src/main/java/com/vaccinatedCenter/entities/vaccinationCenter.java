package com.vaccinatedCenter.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class vaccinationCenter {

	@Id
	private int id;
	private String centerName;
	private String centerType;
	
	private int sputnikDose;
	private int covishieldDose;
	private int covaxinDose;
	
	//one vaccinationCenter can have multiple patietents
	@OneToMany(mappedBy = "vaccinationCenter")
	private List<patietent> petient;
	
	//one vaccinationCenter can have multiple doctor who are working there
	@OneToMany(mappedBy = "vaccinationCenter")
	private List<doctor> doctor;

	public int getSputnikDose() {
		return sputnikDose;
	}

	public void setSputnikDose(int sputnikDose) {
		this.sputnikDose = sputnikDose;
	}

	public int getCovishieldDose() {
		return covishieldDose;
	}

	public void setCovishieldDose(int covishieldDose) {
		this.covishieldDose = covishieldDose;
	}

	public int getCovaxinDose() {
		return covaxinDose;
	}

	public void setCovaxinDose(int covaxinDose) {
		this.covaxinDose = covaxinDose;
	}

	
	


	public vaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterType() {
		return centerType;
	}

	public void setCenterType(String centerType) {
		this.centerType = centerType;
	}

	public List<patietent> getPetient() {
		return petient;
	}

	public void setPetient(List<patietent> petient) {
		this.petient = petient;
	}

	public List<doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<doctor> doctor) {
		this.doctor = doctor;
	}
}
