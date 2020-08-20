package com.akshay.hospital;

import com.akshay.hospital.model.AppointmentByClinic;
import com.akshay.hospital.service.AppointmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class WebTest {
    @Autowired
    AppointmentService appointmentService;

    @Test
    public void contextLoads() {
        System.out.println(" ----  List of appointments by a clinic -----");
         countByClinic();
        System.out.println(" ----  List of appointments by a Year -----");
        countAppointmentByYear() ;
        System.out.println(" ----  List of appointments by a Month -----");
        countAppointmentByMonth();
        System.out.println(" ----  List of Patient Id's who do not have appointments in the future  -----");
         countAppointmentByPat();

    }

    public void countByClinic() {
        List<AppointmentByClinic> appointmentByClinicList = appointmentService.countTotalByClinic();
        appointmentByClinicList.forEach(appointmentByClinic -> {
                    System.out.println(appointmentByClinic.getClinicname() + " --- " + appointmentByClinic.getCount());
                }
        );

    }

    public void countAppointmentByYear() {
        HashMap mapdata = appointmentService.countAppointmentByYear();
        mapdata.forEach((key, value) -> System.out.println( key + " ---- " + value));
    }

    public void countAppointmentByMonth() {
        HashMap mapdata = appointmentService.countAppointmentByMonth();
        mapdata.forEach((key, value) -> System.out.println( key + " ---- " + value));
    }

    public void countAppointmentByPat() {
        List list = appointmentService.countAppointmentByPat();
       list.forEach(it->{
           System.out.println(it);
               }
       );
    }

}