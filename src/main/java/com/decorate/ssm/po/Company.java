package com.decorate.ssm.po;

import java.util.Date;

public class Company {
    private Integer id;

    private String companyname;

    private String companyaddr;

    private String companybusiness;

    private String employee;

    private Date createdt;

    private Integer isactived;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyaddr() {
        return companyaddr;
    }

    public void setCompanyaddr(String companyaddr) {
        this.companyaddr = companyaddr == null ? null : companyaddr.trim();
    }

    public String getCompanybusiness() {
        return companybusiness;
    }

    public void setCompanybusiness(String companybusiness) {
        this.companybusiness = companybusiness == null ? null : companybusiness.trim();
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee == null ? null : employee.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Integer getIsactived() {
        return isactived;
    }

    public void setIsactived(Integer isactived) {
        this.isactived = isactived;
    }
}