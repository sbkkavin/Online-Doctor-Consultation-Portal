package com.example.doctorconsultationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.BookingRequest;

@Repository 
public interface BookingRqRepo extends JpaRepository<BookingRequest,Integer> {

}
