package com.vaccinatedCenter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class patietent {

	@Id
	private int id;
	private String name;
	private String centerPreference;
	private String vaccainPreference;
	@Column(unique = true)
	private String contact;
	@Column(unique = true)
	private String email;
	
	//one patient can have only one certificate
	@OneToOne
	private certificate certificate;

	//multiple patietents can go to one doctor
	@ManyToOne
	private doctor doctor;

	//multiple patietent can go to one vaccinationCenter
	@ManyToOne
	private vaccinationCenter vaccinationCenter;

	public patietent() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCenterPreference() {
		return centerPreference;
	}

	public void setCenterPreference(String centerPreference) {
		this.centerPreference = centerPreference;
	}

	public String getVaccainPreference() {
		return vaccainPreference;
	}

	public void setVaccainPreference(String vaccainPreference) {
		this.vaccainPreference = vaccainPreference;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(certificate certificate) {
		this.certificate = certificate;
	}

	public doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(doctor doctor) {
		this.doctor = doctor;
	}

	public vaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(vaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

}
