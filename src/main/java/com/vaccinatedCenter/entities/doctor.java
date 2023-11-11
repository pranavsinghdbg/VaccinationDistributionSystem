package com.vaccinatedCenter.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class doctor{

	public doctor() {
		super();
	}
	
	@Id
	private int doctorId;
	private String name;
	private String degree;
	
	//one doctor can checkUp multiple patitent
	@OneToMany(mappedBy = "doctor")
	private List<patietent> patitentList;
	
	//many doctor can work in one vaccinationCenter
	@ManyToOne
	private vaccinationCenter vaccinationCenter;
	
	
	public doctor(int doctorId, String name, String degree, List<patietent> patitentList,
			com.vaccinatedCenter.entities.vaccinationCenter vaccinationCenter) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.degree = degree;
		this.patitentList = patitentList;
		this.vaccinationCenter = vaccinationCenter;
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public List<patietent> getPatitentList() {
		return patitentList;
	}


	public void setPatitentList(List<patietent> patitentList) {
		this.patitentList = patitentList;
	}


	public vaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}


	public void setVaccinationCenter(vaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}
	
	
}
