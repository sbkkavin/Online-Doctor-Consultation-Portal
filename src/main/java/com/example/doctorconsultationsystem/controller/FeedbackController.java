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
import com.example.doctorconsultationsystem.models.Feedback;
import com.example.doctorconsultationsystem.service.FeedbackService;

@RestController
@CrossOrigin("*")
public class FeedbackController {
	
	@Autowired
	FeedbackService fs;
	
	@RequestMapping(value="addfeedback",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Feedback> Feedback(@RequestBody Feedback fd){
		return fs.addFeedback(fd);
		
	}
	
	@RequestMapping(value="viewfeedback",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Feedback> Feedback(@RequestBody Doctor dr){
		int fdocid=dr.getDocid();
		return fs.getFeedback(fdocid);
		
	}
	

}
