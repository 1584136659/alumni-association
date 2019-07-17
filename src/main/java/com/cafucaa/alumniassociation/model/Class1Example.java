package com.cafucaa.alumniassociation.model;

import java.util.ArrayList;
import java.util.List;

public class Class1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Class1Example() {
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

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassCreaterIsNull() {
            addCriterion("class_creater is null");
            return (Criteria) this;
        }

        public Criteria andClassCreaterIsNotNull() {
            addCriterion("class_creater is not null");
            return (Criteria) this;
        }

        public Criteria andClassCreaterEqualTo(String value) {
            addCriterion("class_creater =", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterNotEqualTo(String value) {
            addCriterion("class_creater <>", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterGreaterThan(String value) {
            addCriterion("class_creater >", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("class_creater >=", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterLessThan(String value) {
            addCriterion("class_creater <", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterLessThanOrEqualTo(String value) {
            addCriterion("class_creater <=", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterLike(String value) {
            addCriterion("class_creater like", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterNotLike(String value) {
            addCriterion("class_creater not like", value, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterIn(List<String> values) {
            addCriterion("class_creater in", values, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterNotIn(List<String> values) {
            addCriterion("class_creater not in", values, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterBetween(String value1, String value2) {
            addCriterion("class_creater between", value1, value2, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassCreaterNotBetween(String value1, String value2) {
            addCriterion("class_creater not between", value1, value2, "classCreater");
            return (Criteria) this;
        }

        public Criteria andClassQuantityIsNull() {
            addCriterion("class_quantity is null");
            return (Criteria) this;
        }

        public Criteria andClassQuantityIsNotNull() {
            addCriterion("class_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andClassQuantityEqualTo(String value) {
            addCriterion("class_quantity =", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityNotEqualTo(String value) {
            addCriterion("class_quantity <>", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityGreaterThan(String value) {
            addCriterion("class_quantity >", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("class_quantity >=", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityLessThan(String value) {
            addCriterion("class_quantity <", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityLessThanOrEqualTo(String value) {
            addCriterion("class_quantity <=", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityLike(String value) {
            addCriterion("class_quantity like", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityNotLike(String value) {
            addCriterion("class_quantity not like", value, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityIn(List<String> values) {
            addCriterion("class_quantity in", values, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityNotIn(List<String> values) {
            addCriterion("class_quantity not in", values, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityBetween(String value1, String value2) {
            addCriterion("class_quantity between", value1, value2, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassQuantityNotBetween(String value1, String value2) {
            addCriterion("class_quantity not between", value1, value2, "classQuantity");
            return (Criteria) this;
        }

        public Criteria andClassActivityIsNull() {
            addCriterion("class_activity is null");
            return (Criteria) this;
        }

        public Criteria andClassActivityIsNotNull() {
            addCriterion("class_activity is not null");
            return (Criteria) this;
        }

        public Criteria andClassActivityEqualTo(String value) {
            addCriterion("class_activity =", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityNotEqualTo(String value) {
            addCriterion("class_activity <>", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityGreaterThan(String value) {
            addCriterion("class_activity >", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityGreaterThanOrEqualTo(String value) {
            addCriterion("class_activity >=", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityLessThan(String value) {
            addCriterion("class_activity <", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityLessThanOrEqualTo(String value) {
            addCriterion("class_activity <=", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityLike(String value) {
            addCriterion("class_activity like", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityNotLike(String value) {
            addCriterion("class_activity not like", value, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityIn(List<String> values) {
            addCriterion("class_activity in", values, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityNotIn(List<String> values) {
            addCriterion("class_activity not in", values, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityBetween(String value1, String value2) {
            addCriterion("class_activity between", value1, value2, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassActivityNotBetween(String value1, String value2) {
            addCriterion("class_activity not between", value1, value2, "classActivity");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlIsNull() {
            addCriterion("class_data_url is null");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlIsNotNull() {
            addCriterion("class_data_url is not null");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlEqualTo(String value) {
            addCriterion("class_data_url =", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlNotEqualTo(String value) {
            addCriterion("class_data_url <>", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlGreaterThan(String value) {
            addCriterion("class_data_url >", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlGreaterThanOrEqualTo(String value) {
            addCriterion("class_data_url >=", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlLessThan(String value) {
            addCriterion("class_data_url <", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlLessThanOrEqualTo(String value) {
            addCriterion("class_data_url <=", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlLike(String value) {
            addCriterion("class_data_url like", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlNotLike(String value) {
            addCriterion("class_data_url not like", value, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlIn(List<String> values) {
            addCriterion("class_data_url in", values, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlNotIn(List<String> values) {
            addCriterion("class_data_url not in", values, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlBetween(String value1, String value2) {
            addCriterion("class_data_url between", value1, value2, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassDataUrlNotBetween(String value1, String value2) {
            addCriterion("class_data_url not between", value1, value2, "classDataUrl");
            return (Criteria) this;
        }

        public Criteria andAttribute94IsNull() {
            addCriterion("Attribute_94 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute94IsNotNull() {
            addCriterion("Attribute_94 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute94EqualTo(String value) {
            addCriterion("Attribute_94 =", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94NotEqualTo(String value) {
            addCriterion("Attribute_94 <>", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94GreaterThan(String value) {
            addCriterion("Attribute_94 >", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_94 >=", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94LessThan(String value) {
            addCriterion("Attribute_94 <", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94LessThanOrEqualTo(String value) {
            addCriterion("Attribute_94 <=", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94Like(String value) {
            addCriterion("Attribute_94 like", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94NotLike(String value) {
            addCriterion("Attribute_94 not like", value, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94In(List<String> values) {
            addCriterion("Attribute_94 in", values, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94NotIn(List<String> values) {
            addCriterion("Attribute_94 not in", values, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94Between(String value1, String value2) {
            addCriterion("Attribute_94 between", value1, value2, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute94NotBetween(String value1, String value2) {
            addCriterion("Attribute_94 not between", value1, value2, "attribute94");
            return (Criteria) this;
        }

        public Criteria andAttribute95IsNull() {
            addCriterion("Attribute_95 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute95IsNotNull() {
            addCriterion("Attribute_95 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute95EqualTo(String value) {
            addCriterion("Attribute_95 =", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95NotEqualTo(String value) {
            addCriterion("Attribute_95 <>", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95GreaterThan(String value) {
            addCriterion("Attribute_95 >", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_95 >=", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95LessThan(String value) {
            addCriterion("Attribute_95 <", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95LessThanOrEqualTo(String value) {
            addCriterion("Attribute_95 <=", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95Like(String value) {
            addCriterion("Attribute_95 like", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95NotLike(String value) {
            addCriterion("Attribute_95 not like", value, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95In(List<String> values) {
            addCriterion("Attribute_95 in", values, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95NotIn(List<String> values) {
            addCriterion("Attribute_95 not in", values, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95Between(String value1, String value2) {
            addCriterion("Attribute_95 between", value1, value2, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute95NotBetween(String value1, String value2) {
            addCriterion("Attribute_95 not between", value1, value2, "attribute95");
            return (Criteria) this;
        }

        public Criteria andAttribute96IsNull() {
            addCriterion("Attribute_96 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute96IsNotNull() {
            addCriterion("Attribute_96 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute96EqualTo(String value) {
            addCriterion("Attribute_96 =", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96NotEqualTo(String value) {
            addCriterion("Attribute_96 <>", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96GreaterThan(String value) {
            addCriterion("Attribute_96 >", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96GreaterThanOrEqualTo(String value) {
            addCriterion("Attribute_96 >=", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96LessThan(String value) {
            addCriterion("Attribute_96 <", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96LessThanOrEqualTo(String value) {
            addCriterion("Attribute_96 <=", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96Like(String value) {
            addCriterion("Attribute_96 like", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96NotLike(String value) {
            addCriterion("Attribute_96 not like", value, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96In(List<String> values) {
            addCriterion("Attribute_96 in", values, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96NotIn(List<String> values) {
            addCriterion("Attribute_96 not in", values, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96Between(String value1, String value2) {
            addCriterion("Attribute_96 between", value1, value2, "attribute96");
            return (Criteria) this;
        }

        public Criteria andAttribute96NotBetween(String value1, String value2) {
            addCriterion("Attribute_96 not between", value1, value2, "attribute96");
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