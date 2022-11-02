package com.example.doctorconsultationsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultationsystem.models.Doctor;

import com.example.doctorconsultationsystem.service.DoctorService;

@RestController
@CrossOrigin("*")
public class DoctorController {
	
	@Autowired
	DoctorService ds;
	
	@RequestMapping(value="registerdoctor",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Doctor> registerPatient(@RequestBody Doctor dr) throws Exception{
				
				int temp_docid=(dr.getDocid());
				Doctor temp_doctor= ds.getDoctorById(temp_docid);
				
				if(temp_doctor !=null) {
					throw new Exception("User with patient id "+temp_docid+" already exist!!");
				}
				
				return ds.registerDoctor(dr);
				
				
			}
	
	@RequestMapping(value="logindoctor",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public Doctor loginDoctor(@RequestBody Doctor dr) throws Exception{
		Doctor temp_doctor=ds.getDoctorByIdAndPass(dr.getDocid(),dr.getDocpass());
		if(temp_doctor==null) {
			throw new Exception("Invalid User id or Password");
		}
	  return temp_doctor;
	}
	
	@RequestMapping(value="doctors",method=RequestMethod.GET)
	public List<Doctor> getAllDoctor(){
		return ds.getDoctors();
		
	}
	
	

}
