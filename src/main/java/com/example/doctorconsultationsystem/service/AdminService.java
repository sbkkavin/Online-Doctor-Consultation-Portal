package com.example.doctorconsultationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultationsystem.models.Admin;
import com.example.doctorconsultationsystem.repositories.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo ar;
	
	public Admin loginAdmin(Admin ad) {
		return ar.findByAidAndAdpassword(ad.getAid(),ad.getAdpassword());
	}
	
	
	

}
