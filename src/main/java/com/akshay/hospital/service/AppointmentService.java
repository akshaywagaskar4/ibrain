package com.akshay.hospital.service;

import com.akshay.hospital.model.AppointmentByClinic;
import com.akshay.hospital.model.Clinic;
import com.akshay.hospital.repository.AppointmentRepository;
import com.akshay.hospital.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    ClinicRepository clinicRepository;

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
//    public HashMap countAppointmentByPat() {
//        HashMap patMap=new HashMap();
//        Object obj = appointmentRepository.countAppointmentByPat();
//        System.out.println(" OBJ "+obj.toString());
//        return patMap;
//    }
}
