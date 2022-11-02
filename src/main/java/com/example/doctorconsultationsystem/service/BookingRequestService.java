package com.example.doctorconsultationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultationsystem.models.BookingRequest;
import com.example.doctorconsultationsystem.repositories.BookingRqRepo;

@Service
public class BookingRequestService {
	
	@Autowired
	BookingRqRepo br;
	
	public List<BookingRequest> getAllRequest(){
		return br.findAll();
	}
	
	public List<BookingRequest> addBookingRequest(BookingRequest nb) {
		br.save(nb);
		return br.findAll();
	}
	
	

}
