package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CaAlumniExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaAlumniExample() {
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

        public Criteria andCaRoleIdIsNull() {
            addCriterion("CA_role_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdIsNotNull() {
            addCriterion("CA_role_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdEqualTo(Integer value) {
            addCriterion("CA_role_ID =", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdNotEqualTo(Integer value) {
            addCriterion("CA_role_ID <>", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdGreaterThan(Integer value) {
            addCriterion("CA_role_ID >", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_role_ID >=", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdLessThan(Integer value) {
            addCriterion("CA_role_ID <", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_role_ID <=", value, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdIn(List<Integer> values) {
            addCriterion("CA_role_ID in", values, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdNotIn(List<Integer> values) {
            addCriterion("CA_role_ID not in", values, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_role_ID between", value1, value2, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_role_ID not between", value1, value2, "caRoleId");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdIsNull() {
            addCriterion("CA_Class1_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdIsNotNull() {
            addCriterion("CA_Class1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdEqualTo(Integer value) {
            addCriterion("CA_Class1_ID =", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdNotEqualTo(Integer value) {
            addCriterion("CA_Class1_ID <>", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdGreaterThan(Integer value) {
            addCriterion("CA_Class1_ID >", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Class1_ID >=", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdLessThan(Integer value) {
            addCriterion("CA_Class1_ID <", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Class1_ID <=", value, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdIn(List<Integer> values) {
            addCriterion("CA_Class1_ID in", values, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdNotIn(List<Integer> values) {
            addCriterion("CA_Class1_ID not in", values, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class1_ID between", value1, value2, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaClass1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class1_ID not between", value1, value2, "caClass1Id");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdIsNull() {
            addCriterion("CA_ssi_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdIsNotNull() {
            addCriterion("CA_ssi_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdEqualTo(Integer value) {
            addCriterion("CA_ssi_ID =", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdNotEqualTo(Integer value) {
            addCriterion("CA_ssi_ID <>", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdGreaterThan(Integer value) {
            addCriterion("CA_ssi_ID >", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_ssi_ID >=", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdLessThan(Integer value) {
            addCriterion("CA_ssi_ID <", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_ssi_ID <=", value, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdIn(List<Integer> values) {
            addCriterion("CA_ssi_ID in", values, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdNotIn(List<Integer> values) {
            addCriterion("CA_ssi_ID not in", values, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdBetween(Integer value1, Integer value2) {
            addCriterion("CA_ssi_ID between", value1, value2, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andCaSsiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_ssi_ID not between", value1, value2, "caSsiId");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberIsNull() {
            addCriterion("alumni_stu_number is null");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberIsNotNull() {
            addCriterion("alumni_stu_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberEqualTo(String value) {
            addCriterion("alumni_stu_number =", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberNotEqualTo(String value) {
            addCriterion("alumni_stu_number <>", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberGreaterThan(String value) {
            addCriterion("alumni_stu_number >", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_stu_number >=", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberLessThan(String value) {
            addCriterion("alumni_stu_number <", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberLessThanOrEqualTo(String value) {
            addCriterion("alumni_stu_number <=", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberLike(String value) {
            addCriterion("alumni_stu_number like", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberNotLike(String value) {
            addCriterion("alumni_stu_number not like", value, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberIn(List<String> values) {
            addCriterion("alumni_stu_number in", values, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberNotIn(List<String> values) {
            addCriterion("alumni_stu_number not in", values, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberBetween(String value1, String value2) {
            addCriterion("alumni_stu_number between", value1, value2, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniStuNumberNotBetween(String value1, String value2) {
            addCriterion("alumni_stu_number not between", value1, value2, "alumniStuNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIsNull() {
            addCriterion("alumni_name is null");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIsNotNull() {
            addCriterion("alumni_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniNameEqualTo(String value) {
            addCriterion("alumni_name =", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotEqualTo(String value) {
            addCriterion("alumni_name <>", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameGreaterThan(String value) {
            addCriterion("alumni_name >", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_name >=", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLessThan(String value) {
            addCriterion("alumni_name <", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLessThanOrEqualTo(String value) {
            addCriterion("alumni_name <=", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLike(String value) {
            addCriterion("alumni_name like", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotLike(String value) {
            addCriterion("alumni_name not like", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIn(List<String> values) {
            addCriterion("alumni_name in", values, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotIn(List<String> values) {
            addCriterion("alumni_name not in", values, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameBetween(String value1, String value2) {
            addCriterion("alumni_name between", value1, value2, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotBetween(String value1, String value2) {
            addCriterion("alumni_name not between", value1, value2, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniSexIsNull() {
            addCriterion("alumni_sex is null");
            return (Criteria) this;
        }

        public Criteria andAlumniSexIsNotNull() {
            addCriterion("alumni_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniSexEqualTo(Boolean value) {
            addCriterion("alumni_sex =", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexNotEqualTo(Boolean value) {
            addCriterion("alumni_sex <>", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexGreaterThan(Boolean value) {
            addCriterion("alumni_sex >", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("alumni_sex >=", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexLessThan(Boolean value) {
            addCriterion("alumni_sex <", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexLessThanOrEqualTo(Boolean value) {
            addCriterion("alumni_sex <=", value, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexIn(List<Boolean> values) {
            addCriterion("alumni_sex in", values, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexNotIn(List<Boolean> values) {
            addCriterion("alumni_sex not in", values, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexBetween(Boolean value1, Boolean value2) {
            addCriterion("alumni_sex between", value1, value2, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("alumni_sex not between", value1, value2, "alumniSex");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateIsNull() {
            addCriterion("alumni_admission_date is null");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateIsNotNull() {
            addCriterion("alumni_admission_date is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateEqualTo(Date value) {
            addCriterionForJDBCDate("alumni_admission_date =", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("alumni_admission_date <>", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("alumni_admission_date >", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alumni_admission_date >=", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateLessThan(Date value) {
            addCriterionForJDBCDate("alumni_admission_date <", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alumni_admission_date <=", value, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateIn(List<Date> values) {
            addCriterionForJDBCDate("alumni_admission_date in", values, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("alumni_admission_date not in", values, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alumni_admission_date between", value1, value2, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniAdmissionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alumni_admission_date not between", value1, value2, "alumniAdmissionDate");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeIsNull() {
            addCriterion("alumni_second_college is null");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeIsNotNull() {
            addCriterion("alumni_second_college is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeEqualTo(String value) {
            addCriterion("alumni_second_college =", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeNotEqualTo(String value) {
            addCriterion("alumni_second_college <>", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeGreaterThan(String value) {
            addCriterion("alumni_second_college >", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_second_college >=", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeLessThan(String value) {
            addCriterion("alumni_second_college <", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeLessThanOrEqualTo(String value) {
            addCriterion("alumni_second_college <=", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeLike(String value) {
            addCriterion("alumni_second_college like", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeNotLike(String value) {
            addCriterion("alumni_second_college not like", value, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeIn(List<String> values) {
            addCriterion("alumni_second_college in", values, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeNotIn(List<String> values) {
            addCriterion("alumni_second_college not in", values, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeBetween(String value1, String value2) {
            addCriterion("alumni_second_college between", value1, value2, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniSecondCollegeNotBetween(String value1, String value2) {
            addCriterion("alumni_second_college not between", value1, value2, "alumniSecondCollege");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerIsNull() {
            addCriterion("alumni_career is null");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerIsNotNull() {
            addCriterion("alumni_career is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerEqualTo(String value) {
            addCriterion("alumni_career =", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerNotEqualTo(String value) {
            addCriterion("alumni_career <>", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerGreaterThan(String value) {
            addCriterion("alumni_career >", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_career >=", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerLessThan(String value) {
            addCriterion("alumni_career <", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerLessThanOrEqualTo(String value) {
            addCriterion("alumni_career <=", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerLike(String value) {
            addCriterion("alumni_career like", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerNotLike(String value) {
            addCriterion("alumni_career not like", value, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerIn(List<String> values) {
            addCriterion("alumni_career in", values, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerNotIn(List<String> values) {
            addCriterion("alumni_career not in", values, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerBetween(String value1, String value2) {
            addCriterion("alumni_career between", value1, value2, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCareerNotBetween(String value1, String value2) {
            addCriterion("alumni_career not between", value1, value2, "alumniCareer");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIsNull() {
            addCriterion("alumni_company is null");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIsNotNull() {
            addCriterion("alumni_company is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyEqualTo(String value) {
            addCriterion("alumni_company =", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotEqualTo(String value) {
            addCriterion("alumni_company <>", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyGreaterThan(String value) {
            addCriterion("alumni_company >", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_company >=", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLessThan(String value) {
            addCriterion("alumni_company <", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLessThanOrEqualTo(String value) {
            addCriterion("alumni_company <=", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLike(String value) {
            addCriterion("alumni_company like", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotLike(String value) {
            addCriterion("alumni_company not like", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIn(List<String> values) {
            addCriterion("alumni_company in", values, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotIn(List<String> values) {
            addCriterion("alumni_company not in", values, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyBetween(String value1, String value2) {
            addCriterion("alumni_company between", value1, value2, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotBetween(String value1, String value2) {
            addCriterion("alumni_company not between", value1, value2, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressIsNull() {
            addCriterion("alumni_address is null");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressIsNotNull() {
            addCriterion("alumni_address is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressEqualTo(String value) {
            addCriterion("alumni_address =", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressNotEqualTo(String value) {
            addCriterion("alumni_address <>", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressGreaterThan(String value) {
            addCriterion("alumni_address >", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_address >=", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressLessThan(String value) {
            addCriterion("alumni_address <", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressLessThanOrEqualTo(String value) {
            addCriterion("alumni_address <=", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressLike(String value) {
            addCriterion("alumni_address like", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressNotLike(String value) {
            addCriterion("alumni_address not like", value, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressIn(List<String> values) {
            addCriterion("alumni_address in", values, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressNotIn(List<String> values) {
            addCriterion("alumni_address not in", values, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressBetween(String value1, String value2) {
            addCriterion("alumni_address between", value1, value2, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAddressNotBetween(String value1, String value2) {
            addCriterion("alumni_address not between", value1, value2, "alumniAddress");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberIsNull() {
            addCriterion("alumni_account_number is null");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberIsNotNull() {
            addCriterion("alumni_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberEqualTo(String value) {
            addCriterion("alumni_account_number =", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberNotEqualTo(String value) {
            addCriterion("alumni_account_number <>", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberGreaterThan(String value) {
            addCriterion("alumni_account_number >", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_account_number >=", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberLessThan(String value) {
            addCriterion("alumni_account_number <", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("alumni_account_number <=", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberLike(String value) {
            addCriterion("alumni_account_number like", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberNotLike(String value) {
            addCriterion("alumni_account_number not like", value, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberIn(List<String> values) {
            addCriterion("alumni_account_number in", values, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberNotIn(List<String> values) {
            addCriterion("alumni_account_number not in", values, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberBetween(String value1, String value2) {
            addCriterion("alumni_account_number between", value1, value2, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniAccountNumberNotBetween(String value1, String value2) {
            addCriterion("alumni_account_number not between", value1, value2, "alumniAccountNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordIsNull() {
            addCriterion("alumni_password is null");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordIsNotNull() {
            addCriterion("alumni_password is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordEqualTo(String value) {
            addCriterion("alumni_password =", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordNotEqualTo(String value) {
            addCriterion("alumni_password <>", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordGreaterThan(String value) {
            addCriterion("alumni_password >", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_password >=", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordLessThan(String value) {
            addCriterion("alumni_password <", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordLessThanOrEqualTo(String value) {
            addCriterion("alumni_password <=", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordLike(String value) {
            addCriterion("alumni_password like", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordNotLike(String value) {
            addCriterion("alumni_password not like", value, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordIn(List<String> values) {
            addCriterion("alumni_password in", values, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordNotIn(List<String> values) {
            addCriterion("alumni_password not in", values, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordBetween(String value1, String value2) {
            addCriterion("alumni_password between", value1, value2, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniPasswordNotBetween(String value1, String value2) {
            addCriterion("alumni_password not between", value1, value2, "alumniPassword");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneIsNull() {
            addCriterion("alumni_cellphone is null");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneIsNotNull() {
            addCriterion("alumni_cellphone is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneEqualTo(String value) {
            addCriterion("alumni_cellphone =", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneNotEqualTo(String value) {
            addCriterion("alumni_cellphone <>", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneGreaterThan(String value) {
            addCriterion("alumni_cellphone >", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_cellphone >=", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneLessThan(String value) {
            addCriterion("alumni_cellphone <", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneLessThanOrEqualTo(String value) {
            addCriterion("alumni_cellphone <=", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneLike(String value) {
            addCriterion("alumni_cellphone like", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneNotLike(String value) {
            addCriterion("alumni_cellphone not like", value, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneIn(List<String> values) {
            addCriterion("alumni_cellphone in", values, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneNotIn(List<String> values) {
            addCriterion("alumni_cellphone not in", values, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneBetween(String value1, String value2) {
            addCriterion("alumni_cellphone between", value1, value2, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniCellphoneNotBetween(String value1, String value2) {
            addCriterion("alumni_cellphone not between", value1, value2, "alumniCellphone");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailIsNull() {
            addCriterion("alumni_email is null");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailIsNotNull() {
            addCriterion("alumni_email is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailEqualTo(String value) {
            addCriterion("alumni_email =", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailNotEqualTo(String value) {
            addCriterion("alumni_email <>", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailGreaterThan(String value) {
            addCriterion("alumni_email >", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_email >=", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailLessThan(String value) {
            addCriterion("alumni_email <", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailLessThanOrEqualTo(String value) {
            addCriterion("alumni_email <=", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailLike(String value) {
            addCriterion("alumni_email like", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailNotLike(String value) {
            addCriterion("alumni_email not like", value, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailIn(List<String> values) {
            addCriterion("alumni_email in", values, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailNotIn(List<String> values) {
            addCriterion("alumni_email not in", values, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailBetween(String value1, String value2) {
            addCriterion("alumni_email between", value1, value2, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAlumniEmailNotBetween(String value1, String value2) {
            addCriterion("alumni_email not between", value1, value2, "alumniEmail");
            return (Criteria) this;
        }

        public Criteria andAttribute82IsNull() {
            addCriterion("Attribute_82 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute82IsNotNull() {
            addCriterion("Attribute_82 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute82EqualTo(String value) {
            addCriterion("Attribute_82 =", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82NotEqualTo(String value) {
            addCriterion("Attribute_82 <>", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82GreaterThan(String value) {
            addCriterion("Attribute_82 >", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_82 >=", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82LessThan(String value) {
            addCriterion("Attribute_82 <", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82LessThanOrEqualTo(String value) {
            addCriterion("Attribute_82 <=", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82Like(String value) {
            addCriterion("Attribute_82 like", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82NotLike(String value) {
            addCriterion("Attribute_82 not like", value, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82In(List<String> values) {
            addCriterion("Attribute_82 in", values, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82NotIn(List<String> values) {
            addCriterion("Attribute_82 not in", values, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82Between(String value1, String value2) {
            addCriterion("Attribute_82 between", value1, value2, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute82NotBetween(String value1, String value2) {
            addCriterion("Attribute_82 not between", value1, value2, "attribute82");
            return (Criteria) this;
        }

        public Criteria andAttribute83IsNull() {
            addCriterion("Attribute_83 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute83IsNotNull() {
            addCriterion("Attribute_83 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute83EqualTo(String value) {
            addCriterion("Attribute_83 =", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83NotEqualTo(String value) {
            addCriterion("Attribute_83 <>", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83GreaterThan(String value) {
            addCriterion("Attribute_83 >", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_83 >=", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83LessThan(String value) {
            addCriterion("Attribute_83 <", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83LessThanOrEqualTo(String value) {
            addCriterion("Attribute_83 <=", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83Like(String value) {
            addCriterion("Attribute_83 like", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83NotLike(String value) {
            addCriterion("Attribute_83 not like", value, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83In(List<String> values) {
            addCriterion("Attribute_83 in", values, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83NotIn(List<String> values) {
            addCriterion("Attribute_83 not in", values, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83Between(String value1, String value2) {
            addCriterion("Attribute_83 between", value1, value2, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute83NotBetween(String value1, String value2) {
            addCriterion("Attribute_83 not between", value1, value2, "attribute83");
            return (Criteria) this;
        }

        public Criteria andAttribute84IsNull() {
            addCriterion("Attribute_84 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute84IsNotNull() {
            addCriterion("Attribute_84 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute84EqualTo(String value) {
            addCriterion("Attribute_84 =", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84NotEqualTo(String value) {
            addCriterion("Attribute_84 <>", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84GreaterThan(String value) {
            addCriterion("Attribute_84 >", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_84 >=", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84LessThan(String value) {
            addCriterion("Attribute_84 <", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84LessThanOrEqualTo(String value) {
            addCriterion("Attribute_84 <=", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84Like(String value) {
            addCriterion("Attribute_84 like", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84NotLike(String value) {
            addCriterion("Attribute_84 not like", value, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84In(List<String> values) {
            addCriterion("Attribute_84 in", values, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84NotIn(List<String> values) {
            addCriterion("Attribute_84 not in", values, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84Between(String value1, String value2) {
            addCriterion("Attribute_84 between", value1, value2, "attribute84");
            return (Criteria) this;
        }

        public Criteria andAttribute84NotBetween(String value1, String value2) {
            addCriterion("Attribute_84 not between", value1, value2, "attribute84");
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