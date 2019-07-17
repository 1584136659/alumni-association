package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class SouvenirExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SouvenirExample() {
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

        public Criteria andCaSouvenirIdIsNull() {
            addCriterion("CA_Souvenir_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdIsNotNull() {
            addCriterion("CA_Souvenir_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdEqualTo(Integer value) {
            addCriterion("CA_Souvenir_ID =", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdNotEqualTo(Integer value) {
            addCriterion("CA_Souvenir_ID <>", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdGreaterThan(Integer value) {
            addCriterion("CA_Souvenir_ID >", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Souvenir_ID >=", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdLessThan(Integer value) {
            addCriterion("CA_Souvenir_ID <", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Souvenir_ID <=", value, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdIn(List<Integer> values) {
            addCriterion("CA_Souvenir_ID in", values, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdNotIn(List<Integer> values) {
            addCriterion("CA_Souvenir_ID not in", values, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Souvenir_ID between", value1, value2, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andCaSouvenirIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Souvenir_ID not between", value1, value2, "caSouvenirId");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameIsNull() {
            addCriterion("souvenir_name is null");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameIsNotNull() {
            addCriterion("souvenir_name is not null");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameEqualTo(String value) {
            addCriterion("souvenir_name =", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameNotEqualTo(String value) {
            addCriterion("souvenir_name <>", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameGreaterThan(String value) {
            addCriterion("souvenir_name >", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameGreaterThanOrEqualTo(String value) {
            addCriterion("souvenir_name >=", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameLessThan(String value) {
            addCriterion("souvenir_name <", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameLessThanOrEqualTo(String value) {
            addCriterion("souvenir_name <=", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameLike(String value) {
            addCriterion("souvenir_name like", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameNotLike(String value) {
            addCriterion("souvenir_name not like", value, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameIn(List<String> values) {
            addCriterion("souvenir_name in", values, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameNotIn(List<String> values) {
            addCriterion("souvenir_name not in", values, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameBetween(String value1, String value2) {
            addCriterion("souvenir_name between", value1, value2, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirNameNotBetween(String value1, String value2) {
            addCriterion("souvenir_name not between", value1, value2, "souvenirName");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlIsNull() {
            addCriterion("souvenir_url is null");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlIsNotNull() {
            addCriterion("souvenir_url is not null");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlEqualTo(String value) {
            addCriterion("souvenir_url =", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlNotEqualTo(String value) {
            addCriterion("souvenir_url <>", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlGreaterThan(String value) {
            addCriterion("souvenir_url >", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlGreaterThanOrEqualTo(String value) {
            addCriterion("souvenir_url >=", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlLessThan(String value) {
            addCriterion("souvenir_url <", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlLessThanOrEqualTo(String value) {
            addCriterion("souvenir_url <=", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlLike(String value) {
            addCriterion("souvenir_url like", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlNotLike(String value) {
            addCriterion("souvenir_url not like", value, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlIn(List<String> values) {
            addCriterion("souvenir_url in", values, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlNotIn(List<String> values) {
            addCriterion("souvenir_url not in", values, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlBetween(String value1, String value2) {
            addCriterion("souvenir_url between", value1, value2, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andSouvenirUrlNotBetween(String value1, String value2) {
            addCriterion("souvenir_url not between", value1, value2, "souvenirUrl");
            return (Criteria) this;
        }

        public Criteria andAttribute91IsNull() {
            addCriterion("Attribute_91 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute91IsNotNull() {
            addCriterion("Attribute_91 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute91EqualTo(String value) {
            addCriterion("Attribute_91 =", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91NotEqualTo(String value) {
            addCriterion("Attribute_91 <>", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91GreaterThan(String value) {
            addCriterion("Attribute_91 >", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_91 >=", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91LessThan(String value) {
            addCriterion("Attribute_91 <", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91LessThanOrEqualTo(String value) {
            addCriterion("Attribute_91 <=", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91Like(String value) {
            addCriterion("Attribute_91 like", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91NotLike(String value) {
            addCriterion("Attribute_91 not like", value, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91In(List<String> values) {
            addCriterion("Attribute_91 in", values, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91NotIn(List<String> values) {
            addCriterion("Attribute_91 not in", values, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91Between(String value1, String value2) {
            addCriterion("Attribute_91 between", value1, value2, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute91NotBetween(String value1, String value2) {
            addCriterion("Attribute_91 not between", value1, value2, "attribute91");
            return (Criteria) this;
        }

        public Criteria andAttribute92IsNull() {
            addCriterion("Attribute_92 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute92IsNotNull() {
            addCriterion("Attribute_92 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute92EqualTo(String value) {
            addCriterion("Attribute_92 =", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92NotEqualTo(String value) {
            addCriterion("Attribute_92 <>", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92GreaterThan(String value) {
            addCriterion("Attribute_92 >", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_92 >=", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92LessThan(String value) {
            addCriterion("Attribute_92 <", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92LessThanOrEqualTo(String value) {
            addCriterion("Attribute_92 <=", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92Like(String value) {
            addCriterion("Attribute_92 like", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92NotLike(String value) {
            addCriterion("Attribute_92 not like", value, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92In(List<String> values) {
            addCriterion("Attribute_92 in", values, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92NotIn(List<String> values) {
            addCriterion("Attribute_92 not in", values, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92Between(String value1, String value2) {
            addCriterion("Attribute_92 between", value1, value2, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute92NotBetween(String value1, String value2) {
            addCriterion("Attribute_92 not between", value1, value2, "attribute92");
            return (Criteria) this;
        }

        public Criteria andAttribute93IsNull() {
            addCriterion("Attribute_93 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute93IsNotNull() {
            addCriterion("Attribute_93 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute93EqualTo(String value) {
            addCriterion("Attribute_93 =", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93NotEqualTo(String value) {
            addCriterion("Attribute_93 <>", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93GreaterThan(String value) {
            addCriterion("Attribute_93 >", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_93 >=", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93LessThan(String value) {
            addCriterion("Attribute_93 <", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93LessThanOrEqualTo(String value) {
            addCriterion("Attribute_93 <=", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93Like(String value) {
            addCriterion("Attribute_93 like", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93NotLike(String value) {
            addCriterion("Attribute_93 not like", value, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93In(List<String> values) {
            addCriterion("Attribute_93 in", values, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93NotIn(List<String> values) {
            addCriterion("Attribute_93 not in", values, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93Between(String value1, String value2) {
            addCriterion("Attribute_93 between", value1, value2, "attribute93");
            return (Criteria) this;
        }

        public Criteria andAttribute93NotBetween(String value1, String value2) {
            addCriterion("Attribute_93 not between", value1, value2, "attribute93");
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