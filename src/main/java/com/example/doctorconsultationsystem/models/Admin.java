package com.example.doctorconsultationsystem.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospitaladmin")
public class Admin {
	@Id
	int aid;
	String adminname;
	String  adpassword;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdpassword() {
		return adpassword;
	}
	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}
	
	
}
