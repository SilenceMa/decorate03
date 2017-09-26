package com.decorate.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
    private Integer id;

    private Integer costtypeId;

    private String costname;

    private BigDecimal money;

    private String memo;

    private Integer projectId;

    private Integer empId;

    private Integer authorId;

    private Integer companyId;

    private Date createdt;

    private Integer pay;

    private Date costday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCosttypeId() {
        return costtypeId;
    }

    public void setCosttypeId(Integer costtypeId) {
        this.costtypeId = costtypeId;
    }

    public String getCostname() {
        return costname;
    }

    public void setCostname(String costname) {
        this.costname = costname == null ? null : costname.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Date getCostday() {
        return costday;
    }

    public void setCostday(Date costday) {
        this.costday = costday;
    }
}