package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class Class2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Class2Example() {
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

        public Criteria andCaClass2IdIsNull() {
            addCriterion("CA_Class2_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdIsNotNull() {
            addCriterion("CA_Class2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdEqualTo(Integer value) {
            addCriterion("CA_Class2_ID =", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdNotEqualTo(Integer value) {
            addCriterion("CA_Class2_ID <>", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdGreaterThan(Integer value) {
            addCriterion("CA_Class2_ID >", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CA_Class2_ID >=", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdLessThan(Integer value) {
            addCriterion("CA_Class2_ID <", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdLessThanOrEqualTo(Integer value) {
            addCriterion("CA_Class2_ID <=", value, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdIn(List<Integer> values) {
            addCriterion("CA_Class2_ID in", values, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdNotIn(List<Integer> values) {
            addCriterion("CA_Class2_ID not in", values, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class2_ID between", value1, value2, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andCaClass2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("CA_Class2_ID not between", value1, value2, "caClass2Id");
            return (Criteria) this;
        }

        public Criteria andClass2NameIsNull() {
            addCriterion("class2_name is null");
            return (Criteria) this;
        }

        public Criteria andClass2NameIsNotNull() {
            addCriterion("class2_name is not null");
            return (Criteria) this;
        }

        public Criteria andClass2NameEqualTo(String value) {
            addCriterion("class2_name =", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotEqualTo(String value) {
            addCriterion("class2_name <>", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameGreaterThan(String value) {
            addCriterion("class2_name >", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameGreaterThanOrEqualTo(String value) {
            addCriterion("class2_name >=", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLessThan(String value) {
            addCriterion("class2_name <", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLessThanOrEqualTo(String value) {
            addCriterion("class2_name <=", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLike(String value) {
            addCriterion("class2_name like", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotLike(String value) {
            addCriterion("class2_name not like", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameIn(List<String> values) {
            addCriterion("class2_name in", values, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotIn(List<String> values) {
            addCriterion("class2_name not in", values, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameBetween(String value1, String value2) {
            addCriterion("class2_name between", value1, value2, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotBetween(String value1, String value2) {
            addCriterion("class2_name not between", value1, value2, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityIsNull() {
            addCriterion("class2_quantity is null");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityIsNotNull() {
            addCriterion("class2_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityEqualTo(String value) {
            addCriterion("class2_quantity =", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityNotEqualTo(String value) {
            addCriterion("class2_quantity <>", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityGreaterThan(String value) {
            addCriterion("class2_quantity >", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityGreaterThanOrEqualTo(String value) {
            addCriterion("class2_quantity >=", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityLessThan(String value) {
            addCriterion("class2_quantity <", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityLessThanOrEqualTo(String value) {
            addCriterion("class2_quantity <=", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityLike(String value) {
            addCriterion("class2_quantity like", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityNotLike(String value) {
            addCriterion("class2_quantity not like", value, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityIn(List<String> values) {
            addCriterion("class2_quantity in", values, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityNotIn(List<String> values) {
            addCriterion("class2_quantity not in", values, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityBetween(String value1, String value2) {
            addCriterion("class2_quantity between", value1, value2, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andClass2QuantityNotBetween(String value1, String value2) {
            addCriterion("class2_quantity not between", value1, value2, "class2Quantity");
            return (Criteria) this;
        }

        public Criteria andAttribute76IsNull() {
            addCriterion("Attribute_76 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute76IsNotNull() {
            addCriterion("Attribute_76 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute76EqualTo(String value) {
            addCriterion("Attribute_76 =", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76NotEqualTo(String value) {
            addCriterion("Attribute_76 <>", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76GreaterThan(String value) {
            addCriterion("Attribute_76 >", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_76 >=", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76LessThan(String value) {
            addCriterion("Attribute_76 <", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76LessThanOrEqualTo(String value) {
            addCriterion("Attribute_76 <=", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76Like(String value) {
            addCriterion("Attribute_76 like", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76NotLike(String value) {
            addCriterion("Attribute_76 not like", value, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76In(List<String> values) {
            addCriterion("Attribute_76 in", values, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76NotIn(List<String> values) {
            addCriterion("Attribute_76 not in", values, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76Between(String value1, String value2) {
            addCriterion("Attribute_76 between", value1, value2, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute76NotBetween(String value1, String value2) {
            addCriterion("Attribute_76 not between", value1, value2, "attribute76");
            return (Criteria) this;
        }

        public Criteria andAttribute77IsNull() {
            addCriterion("Attribute_77 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute77IsNotNull() {
            addCriterion("Attribute_77 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute77EqualTo(String value) {
            addCriterion("Attribute_77 =", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77NotEqualTo(String value) {
            addCriterion("Attribute_77 <>", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77GreaterThan(String value) {
            addCriterion("Attribute_77 >", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_77 >=", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77LessThan(String value) {
            addCriterion("Attribute_77 <", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77LessThanOrEqualTo(String value) {
            addCriterion("Attribute_77 <=", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77Like(String value) {
            addCriterion("Attribute_77 like", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77NotLike(String value) {
            addCriterion("Attribute_77 not like", value, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77In(List<String> values) {
            addCriterion("Attribute_77 in", values, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77NotIn(List<String> values) {
            addCriterion("Attribute_77 not in", values, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77Between(String value1, String value2) {
            addCriterion("Attribute_77 between", value1, value2, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute77NotBetween(String value1, String value2) {
            addCriterion("Attribute_77 not between", value1, value2, "attribute77");
            return (Criteria) this;
        }

        public Criteria andAttribute78IsNull() {
            addCriterion("Attribute_78 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute78IsNotNull() {
            addCriterion("Attribute_78 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute78EqualTo(String value) {
            addCriterion("Attribute_78 =", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78NotEqualTo(String value) {
            addCriterion("Attribute_78 <>", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78GreaterThan(String value) {
            addCriterion("Attribute_78 >", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_78 >=", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78LessThan(String value) {
            addCriterion("Attribute_78 <", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78LessThanOrEqualTo(String value) {
            addCriterion("Attribute_78 <=", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78Like(String value) {
            addCriterion("Attribute_78 like", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78NotLike(String value) {
            addCriterion("Attribute_78 not like", value, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78In(List<String> values) {
            addCriterion("Attribute_78 in", values, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78NotIn(List<String> values) {
            addCriterion("Attribute_78 not in", values, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78Between(String value1, String value2) {
            addCriterion("Attribute_78 between", value1, value2, "attribute78");
            return (Criteria) this;
        }

        public Criteria andAttribute78NotBetween(String value1, String value2) {
            addCriterion("Attribute_78 not between", value1, value2, "attribute78");
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