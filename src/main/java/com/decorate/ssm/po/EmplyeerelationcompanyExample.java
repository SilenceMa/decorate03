package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmplyeerelationcompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmplyeerelationcompanyExample() {
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

        public Criteria andActorIdIsNull() {
            addCriterion("actor_Id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_Id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(Integer value) {
            addCriterion("actor_Id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(Integer value) {
            addCriterion("actor_Id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(Integer value) {
            addCriterion("actor_Id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actor_Id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(Integer value) {
            addCriterion("actor_Id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(Integer value) {
            addCriterion("actor_Id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<Integer> values) {
            addCriterion("actor_Id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<Integer> values) {
            addCriterion("actor_Id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(Integer value1, Integer value2) {
            addCriterion("actor_Id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actor_Id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_Id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_Id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_Id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_Id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_Id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_Id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_Id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_Id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_Id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_Id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_Id not between", value1, value2, "empId");
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

        public Criteria andProfIdIsNull() {
            addCriterion("prof_Id is null");
            return (Criteria) this;
        }

        public Criteria andProfIdIsNotNull() {
            addCriterion("prof_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProfIdEqualTo(Integer value) {
            addCriterion("prof_Id =", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotEqualTo(Integer value) {
            addCriterion("prof_Id <>", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdGreaterThan(Integer value) {
            addCriterion("prof_Id >", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prof_Id >=", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdLessThan(Integer value) {
            addCriterion("prof_Id <", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdLessThanOrEqualTo(Integer value) {
            addCriterion("prof_Id <=", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdIn(List<Integer> values) {
            addCriterion("prof_Id in", values, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotIn(List<Integer> values) {
            addCriterion("prof_Id not in", values, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdBetween(Integer value1, Integer value2) {
            addCriterion("prof_Id between", value1, value2, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prof_Id not between", value1, value2, "profId");
            return (Criteria) this;
        }

        public Criteria andIsownerIsNull() {
            addCriterion("isOwner is null");
            return (Criteria) this;
        }

        public Criteria andIsownerIsNotNull() {
            addCriterion("isOwner is not null");
            return (Criteria) this;
        }

        public Criteria andIsownerEqualTo(Integer value) {
            addCriterion("isOwner =", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerNotEqualTo(Integer value) {
            addCriterion("isOwner <>", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerGreaterThan(Integer value) {
            addCriterion("isOwner >", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOwner >=", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerLessThan(Integer value) {
            addCriterion("isOwner <", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerLessThanOrEqualTo(Integer value) {
            addCriterion("isOwner <=", value, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerIn(List<Integer> values) {
            addCriterion("isOwner in", values, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerNotIn(List<Integer> values) {
            addCriterion("isOwner not in", values, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerBetween(Integer value1, Integer value2) {
            addCriterion("isOwner between", value1, value2, "isowner");
            return (Criteria) this;
        }

        public Criteria andIsownerNotBetween(Integer value1, Integer value2) {
            addCriterion("isOwner not between", value1, value2, "isowner");
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