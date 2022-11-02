package com.example.doctorconsultationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultationsystem.models.Admin;

import com.example.doctorconsultationsystem.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminController {
	
	@Autowired 
	AdminService as;
	
	@RequestMapping(value="adminlogin",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public Admin loginAdminFn(@RequestBody Admin ad) throws Exception{
		Admin temp_admin=as.loginAdmin(ad);
		if(temp_admin==null) {
			throw new Exception("Invalid User id or Password");
		}
	  return temp_admin;
	}
	
	

}
