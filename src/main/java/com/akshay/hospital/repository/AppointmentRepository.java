package com.akshay.hospital.repository;

import com.akshay.hospital.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

   @Query("SELECT a.clinicid AS clinicid, COUNT(a.clinicid) AS count FROM Appointment AS a GROUP BY a.clinicid ORDER BY a.clinicid DESC")
    List<Object[]> countTotalByClinic();

    @Query("SELECT YEAR(a.apptdate) AS apptdate, COUNT(a.apptdate) AS count FROM Appointment AS a GROUP BY YEAR(a.apptdate) ORDER BY a.clinicid DESC")
    List<Object[]> countAppointmentByYear();

    @Query("SELECT MONTH(a.apptdate) AS apptdate, COUNT(a.apptdate) AS count FROM Appointment AS a GROUP BY MONTH(a.apptdate) ORDER BY a.clinicid DESC")
    List<Object[]> countAppointmentByMonth();

   // @Query("SELECT a.patid FROM appointment a  where a.patid  IN  (select an.patid from appointment an )")
   // @Query(value = "select a from  appointment a where a.patid IN (Select a. patid from  appointment a where apptdate >= CURDATE()", nativeQuery = true)
    //@Query("SELECT a FROM appointment a WHERE a.patid NOT IN (SELECT a.patid  FROM appointment where a.apptdate >= CURDATE)")
      @Query("SELECT a.patid FROM Appointment a  where a.patid  NOT IN  (select an.patid from Appointment an where an.apptdate >= CURDATE())")
 List<Object[]> countAppointmentByPat();

}

