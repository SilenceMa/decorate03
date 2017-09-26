package com.decorate.ssm.po;

import java.util.Date;

public class Project {
    private Integer id;

    private String projectname;

    private String projectdesc;

    private Date projectbegindt;

    private Date projectenddt;

    private Integer isfinished;

    private String projectarea;

    private String projectaddr;

    private Date createdt;

    private Integer projecttypeId;

    private String contact;

    private String mobile;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectdesc() {
        return projectdesc;
    }

    public void setProjectdesc(String projectdesc) {
        this.projectdesc = projectdesc == null ? null : projectdesc.trim();
    }

    public Date getProjectbegindt() {
        return projectbegindt;
    }

    public void setProjectbegindt(Date projectbegindt) {
        this.projectbegindt = projectbegindt;
    }

    public Date getProjectenddt() {
        return projectenddt;
    }

    public void setProjectenddt(Date projectenddt) {
        this.projectenddt = projectenddt;
    }

    public Integer getIsfinished() {
        return isfinished;
    }

    public void setIsfinished(Integer isfinished) {
        this.isfinished = isfinished;
    }

    public String getProjectarea() {
        return projectarea;
    }

    public void setProjectarea(String projectarea) {
        this.projectarea = projectarea == null ? null : projectarea.trim();
    }

    public String getProjectaddr() {
        return projectaddr;
    }

    public void setProjectaddr(String projectaddr) {
        this.projectaddr = projectaddr == null ? null : projectaddr.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Integer getProjecttypeId() {
        return projecttypeId;
    }

    public void setProjecttypeId(Integer projecttypeId) {
        this.projecttypeId = projecttypeId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}