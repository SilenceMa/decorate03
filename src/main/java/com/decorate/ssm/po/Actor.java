package com.decorate.ssm.po;

import java.util.Date;

public class Actor {
    private Integer id;

    private String actorname;

    private String actordesc;

    private Date createdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname == null ? null : actorname.trim();
    }

    public String getActordesc() {
        return actordesc;
    }

    public void setActordesc(String actordesc) {
        this.actordesc = actordesc == null ? null : actordesc.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }
}