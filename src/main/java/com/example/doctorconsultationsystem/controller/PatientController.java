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
import com.example.doctorconsultationsystem.models.Patient;
import com.example.doctorconsultationsystem.service.PatientService;

@RestController
@CrossOrigin("*")
public class PatientController {

	@Autowired
	PatientService ps;
	
@RequestMapping(value="registerpatient",method=RequestMethod.POST
,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public List<Patient> registerPatient(@RequestBody Patient pt) throws Exception{
	
	int temp_pid=pt.getPid();
	Patient temp_patient= ps.getPatientById(temp_pid);
	
	if(temp_patient !=null) {
		throw new Exception("User with patient id "+temp_pid+" already exist!!");
	}
	
	return ps.registerPatient(pt);
	
	
}

//@RequestMapping(value="loginpatient",method=RequestMethod.POST
//,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//public Patient loginPatient(@RequestBody Patient pt) throws Exception{
//			int temp_patient_id=pt.getPid();
//			String temp_patient_password=pt.getPatient_password();
//			Patient temp_patient=null;
//			if(temp_patient_password!=null) {
//				temp_patient=ps.fetchPatientByIdAndPass(temp_patient_id, temp_patient_password);
//			}
//			if(temp_patient==null) {
//				throw new Exception("Invalid user id or password");
//			}
//			return temp_patient;
//	
//	
//}

@RequestMapping(value="loginpatient",method=RequestMethod.POST
,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public Patient loginPatient(@RequestBody Patient pt) throws Exception{
	int temp_pid=pt.getPid();
	Patient temp_patient= ps.getPatientById(temp_pid);
	if(temp_patient.getPatient_password().equals(pt.getPatient_password())) {
		return temp_patient;
	}
	else {
		throw new Exception("Invalid user id or password");
	}
	
}

//
//@RequestMapping(value="getdocpatient",method=RequestMethod.POST
//,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//public List<Patient> getPatientAssignedToDoc(@RequestBody Patient pt){
//		System.out.println("yooooo:"+pt.getAdocid());
//		return ps.getPatientByDocId(pt);
//}


@RequestMapping(value="getdocpatient",method=RequestMethod.POST
,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public List<Patient> getPatientAssignedToDoc(@RequestBody Doctor dr){
		System.out.println("yooooo:"+dr.getDocid());
		return ps.getPatientByDocId(dr);
}

@RequestMapping(value="patients",method=RequestMethod.GET)
public List<Patient> getAllPatients(){
	return ps.getPatients();
	
}

@RequestMapping(value="bookingrequest",method=RequestMethod.POST
,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public List<Patient> bookingrq(@RequestBody Patient pt){
		return ps.bookingRequest(pt);
}

@RequestMapping(value="patientbyid",method=RequestMethod.POST
,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public Patient getPatientUsingId(@RequestBody int pid){
		
		return ps.getPatientById(pid);

}
}



