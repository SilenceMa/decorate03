package com.decorate.ssm.po;

import java.util.Date;

public class Emprelationemp {
    private Integer id;

    private Integer empId;

    private Integer emprelationId;

    private Date createdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmprelationId() {
        return emprelationId;
    }

    public void setEmprelationId(Integer emprelationId) {
        this.emprelationId = emprelationId;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }
}