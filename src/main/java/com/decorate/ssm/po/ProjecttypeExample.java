package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjecttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjecttypeExample() {
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

        public Criteria andProtypenameIsNull() {
            addCriterion("proTypeName is null");
            return (Criteria) this;
        }

        public Criteria andProtypenameIsNotNull() {
            addCriterion("proTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andProtypenameEqualTo(String value) {
            addCriterion("proTypeName =", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotEqualTo(String value) {
            addCriterion("proTypeName <>", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameGreaterThan(String value) {
            addCriterion("proTypeName >", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("proTypeName >=", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLessThan(String value) {
            addCriterion("proTypeName <", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLessThanOrEqualTo(String value) {
            addCriterion("proTypeName <=", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameLike(String value) {
            addCriterion("proTypeName like", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotLike(String value) {
            addCriterion("proTypeName not like", value, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameIn(List<String> values) {
            addCriterion("proTypeName in", values, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotIn(List<String> values) {
            addCriterion("proTypeName not in", values, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameBetween(String value1, String value2) {
            addCriterion("proTypeName between", value1, value2, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypenameNotBetween(String value1, String value2) {
            addCriterion("proTypeName not between", value1, value2, "protypename");
            return (Criteria) this;
        }

        public Criteria andProtypedescIsNull() {
            addCriterion("proTypeDesc is null");
            return (Criteria) this;
        }

        public Criteria andProtypedescIsNotNull() {
            addCriterion("proTypeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProtypedescEqualTo(String value) {
            addCriterion("proTypeDesc =", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescNotEqualTo(String value) {
            addCriterion("proTypeDesc <>", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescGreaterThan(String value) {
            addCriterion("proTypeDesc >", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescGreaterThanOrEqualTo(String value) {
            addCriterion("proTypeDesc >=", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescLessThan(String value) {
            addCriterion("proTypeDesc <", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescLessThanOrEqualTo(String value) {
            addCriterion("proTypeDesc <=", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescLike(String value) {
            addCriterion("proTypeDesc like", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescNotLike(String value) {
            addCriterion("proTypeDesc not like", value, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescIn(List<String> values) {
            addCriterion("proTypeDesc in", values, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescNotIn(List<String> values) {
            addCriterion("proTypeDesc not in", values, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescBetween(String value1, String value2) {
            addCriterion("proTypeDesc between", value1, value2, "protypedesc");
            return (Criteria) this;
        }

        public Criteria andProtypedescNotBetween(String value1, String value2) {
            addCriterion("proTypeDesc not between", value1, value2, "protypedesc");
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