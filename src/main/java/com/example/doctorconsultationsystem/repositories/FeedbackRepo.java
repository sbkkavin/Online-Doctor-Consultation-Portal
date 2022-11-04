package com.example.doctorconsultationsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback,Integer>{
	
	public List<Feedback> findByDocid(int did);

}
