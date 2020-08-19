package com.akshay.hospital.model;

import org.hibernate.exception.DataException;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long practiceid;

    private String lastname;

    private String firstname;

    private String city;

    private String state;

    private String gender;

    private String patientagegroup;

    private DataException birthdate;

    private Long age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPracticeid() {
        return practiceid;
    }

    public void setPracticeid(Long practiceid) {
        this.practiceid = practiceid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientagegroup() {
        return patientagegroup;
    }

    public void setPatientagegroup(String patientagegroup) {
        this.patientagegroup = patientagegroup;
    }

    public DataException getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(DataException birthdate) {
        this.birthdate = birthdate;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}