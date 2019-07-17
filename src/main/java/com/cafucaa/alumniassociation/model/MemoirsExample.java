package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemoirsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoirsExample() {
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

        public Criteria andCaMemoirsIdIsNull() {
            addCriterion("CA_Memoirs_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdIsNotNull() {
            addCriterion("CA_Memoirs_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdEqualTo(Integer value) {
            addCriterion("CA_Memoirs_ID =", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdNotEqualTo(Integer value) {
            addCriterion("CA_Memoirs_ID <>", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdGreaterThan(Integer value) {
            addCriterion("CA_Memoirs_ID >", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Memoirs_ID >=", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdLessThan(Integer value) {
            addCriterion("CA_Memoirs_ID <", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Memoirs_ID <=", value, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdIn(List<Integer> values) {
            addCriterion("CA_Memoirs_ID in", values, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdNotIn(List<Integer> values) {
            addCriterion("CA_Memoirs_ID not in", values, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Memoirs_ID between", value1, value2, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andCaMemoirsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Memoirs_ID not between", value1, value2, "caMemoirsId");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleIsNull() {
            addCriterion("memoris_title is null");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleIsNotNull() {
            addCriterion("memoris_title is not null");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleEqualTo(String value) {
            addCriterion("memoris_title =", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleNotEqualTo(String value) {
            addCriterion("memoris_title <>", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleGreaterThan(String value) {
            addCriterion("memoris_title >", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleGreaterThanOrEqualTo(String value) {
            addCriterion("memoris_title >=", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleLessThan(String value) {
            addCriterion("memoris_title <", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleLessThanOrEqualTo(String value) {
            addCriterion("memoris_title <=", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleLike(String value) {
            addCriterion("memoris_title like", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleNotLike(String value) {
            addCriterion("memoris_title not like", value, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleIn(List<String> values) {
            addCriterion("memoris_title in", values, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleNotIn(List<String> values) {
            addCriterion("memoris_title not in", values, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleBetween(String value1, String value2) {
            addCriterion("memoris_title between", value1, value2, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisTitleNotBetween(String value1, String value2) {
            addCriterion("memoris_title not between", value1, value2, "memorisTitle");
            return (Criteria) this;
        }

        public Criteria andMemorisDateIsNull() {
            addCriterion("memoris_date is null");
            return (Criteria) this;
        }

        public Criteria andMemorisDateIsNotNull() {
            addCriterion("memoris_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemorisDateEqualTo(Date value) {
            addCriterionForJDBCDate("memoris_date =", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("memoris_date <>", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateGreaterThan(Date value) {
            addCriterionForJDBCDate("memoris_date >", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("memoris_date >=", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateLessThan(Date value) {
            addCriterionForJDBCDate("memoris_date <", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("memoris_date <=", value, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateIn(List<Date> values) {
            addCriterionForJDBCDate("memoris_date in", values, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("memoris_date not in", values, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("memoris_date between", value1, value2, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("memoris_date not between", value1, value2, "memorisDate");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlIsNull() {
            addCriterion("memoris_url is null");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlIsNotNull() {
            addCriterion("memoris_url is not null");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlEqualTo(String value) {
            addCriterion("memoris_url =", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlNotEqualTo(String value) {
            addCriterion("memoris_url <>", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlGreaterThan(String value) {
            addCriterion("memoris_url >", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlGreaterThanOrEqualTo(String value) {
            addCriterion("memoris_url >=", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlLessThan(String value) {
            addCriterion("memoris_url <", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlLessThanOrEqualTo(String value) {
            addCriterion("memoris_url <=", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlLike(String value) {
            addCriterion("memoris_url like", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlNotLike(String value) {
            addCriterion("memoris_url not like", value, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlIn(List<String> values) {
            addCriterion("memoris_url in", values, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlNotIn(List<String> values) {
            addCriterion("memoris_url not in", values, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlBetween(String value1, String value2) {
            addCriterion("memoris_url between", value1, value2, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andMemorisUrlNotBetween(String value1, String value2) {
            addCriterion("memoris_url not between", value1, value2, "memorisUrl");
            return (Criteria) this;
        }

        public Criteria andAttribute97IsNull() {
            addCriterion("Attribute_97 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute97IsNotNull() {
            addCriterion("Attribute_97 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute97EqualTo(String value) {
            addCriterion("Attribute_97 =", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97NotEqualTo(String value) {
            addCriterion("Attribute_97 <>", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97GreaterThan(String value) {
            addCriterion("Attribute_97 >", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_97 >=", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97LessThan(String value) {
            addCriterion("Attribute_97 <", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97LessThanOrEqualTo(String value) {
            addCriterion("Attribute_97 <=", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97Like(String value) {
            addCriterion("Attribute_97 like", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97NotLike(String value) {
            addCriterion("Attribute_97 not like", value, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97In(List<String> values) {
            addCriterion("Attribute_97 in", values, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97NotIn(List<String> values) {
            addCriterion("Attribute_97 not in", values, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97Between(String value1, String value2) {
            addCriterion("Attribute_97 between", value1, value2, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute97NotBetween(String value1, String value2) {
            addCriterion("Attribute_97 not between", value1, value2, "attribute97");
            return (Criteria) this;
        }

        public Criteria andAttribute98IsNull() {
            addCriterion("Attribute_98 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute98IsNotNull() {
            addCriterion("Attribute_98 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute98EqualTo(String value) {
            addCriterion("Attribute_98 =", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98NotEqualTo(String value) {
            addCriterion("Attribute_98 <>", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98GreaterThan(String value) {
            addCriterion("Attribute_98 >", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_98 >=", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98LessThan(String value) {
            addCriterion("Attribute_98 <", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98LessThanOrEqualTo(String value) {
            addCriterion("Attribute_98 <=", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98Like(String value) {
            addCriterion("Attribute_98 like", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98NotLike(String value) {
            addCriterion("Attribute_98 not like", value, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98In(List<String> values) {
            addCriterion("Attribute_98 in", values, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98NotIn(List<String> values) {
            addCriterion("Attribute_98 not in", values, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98Between(String value1, String value2) {
            addCriterion("Attribute_98 between", value1, value2, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute98NotBetween(String value1, String value2) {
            addCriterion("Attribute_98 not between", value1, value2, "attribute98");
            return (Criteria) this;
        }

        public Criteria andAttribute99IsNull() {
            addCriterion("Attribute_99 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute99IsNotNull() {
            addCriterion("Attribute_99 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute99EqualTo(String value) {
            addCriterion("Attribute_99 =", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99NotEqualTo(String value) {
            addCriterion("Attribute_99 <>", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99GreaterThan(String value) {
            addCriterion("Attribute_99 >", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_99 >=", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99LessThan(String value) {
            addCriterion("Attribute_99 <", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99LessThanOrEqualTo(String value) {
            addCriterion("Attribute_99 <=", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99Like(String value) {
            addCriterion("Attribute_99 like", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99NotLike(String value) {
            addCriterion("Attribute_99 not like", value, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99In(List<String> values) {
            addCriterion("Attribute_99 in", values, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99NotIn(List<String> values) {
            addCriterion("Attribute_99 not in", values, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99Between(String value1, String value2) {
            addCriterion("Attribute_99 between", value1, value2, "attribute99");
            return (Criteria) this;
        }

        public Criteria andAttribute99NotBetween(String value1, String value2) {
            addCriterion("Attribute_99 not between", value1, value2, "attribute99");
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