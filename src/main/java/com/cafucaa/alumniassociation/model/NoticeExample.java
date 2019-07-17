package com.cafucaa.alumniassociation.model;

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

        public Criteria andCaNoticeIdIsNull() {
            addCriterion("CA_Notice_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdIsNotNull() {
            addCriterion("CA_Notice_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdEqualTo(Integer value) {
            addCriterion("CA_Notice_ID =", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdNotEqualTo(Integer value) {
            addCriterion("CA_Notice_ID <>", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdGreaterThan(Integer value) {
            addCriterion("CA_Notice_ID >", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Notice_ID >=", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdLessThan(Integer value) {
            addCriterion("CA_Notice_ID <", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Notice_ID <=", value, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdIn(List<Integer> values) {
            addCriterion("CA_Notice_ID in", values, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdNotIn(List<Integer> values) {
            addCriterion("CA_Notice_ID not in", values, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Notice_ID between", value1, value2, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andCaNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Notice_ID not between", value1, value2, "caNoticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("notice_content is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("notice_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("notice_content =", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("notice_content <>", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("notice_content >", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("notice_content >=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("notice_content <", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("notice_content <=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("notice_content like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("notice_content not like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("notice_content in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("notice_content not in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("notice_content between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("notice_content not between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNull() {
            addCriterion("notice_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNotNull() {
            addCriterion("notice_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateEqualTo(Date value) {
            addCriterion("notice_date =", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotEqualTo(Date value) {
            addCriterion("notice_date <>", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThan(Date value) {
            addCriterion("notice_date >", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_date >=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThan(Date value) {
            addCriterion("notice_date <", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("notice_date <=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIn(List<Date> values) {
            addCriterion("notice_date in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotIn(List<Date> values) {
            addCriterion("notice_date not in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateBetween(Date value1, Date value2) {
            addCriterion("notice_date between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("notice_date not between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andAttribute79IsNull() {
            addCriterion("Attribute_79 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute79IsNotNull() {
            addCriterion("Attribute_79 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute79EqualTo(String value) {
            addCriterion("Attribute_79 =", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79NotEqualTo(String value) {
            addCriterion("Attribute_79 <>", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79GreaterThan(String value) {
            addCriterion("Attribute_79 >", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_79 >=", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79LessThan(String value) {
            addCriterion("Attribute_79 <", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79LessThanOrEqualTo(String value) {
            addCriterion("Attribute_79 <=", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79Like(String value) {
            addCriterion("Attribute_79 like", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79NotLike(String value) {
            addCriterion("Attribute_79 not like", value, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79In(List<String> values) {
            addCriterion("Attribute_79 in", values, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79NotIn(List<String> values) {
            addCriterion("Attribute_79 not in", values, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79Between(String value1, String value2) {
            addCriterion("Attribute_79 between", value1, value2, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute79NotBetween(String value1, String value2) {
            addCriterion("Attribute_79 not between", value1, value2, "attribute79");
            return (Criteria) this;
        }

        public Criteria andAttribute80IsNull() {
            addCriterion("Attribute_80 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute80IsNotNull() {
            addCriterion("Attribute_80 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute80EqualTo(String value) {
            addCriterion("Attribute_80 =", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80NotEqualTo(String value) {
            addCriterion("Attribute_80 <>", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80GreaterThan(String value) {
            addCriterion("Attribute_80 >", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_80 >=", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80LessThan(String value) {
            addCriterion("Attribute_80 <", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80LessThanOrEqualTo(String value) {
            addCriterion("Attribute_80 <=", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80Like(String value) {
            addCriterion("Attribute_80 like", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80NotLike(String value) {
            addCriterion("Attribute_80 not like", value, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80In(List<String> values) {
            addCriterion("Attribute_80 in", values, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80NotIn(List<String> values) {
            addCriterion("Attribute_80 not in", values, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80Between(String value1, String value2) {
            addCriterion("Attribute_80 between", value1, value2, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute80NotBetween(String value1, String value2) {
            addCriterion("Attribute_80 not between", value1, value2, "attribute80");
            return (Criteria) this;
        }

        public Criteria andAttribute81IsNull() {
            addCriterion("Attribute_81 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute81IsNotNull() {
            addCriterion("Attribute_81 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute81EqualTo(String value) {
            addCriterion("Attribute_81 =", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81NotEqualTo(String value) {
            addCriterion("Attribute_81 <>", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81GreaterThan(String value) {
            addCriterion("Attribute_81 >", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_81 >=", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81LessThan(String value) {
            addCriterion("Attribute_81 <", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81LessThanOrEqualTo(String value) {
            addCriterion("Attribute_81 <=", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81Like(String value) {
            addCriterion("Attribute_81 like", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81NotLike(String value) {
            addCriterion("Attribute_81 not like", value, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81In(List<String> values) {
            addCriterion("Attribute_81 in", values, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81NotIn(List<String> values) {
            addCriterion("Attribute_81 not in", values, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81Between(String value1, String value2) {
            addCriterion("Attribute_81 between", value1, value2, "attribute81");
            return (Criteria) this;
        }

        public Criteria andAttribute81NotBetween(String value1, String value2) {
            addCriterion("Attribute_81 not between", value1, value2, "attribute81");
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