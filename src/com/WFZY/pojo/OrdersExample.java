package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
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

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Byte value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Byte value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Byte value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Byte value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Byte value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Byte> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Byte> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Byte value1, Byte value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIsNull() {
            addCriterion("goodsMoney is null");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIsNotNull() {
            addCriterion("goodsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyEqualTo(BigDecimal value) {
            addCriterion("goodsMoney =", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotEqualTo(BigDecimal value) {
            addCriterion("goodsMoney <>", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyGreaterThan(BigDecimal value) {
            addCriterion("goodsMoney >", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsMoney >=", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyLessThan(BigDecimal value) {
            addCriterion("goodsMoney <", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsMoney <=", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIn(List<BigDecimal> values) {
            addCriterion("goodsMoney in", values, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotIn(List<BigDecimal> values) {
            addCriterion("goodsMoney not in", values, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsMoney between", value1, value2, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsMoney not between", value1, value2, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIsNull() {
            addCriterion("deliverType is null");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIsNotNull() {
            addCriterion("deliverType is not null");
            return (Criteria) this;
        }

        public Criteria andDelivertypeEqualTo(Byte value) {
            addCriterion("deliverType =", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotEqualTo(Byte value) {
            addCriterion("deliverType <>", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeGreaterThan(Byte value) {
            addCriterion("deliverType >", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliverType >=", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeLessThan(Byte value) {
            addCriterion("deliverType <", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeLessThanOrEqualTo(Byte value) {
            addCriterion("deliverType <=", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIn(List<Byte> values) {
            addCriterion("deliverType in", values, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotIn(List<Byte> values) {
            addCriterion("deliverType not in", values, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeBetween(Byte value1, Byte value2) {
            addCriterion("deliverType between", value1, value2, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotBetween(Byte value1, Byte value2) {
            addCriterion("deliverType not between", value1, value2, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIsNull() {
            addCriterion("deliverMoney is null");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIsNotNull() {
            addCriterion("deliverMoney is not null");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyEqualTo(BigDecimal value) {
            addCriterion("deliverMoney =", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotEqualTo(BigDecimal value) {
            addCriterion("deliverMoney <>", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyGreaterThan(BigDecimal value) {
            addCriterion("deliverMoney >", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverMoney >=", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyLessThan(BigDecimal value) {
            addCriterion("deliverMoney <", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverMoney <=", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIn(List<BigDecimal> values) {
            addCriterion("deliverMoney in", values, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotIn(List<BigDecimal> values) {
            addCriterion("deliverMoney not in", values, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverMoney between", value1, value2, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverMoney not between", value1, value2, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(BigDecimal value) {
            addCriterion("totalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("totalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("totalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(BigDecimal value) {
            addCriterion("totalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<BigDecimal> values) {
            addCriterion("totalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("totalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyIsNull() {
            addCriterion("realTotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyIsNotNull() {
            addCriterion("realTotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyEqualTo(BigDecimal value) {
            addCriterion("realTotalMoney =", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("realTotalMoney <>", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("realTotalMoney >", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realTotalMoney >=", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyLessThan(BigDecimal value) {
            addCriterion("realTotalMoney <", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realTotalMoney <=", value, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyIn(List<BigDecimal> values) {
            addCriterion("realTotalMoney in", values, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("realTotalMoney not in", values, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realTotalMoney between", value1, value2, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andRealtotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realTotalMoney not between", value1, value2, "realtotalmoney");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Byte value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Byte value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Byte value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Byte value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Byte value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Byte> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Byte> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Byte value1, Byte value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Byte value1, Byte value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPayfromIsNull() {
            addCriterion("payFrom is null");
            return (Criteria) this;
        }

        public Criteria andPayfromIsNotNull() {
            addCriterion("payFrom is not null");
            return (Criteria) this;
        }

        public Criteria andPayfromEqualTo(Integer value) {
            addCriterion("payFrom =", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromNotEqualTo(Integer value) {
            addCriterion("payFrom <>", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromGreaterThan(Integer value) {
            addCriterion("payFrom >", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("payFrom >=", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromLessThan(Integer value) {
            addCriterion("payFrom <", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromLessThanOrEqualTo(Integer value) {
            addCriterion("payFrom <=", value, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromIn(List<Integer> values) {
            addCriterion("payFrom in", values, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromNotIn(List<Integer> values) {
            addCriterion("payFrom not in", values, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromBetween(Integer value1, Integer value2) {
            addCriterion("payFrom between", value1, value2, "payfrom");
            return (Criteria) this;
        }

        public Criteria andPayfromNotBetween(Integer value1, Integer value2) {
            addCriterion("payFrom not between", value1, value2, "payfrom");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Byte value) {
            addCriterion("isPay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Byte value) {
            addCriterion("isPay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Byte value) {
            addCriterion("isPay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Byte value) {
            addCriterion("isPay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Byte value) {
            addCriterion("isPay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Byte value) {
            addCriterion("isPay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Byte> values) {
            addCriterion("isPay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Byte> values) {
            addCriterion("isPay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Byte value1, Byte value2) {
            addCriterion("isPay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Byte value1, Byte value2) {
            addCriterion("isPay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("userAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("userAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("userAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("userAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("userAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNull() {
            addCriterion("isInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNotNull() {
            addCriterion("isInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceEqualTo(Byte value) {
            addCriterion("isInvoice =", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotEqualTo(Byte value) {
            addCriterion("isInvoice <>", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThan(Byte value) {
            addCriterion("isInvoice >", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("isInvoice >=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThan(Byte value) {
            addCriterion("isInvoice <", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("isInvoice <=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIn(List<Byte> values) {
            addCriterion("isInvoice in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotIn(List<Byte> values) {
            addCriterion("isInvoice not in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceBetween(Byte value1, Byte value2) {
            addCriterion("isInvoice between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("isInvoice not between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNull() {
            addCriterion("orderRemarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNotNull() {
            addCriterion("orderRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksEqualTo(String value) {
            addCriterion("orderRemarks =", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotEqualTo(String value) {
            addCriterion("orderRemarks <>", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThan(String value) {
            addCriterion("orderRemarks >", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThanOrEqualTo(String value) {
            addCriterion("orderRemarks >=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThan(String value) {
            addCriterion("orderRemarks <", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThanOrEqualTo(String value) {
            addCriterion("orderRemarks <=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLike(String value) {
            addCriterion("orderRemarks like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotLike(String value) {
            addCriterion("orderRemarks not like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIn(List<String> values) {
            addCriterion("orderRemarks in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotIn(List<String> values) {
            addCriterion("orderRemarks not in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksBetween(String value1, String value2) {
            addCriterion("orderRemarks between", value1, value2, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotBetween(String value1, String value2) {
            addCriterion("orderRemarks not between", value1, value2, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrdersrcIsNull() {
            addCriterion("orderSrc is null");
            return (Criteria) this;
        }

        public Criteria andOrdersrcIsNotNull() {
            addCriterion("orderSrc is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersrcEqualTo(Byte value) {
            addCriterion("orderSrc =", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcNotEqualTo(Byte value) {
            addCriterion("orderSrc <>", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcGreaterThan(Byte value) {
            addCriterion("orderSrc >", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderSrc >=", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcLessThan(Byte value) {
            addCriterion("orderSrc <", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcLessThanOrEqualTo(Byte value) {
            addCriterion("orderSrc <=", value, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcIn(List<Byte> values) {
            addCriterion("orderSrc in", values, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcNotIn(List<Byte> values) {
            addCriterion("orderSrc not in", values, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcBetween(Byte value1, Byte value2) {
            addCriterion("orderSrc between", value1, value2, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andOrdersrcNotBetween(Byte value1, Byte value2) {
            addCriterion("orderSrc not between", value1, value2, "ordersrc");
            return (Criteria) this;
        }

        public Criteria andIsrefundIsNull() {
            addCriterion("isRefund is null");
            return (Criteria) this;
        }

        public Criteria andIsrefundIsNotNull() {
            addCriterion("isRefund is not null");
            return (Criteria) this;
        }

        public Criteria andIsrefundEqualTo(Byte value) {
            addCriterion("isRefund =", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotEqualTo(Byte value) {
            addCriterion("isRefund <>", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundGreaterThan(Byte value) {
            addCriterion("isRefund >", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("isRefund >=", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundLessThan(Byte value) {
            addCriterion("isRefund <", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundLessThanOrEqualTo(Byte value) {
            addCriterion("isRefund <=", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundIn(List<Byte> values) {
            addCriterion("isRefund in", values, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotIn(List<Byte> values) {
            addCriterion("isRefund not in", values, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundBetween(Byte value1, Byte value2) {
            addCriterion("isRefund between", value1, value2, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotBetween(Byte value1, Byte value2) {
            addCriterion("isRefund not between", value1, value2, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIsNull() {
            addCriterion("isAppraise is null");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIsNotNull() {
            addCriterion("isAppraise is not null");
            return (Criteria) this;
        }

        public Criteria andIsappraiseEqualTo(Byte value) {
            addCriterion("isAppraise =", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotEqualTo(Byte value) {
            addCriterion("isAppraise <>", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseGreaterThan(Byte value) {
            addCriterion("isAppraise >", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseGreaterThanOrEqualTo(Byte value) {
            addCriterion("isAppraise >=", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseLessThan(Byte value) {
            addCriterion("isAppraise <", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseLessThanOrEqualTo(Byte value) {
            addCriterion("isAppraise <=", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIn(List<Byte> values) {
            addCriterion("isAppraise in", values, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotIn(List<Byte> values) {
            addCriterion("isAppraise not in", values, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseBetween(Byte value1, Byte value2) {
            addCriterion("isAppraise between", value1, value2, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotBetween(Byte value1, Byte value2) {
            addCriterion("isAppraise not between", value1, value2, "isappraise");
            return (Criteria) this;
        }

        public Criteria andCancelreasonIsNull() {
            addCriterion("cancelReason is null");
            return (Criteria) this;
        }

        public Criteria andCancelreasonIsNotNull() {
            addCriterion("cancelReason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelreasonEqualTo(Integer value) {
            addCriterion("cancelReason =", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotEqualTo(Integer value) {
            addCriterion("cancelReason <>", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonGreaterThan(Integer value) {
            addCriterion("cancelReason >", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancelReason >=", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonLessThan(Integer value) {
            addCriterion("cancelReason <", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonLessThanOrEqualTo(Integer value) {
            addCriterion("cancelReason <=", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonIn(List<Integer> values) {
            addCriterion("cancelReason in", values, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotIn(List<Integer> values) {
            addCriterion("cancelReason not in", values, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonBetween(Integer value1, Integer value2) {
            addCriterion("cancelReason between", value1, value2, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotBetween(Integer value1, Integer value2) {
            addCriterion("cancelReason not between", value1, value2, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNull() {
            addCriterion("rejectReason is null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNotNull() {
            addCriterion("rejectReason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonEqualTo(Integer value) {
            addCriterion("rejectReason =", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotEqualTo(Integer value) {
            addCriterion("rejectReason <>", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThan(Integer value) {
            addCriterion("rejectReason >", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("rejectReason >=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThan(Integer value) {
            addCriterion("rejectReason <", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThanOrEqualTo(Integer value) {
            addCriterion("rejectReason <=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIn(List<Integer> values) {
            addCriterion("rejectReason in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotIn(List<Integer> values) {
            addCriterion("rejectReason not in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonBetween(Integer value1, Integer value2) {
            addCriterion("rejectReason between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotBetween(Integer value1, Integer value2) {
            addCriterion("rejectReason not between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonIsNull() {
            addCriterion("rejectOtherReason is null");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonIsNotNull() {
            addCriterion("rejectOtherReason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonEqualTo(String value) {
            addCriterion("rejectOtherReason =", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonNotEqualTo(String value) {
            addCriterion("rejectOtherReason <>", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonGreaterThan(String value) {
            addCriterion("rejectOtherReason >", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonGreaterThanOrEqualTo(String value) {
            addCriterion("rejectOtherReason >=", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonLessThan(String value) {
            addCriterion("rejectOtherReason <", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonLessThanOrEqualTo(String value) {
            addCriterion("rejectOtherReason <=", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonLike(String value) {
            addCriterion("rejectOtherReason like", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonNotLike(String value) {
            addCriterion("rejectOtherReason not like", value, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonIn(List<String> values) {
            addCriterion("rejectOtherReason in", values, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonNotIn(List<String> values) {
            addCriterion("rejectOtherReason not in", values, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonBetween(String value1, String value2) {
            addCriterion("rejectOtherReason between", value1, value2, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andRejectotherreasonNotBetween(String value1, String value2) {
            addCriterion("rejectOtherReason not between", value1, value2, "rejectotherreason");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNull() {
            addCriterion("isClosed is null");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNotNull() {
            addCriterion("isClosed is not null");
            return (Criteria) this;
        }

        public Criteria andIsclosedEqualTo(Byte value) {
            addCriterion("isClosed =", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotEqualTo(Byte value) {
            addCriterion("isClosed <>", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThan(Byte value) {
            addCriterion("isClosed >", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isClosed >=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThan(Byte value) {
            addCriterion("isClosed <", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThanOrEqualTo(Byte value) {
            addCriterion("isClosed <=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedIn(List<Byte> values) {
            addCriterion("isClosed in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotIn(List<Byte> values) {
            addCriterion("isClosed not in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedBetween(Byte value1, Byte value2) {
            addCriterion("isClosed between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotBetween(Byte value1, Byte value2) {
            addCriterion("isClosed not between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueIsNull() {
            addCriterion("orderunique is null");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueIsNotNull() {
            addCriterion("orderunique is not null");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueEqualTo(String value) {
            addCriterion("orderunique =", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueNotEqualTo(String value) {
            addCriterion("orderunique <>", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueGreaterThan(String value) {
            addCriterion("orderunique >", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueGreaterThanOrEqualTo(String value) {
            addCriterion("orderunique >=", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueLessThan(String value) {
            addCriterion("orderunique <", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueLessThanOrEqualTo(String value) {
            addCriterion("orderunique <=", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueLike(String value) {
            addCriterion("orderunique like", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueNotLike(String value) {
            addCriterion("orderunique not like", value, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueIn(List<String> values) {
            addCriterion("orderunique in", values, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueNotIn(List<String> values) {
            addCriterion("orderunique not in", values, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueBetween(String value1, String value2) {
            addCriterion("orderunique between", value1, value2, "orderunique");
            return (Criteria) this;
        }

        public Criteria andOrderuniqueNotBetween(String value1, String value2) {
            addCriterion("orderunique not between", value1, value2, "orderunique");
            return (Criteria) this;
        }

        public Criteria andSettlementidIsNull() {
            addCriterion("settlementId is null");
            return (Criteria) this;
        }

        public Criteria andSettlementidIsNotNull() {
            addCriterion("settlementId is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementidEqualTo(Integer value) {
            addCriterion("settlementId =", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotEqualTo(Integer value) {
            addCriterion("settlementId <>", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThan(Integer value) {
            addCriterion("settlementId >", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlementId >=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThan(Integer value) {
            addCriterion("settlementId <", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThanOrEqualTo(Integer value) {
            addCriterion("settlementId <=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidIn(List<Integer> values) {
            addCriterion("settlementId in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotIn(List<Integer> values) {
            addCriterion("settlementId not in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidBetween(Integer value1, Integer value2) {
            addCriterion("settlementId between", value1, value2, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotBetween(Integer value1, Integer value2) {
            addCriterion("settlementId not between", value1, value2, "settlementid");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("deliveryTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("deliveryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Date value) {
            addCriterion("deliveryTime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Date value) {
            addCriterion("deliveryTime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Date value) {
            addCriterion("deliveryTime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryTime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Date value) {
            addCriterion("deliveryTime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("deliveryTime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Date> values) {
            addCriterion("deliveryTime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Date> values) {
            addCriterion("deliveryTime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Date value1, Date value2) {
            addCriterion("deliveryTime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("deliveryTime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNull() {
            addCriterion("expressNo is null");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNotNull() {
            addCriterion("expressNo is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnoEqualTo(String value) {
            addCriterion("expressNo =", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotEqualTo(String value) {
            addCriterion("expressNo <>", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThan(String value) {
            addCriterion("expressNo >", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThanOrEqualTo(String value) {
            addCriterion("expressNo >=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThan(String value) {
            addCriterion("expressNo <", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThanOrEqualTo(String value) {
            addCriterion("expressNo <=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLike(String value) {
            addCriterion("expressNo like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotLike(String value) {
            addCriterion("expressNo not like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoIn(List<String> values) {
            addCriterion("expressNo in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotIn(List<String> values) {
            addCriterion("expressNo not in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoBetween(String value1, String value2) {
            addCriterion("expressNo between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotBetween(String value1, String value2) {
            addCriterion("expressNo not between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNull() {
            addCriterion("expressId is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("expressId is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(Integer value) {
            addCriterion("expressId =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(Integer value) {
            addCriterion("expressId <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(Integer value) {
            addCriterion("expressId >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expressId >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(Integer value) {
            addCriterion("expressId <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(Integer value) {
            addCriterion("expressId <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<Integer> values) {
            addCriterion("expressId in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<Integer> values) {
            addCriterion("expressId not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(Integer value1, Integer value2) {
            addCriterion("expressId between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(Integer value1, Integer value2) {
            addCriterion("expressId not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNull() {
            addCriterion("tradeNo is null");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNotNull() {
            addCriterion("tradeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTradenoEqualTo(String value) {
            addCriterion("tradeNo =", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotEqualTo(String value) {
            addCriterion("tradeNo <>", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThan(String value) {
            addCriterion("tradeNo >", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThanOrEqualTo(String value) {
            addCriterion("tradeNo >=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThan(String value) {
            addCriterion("tradeNo <", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThanOrEqualTo(String value) {
            addCriterion("tradeNo <=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLike(String value) {
            addCriterion("tradeNo like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotLike(String value) {
            addCriterion("tradeNo not like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoIn(List<String> values) {
            addCriterion("tradeNo in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotIn(List<String> values) {
            addCriterion("tradeNo not in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoBetween(String value1, String value2) {
            addCriterion("tradeNo between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotBetween(String value1, String value2) {
            addCriterion("tradeNo not between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andDataflagIsNull() {
            addCriterion("dataFlag is null");
            return (Criteria) this;
        }

        public Criteria andDataflagIsNotNull() {
            addCriterion("dataFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDataflagEqualTo(Byte value) {
            addCriterion("dataFlag =", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagNotEqualTo(Byte value) {
            addCriterion("dataFlag <>", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagGreaterThan(Byte value) {
            addCriterion("dataFlag >", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("dataFlag >=", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagLessThan(Byte value) {
            addCriterion("dataFlag <", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagLessThanOrEqualTo(Byte value) {
            addCriterion("dataFlag <=", value, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagIn(List<Byte> values) {
            addCriterion("dataFlag in", values, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagNotIn(List<Byte> values) {
            addCriterion("dataFlag not in", values, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagBetween(Byte value1, Byte value2) {
            addCriterion("dataFlag between", value1, value2, "dataflag");
            return (Criteria) this;
        }

        public Criteria andDataflagNotBetween(Byte value1, Byte value2) {
            addCriterion("dataFlag not between", value1, value2, "dataflag");
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