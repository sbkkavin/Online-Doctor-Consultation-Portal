package com.example.doctorconsultationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultationsystem.models.Doctor;

import com.example.doctorconsultationsystem.repositories.DoctorRepo;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo dr;
	
	
	public List<Doctor> registerDoctor(Doctor d){
		dr.save(d);
		return dr.findAll();
	}
	
	public Doctor getDoctorById(int  id) {
		return dr.findBydocid(id);
	}
	
	public Doctor getDoctorByIdAndPass(int id,String pass) {
		return dr.findByDocidAndDocpass(id, pass);
	}
	public List<Doctor> getDoctors(){
		return dr.findAll();
	}
	
	

}
