package com.example.doctorconsultationsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.BookingRequest;

@Repository 
public interface BookingRqRepo extends JpaRepository<BookingRequest,Integer> {

	public BookingRequest findByPid(int id);
	public List<BookingRequest> deleteByPid(int id);
}
