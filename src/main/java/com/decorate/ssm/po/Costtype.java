package com.decorate.ssm.po;

import java.util.Date;

public class Costtype {
    private Integer id;

    private String costtypename;

    private Date createdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCosttypename() {
        return costtypename;
    }

    public void setCosttypename(String costtypename) {
        this.costtypename = costtypename == null ? null : costtypename.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }
}