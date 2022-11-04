package com.example.doctorconsultationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.doctorconsultationsystem.models.Feedback;
import com.example.doctorconsultationsystem.repositories.FeedbackRepo;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackRepo fr;
	
	public List<Feedback> addFeedback(Feedback f){
		 fr.save(f);
		 return fr.findAll();
	}

	public List<Feedback> getFeedback(int did){
     return  fr.findByDocid(did);
	}
}
