package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectdescIsNull() {
            addCriterion("projectDesc is null");
            return (Criteria) this;
        }

        public Criteria andProjectdescIsNotNull() {
            addCriterion("projectDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdescEqualTo(String value) {
            addCriterion("projectDesc =", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotEqualTo(String value) {
            addCriterion("projectDesc <>", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescGreaterThan(String value) {
            addCriterion("projectDesc >", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescGreaterThanOrEqualTo(String value) {
            addCriterion("projectDesc >=", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLessThan(String value) {
            addCriterion("projectDesc <", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLessThanOrEqualTo(String value) {
            addCriterion("projectDesc <=", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLike(String value) {
            addCriterion("projectDesc like", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotLike(String value) {
            addCriterion("projectDesc not like", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescIn(List<String> values) {
            addCriterion("projectDesc in", values, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotIn(List<String> values) {
            addCriterion("projectDesc not in", values, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescBetween(String value1, String value2) {
            addCriterion("projectDesc between", value1, value2, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotBetween(String value1, String value2) {
            addCriterion("projectDesc not between", value1, value2, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtIsNull() {
            addCriterion("projectbeginDT is null");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtIsNotNull() {
            addCriterion("projectbeginDT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtEqualTo(Date value) {
            addCriterion("projectbeginDT =", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtNotEqualTo(Date value) {
            addCriterion("projectbeginDT <>", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtGreaterThan(Date value) {
            addCriterion("projectbeginDT >", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtGreaterThanOrEqualTo(Date value) {
            addCriterion("projectbeginDT >=", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtLessThan(Date value) {
            addCriterion("projectbeginDT <", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtLessThanOrEqualTo(Date value) {
            addCriterion("projectbeginDT <=", value, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtIn(List<Date> values) {
            addCriterion("projectbeginDT in", values, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtNotIn(List<Date> values) {
            addCriterion("projectbeginDT not in", values, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtBetween(Date value1, Date value2) {
            addCriterion("projectbeginDT between", value1, value2, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectbegindtNotBetween(Date value1, Date value2) {
            addCriterion("projectbeginDT not between", value1, value2, "projectbegindt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtIsNull() {
            addCriterion("projectendDT is null");
            return (Criteria) this;
        }

        public Criteria andProjectenddtIsNotNull() {
            addCriterion("projectendDT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectenddtEqualTo(Date value) {
            addCriterion("projectendDT =", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtNotEqualTo(Date value) {
            addCriterion("projectendDT <>", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtGreaterThan(Date value) {
            addCriterion("projectendDT >", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtGreaterThanOrEqualTo(Date value) {
            addCriterion("projectendDT >=", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtLessThan(Date value) {
            addCriterion("projectendDT <", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtLessThanOrEqualTo(Date value) {
            addCriterion("projectendDT <=", value, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtIn(List<Date> values) {
            addCriterion("projectendDT in", values, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtNotIn(List<Date> values) {
            addCriterion("projectendDT not in", values, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtBetween(Date value1, Date value2) {
            addCriterion("projectendDT between", value1, value2, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andProjectenddtNotBetween(Date value1, Date value2) {
            addCriterion("projectendDT not between", value1, value2, "projectenddt");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNull() {
            addCriterion("isFinished is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNotNull() {
            addCriterion("isFinished is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedEqualTo(Integer value) {
            addCriterion("isFinished =", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotEqualTo(Integer value) {
            addCriterion("isFinished <>", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThan(Integer value) {
            addCriterion("isFinished >", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFinished >=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThan(Integer value) {
            addCriterion("isFinished <", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThanOrEqualTo(Integer value) {
            addCriterion("isFinished <=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIn(List<Integer> values) {
            addCriterion("isFinished in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotIn(List<Integer> values) {
            addCriterion("isFinished not in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedBetween(Integer value1, Integer value2) {
            addCriterion("isFinished between", value1, value2, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("isFinished not between", value1, value2, "isfinished");
            return (Criteria) this;
        }

        public Criteria andProjectareaIsNull() {
            addCriterion("projectArea is null");
            return (Criteria) this;
        }

        public Criteria andProjectareaIsNotNull() {
            addCriterion("projectArea is not null");
            return (Criteria) this;
        }

        public Criteria andProjectareaEqualTo(String value) {
            addCriterion("projectArea =", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotEqualTo(String value) {
            addCriterion("projectArea <>", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaGreaterThan(String value) {
            addCriterion("projectArea >", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaGreaterThanOrEqualTo(String value) {
            addCriterion("projectArea >=", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLessThan(String value) {
            addCriterion("projectArea <", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLessThanOrEqualTo(String value) {
            addCriterion("projectArea <=", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLike(String value) {
            addCriterion("projectArea like", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotLike(String value) {
            addCriterion("projectArea not like", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaIn(List<String> values) {
            addCriterion("projectArea in", values, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotIn(List<String> values) {
            addCriterion("projectArea not in", values, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaBetween(String value1, String value2) {
            addCriterion("projectArea between", value1, value2, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotBetween(String value1, String value2) {
            addCriterion("projectArea not between", value1, value2, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectaddrIsNull() {
            addCriterion("projectAddr is null");
            return (Criteria) this;
        }

        public Criteria andProjectaddrIsNotNull() {
            addCriterion("projectAddr is not null");
            return (Criteria) this;
        }

        public Criteria andProjectaddrEqualTo(String value) {
            addCriterion("projectAddr =", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrNotEqualTo(String value) {
            addCriterion("projectAddr <>", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrGreaterThan(String value) {
            addCriterion("projectAddr >", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrGreaterThanOrEqualTo(String value) {
            addCriterion("projectAddr >=", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrLessThan(String value) {
            addCriterion("projectAddr <", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrLessThanOrEqualTo(String value) {
            addCriterion("projectAddr <=", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrLike(String value) {
            addCriterion("projectAddr like", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrNotLike(String value) {
            addCriterion("projectAddr not like", value, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrIn(List<String> values) {
            addCriterion("projectAddr in", values, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrNotIn(List<String> values) {
            addCriterion("projectAddr not in", values, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrBetween(String value1, String value2) {
            addCriterion("projectAddr between", value1, value2, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andProjectaddrNotBetween(String value1, String value2) {
            addCriterion("projectAddr not between", value1, value2, "projectaddr");
            return (Criteria) this;
        }

        public Criteria andCreatedtIsNull() {
            addCriterion("createDT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtIsNotNull() {
            addCriterion("createDT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtEqualTo(Date value) {
            addCriterion("createDT =", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotEqualTo(Date value) {
            addCriterion("createDT <>", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtGreaterThan(Date value) {
            addCriterion("createDT >", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtGreaterThanOrEqualTo(Date value) {
            addCriterion("createDT >=", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtLessThan(Date value) {
            addCriterion("createDT <", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtLessThanOrEqualTo(Date value) {
            addCriterion("createDT <=", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtIn(List<Date> values) {
            addCriterion("createDT in", values, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotIn(List<Date> values) {
            addCriterion("createDT not in", values, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtBetween(Date value1, Date value2) {
            addCriterion("createDT between", value1, value2, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotBetween(Date value1, Date value2) {
            addCriterion("createDT not between", value1, value2, "createdt");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIsNull() {
            addCriterion("projectType_Id is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIsNotNull() {
            addCriterion("projectType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdEqualTo(Integer value) {
            addCriterion("projectType_Id =", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotEqualTo(Integer value) {
            addCriterion("projectType_Id <>", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdGreaterThan(Integer value) {
            addCriterion("projectType_Id >", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectType_Id >=", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdLessThan(Integer value) {
            addCriterion("projectType_Id <", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("projectType_Id <=", value, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdIn(List<Integer> values) {
            addCriterion("projectType_Id in", values, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotIn(List<Integer> values) {
            addCriterion("projectType_Id not in", values, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdBetween(Integer value1, Integer value2) {
            addCriterion("projectType_Id between", value1, value2, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("projectType_Id not between", value1, value2, "projecttypeId");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_Id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_Id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_Id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_Id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_Id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_Id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_Id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_Id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_Id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_Id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_Id not between", value1, value2, "companyId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}