package com.decorate.ssm.po;

import java.util.Date;

public class Profession {
    private Integer id;

    private String profname;

    private String profdesc;

    private Date createdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfname() {
        return profname;
    }

    public void setProfname(String profname) {
        this.profname = profname == null ? null : profname.trim();
    }

    public String getProfdesc() {
        return profdesc;
    }

    public void setProfdesc(String profdesc) {
        this.profdesc = profdesc == null ? null : profdesc.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }
}