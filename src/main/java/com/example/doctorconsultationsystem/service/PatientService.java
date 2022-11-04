package com.example.doctorconsultationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultationsystem.repositories.PatientRepo;
import com.example.doctorconsultationsystem.models.Doctor;
import com.example.doctorconsultationsystem.models.Patient;

@Service
public class PatientService {

	
	@Autowired
	PatientRepo pr;
	
	public List<Patient> registerPatient(Patient p){
		pr.save(p);
		return pr.findAll();
	}
	
	public Patient getPatientById(int id){
		return pr.findBypid(id);
	}
	
	
//	public Patient fetchPatientByIdAndPass(int id,String pass) {
//		return pr.findBypidAndpatient_password(id,pass);
//	}
	
	public List<Patient> getPatientByDocId(Doctor dr){
		return pr.findByadocid(dr.getDocid());
	}
	
	public List<Patient> getPatients(){
	return pr.findAll();
	}
	
	public List<Patient> bookingRequest(Patient p){
		pr.save(p);
		return pr.findAll();
	}
	
	
	
}
