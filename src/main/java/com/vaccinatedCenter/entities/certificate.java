package com.vaccinatedCenter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class certificate {

	@Id
	private int Id;
	@OneToOne
	private patietent patietent;

	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public certificate(int id, patietent patietent) {
		super();
		this.Id = id;
		this.patietent = patietent;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public patietent getPatietent() {
		return patietent;
	}

	public void setPatietent(patietent patietent) {
		this.patietent = patietent;
	}

}
