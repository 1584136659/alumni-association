package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class RelationshipsActivityClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationshipsActivityClassExample() {
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

        public Criteria andCaActivityIdIsNull() {
            addCriterion("CA_Activity_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdIsNotNull() {
            addCriterion("CA_Activity_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdEqualTo(Integer value) {
            addCriterion("CA_Activity_ID =", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdNotEqualTo(Integer value) {
            addCriterion("CA_Activity_ID <>", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdGreaterThan(Integer value) {
            addCriterion("CA_Activity_ID >", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Activity_ID >=", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdLessThan(Integer value) {
            addCriterion("CA_Activity_ID <", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Activity_ID <=", value, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdIn(List<Integer> values) {
            addCriterion("CA_Activity_ID in", values, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdNotIn(List<Integer> values) {
            addCriterion("CA_Activity_ID not in", values, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Activity_ID between", value1, value2, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Activity_ID not between", value1, value2, "caActivityId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdIsNull() {
            addCriterion("CA_Class_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaClassIdIsNotNull() {
            addCriterion("CA_Class_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaClassIdEqualTo(Integer value) {
            addCriterion("CA_Class_ID =", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdNotEqualTo(Integer value) {
            addCriterion("CA_Class_ID <>", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdGreaterThan(Integer value) {
            addCriterion("CA_Class_ID >", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Class_ID >=", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdLessThan(Integer value) {
            addCriterion("CA_Class_ID <", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Class_ID <=", value, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdIn(List<Integer> values) {
            addCriterion("CA_Class_ID in", values, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdNotIn(List<Integer> values) {
            addCriterion("CA_Class_ID not in", values, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class_ID between", value1, value2, "caClassId");
            return (Criteria) this;
        }

        public Criteria andCaClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class_ID not between", value1, value2, "caClassId");
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