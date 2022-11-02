package com.example.doctorconsultationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer>{
	
	public Doctor findBydocid(int id);
	public Doctor findByDocidAndDocpass(int id,String pass);

}
