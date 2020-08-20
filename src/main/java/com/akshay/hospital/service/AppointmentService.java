package com.akshay.hospital.service;

import com.akshay.hospital.model.AppointmentByClinic;
import com.akshay.hospital.model.Clinic;
import com.akshay.hospital.repository.AppointmentRepository;
import com.akshay.hospital.repository.ClinicRepository;
import com.akshay.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    ClinicRepository clinicRepository;

    @Autowired
    PatientRepository patientRepository;

    public List<AppointmentByClinic> countTotalByClinic() {
        List<Object[]> list = appointmentRepository.countTotalByClinic();
        List<AppointmentByClinic> appointmentByClinics = new ArrayList<>();
        AppointmentByClinic appointmentByClinic = null;
        for (Object[] ob : list) {
            appointmentByClinic = new AppointmentByClinic();
            Optional<Clinic> clinic = clinicRepository.findById((Long) ob[0]);
            appointmentByClinic.setClinicname(clinic.get().getClinicname());
            appointmentByClinic.setCount((Long) ob[1]);
            appointmentByClinics.add(appointmentByClinic);
        }
        return appointmentByClinics;
    }

 //   public List<AppointmentByAppdatestr> countTotalByAppdatestr() {
 //       List<AppointmentByAppdatestr> appointmentByAppdatestrs = new ArrayList<>();
 //       List<Object[]> list = appointmentRepository.countAppointmentByYear();
 //       for (Object[] ob : list) {
 //           System.out.println("ob[0] "+ob[0] +"  "+ob[1]);
 //       }

   //     return appointmentByAppdatestrs;
   // }


    public HashMap countAppointmentByMonth ()  {
       HashMap monthMap=new HashMap();
        String montharray [] = {" ", "JAN", "FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        List<Object[]> list = appointmentRepository.countAppointmentByMonth();
        for (Object[] ob : list) {
            monthMap.put( montharray[Integer.parseInt(ob[0].toString())], ob[1].toString());
        }
        return monthMap;
    }

    public HashMap countAppointmentByYear() {
        HashMap yearMap=new HashMap();
        List<Object[]> list = appointmentRepository.countAppointmentByYear();
        for (Object[] ob : list) {
           yearMap.put( ob[0].toString() , ob[1].toString());
        }
        return yearMap;
    }
    public List countAppointmentByPat() {
        List dataList=new ArrayList();
        List<Object[]> list = appointmentRepository.countAppointmentByPat();
        for (Object[] ob : list) {
           //  Patient   patient = patientRepository.getOne((Long) ob[0]);
          //  System.out.println(patient);
            dataList.add((Long) ob[0]);
        }
        return dataList;
    }
}
