package com.akshay.hospital.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long patid;

    private String proceduretype;

    private Date proceduredate;

    private Long prov;

    private Long amount;

    private Long clinicid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatid() {
        return patid;
    }

    public void setPatid(Long patid) {
        this.patid = patid;
    }

    public String getProceduretype() {
        return proceduretype;
    }

    public void setProceduretype(String proceduretype) {
        this.proceduretype = proceduretype;
    }

    public Date getProceduredate() {
        return proceduredate;
    }

    public void setProceduredate(Date proceduredate) {
        this.proceduredate = proceduredate;
    }

    public Long getProv() {
        return prov;
    }

    public void setProv(Long prov) {
        this.prov = prov;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getClinicid() {
        return clinicid;
    }

    public void setClinicid(Long clinicid) {
        this.clinicid = clinicid;
    }
}