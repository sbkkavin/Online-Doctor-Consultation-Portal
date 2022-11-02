package com.example.doctorconsultationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.Admin;

@Repository 
public interface AdminRepo extends JpaRepository<Admin,Integer> {
	
public Admin findByAidAndAdpassword(int id,String pass);

}
