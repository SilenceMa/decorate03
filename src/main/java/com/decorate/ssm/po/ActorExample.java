package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActorExample() {
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

        public Criteria andActornameIsNull() {
            addCriterion("actorName is null");
            return (Criteria) this;
        }

        public Criteria andActornameIsNotNull() {
            addCriterion("actorName is not null");
            return (Criteria) this;
        }

        public Criteria andActornameEqualTo(String value) {
            addCriterion("actorName =", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotEqualTo(String value) {
            addCriterion("actorName <>", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameGreaterThan(String value) {
            addCriterion("actorName >", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameGreaterThanOrEqualTo(String value) {
            addCriterion("actorName >=", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLessThan(String value) {
            addCriterion("actorName <", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLessThanOrEqualTo(String value) {
            addCriterion("actorName <=", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLike(String value) {
            addCriterion("actorName like", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotLike(String value) {
            addCriterion("actorName not like", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameIn(List<String> values) {
            addCriterion("actorName in", values, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotIn(List<String> values) {
            addCriterion("actorName not in", values, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameBetween(String value1, String value2) {
            addCriterion("actorName between", value1, value2, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotBetween(String value1, String value2) {
            addCriterion("actorName not between", value1, value2, "actorname");
            return (Criteria) this;
        }

        public Criteria andActordescIsNull() {
            addCriterion("actorDesc is null");
            return (Criteria) this;
        }

        public Criteria andActordescIsNotNull() {
            addCriterion("actorDesc is not null");
            return (Criteria) this;
        }

        public Criteria andActordescEqualTo(String value) {
            addCriterion("actorDesc =", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescNotEqualTo(String value) {
            addCriterion("actorDesc <>", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescGreaterThan(String value) {
            addCriterion("actorDesc >", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescGreaterThanOrEqualTo(String value) {
            addCriterion("actorDesc >=", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescLessThan(String value) {
            addCriterion("actorDesc <", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescLessThanOrEqualTo(String value) {
            addCriterion("actorDesc <=", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescLike(String value) {
            addCriterion("actorDesc like", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescNotLike(String value) {
            addCriterion("actorDesc not like", value, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescIn(List<String> values) {
            addCriterion("actorDesc in", values, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescNotIn(List<String> values) {
            addCriterion("actorDesc not in", values, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescBetween(String value1, String value2) {
            addCriterion("actorDesc between", value1, value2, "actordesc");
            return (Criteria) this;
        }

        public Criteria andActordescNotBetween(String value1, String value2) {
            addCriterion("actorDesc not between", value1, value2, "actordesc");
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