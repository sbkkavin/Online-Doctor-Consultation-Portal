package com.example.doctorconsultationsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultationsystem.models.BookingRequest;

import com.example.doctorconsultationsystem.service.BookingRequestService;

@RestController
@CrossOrigin("*")
public class BookingController {
	
	@Autowired
	BookingRequestService brs; 
	
	@RequestMapping(value="getallrequests",method=RequestMethod.GET)
			public List<BookingRequest> getAllBookingRequest(){
				return brs.getAllRequest();
	}
	
	@RequestMapping(value="newbookingrequest",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public BookingRequest newBookingRequest(@RequestBody BookingRequest br) throws Exception{
						
				return brs.addBookingRequest(br);
		
}
	
	@RequestMapping(value="deletebookingrequest",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<BookingRequest> deleteBookingRequest(@RequestBody BookingRequest br) throws Exception{
						
				return brs.deleteRequest(br.getPid());
		
}
	
	
	

}
