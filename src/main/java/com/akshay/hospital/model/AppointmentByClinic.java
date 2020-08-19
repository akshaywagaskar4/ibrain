package com.akshay.hospital.model;

public class AppointmentByClinic {
    private   String clinicname;
    private  Long count;

    public String getClinicname() {
        return clinicname;
    }

    public void setClinicname(String clinicname) {
        this.clinicname = clinicname;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
