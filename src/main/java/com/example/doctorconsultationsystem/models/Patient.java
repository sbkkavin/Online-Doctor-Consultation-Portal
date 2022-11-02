package com.example.doctorconsultationsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id

	int pid;
	
	String patient_name;
	String phoneno;
	@Column(name="assigned_docid")
	int adocid;
	String patient_password;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getAdocid() {
		return adocid;
	}
	public void setAdocid(int adocid) {
		this.adocid = adocid;
	}
	public String getPatient_password() {
		return patient_password;
	}
	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	
	

	
	
	

	

	

	
	
	
}
