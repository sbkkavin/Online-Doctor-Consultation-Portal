package com.example.doctorconsultationsystem.repositories;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultationsystem.models.Patient;

@Repository 
public interface PatientRepo extends JpaRepository<Patient,Integer> {
	
	public Patient findBypid(int id);
//	public List<Patient> findBypid(int id);
//	public Patient findBypidAndpatient_password(int id,String password);
//	public Patient findBypatient_password(String pass);
	public List<Patient> findByadocid(int id);
}
