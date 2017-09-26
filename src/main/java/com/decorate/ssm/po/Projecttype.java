package com.decorate.ssm.po;

import java.util.Date;

public class Projecttype {
    private Integer id;

    private String protypename;

    private String protypedesc;

    private Date createdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProtypename() {
        return protypename;
    }

    public void setProtypename(String protypename) {
        this.protypename = protypename == null ? null : protypename.trim();
    }

    public String getProtypedesc() {
        return protypedesc;
    }

    public void setProtypedesc(String protypedesc) {
        this.protypedesc = protypedesc == null ? null : protypedesc.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }
}