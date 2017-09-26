package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNull() {
            addCriterion("companyAddr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNotNull() {
            addCriterion("companyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrEqualTo(String value) {
            addCriterion("companyAddr =", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotEqualTo(String value) {
            addCriterion("companyAddr <>", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThan(String value) {
            addCriterion("companyAddr >", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddr >=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThan(String value) {
            addCriterion("companyAddr <", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("companyAddr <=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLike(String value) {
            addCriterion("companyAddr like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotLike(String value) {
            addCriterion("companyAddr not like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIn(List<String> values) {
            addCriterion("companyAddr in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotIn(List<String> values) {
            addCriterion("companyAddr not in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrBetween(String value1, String value2) {
            addCriterion("companyAddr between", value1, value2, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotBetween(String value1, String value2) {
            addCriterion("companyAddr not between", value1, value2, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessIsNull() {
            addCriterion("companyBusiness is null");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessIsNotNull() {
            addCriterion("companyBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessEqualTo(String value) {
            addCriterion("companyBusiness =", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessNotEqualTo(String value) {
            addCriterion("companyBusiness <>", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessGreaterThan(String value) {
            addCriterion("companyBusiness >", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessGreaterThanOrEqualTo(String value) {
            addCriterion("companyBusiness >=", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessLessThan(String value) {
            addCriterion("companyBusiness <", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessLessThanOrEqualTo(String value) {
            addCriterion("companyBusiness <=", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessLike(String value) {
            addCriterion("companyBusiness like", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessNotLike(String value) {
            addCriterion("companyBusiness not like", value, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessIn(List<String> values) {
            addCriterion("companyBusiness in", values, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessNotIn(List<String> values) {
            addCriterion("companyBusiness not in", values, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessBetween(String value1, String value2) {
            addCriterion("companyBusiness between", value1, value2, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andCompanybusinessNotBetween(String value1, String value2) {
            addCriterion("companyBusiness not between", value1, value2, "companybusiness");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("employee is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("employee is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(String value) {
            addCriterion("employee =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(String value) {
            addCriterion("employee <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(String value) {
            addCriterion("employee >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("employee >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(String value) {
            addCriterion("employee <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(String value) {
            addCriterion("employee <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLike(String value) {
            addCriterion("employee like", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotLike(String value) {
            addCriterion("employee not like", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<String> values) {
            addCriterion("employee in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<String> values) {
            addCriterion("employee not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(String value1, String value2) {
            addCriterion("employee between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(String value1, String value2) {
            addCriterion("employee not between", value1, value2, "employee");
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

        public Criteria andIsactivedIsNull() {
            addCriterion("isActived is null");
            return (Criteria) this;
        }

        public Criteria andIsactivedIsNotNull() {
            addCriterion("isActived is not null");
            return (Criteria) this;
        }

        public Criteria andIsactivedEqualTo(Integer value) {
            addCriterion("isActived =", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotEqualTo(Integer value) {
            addCriterion("isActived <>", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedGreaterThan(Integer value) {
            addCriterion("isActived >", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isActived >=", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedLessThan(Integer value) {
            addCriterion("isActived <", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedLessThanOrEqualTo(Integer value) {
            addCriterion("isActived <=", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedIn(List<Integer> values) {
            addCriterion("isActived in", values, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotIn(List<Integer> values) {
            addCriterion("isActived not in", values, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedBetween(Integer value1, Integer value2) {
            addCriterion("isActived between", value1, value2, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotBetween(Integer value1, Integer value2) {
            addCriterion("isActived not between", value1, value2, "isactived");
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