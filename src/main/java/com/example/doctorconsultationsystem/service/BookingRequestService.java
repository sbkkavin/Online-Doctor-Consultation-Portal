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
	
	public BookingRequest addBookingRequest(BookingRequest nb) {
		br.save(nb);
		return br.findByPid(nb.getPid());
	
	}
	
	public List<BookingRequest> deleteRequest(int pid){
		br.deleteById(pid);
		return br.findAll();
	}
	
	

}
