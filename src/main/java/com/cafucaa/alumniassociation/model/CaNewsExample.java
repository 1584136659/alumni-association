package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CaNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaNewsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCaNewsIdIsNull() {
            addCriterion("CA_News_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdIsNotNull() {
            addCriterion("CA_News_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdEqualTo(Integer value) {
            addCriterion("CA_News_ID =", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdNotEqualTo(Integer value) {
            addCriterion("CA_News_ID <>", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdGreaterThan(Integer value) {
            addCriterion("CA_News_ID >", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_News_ID >=", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdLessThan(Integer value) {
            addCriterion("CA_News_ID <", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_News_ID <=", value, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdIn(List<Integer> values) {
            addCriterion("CA_News_ID in", values, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdNotIn(List<Integer> values) {
            addCriterion("CA_News_ID not in", values, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_News_ID between", value1, value2, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andCaNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_News_ID not between", value1, value2, "caNewsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("news_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("news_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterionForJDBCDate("news_date =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("news_date <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("news_date >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("news_date >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterionForJDBCDate("news_date <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("news_date <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterionForJDBCDate("news_date in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("news_date not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("news_date between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("news_date not between", value1, value2, "newsDate");
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