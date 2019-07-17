package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andCaAlumniIdIsNull() {
            addCriterion("CA_Alumni_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdIsNotNull() {
            addCriterion("CA_Alumni_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdEqualTo(Integer value) {
            addCriterion("CA_Alumni_ID =", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdNotEqualTo(Integer value) {
            addCriterion("CA_Alumni_ID <>", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdGreaterThan(Integer value) {
            addCriterion("CA_Alumni_ID >", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Alumni_ID >=", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdLessThan(Integer value) {
            addCriterion("CA_Alumni_ID <", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Alumni_ID <=", value, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdIn(List<Integer> values) {
            addCriterion("CA_Alumni_ID in", values, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdNotIn(List<Integer> values) {
            addCriterion("CA_Alumni_ID not in", values, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Alumni_ID between", value1, value2, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andCaAlumniIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Alumni_ID not between", value1, value2, "caAlumniId");
            return (Criteria) this;
        }

        public Criteria andActivityClassIsNull() {
            addCriterion("activity_class is null");
            return (Criteria) this;
        }

        public Criteria andActivityClassIsNotNull() {
            addCriterion("activity_class is not null");
            return (Criteria) this;
        }

        public Criteria andActivityClassEqualTo(String value) {
            addCriterion("activity_class =", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassNotEqualTo(String value) {
            addCriterion("activity_class <>", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassGreaterThan(String value) {
            addCriterion("activity_class >", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassGreaterThanOrEqualTo(String value) {
            addCriterion("activity_class >=", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassLessThan(String value) {
            addCriterion("activity_class <", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassLessThanOrEqualTo(String value) {
            addCriterion("activity_class <=", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassLike(String value) {
            addCriterion("activity_class like", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassNotLike(String value) {
            addCriterion("activity_class not like", value, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassIn(List<String> values) {
            addCriterion("activity_class in", values, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassNotIn(List<String> values) {
            addCriterion("activity_class not in", values, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassBetween(String value1, String value2) {
            addCriterion("activity_class between", value1, value2, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityClassNotBetween(String value1, String value2) {
            addCriterion("activity_class not between", value1, value2, "activityClass");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotIsNull() {
            addCriterion("activity_back_or_not is null");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotIsNotNull() {
            addCriterion("activity_back_or_not is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotEqualTo(Boolean value) {
            addCriterion("activity_back_or_not =", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotNotEqualTo(Boolean value) {
            addCriterion("activity_back_or_not <>", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotGreaterThan(Boolean value) {
            addCriterion("activity_back_or_not >", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activity_back_or_not >=", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotLessThan(Boolean value) {
            addCriterion("activity_back_or_not <", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotLessThanOrEqualTo(Boolean value) {
            addCriterion("activity_back_or_not <=", value, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotIn(List<Boolean> values) {
            addCriterion("activity_back_or_not in", values, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotNotIn(List<Boolean> values) {
            addCriterion("activity_back_or_not not in", values, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_back_or_not between", value1, value2, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityBackOrNotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_back_or_not not between", value1, value2, "activityBackOrNot");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIsNull() {
            addCriterion("activity_creater is null");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIsNotNull() {
            addCriterion("activity_creater is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterEqualTo(String value) {
            addCriterion("activity_creater =", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotEqualTo(String value) {
            addCriterion("activity_creater <>", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterGreaterThan(String value) {
            addCriterion("activity_creater >", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("activity_creater >=", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLessThan(String value) {
            addCriterion("activity_creater <", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLessThanOrEqualTo(String value) {
            addCriterion("activity_creater <=", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLike(String value) {
            addCriterion("activity_creater like", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotLike(String value) {
            addCriterion("activity_creater not like", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIn(List<String> values) {
            addCriterion("activity_creater in", values, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotIn(List<String> values) {
            addCriterion("activity_creater not in", values, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterBetween(String value1, String value2) {
            addCriterion("activity_creater between", value1, value2, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotBetween(String value1, String value2) {
            addCriterion("activity_creater not between", value1, value2, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityDateIsNull() {
            addCriterion("activity_date is null");
            return (Criteria) this;
        }

        public Criteria andActivityDateIsNotNull() {
            addCriterion("activity_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDateEqualTo(Date value) {
            addCriterion("activity_date =", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateNotEqualTo(Date value) {
            addCriterion("activity_date <>", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateGreaterThan(Date value) {
            addCriterion("activity_date >", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_date >=", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateLessThan(Date value) {
            addCriterion("activity_date <", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateLessThanOrEqualTo(Date value) {
            addCriterion("activity_date <=", value, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateIn(List<Date> values) {
            addCriterion("activity_date in", values, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateNotIn(List<Date> values) {
            addCriterion("activity_date not in", values, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateBetween(Date value1, Date value2) {
            addCriterion("activity_date between", value1, value2, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivityDateNotBetween(Date value1, Date value2) {
            addCriterion("activity_date not between", value1, value2, "activityDate");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIsNull() {
            addCriterion("activity_site is null");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIsNotNull() {
            addCriterion("activity_site is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySiteEqualTo(String value) {
            addCriterion("activity_site =", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotEqualTo(String value) {
            addCriterion("activity_site <>", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteGreaterThan(String value) {
            addCriterion("activity_site >", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteGreaterThanOrEqualTo(String value) {
            addCriterion("activity_site >=", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLessThan(String value) {
            addCriterion("activity_site <", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLessThanOrEqualTo(String value) {
            addCriterion("activity_site <=", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteLike(String value) {
            addCriterion("activity_site like", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotLike(String value) {
            addCriterion("activity_site not like", value, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteIn(List<String> values) {
            addCriterion("activity_site in", values, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotIn(List<String> values) {
            addCriterion("activity_site not in", values, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteBetween(String value1, String value2) {
            addCriterion("activity_site between", value1, value2, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivitySiteNotBetween(String value1, String value2) {
            addCriterion("activity_site not between", value1, value2, "activitySite");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("activity_status =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("activity_status <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("activity_status >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("activity_status >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("activity_status <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("activity_status <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("activity_status like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("activity_status not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("activity_status in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("activity_status not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("activity_status between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("activity_status not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityResultIsNull() {
            addCriterion("activity_result is null");
            return (Criteria) this;
        }

        public Criteria andActivityResultIsNotNull() {
            addCriterion("activity_result is not null");
            return (Criteria) this;
        }

        public Criteria andActivityResultEqualTo(String value) {
            addCriterion("activity_result =", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultNotEqualTo(String value) {
            addCriterion("activity_result <>", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultGreaterThan(String value) {
            addCriterion("activity_result >", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultGreaterThanOrEqualTo(String value) {
            addCriterion("activity_result >=", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultLessThan(String value) {
            addCriterion("activity_result <", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultLessThanOrEqualTo(String value) {
            addCriterion("activity_result <=", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultLike(String value) {
            addCriterion("activity_result like", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultNotLike(String value) {
            addCriterion("activity_result not like", value, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultIn(List<String> values) {
            addCriterion("activity_result in", values, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultNotIn(List<String> values) {
            addCriterion("activity_result not in", values, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultBetween(String value1, String value2) {
            addCriterion("activity_result between", value1, value2, "activityResult");
            return (Criteria) this;
        }

        public Criteria andActivityResultNotBetween(String value1, String value2) {
            addCriterion("activity_result not between", value1, value2, "activityResult");
            return (Criteria) this;
        }

        public Criteria andAttribute100IsNull() {
            addCriterion("Attribute_100 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute100IsNotNull() {
            addCriterion("Attribute_100 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute100EqualTo(String value) {
            addCriterion("Attribute_100 =", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100NotEqualTo(String value) {
            addCriterion("Attribute_100 <>", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100GreaterThan(String value) {
            addCriterion("Attribute_100 >", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_100 >=", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100LessThan(String value) {
            addCriterion("Attribute_100 <", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100LessThanOrEqualTo(String value) {
            addCriterion("Attribute_100 <=", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100Like(String value) {
            addCriterion("Attribute_100 like", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100NotLike(String value) {
            addCriterion("Attribute_100 not like", value, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100In(List<String> values) {
            addCriterion("Attribute_100 in", values, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100NotIn(List<String> values) {
            addCriterion("Attribute_100 not in", values, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100Between(String value1, String value2) {
            addCriterion("Attribute_100 between", value1, value2, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute100NotBetween(String value1, String value2) {
            addCriterion("Attribute_100 not between", value1, value2, "attribute100");
            return (Criteria) this;
        }

        public Criteria andAttribute101IsNull() {
            addCriterion("Attribute_101 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute101IsNotNull() {
            addCriterion("Attribute_101 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute101EqualTo(String value) {
            addCriterion("Attribute_101 =", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101NotEqualTo(String value) {
            addCriterion("Attribute_101 <>", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101GreaterThan(String value) {
            addCriterion("Attribute_101 >", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_101 >=", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101LessThan(String value) {
            addCriterion("Attribute_101 <", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101LessThanOrEqualTo(String value) {
            addCriterion("Attribute_101 <=", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101Like(String value) {
            addCriterion("Attribute_101 like", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101NotLike(String value) {
            addCriterion("Attribute_101 not like", value, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101In(List<String> values) {
            addCriterion("Attribute_101 in", values, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101NotIn(List<String> values) {
            addCriterion("Attribute_101 not in", values, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101Between(String value1, String value2) {
            addCriterion("Attribute_101 between", value1, value2, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute101NotBetween(String value1, String value2) {
            addCriterion("Attribute_101 not between", value1, value2, "attribute101");
            return (Criteria) this;
        }

        public Criteria andAttribute102IsNull() {
            addCriterion("Attribute_102 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute102IsNotNull() {
            addCriterion("Attribute_102 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute102EqualTo(String value) {
            addCriterion("Attribute_102 =", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102NotEqualTo(String value) {
            addCriterion("Attribute_102 <>", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102GreaterThan(String value) {
            addCriterion("Attribute_102 >", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_102 >=", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102LessThan(String value) {
            addCriterion("Attribute_102 <", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102LessThanOrEqualTo(String value) {
            addCriterion("Attribute_102 <=", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102Like(String value) {
            addCriterion("Attribute_102 like", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102NotLike(String value) {
            addCriterion("Attribute_102 not like", value, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102In(List<String> values) {
            addCriterion("Attribute_102 in", values, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102NotIn(List<String> values) {
            addCriterion("Attribute_102 not in", values, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102Between(String value1, String value2) {
            addCriterion("Attribute_102 between", value1, value2, "attribute102");
            return (Criteria) this;
        }

        public Criteria andAttribute102NotBetween(String value1, String value2) {
            addCriterion("Attribute_102 not between", value1, value2, "attribute102");
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