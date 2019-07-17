package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationIsNull() {
            addCriterion("role_illustration is null");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationIsNotNull() {
            addCriterion("role_illustration is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationEqualTo(String value) {
            addCriterion("role_illustration =", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationNotEqualTo(String value) {
            addCriterion("role_illustration <>", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationGreaterThan(String value) {
            addCriterion("role_illustration >", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationGreaterThanOrEqualTo(String value) {
            addCriterion("role_illustration >=", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationLessThan(String value) {
            addCriterion("role_illustration <", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationLessThanOrEqualTo(String value) {
            addCriterion("role_illustration <=", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationLike(String value) {
            addCriterion("role_illustration like", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationNotLike(String value) {
            addCriterion("role_illustration not like", value, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationIn(List<String> values) {
            addCriterion("role_illustration in", values, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationNotIn(List<String> values) {
            addCriterion("role_illustration not in", values, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationBetween(String value1, String value2) {
            addCriterion("role_illustration between", value1, value2, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andRoleIllustrationNotBetween(String value1, String value2) {
            addCriterion("role_illustration not between", value1, value2, "roleIllustration");
            return (Criteria) this;
        }

        public Criteria andAttribute85IsNull() {
            addCriterion("Attribute_85 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute85IsNotNull() {
            addCriterion("Attribute_85 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute85EqualTo(String value) {
            addCriterion("Attribute_85 =", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85NotEqualTo(String value) {
            addCriterion("Attribute_85 <>", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85GreaterThan(String value) {
            addCriterion("Attribute_85 >", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_85 >=", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85LessThan(String value) {
            addCriterion("Attribute_85 <", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85LessThanOrEqualTo(String value) {
            addCriterion("Attribute_85 <=", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85Like(String value) {
            addCriterion("Attribute_85 like", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85NotLike(String value) {
            addCriterion("Attribute_85 not like", value, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85In(List<String> values) {
            addCriterion("Attribute_85 in", values, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85NotIn(List<String> values) {
            addCriterion("Attribute_85 not in", values, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85Between(String value1, String value2) {
            addCriterion("Attribute_85 between", value1, value2, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute85NotBetween(String value1, String value2) {
            addCriterion("Attribute_85 not between", value1, value2, "attribute85");
            return (Criteria) this;
        }

        public Criteria andAttribute86IsNull() {
            addCriterion("Attribute_86 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute86IsNotNull() {
            addCriterion("Attribute_86 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute86EqualTo(String value) {
            addCriterion("Attribute_86 =", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86NotEqualTo(String value) {
            addCriterion("Attribute_86 <>", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86GreaterThan(String value) {
            addCriterion("Attribute_86 >", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_86 >=", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86LessThan(String value) {
            addCriterion("Attribute_86 <", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86LessThanOrEqualTo(String value) {
            addCriterion("Attribute_86 <=", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86Like(String value) {
            addCriterion("Attribute_86 like", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86NotLike(String value) {
            addCriterion("Attribute_86 not like", value, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86In(List<String> values) {
            addCriterion("Attribute_86 in", values, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86NotIn(List<String> values) {
            addCriterion("Attribute_86 not in", values, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86Between(String value1, String value2) {
            addCriterion("Attribute_86 between", value1, value2, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute86NotBetween(String value1, String value2) {
            addCriterion("Attribute_86 not between", value1, value2, "attribute86");
            return (Criteria) this;
        }

        public Criteria andAttribute87IsNull() {
            addCriterion("Attribute_87 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute87IsNotNull() {
            addCriterion("Attribute_87 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute87EqualTo(String value) {
            addCriterion("Attribute_87 =", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87NotEqualTo(String value) {
            addCriterion("Attribute_87 <>", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87GreaterThan(String value) {
            addCriterion("Attribute_87 >", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_87 >=", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87LessThan(String value) {
            addCriterion("Attribute_87 <", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87LessThanOrEqualTo(String value) {
            addCriterion("Attribute_87 <=", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87Like(String value) {
            addCriterion("Attribute_87 like", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87NotLike(String value) {
            addCriterion("Attribute_87 not like", value, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87In(List<String> values) {
            addCriterion("Attribute_87 in", values, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87NotIn(List<String> values) {
            addCriterion("Attribute_87 not in", values, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87Between(String value1, String value2) {
            addCriterion("Attribute_87 between", value1, value2, "attribute87");
            return (Criteria) this;
        }

        public Criteria andAttribute87NotBetween(String value1, String value2) {
            addCriterion("Attribute_87 not between", value1, value2, "attribute87");
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