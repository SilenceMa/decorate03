package com.decorate.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andCreateauthorIsNull() {
            addCriterion("createAuthor is null");
            return (Criteria) this;
        }

        public Criteria andCreateauthorIsNotNull() {
            addCriterion("createAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andCreateauthorEqualTo(String value) {
            addCriterion("createAuthor =", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorNotEqualTo(String value) {
            addCriterion("createAuthor <>", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorGreaterThan(String value) {
            addCriterion("createAuthor >", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorGreaterThanOrEqualTo(String value) {
            addCriterion("createAuthor >=", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorLessThan(String value) {
            addCriterion("createAuthor <", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorLessThanOrEqualTo(String value) {
            addCriterion("createAuthor <=", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorLike(String value) {
            addCriterion("createAuthor like", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorNotLike(String value) {
            addCriterion("createAuthor not like", value, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorIn(List<String> values) {
            addCriterion("createAuthor in", values, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorNotIn(List<String> values) {
            addCriterion("createAuthor not in", values, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorBetween(String value1, String value2) {
            addCriterion("createAuthor between", value1, value2, "createauthor");
            return (Criteria) this;
        }

        public Criteria andCreateauthorNotBetween(String value1, String value2) {
            addCriterion("createAuthor not between", value1, value2, "createauthor");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdIsNull() {
            addCriterion("noticetype_Id is null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdIsNotNull() {
            addCriterion("noticetype_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdEqualTo(Integer value) {
            addCriterion("noticetype_Id =", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdNotEqualTo(Integer value) {
            addCriterion("noticetype_Id <>", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdGreaterThan(Integer value) {
            addCriterion("noticetype_Id >", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticetype_Id >=", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdLessThan(Integer value) {
            addCriterion("noticetype_Id <", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("noticetype_Id <=", value, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdIn(List<Integer> values) {
            addCriterion("noticetype_Id in", values, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdNotIn(List<Integer> values) {
            addCriterion("noticetype_Id not in", values, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdBetween(Integer value1, Integer value2) {
            addCriterion("noticetype_Id between", value1, value2, "noticetypeId");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("noticetype_Id not between", value1, value2, "noticetypeId");
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