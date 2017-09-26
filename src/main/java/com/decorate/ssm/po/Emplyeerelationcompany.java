package com.decorate.ssm.po;

import java.util.Date;

public class Emplyeerelationcompany {
    private Integer id;

    private Integer companyId;

    private Integer actorId;

    private Integer empId;

    private Date createdt;

    private Integer profId;

    private Integer isowner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Integer getProfId() {
        return profId;
    }

    public void setProfId(Integer profId) {
        this.profId = profId;
    }

    public Integer getIsowner() {
        return isowner;
    }

    public void setIsowner(Integer isowner) {
        this.isowner = isowner;
    }
}