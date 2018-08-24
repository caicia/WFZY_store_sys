package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridIsNull() {
            addCriterion("sAccepterId is null");
            return (Criteria) this;
        }

        public Criteria andSaccepteridIsNotNull() {
            addCriterion("sAccepterId is not null");
            return (Criteria) this;
        }

        public Criteria andSaccepteridEqualTo(Integer value) {
            addCriterion("sAccepterId =", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridNotEqualTo(Integer value) {
            addCriterion("sAccepterId <>", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridGreaterThan(Integer value) {
            addCriterion("sAccepterId >", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sAccepterId >=", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridLessThan(Integer value) {
            addCriterion("sAccepterId <", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridLessThanOrEqualTo(Integer value) {
            addCriterion("sAccepterId <=", value, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridIn(List<Integer> values) {
            addCriterion("sAccepterId in", values, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridNotIn(List<Integer> values) {
            addCriterion("sAccepterId not in", values, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridBetween(Integer value1, Integer value2) {
            addCriterion("sAccepterId between", value1, value2, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andSaccepteridNotBetween(Integer value1, Integer value2) {
            addCriterion("sAccepterId not between", value1, value2, "saccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridIsNull() {
            addCriterion("uAccepterId is null");
            return (Criteria) this;
        }

        public Criteria andUaccepteridIsNotNull() {
            addCriterion("uAccepterId is not null");
            return (Criteria) this;
        }

        public Criteria andUaccepteridEqualTo(Integer value) {
            addCriterion("uAccepterId =", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridNotEqualTo(Integer value) {
            addCriterion("uAccepterId <>", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridGreaterThan(Integer value) {
            addCriterion("uAccepterId >", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("uAccepterId >=", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridLessThan(Integer value) {
            addCriterion("uAccepterId <", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridLessThanOrEqualTo(Integer value) {
            addCriterion("uAccepterId <=", value, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridIn(List<Integer> values) {
            addCriterion("uAccepterId in", values, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridNotIn(List<Integer> values) {
            addCriterion("uAccepterId not in", values, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridBetween(Integer value1, Integer value2) {
            addCriterion("uAccepterId between", value1, value2, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andUaccepteridNotBetween(Integer value1, Integer value2) {
            addCriterion("uAccepterId not between", value1, value2, "uaccepterid");
            return (Criteria) this;
        }

        public Criteria andSsendidIsNull() {
            addCriterion("sSendId is null");
            return (Criteria) this;
        }

        public Criteria andSsendidIsNotNull() {
            addCriterion("sSendId is not null");
            return (Criteria) this;
        }

        public Criteria andSsendidEqualTo(Integer value) {
            addCriterion("sSendId =", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidNotEqualTo(Integer value) {
            addCriterion("sSendId <>", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidGreaterThan(Integer value) {
            addCriterion("sSendId >", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sSendId >=", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidLessThan(Integer value) {
            addCriterion("sSendId <", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidLessThanOrEqualTo(Integer value) {
            addCriterion("sSendId <=", value, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidIn(List<Integer> values) {
            addCriterion("sSendId in", values, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidNotIn(List<Integer> values) {
            addCriterion("sSendId not in", values, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidBetween(Integer value1, Integer value2) {
            addCriterion("sSendId between", value1, value2, "ssendid");
            return (Criteria) this;
        }

        public Criteria andSsendidNotBetween(Integer value1, Integer value2) {
            addCriterion("sSendId not between", value1, value2, "ssendid");
            return (Criteria) this;
        }

        public Criteria andUsendidIsNull() {
            addCriterion("uSendId is null");
            return (Criteria) this;
        }

        public Criteria andUsendidIsNotNull() {
            addCriterion("uSendId is not null");
            return (Criteria) this;
        }

        public Criteria andUsendidEqualTo(Integer value) {
            addCriterion("uSendId =", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidNotEqualTo(Integer value) {
            addCriterion("uSendId <>", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidGreaterThan(Integer value) {
            addCriterion("uSendId >", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uSendId >=", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidLessThan(Integer value) {
            addCriterion("uSendId <", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidLessThanOrEqualTo(Integer value) {
            addCriterion("uSendId <=", value, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidIn(List<Integer> values) {
            addCriterion("uSendId in", values, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidNotIn(List<Integer> values) {
            addCriterion("uSendId not in", values, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidBetween(Integer value1, Integer value2) {
            addCriterion("uSendId between", value1, value2, "usendid");
            return (Criteria) this;
        }

        public Criteria andUsendidNotBetween(Integer value1, Integer value2) {
            addCriterion("uSendId not between", value1, value2, "usendid");
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