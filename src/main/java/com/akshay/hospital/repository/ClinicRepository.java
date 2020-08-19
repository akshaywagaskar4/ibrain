package com.akshay.hospital.repository;

import com.akshay.hospital.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClinicRepository extends JpaRepository<Clinic, Long> {

}
