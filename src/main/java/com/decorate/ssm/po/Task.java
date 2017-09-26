package com.decorate.ssm.po;

import java.util.Date;

public class Task {
    private Integer id;

    private Integer proId;

    private Integer companyId;

    private String taskname;

    private String content;

    private Date createdt;

    private Integer authorId;

    private Integer empId;

    private Date workdt;

    private Integer empread;

    private Date empreaddt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getWorkdt() {
        return workdt;
    }

    public void setWorkdt(Date workdt) {
        this.workdt = workdt;
    }

    public Integer getEmpread() {
        return empread;
    }

    public void setEmpread(Integer empread) {
        this.empread = empread;
    }

    public Date getEmpreaddt() {
        return empreaddt;
    }

    public void setEmpreaddt(Date empreaddt) {
        this.empreaddt = empreaddt;
    }
}