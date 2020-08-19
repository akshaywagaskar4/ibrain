package com.akshay.hospital.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment {

    private Long patid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appid;

    private Date apptdate;

    private Long operatory;

    private Long provider;

    private String appttime;

    private Long apptlength;

    private Double amount;

    private Long clinicid;

    public Long getPatid() {
        return patid;
    }

    public void setPatid(Long patid) {
        this.patid = patid;
    }

    public Long getAppid() {
        return appid;
    }

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public Date getApptdate() {
        return apptdate;
    }

    public void setApptdate(Date apptdate) {
        this.apptdate = apptdate;
    }

    public Long getOperatory() {
        return operatory;
    }

    public void setOperatory(Long operatory) {
        this.operatory = operatory;
    }

    public Long getProvider() {
        return provider;
    }

    public void setProvider(Long provider) {
        this.provider = provider;
    }

    public String getAppttime() {
        return appttime;
    }

    public void setAppttime(String appttime) {
        this.appttime = appttime;
    }

    public Long getApptlength() {
        return apptlength;
    }

    public void setApptlength(Long apptlength) {
        this.apptlength = apptlength;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getClinicid() {
        return clinicid;
    }

    public void setClinicid(Long clinicid) {
        this.clinicid = clinicid;
    }


}
