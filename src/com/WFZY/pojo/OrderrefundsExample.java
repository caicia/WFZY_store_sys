package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderrefundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderrefundsExample() {
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

        public Criteria andOrderrefundsidIsNull() {
            addCriterion("orderRefundsId is null");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidIsNotNull() {
            addCriterion("orderRefundsId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidEqualTo(Integer value) {
            addCriterion("orderRefundsId =", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidNotEqualTo(Integer value) {
            addCriterion("orderRefundsId <>", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidGreaterThan(Integer value) {
            addCriterion("orderRefundsId >", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderRefundsId >=", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidLessThan(Integer value) {
            addCriterion("orderRefundsId <", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidLessThanOrEqualTo(Integer value) {
            addCriterion("orderRefundsId <=", value, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidIn(List<Integer> values) {
            addCriterion("orderRefundsId in", values, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidNotIn(List<Integer> values) {
            addCriterion("orderRefundsId not in", values, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidBetween(Integer value1, Integer value2) {
            addCriterion("orderRefundsId between", value1, value2, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderrefundsidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderRefundsId not between", value1, value2, "orderrefundsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonIsNull() {
            addCriterion("refundOtherReson is null");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonIsNotNull() {
            addCriterion("refundOtherReson is not null");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonEqualTo(String value) {
            addCriterion("refundOtherReson =", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonNotEqualTo(String value) {
            addCriterion("refundOtherReson <>", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonGreaterThan(String value) {
            addCriterion("refundOtherReson >", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonGreaterThanOrEqualTo(String value) {
            addCriterion("refundOtherReson >=", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonLessThan(String value) {
            addCriterion("refundOtherReson <", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonLessThanOrEqualTo(String value) {
            addCriterion("refundOtherReson <=", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonLike(String value) {
            addCriterion("refundOtherReson like", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonNotLike(String value) {
            addCriterion("refundOtherReson not like", value, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonIn(List<String> values) {
            addCriterion("refundOtherReson in", values, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonNotIn(List<String> values) {
            addCriterion("refundOtherReson not in", values, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonBetween(String value1, String value2) {
            addCriterion("refundOtherReson between", value1, value2, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andRefundotherresonNotBetween(String value1, String value2) {
            addCriterion("refundOtherReson not between", value1, value2, "refundotherreson");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBackmoneyIsNull() {
            addCriterion("backMoney is null");
            return (Criteria) this;
        }

        public Criteria andBackmoneyIsNotNull() {
            addCriterion("backMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBackmoneyEqualTo(BigDecimal value) {
            addCriterion("backMoney =", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyNotEqualTo(BigDecimal value) {
            addCriterion("backMoney <>", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyGreaterThan(BigDecimal value) {
            addCriterion("backMoney >", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backMoney >=", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyLessThan(BigDecimal value) {
            addCriterion("backMoney <", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backMoney <=", value, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyIn(List<BigDecimal> values) {
            addCriterion("backMoney in", values, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyNotIn(List<BigDecimal> values) {
            addCriterion("backMoney not in", values, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backMoney between", value1, value2, "backmoney");
            return (Criteria) this;
        }

        public Criteria andBackmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backMoney not between", value1, value2, "backmoney");
            return (Criteria) this;
        }

        public Criteria andRefundremarkIsNull() {
            addCriterion("refundRemark is null");
            return (Criteria) this;
        }

        public Criteria andRefundremarkIsNotNull() {
            addCriterion("refundRemark is not null");
            return (Criteria) this;
        }

        public Criteria andRefundremarkEqualTo(String value) {
            addCriterion("refundRemark =", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkNotEqualTo(String value) {
            addCriterion("refundRemark <>", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkGreaterThan(String value) {
            addCriterion("refundRemark >", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkGreaterThanOrEqualTo(String value) {
            addCriterion("refundRemark >=", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkLessThan(String value) {
            addCriterion("refundRemark <", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkLessThanOrEqualTo(String value) {
            addCriterion("refundRemark <=", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkLike(String value) {
            addCriterion("refundRemark like", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkNotLike(String value) {
            addCriterion("refundRemark not like", value, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkIn(List<String> values) {
            addCriterion("refundRemark in", values, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkNotIn(List<String> values) {
            addCriterion("refundRemark not in", values, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkBetween(String value1, String value2) {
            addCriterion("refundRemark between", value1, value2, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundremarkNotBetween(String value1, String value2) {
            addCriterion("refundRemark not between", value1, value2, "refundremark");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNull() {
            addCriterion("refundTime is null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNotNull() {
            addCriterion("refundTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeEqualTo(Date value) {
            addCriterion("refundTime =", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotEqualTo(Date value) {
            addCriterion("refundTime <>", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThan(Date value) {
            addCriterion("refundTime >", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refundTime >=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThan(Date value) {
            addCriterion("refundTime <", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThanOrEqualTo(Date value) {
            addCriterion("refundTime <=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIn(List<Date> values) {
            addCriterion("refundTime in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotIn(List<Date> values) {
            addCriterion("refundTime not in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeBetween(Date value1, Date value2) {
            addCriterion("refundTime between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotBetween(Date value1, Date value2) {
            addCriterion("refundTime not between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonIsNull() {
            addCriterion("shopRejectReason is null");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonIsNotNull() {
            addCriterion("shopRejectReason is not null");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonEqualTo(String value) {
            addCriterion("shopRejectReason =", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonNotEqualTo(String value) {
            addCriterion("shopRejectReason <>", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonGreaterThan(String value) {
            addCriterion("shopRejectReason >", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("shopRejectReason >=", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonLessThan(String value) {
            addCriterion("shopRejectReason <", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonLessThanOrEqualTo(String value) {
            addCriterion("shopRejectReason <=", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonLike(String value) {
            addCriterion("shopRejectReason like", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonNotLike(String value) {
            addCriterion("shopRejectReason not like", value, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonIn(List<String> values) {
            addCriterion("shopRejectReason in", values, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonNotIn(List<String> values) {
            addCriterion("shopRejectReason not in", values, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonBetween(String value1, String value2) {
            addCriterion("shopRejectReason between", value1, value2, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andShoprejectreasonNotBetween(String value1, String value2) {
            addCriterion("shopRejectReason not between", value1, value2, "shoprejectreason");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNull() {
            addCriterion("refundStatus is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("refundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(Byte value) {
            addCriterion("refundStatus =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(Byte value) {
            addCriterion("refundStatus <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(Byte value) {
            addCriterion("refundStatus >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refundStatus >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(Byte value) {
            addCriterion("refundStatus <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(Byte value) {
            addCriterion("refundStatus <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<Byte> values) {
            addCriterion("refundStatus in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<Byte> values) {
            addCriterion("refundStatus not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(Byte value1, Byte value2) {
            addCriterion("refundStatus between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refundStatus not between", value1, value2, "refundstatus");
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