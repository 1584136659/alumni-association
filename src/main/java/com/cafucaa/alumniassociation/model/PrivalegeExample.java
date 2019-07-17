package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class PrivalegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrivalegeExample() {
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

        public Criteria andCaPrivalegeIdIsNull() {
            addCriterion("CA_Privalege_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdIsNotNull() {
            addCriterion("CA_Privalege_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdEqualTo(Integer value) {
            addCriterion("CA_Privalege_ID =", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdNotEqualTo(Integer value) {
            addCriterion("CA_Privalege_ID <>", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdGreaterThan(Integer value) {
            addCriterion("CA_Privalege_ID >", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Privalege_ID >=", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdLessThan(Integer value) {
            addCriterion("CA_Privalege_ID <", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Privalege_ID <=", value, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdIn(List<Integer> values) {
            addCriterion("CA_Privalege_ID in", values, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdNotIn(List<Integer> values) {
            addCriterion("CA_Privalege_ID not in", values, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Privalege_ID between", value1, value2, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andCaPrivalegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Privalege_ID not between", value1, value2, "caPrivalegeId");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameIsNull() {
            addCriterion("privalege_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameIsNotNull() {
            addCriterion("privalege_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameEqualTo(String value) {
            addCriterion("privalege_name =", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameNotEqualTo(String value) {
            addCriterion("privalege_name <>", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameGreaterThan(String value) {
            addCriterion("privalege_name >", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("privalege_name >=", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameLessThan(String value) {
            addCriterion("privalege_name <", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameLessThanOrEqualTo(String value) {
            addCriterion("privalege_name <=", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameLike(String value) {
            addCriterion("privalege_name like", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameNotLike(String value) {
            addCriterion("privalege_name not like", value, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameIn(List<String> values) {
            addCriterion("privalege_name in", values, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameNotIn(List<String> values) {
            addCriterion("privalege_name not in", values, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameBetween(String value1, String value2) {
            addCriterion("privalege_name between", value1, value2, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeNameNotBetween(String value1, String value2) {
            addCriterion("privalege_name not between", value1, value2, "privalegeName");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationIsNull() {
            addCriterion("privalege_illutration is null");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationIsNotNull() {
            addCriterion("privalege_illutration is not null");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationEqualTo(String value) {
            addCriterion("privalege_illutration =", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationNotEqualTo(String value) {
            addCriterion("privalege_illutration <>", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationGreaterThan(String value) {
            addCriterion("privalege_illutration >", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationGreaterThanOrEqualTo(String value) {
            addCriterion("privalege_illutration >=", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationLessThan(String value) {
            addCriterion("privalege_illutration <", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationLessThanOrEqualTo(String value) {
            addCriterion("privalege_illutration <=", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationLike(String value) {
            addCriterion("privalege_illutration like", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationNotLike(String value) {
            addCriterion("privalege_illutration not like", value, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationIn(List<String> values) {
            addCriterion("privalege_illutration in", values, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationNotIn(List<String> values) {
            addCriterion("privalege_illutration not in", values, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationBetween(String value1, String value2) {
            addCriterion("privalege_illutration between", value1, value2, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andPrivalegeIllutrationNotBetween(String value1, String value2) {
            addCriterion("privalege_illutration not between", value1, value2, "privalegeIllutration");
            return (Criteria) this;
        }

        public Criteria andAttribute88IsNull() {
            addCriterion("Attribute_88 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute88IsNotNull() {
            addCriterion("Attribute_88 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute88EqualTo(String value) {
            addCriterion("Attribute_88 =", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88NotEqualTo(String value) {
            addCriterion("Attribute_88 <>", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88GreaterThan(String value) {
            addCriterion("Attribute_88 >", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_88 >=", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88LessThan(String value) {
            addCriterion("Attribute_88 <", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88LessThanOrEqualTo(String value) {
            addCriterion("Attribute_88 <=", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88Like(String value) {
            addCriterion("Attribute_88 like", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88NotLike(String value) {
            addCriterion("Attribute_88 not like", value, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88In(List<String> values) {
            addCriterion("Attribute_88 in", values, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88NotIn(List<String> values) {
            addCriterion("Attribute_88 not in", values, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88Between(String value1, String value2) {
            addCriterion("Attribute_88 between", value1, value2, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute88NotBetween(String value1, String value2) {
            addCriterion("Attribute_88 not between", value1, value2, "attribute88");
            return (Criteria) this;
        }

        public Criteria andAttribute89IsNull() {
            addCriterion("Attribute_89 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute89IsNotNull() {
            addCriterion("Attribute_89 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute89EqualTo(String value) {
            addCriterion("Attribute_89 =", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89NotEqualTo(String value) {
            addCriterion("Attribute_89 <>", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89GreaterThan(String value) {
            addCriterion("Attribute_89 >", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_89 >=", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89LessThan(String value) {
            addCriterion("Attribute_89 <", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89LessThanOrEqualTo(String value) {
            addCriterion("Attribute_89 <=", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89Like(String value) {
            addCriterion("Attribute_89 like", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89NotLike(String value) {
            addCriterion("Attribute_89 not like", value, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89In(List<String> values) {
            addCriterion("Attribute_89 in", values, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89NotIn(List<String> values) {
            addCriterion("Attribute_89 not in", values, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89Between(String value1, String value2) {
            addCriterion("Attribute_89 between", value1, value2, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute89NotBetween(String value1, String value2) {
            addCriterion("Attribute_89 not between", value1, value2, "attribute89");
            return (Criteria) this;
        }

        public Criteria andAttribute90IsNull() {
            addCriterion("Attribute_90 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute90IsNotNull() {
            addCriterion("Attribute_90 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute90EqualTo(String value) {
            addCriterion("Attribute_90 =", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90NotEqualTo(String value) {
            addCriterion("Attribute_90 <>", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90GreaterThan(String value) {
            addCriterion("Attribute_90 >", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_90 >=", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90LessThan(String value) {
            addCriterion("Attribute_90 <", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90LessThanOrEqualTo(String value) {
            addCriterion("Attribute_90 <=", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90Like(String value) {
            addCriterion("Attribute_90 like", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90NotLike(String value) {
            addCriterion("Attribute_90 not like", value, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90In(List<String> values) {
            addCriterion("Attribute_90 in", values, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90NotIn(List<String> values) {
            addCriterion("Attribute_90 not in", values, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90Between(String value1, String value2) {
            addCriterion("Attribute_90 between", value1, value2, "attribute90");
            return (Criteria) this;
        }

        public Criteria andAttribute90NotBetween(String value1, String value2) {
            addCriterion("Attribute_90 not between", value1, value2, "attribute90");
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