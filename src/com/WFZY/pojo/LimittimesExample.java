package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LimittimesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimittimesExample() {
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

        public Criteria andLimittimitidIsNull() {
            addCriterion("limitTimitId is null");
            return (Criteria) this;
        }

        public Criteria andLimittimitidIsNotNull() {
            addCriterion("limitTimitId is not null");
            return (Criteria) this;
        }

        public Criteria andLimittimitidEqualTo(Integer value) {
            addCriterion("limitTimitId =", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidNotEqualTo(Integer value) {
            addCriterion("limitTimitId <>", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidGreaterThan(Integer value) {
            addCriterion("limitTimitId >", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitTimitId >=", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidLessThan(Integer value) {
            addCriterion("limitTimitId <", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidLessThanOrEqualTo(Integer value) {
            addCriterion("limitTimitId <=", value, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidIn(List<Integer> values) {
            addCriterion("limitTimitId in", values, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidNotIn(List<Integer> values) {
            addCriterion("limitTimitId not in", values, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidBetween(Integer value1, Integer value2) {
            addCriterion("limitTimitId between", value1, value2, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimitidNotBetween(Integer value1, Integer value2) {
            addCriterion("limitTimitId not between", value1, value2, "limittimitid");
            return (Criteria) this;
        }

        public Criteria andLimittimeIsNull() {
            addCriterion("limitTime is null");
            return (Criteria) this;
        }

        public Criteria andLimittimeIsNotNull() {
            addCriterion("limitTime is not null");
            return (Criteria) this;
        }

        public Criteria andLimittimeEqualTo(Date value) {
            addCriterion("limitTime =", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotEqualTo(Date value) {
            addCriterion("limitTime <>", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeGreaterThan(Date value) {
            addCriterion("limitTime >", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("limitTime >=", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeLessThan(Date value) {
            addCriterion("limitTime <", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeLessThanOrEqualTo(Date value) {
            addCriterion("limitTime <=", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeIn(List<Date> values) {
            addCriterion("limitTime in", values, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotIn(List<Date> values) {
            addCriterion("limitTime not in", values, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeBetween(Date value1, Date value2) {
            addCriterion("limitTime between", value1, value2, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotBetween(Date value1, Date value2) {
            addCriterion("limitTime not between", value1, value2, "limittime");
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