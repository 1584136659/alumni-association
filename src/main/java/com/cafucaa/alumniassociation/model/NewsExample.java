package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsContentIsNull() {
            addCriterion("news_content is null");
            return (Criteria) this;
        }

        public Criteria andNewsContentIsNotNull() {
            addCriterion("news_content is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContentEqualTo(String value) {
            addCriterion("news_content =", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotEqualTo(String value) {
            addCriterion("news_content <>", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThan(String value) {
            addCriterion("news_content >", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThanOrEqualTo(String value) {
            addCriterion("news_content >=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThan(String value) {
            addCriterion("news_content <", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThanOrEqualTo(String value) {
            addCriterion("news_content <=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLike(String value) {
            addCriterion("news_content like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotLike(String value) {
            addCriterion("news_content not like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentIn(List<String> values) {
            addCriterion("news_content in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotIn(List<String> values) {
            addCriterion("news_content not in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentBetween(String value1, String value2) {
            addCriterion("news_content between", value1, value2, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotBetween(String value1, String value2) {
            addCriterion("news_content not between", value1, value2, "newsContent");
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
            addCriterion("news_date =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("news_date <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("news_date >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_date >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("news_date <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("news_date <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("news_date in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("news_date not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("news_date between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("news_date not between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("news_url is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("news_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("news_url =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("news_url <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("news_url >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("news_url >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("news_url <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("news_url <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("news_url like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("news_url not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("news_url in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("news_url not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("news_url between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("news_url not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andAttribute73IsNull() {
            addCriterion("Attribute_73 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute73IsNotNull() {
            addCriterion("Attribute_73 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute73EqualTo(String value) {
            addCriterion("Attribute_73 =", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73NotEqualTo(String value) {
            addCriterion("Attribute_73 <>", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73GreaterThan(String value) {
            addCriterion("Attribute_73 >", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_73 >=", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73LessThan(String value) {
            addCriterion("Attribute_73 <", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73LessThanOrEqualTo(String value) {
            addCriterion("Attribute_73 <=", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73Like(String value) {
            addCriterion("Attribute_73 like", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73NotLike(String value) {
            addCriterion("Attribute_73 not like", value, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73In(List<String> values) {
            addCriterion("Attribute_73 in", values, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73NotIn(List<String> values) {
            addCriterion("Attribute_73 not in", values, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73Between(String value1, String value2) {
            addCriterion("Attribute_73 between", value1, value2, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute73NotBetween(String value1, String value2) {
            addCriterion("Attribute_73 not between", value1, value2, "attribute73");
            return (Criteria) this;
        }

        public Criteria andAttribute74IsNull() {
            addCriterion("Attribute_74 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute74IsNotNull() {
            addCriterion("Attribute_74 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute74EqualTo(String value) {
            addCriterion("Attribute_74 =", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74NotEqualTo(String value) {
            addCriterion("Attribute_74 <>", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74GreaterThan(String value) {
            addCriterion("Attribute_74 >", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_74 >=", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74LessThan(String value) {
            addCriterion("Attribute_74 <", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74LessThanOrEqualTo(String value) {
            addCriterion("Attribute_74 <=", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74Like(String value) {
            addCriterion("Attribute_74 like", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74NotLike(String value) {
            addCriterion("Attribute_74 not like", value, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74In(List<String> values) {
            addCriterion("Attribute_74 in", values, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74NotIn(List<String> values) {
            addCriterion("Attribute_74 not in", values, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74Between(String value1, String value2) {
            addCriterion("Attribute_74 between", value1, value2, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute74NotBetween(String value1, String value2) {
            addCriterion("Attribute_74 not between", value1, value2, "attribute74");
            return (Criteria) this;
        }

        public Criteria andAttribute75IsNull() {
            addCriterion("Attribute_75 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute75IsNotNull() {
            addCriterion("Attribute_75 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute75EqualTo(String value) {
            addCriterion("Attribute_75 =", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75NotEqualTo(String value) {
            addCriterion("Attribute_75 <>", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75GreaterThan(String value) {
            addCriterion("Attribute_75 >", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_75 >=", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75LessThan(String value) {
            addCriterion("Attribute_75 <", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75LessThanOrEqualTo(String value) {
            addCriterion("Attribute_75 <=", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75Like(String value) {
            addCriterion("Attribute_75 like", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75NotLike(String value) {
            addCriterion("Attribute_75 not like", value, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75In(List<String> values) {
            addCriterion("Attribute_75 in", values, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75NotIn(List<String> values) {
            addCriterion("Attribute_75 not in", values, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75Between(String value1, String value2) {
            addCriterion("Attribute_75 between", value1, value2, "attribute75");
            return (Criteria) this;
        }

        public Criteria andAttribute75NotBetween(String value1, String value2) {
            addCriterion("Attribute_75 not between", value1, value2, "attribute75");
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