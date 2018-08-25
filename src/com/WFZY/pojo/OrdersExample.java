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

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNull() {
            addCriterion("goodsCount is null");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNotNull() {
            addCriterion("goodsCount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscountEqualTo(Integer value) {
            addCriterion("goodsCount =", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotEqualTo(Integer value) {
            addCriterion("goodsCount <>", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThan(Integer value) {
            addCriterion("goodsCount >", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsCount >=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThan(Integer value) {
            addCriterion("goodsCount <", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThanOrEqualTo(Integer value) {
            addCriterion("goodsCount <=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountIn(List<Integer> values) {
            addCriterion("goodsCount in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotIn(List<Integer> values) {
            addCriterion("goodsCount not in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount not between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Integer value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Integer value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Integer value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Integer value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Integer value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Integer> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Integer> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Integer value1, Integer value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksIsNull() {
            addCriterion("goodsRemarks is null");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksIsNotNull() {
            addCriterion("goodsRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksEqualTo(String value) {
            addCriterion("goodsRemarks =", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksNotEqualTo(String value) {
            addCriterion("goodsRemarks <>", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksGreaterThan(String value) {
            addCriterion("goodsRemarks >", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksGreaterThanOrEqualTo(String value) {
            addCriterion("goodsRemarks >=", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksLessThan(String value) {
            addCriterion("goodsRemarks <", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksLessThanOrEqualTo(String value) {
            addCriterion("goodsRemarks <=", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksLike(String value) {
            addCriterion("goodsRemarks like", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksNotLike(String value) {
            addCriterion("goodsRemarks not like", value, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksIn(List<String> values) {
            addCriterion("goodsRemarks in", values, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksNotIn(List<String> values) {
            addCriterion("goodsRemarks not in", values, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksBetween(String value1, String value2) {
            addCriterion("goodsRemarks between", value1, value2, "goodsremarks");
            return (Criteria) this;
        }

        public Criteria andGoodsremarksNotBetween(String value1, String value2) {
            addCriterion("goodsRemarks not between", value1, value2, "goodsremarks");
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

        public Criteria andReceivednameIsNull() {
            addCriterion("receivedName is null");
            return (Criteria) this;
        }

        public Criteria andReceivednameIsNotNull() {
            addCriterion("receivedName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivednameEqualTo(String value) {
            addCriterion("receivedName =", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameNotEqualTo(String value) {
            addCriterion("receivedName <>", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameGreaterThan(String value) {
            addCriterion("receivedName >", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameGreaterThanOrEqualTo(String value) {
            addCriterion("receivedName >=", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameLessThan(String value) {
            addCriterion("receivedName <", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameLessThanOrEqualTo(String value) {
            addCriterion("receivedName <=", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameLike(String value) {
            addCriterion("receivedName like", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameNotLike(String value) {
            addCriterion("receivedName not like", value, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameIn(List<String> values) {
            addCriterion("receivedName in", values, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameNotIn(List<String> values) {
            addCriterion("receivedName not in", values, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameBetween(String value1, String value2) {
            addCriterion("receivedName between", value1, value2, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivednameNotBetween(String value1, String value2) {
            addCriterion("receivedName not between", value1, value2, "receivedname");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressIsNull() {
            addCriterion("receivedAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressIsNotNull() {
            addCriterion("receivedAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressEqualTo(String value) {
            addCriterion("receivedAddress =", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressNotEqualTo(String value) {
            addCriterion("receivedAddress <>", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressGreaterThan(String value) {
            addCriterion("receivedAddress >", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("receivedAddress >=", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressLessThan(String value) {
            addCriterion("receivedAddress <", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressLessThanOrEqualTo(String value) {
            addCriterion("receivedAddress <=", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressLike(String value) {
            addCriterion("receivedAddress like", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressNotLike(String value) {
            addCriterion("receivedAddress not like", value, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressIn(List<String> values) {
            addCriterion("receivedAddress in", values, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressNotIn(List<String> values) {
            addCriterion("receivedAddress not in", values, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressBetween(String value1, String value2) {
            addCriterion("receivedAddress between", value1, value2, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedaddressNotBetween(String value1, String value2) {
            addCriterion("receivedAddress not between", value1, value2, "receivedaddress");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneIsNull() {
            addCriterion("receivedPhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneIsNotNull() {
            addCriterion("receivedPhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneEqualTo(String value) {
            addCriterion("receivedPhone =", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneNotEqualTo(String value) {
            addCriterion("receivedPhone <>", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneGreaterThan(String value) {
            addCriterion("receivedPhone >", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneGreaterThanOrEqualTo(String value) {
            addCriterion("receivedPhone >=", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneLessThan(String value) {
            addCriterion("receivedPhone <", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneLessThanOrEqualTo(String value) {
            addCriterion("receivedPhone <=", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneLike(String value) {
            addCriterion("receivedPhone like", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneNotLike(String value) {
            addCriterion("receivedPhone not like", value, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneIn(List<String> values) {
            addCriterion("receivedPhone in", values, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneNotIn(List<String> values) {
            addCriterion("receivedPhone not in", values, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneBetween(String value1, String value2) {
            addCriterion("receivedPhone between", value1, value2, "receivedphone");
            return (Criteria) this;
        }

        public Criteria andReceivedphoneNotBetween(String value1, String value2) {
            addCriterion("receivedPhone not between", value1, value2, "receivedphone");
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

        public Criteria andCancelreasonEqualTo(String value) {
            addCriterion("cancelReason =", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotEqualTo(String value) {
            addCriterion("cancelReason <>", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonGreaterThan(String value) {
            addCriterion("cancelReason >", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancelReason >=", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonLessThan(String value) {
            addCriterion("cancelReason <", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonLessThanOrEqualTo(String value) {
            addCriterion("cancelReason <=", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonLike(String value) {
            addCriterion("cancelReason like", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotLike(String value) {
            addCriterion("cancelReason not like", value, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonIn(List<String> values) {
            addCriterion("cancelReason in", values, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotIn(List<String> values) {
            addCriterion("cancelReason not in", values, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonBetween(String value1, String value2) {
            addCriterion("cancelReason between", value1, value2, "cancelreason");
            return (Criteria) this;
        }

        public Criteria andCancelreasonNotBetween(String value1, String value2) {
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

        public Criteria andRejectreasonEqualTo(String value) {
            addCriterion("rejectReason =", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotEqualTo(String value) {
            addCriterion("rejectReason <>", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThan(String value) {
            addCriterion("rejectReason >", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("rejectReason >=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThan(String value) {
            addCriterion("rejectReason <", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThanOrEqualTo(String value) {
            addCriterion("rejectReason <=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLike(String value) {
            addCriterion("rejectReason like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotLike(String value) {
            addCriterion("rejectReason not like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIn(List<String> values) {
            addCriterion("rejectReason in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotIn(List<String> values) {
            addCriterion("rejectReason not in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonBetween(String value1, String value2) {
            addCriterion("rejectReason between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotBetween(String value1, String value2) {
            addCriterion("rejectReason not between", value1, value2, "rejectreason");
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

        public Criteria andSettlementidIsNull() {
            addCriterion("settlementId is null");
            return (Criteria) this;
        }

        public Criteria andSettlementidIsNotNull() {
            addCriterion("settlementId is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementidEqualTo(Byte value) {
            addCriterion("settlementId =", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotEqualTo(Byte value) {
            addCriterion("settlementId <>", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThan(Byte value) {
            addCriterion("settlementId >", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThanOrEqualTo(Byte value) {
            addCriterion("settlementId >=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThan(Byte value) {
            addCriterion("settlementId <", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThanOrEqualTo(Byte value) {
            addCriterion("settlementId <=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidIn(List<Byte> values) {
            addCriterion("settlementId in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotIn(List<Byte> values) {
            addCriterion("settlementId not in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidBetween(Byte value1, Byte value2) {
            addCriterion("settlementId between", value1, value2, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotBetween(Byte value1, Byte value2) {
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