package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopsExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andShopclassifyidIsNull() {
            addCriterion("shopClassifyId is null");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidIsNotNull() {
            addCriterion("shopClassifyId is not null");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidEqualTo(Integer value) {
            addCriterion("shopClassifyId =", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidNotEqualTo(Integer value) {
            addCriterion("shopClassifyId <>", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidGreaterThan(Integer value) {
            addCriterion("shopClassifyId >", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopClassifyId >=", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidLessThan(Integer value) {
            addCriterion("shopClassifyId <", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("shopClassifyId <=", value, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidIn(List<Integer> values) {
            addCriterion("shopClassifyId in", values, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidNotIn(List<Integer> values) {
            addCriterion("shopClassifyId not in", values, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidBetween(Integer value1, Integer value2) {
            addCriterion("shopClassifyId between", value1, value2, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopclassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopClassifyId not between", value1, value2, "shopclassifyid");
            return (Criteria) this;
        }

        public Criteria andShopsnIsNull() {
            addCriterion("shopSn is null");
            return (Criteria) this;
        }

        public Criteria andShopsnIsNotNull() {
            addCriterion("shopSn is not null");
            return (Criteria) this;
        }

        public Criteria andShopsnEqualTo(String value) {
            addCriterion("shopSn =", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotEqualTo(String value) {
            addCriterion("shopSn <>", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnGreaterThan(String value) {
            addCriterion("shopSn >", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnGreaterThanOrEqualTo(String value) {
            addCriterion("shopSn >=", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLessThan(String value) {
            addCriterion("shopSn <", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLessThanOrEqualTo(String value) {
            addCriterion("shopSn <=", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnLike(String value) {
            addCriterion("shopSn like", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotLike(String value) {
            addCriterion("shopSn not like", value, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnIn(List<String> values) {
            addCriterion("shopSn in", values, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotIn(List<String> values) {
            addCriterion("shopSn not in", values, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnBetween(String value1, String value2) {
            addCriterion("shopSn between", value1, value2, "shopsn");
            return (Criteria) this;
        }

        public Criteria andShopsnNotBetween(String value1, String value2) {
            addCriterion("shopSn not between", value1, value2, "shopsn");
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

        public Criteria andIsselfIsNull() {
            addCriterion("isSelf is null");
            return (Criteria) this;
        }

        public Criteria andIsselfIsNotNull() {
            addCriterion("isSelf is not null");
            return (Criteria) this;
        }

        public Criteria andIsselfEqualTo(Byte value) {
            addCriterion("isSelf =", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfNotEqualTo(Byte value) {
            addCriterion("isSelf <>", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfGreaterThan(Byte value) {
            addCriterion("isSelf >", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfGreaterThanOrEqualTo(Byte value) {
            addCriterion("isSelf >=", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfLessThan(Byte value) {
            addCriterion("isSelf <", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfLessThanOrEqualTo(Byte value) {
            addCriterion("isSelf <=", value, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfIn(List<Byte> values) {
            addCriterion("isSelf in", values, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfNotIn(List<Byte> values) {
            addCriterion("isSelf not in", values, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfBetween(Byte value1, Byte value2) {
            addCriterion("isSelf between", value1, value2, "isself");
            return (Criteria) this;
        }

        public Criteria andIsselfNotBetween(Byte value1, Byte value2) {
            addCriterion("isSelf not between", value1, value2, "isself");
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

        public Criteria andShopkeeperIsNull() {
            addCriterion("shopkeeper is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIsNotNull() {
            addCriterion("shopkeeper is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperEqualTo(String value) {
            addCriterion("shopkeeper =", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNotEqualTo(String value) {
            addCriterion("shopkeeper <>", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperGreaterThan(String value) {
            addCriterion("shopkeeper >", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper >=", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperLessThan(String value) {
            addCriterion("shopkeeper <", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper <=", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperLike(String value) {
            addCriterion("shopkeeper like", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNotLike(String value) {
            addCriterion("shopkeeper not like", value, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIn(List<String> values) {
            addCriterion("shopkeeper in", values, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNotIn(List<String> values) {
            addCriterion("shopkeeper not in", values, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperBetween(String value1, String value2) {
            addCriterion("shopkeeper between", value1, value2, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNotBetween(String value1, String value2) {
            addCriterion("shopkeeper not between", value1, value2, "shopkeeper");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneIsNull() {
            addCriterion("shopTelephone is null");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneIsNotNull() {
            addCriterion("shopTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneEqualTo(String value) {
            addCriterion("shopTelephone =", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneNotEqualTo(String value) {
            addCriterion("shopTelephone <>", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneGreaterThan(String value) {
            addCriterion("shopTelephone >", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("shopTelephone >=", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneLessThan(String value) {
            addCriterion("shopTelephone <", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneLessThanOrEqualTo(String value) {
            addCriterion("shopTelephone <=", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneLike(String value) {
            addCriterion("shopTelephone like", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneNotLike(String value) {
            addCriterion("shopTelephone not like", value, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneIn(List<String> values) {
            addCriterion("shopTelephone in", values, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneNotIn(List<String> values) {
            addCriterion("shopTelephone not in", values, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneBetween(String value1, String value2) {
            addCriterion("shopTelephone between", value1, value2, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShoptelephoneNotBetween(String value1, String value2) {
            addCriterion("shopTelephone not between", value1, value2, "shoptelephone");
            return (Criteria) this;
        }

        public Criteria andShopimgIsNull() {
            addCriterion("shopImg is null");
            return (Criteria) this;
        }

        public Criteria andShopimgIsNotNull() {
            addCriterion("shopImg is not null");
            return (Criteria) this;
        }

        public Criteria andShopimgEqualTo(String value) {
            addCriterion("shopImg =", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotEqualTo(String value) {
            addCriterion("shopImg <>", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgGreaterThan(String value) {
            addCriterion("shopImg >", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgGreaterThanOrEqualTo(String value) {
            addCriterion("shopImg >=", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLessThan(String value) {
            addCriterion("shopImg <", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLessThanOrEqualTo(String value) {
            addCriterion("shopImg <=", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLike(String value) {
            addCriterion("shopImg like", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotLike(String value) {
            addCriterion("shopImg not like", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgIn(List<String> values) {
            addCriterion("shopImg in", values, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotIn(List<String> values) {
            addCriterion("shopImg not in", values, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgBetween(String value1, String value2) {
            addCriterion("shopImg between", value1, value2, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotBetween(String value1, String value2) {
            addCriterion("shopImg not between", value1, value2, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopwangwangIsNull() {
            addCriterion("shopWangWang is null");
            return (Criteria) this;
        }

        public Criteria andShopwangwangIsNotNull() {
            addCriterion("shopWangWang is not null");
            return (Criteria) this;
        }

        public Criteria andShopwangwangEqualTo(String value) {
            addCriterion("shopWangWang =", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangNotEqualTo(String value) {
            addCriterion("shopWangWang <>", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangGreaterThan(String value) {
            addCriterion("shopWangWang >", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangGreaterThanOrEqualTo(String value) {
            addCriterion("shopWangWang >=", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangLessThan(String value) {
            addCriterion("shopWangWang <", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangLessThanOrEqualTo(String value) {
            addCriterion("shopWangWang <=", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangLike(String value) {
            addCriterion("shopWangWang like", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangNotLike(String value) {
            addCriterion("shopWangWang not like", value, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangIn(List<String> values) {
            addCriterion("shopWangWang in", values, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangNotIn(List<String> values) {
            addCriterion("shopWangWang not in", values, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangBetween(String value1, String value2) {
            addCriterion("shopWangWang between", value1, value2, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopwangwangNotBetween(String value1, String value2) {
            addCriterion("shopWangWang not between", value1, value2, "shopwangwang");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNull() {
            addCriterion("shopAddress is null");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNotNull() {
            addCriterion("shopAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShopaddressEqualTo(String value) {
            addCriterion("shopAddress =", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotEqualTo(String value) {
            addCriterion("shopAddress <>", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThan(String value) {
            addCriterion("shopAddress >", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shopAddress >=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThan(String value) {
            addCriterion("shopAddress <", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThanOrEqualTo(String value) {
            addCriterion("shopAddress <=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLike(String value) {
            addCriterion("shopAddress like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotLike(String value) {
            addCriterion("shopAddress not like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressIn(List<String> values) {
            addCriterion("shopAddress in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotIn(List<String> values) {
            addCriterion("shopAddress not in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressBetween(String value1, String value2) {
            addCriterion("shopAddress between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotBetween(String value1, String value2) {
            addCriterion("shopAddress not between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankId is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankId is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Integer value) {
            addCriterion("bankId =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Integer value) {
            addCriterion("bankId <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Integer value) {
            addCriterion("bankId >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankId >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Integer value) {
            addCriterion("bankId <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Integer value) {
            addCriterion("bankId <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Integer> values) {
            addCriterion("bankId in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Integer> values) {
            addCriterion("bankId not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Integer value1, Integer value2) {
            addCriterion("bankId between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Integer value1, Integer value2) {
            addCriterion("bankId not between", value1, value2, "bankid");
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

        public Criteria andInvoiceremarksIsNull() {
            addCriterion("invoiceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksIsNotNull() {
            addCriterion("invoiceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksEqualTo(String value) {
            addCriterion("invoiceRemarks =", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksNotEqualTo(String value) {
            addCriterion("invoiceRemarks <>", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksGreaterThan(String value) {
            addCriterion("invoiceRemarks >", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceRemarks >=", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksLessThan(String value) {
            addCriterion("invoiceRemarks <", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksLessThanOrEqualTo(String value) {
            addCriterion("invoiceRemarks <=", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksLike(String value) {
            addCriterion("invoiceRemarks like", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksNotLike(String value) {
            addCriterion("invoiceRemarks not like", value, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksIn(List<String> values) {
            addCriterion("invoiceRemarks in", values, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksNotIn(List<String> values) {
            addCriterion("invoiceRemarks not in", values, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksBetween(String value1, String value2) {
            addCriterion("invoiceRemarks between", value1, value2, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarksNotBetween(String value1, String value2) {
            addCriterion("invoiceRemarks not between", value1, value2, "invoiceremarks");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeIsNull() {
            addCriterion("serviceStartTime is null");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeIsNotNull() {
            addCriterion("serviceStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("serviceStartTime =", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("serviceStartTime <>", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("serviceStartTime >", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("serviceStartTime >=", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeLessThan(Date value) {
            addCriterionForJDBCTime("serviceStartTime <", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("serviceStartTime <=", value, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("serviceStartTime in", values, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("serviceStartTime not in", values, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("serviceStartTime between", value1, value2, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServicestarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("serviceStartTime not between", value1, value2, "servicestarttime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeIsNull() {
            addCriterion("serviceEndTime is null");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeIsNotNull() {
            addCriterion("serviceEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeEqualTo(Date value) {
            addCriterionForJDBCTime("serviceEndTime =", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("serviceEndTime <>", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("serviceEndTime >", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("serviceEndTime >=", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeLessThan(Date value) {
            addCriterionForJDBCTime("serviceEndTime <", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("serviceEndTime <=", value, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeIn(List<Date> values) {
            addCriterionForJDBCTime("serviceEndTime in", values, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("serviceEndTime not in", values, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("serviceEndTime between", value1, value2, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andServiceendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("serviceEndTime not between", value1, value2, "serviceendtime");
            return (Criteria) this;
        }

        public Criteria andShopativeIsNull() {
            addCriterion("shopAtive is null");
            return (Criteria) this;
        }

        public Criteria andShopativeIsNotNull() {
            addCriterion("shopAtive is not null");
            return (Criteria) this;
        }

        public Criteria andShopativeEqualTo(Byte value) {
            addCriterion("shopAtive =", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeNotEqualTo(Byte value) {
            addCriterion("shopAtive <>", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeGreaterThan(Byte value) {
            addCriterion("shopAtive >", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shopAtive >=", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeLessThan(Byte value) {
            addCriterion("shopAtive <", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeLessThanOrEqualTo(Byte value) {
            addCriterion("shopAtive <=", value, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeIn(List<Byte> values) {
            addCriterion("shopAtive in", values, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeNotIn(List<Byte> values) {
            addCriterion("shopAtive not in", values, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeBetween(Byte value1, Byte value2) {
            addCriterion("shopAtive between", value1, value2, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopativeNotBetween(Byte value1, Byte value2) {
            addCriterion("shopAtive not between", value1, value2, "shopative");
            return (Criteria) this;
        }

        public Criteria andShopstatusIsNull() {
            addCriterion("shopStatus is null");
            return (Criteria) this;
        }

        public Criteria andShopstatusIsNotNull() {
            addCriterion("shopStatus is not null");
            return (Criteria) this;
        }

        public Criteria andShopstatusEqualTo(Byte value) {
            addCriterion("shopStatus =", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotEqualTo(Byte value) {
            addCriterion("shopStatus <>", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusGreaterThan(Byte value) {
            addCriterion("shopStatus >", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("shopStatus >=", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusLessThan(Byte value) {
            addCriterion("shopStatus <", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusLessThanOrEqualTo(Byte value) {
            addCriterion("shopStatus <=", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusIn(List<Byte> values) {
            addCriterion("shopStatus in", values, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotIn(List<Byte> values) {
            addCriterion("shopStatus not in", values, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusBetween(Byte value1, Byte value2) {
            addCriterion("shopStatus between", value1, value2, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("shopStatus not between", value1, value2, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andStatusdescIsNull() {
            addCriterion("statusDesc is null");
            return (Criteria) this;
        }

        public Criteria andStatusdescIsNotNull() {
            addCriterion("statusDesc is not null");
            return (Criteria) this;
        }

        public Criteria andStatusdescEqualTo(String value) {
            addCriterion("statusDesc =", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescNotEqualTo(String value) {
            addCriterion("statusDesc <>", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescGreaterThan(String value) {
            addCriterion("statusDesc >", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescGreaterThanOrEqualTo(String value) {
            addCriterion("statusDesc >=", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescLessThan(String value) {
            addCriterion("statusDesc <", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescLessThanOrEqualTo(String value) {
            addCriterion("statusDesc <=", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescLike(String value) {
            addCriterion("statusDesc like", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescNotLike(String value) {
            addCriterion("statusDesc not like", value, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescIn(List<String> values) {
            addCriterion("statusDesc in", values, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescNotIn(List<String> values) {
            addCriterion("statusDesc not in", values, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescBetween(String value1, String value2) {
            addCriterion("statusDesc between", value1, value2, "statusdesc");
            return (Criteria) this;
        }

        public Criteria andStatusdescNotBetween(String value1, String value2) {
            addCriterion("statusDesc not between", value1, value2, "statusdesc");
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

        public Criteria andShopmoneyIsNull() {
            addCriterion("shopMoney is null");
            return (Criteria) this;
        }

        public Criteria andShopmoneyIsNotNull() {
            addCriterion("shopMoney is not null");
            return (Criteria) this;
        }

        public Criteria andShopmoneyEqualTo(BigDecimal value) {
            addCriterion("shopMoney =", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyNotEqualTo(BigDecimal value) {
            addCriterion("shopMoney <>", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyGreaterThan(BigDecimal value) {
            addCriterion("shopMoney >", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shopMoney >=", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyLessThan(BigDecimal value) {
            addCriterion("shopMoney <", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shopMoney <=", value, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyIn(List<BigDecimal> values) {
            addCriterion("shopMoney in", values, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyNotIn(List<BigDecimal> values) {
            addCriterion("shopMoney not in", values, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopMoney between", value1, value2, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andShopmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopMoney not between", value1, value2, "shopmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyIsNull() {
            addCriterion("lockMoney is null");
            return (Criteria) this;
        }

        public Criteria andLockmoneyIsNotNull() {
            addCriterion("lockMoney is not null");
            return (Criteria) this;
        }

        public Criteria andLockmoneyEqualTo(BigDecimal value) {
            addCriterion("lockMoney =", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyNotEqualTo(BigDecimal value) {
            addCriterion("lockMoney <>", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyGreaterThan(BigDecimal value) {
            addCriterion("lockMoney >", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lockMoney >=", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyLessThan(BigDecimal value) {
            addCriterion("lockMoney <", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lockMoney <=", value, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyIn(List<BigDecimal> values) {
            addCriterion("lockMoney in", values, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyNotIn(List<BigDecimal> values) {
            addCriterion("lockMoney not in", values, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lockMoney between", value1, value2, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andLockmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lockMoney not between", value1, value2, "lockmoney");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumIsNull() {
            addCriterion("noSettledOrderNum is null");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumIsNotNull() {
            addCriterion("noSettledOrderNum is not null");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumEqualTo(Integer value) {
            addCriterion("noSettledOrderNum =", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumNotEqualTo(Integer value) {
            addCriterion("noSettledOrderNum <>", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumGreaterThan(Integer value) {
            addCriterion("noSettledOrderNum >", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("noSettledOrderNum >=", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumLessThan(Integer value) {
            addCriterion("noSettledOrderNum <", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumLessThanOrEqualTo(Integer value) {
            addCriterion("noSettledOrderNum <=", value, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumIn(List<Integer> values) {
            addCriterion("noSettledOrderNum in", values, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumNotIn(List<Integer> values) {
            addCriterion("noSettledOrderNum not in", values, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumBetween(Integer value1, Integer value2) {
            addCriterion("noSettledOrderNum between", value1, value2, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andNosettledordernumNotBetween(Integer value1, Integer value2) {
            addCriterion("noSettledOrderNum not between", value1, value2, "nosettledordernum");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonIsNull() {
            addCriterion("shopApplyReason is null");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonIsNotNull() {
            addCriterion("shopApplyReason is not null");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonEqualTo(String value) {
            addCriterion("shopApplyReason =", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonNotEqualTo(String value) {
            addCriterion("shopApplyReason <>", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonGreaterThan(String value) {
            addCriterion("shopApplyReason >", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("shopApplyReason >=", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonLessThan(String value) {
            addCriterion("shopApplyReason <", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonLessThanOrEqualTo(String value) {
            addCriterion("shopApplyReason <=", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonLike(String value) {
            addCriterion("shopApplyReason like", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonNotLike(String value) {
            addCriterion("shopApplyReason not like", value, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonIn(List<String> values) {
            addCriterion("shopApplyReason in", values, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonNotIn(List<String> values) {
            addCriterion("shopApplyReason not in", values, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonBetween(String value1, String value2) {
            addCriterion("shopApplyReason between", value1, value2, "shopapplyreason");
            return (Criteria) this;
        }

        public Criteria andShopapplyreasonNotBetween(String value1, String value2) {
            addCriterion("shopApplyReason not between", value1, value2, "shopapplyreason");
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