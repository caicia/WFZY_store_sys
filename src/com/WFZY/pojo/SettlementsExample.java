package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettlementsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlementsExample() {
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

        public Criteria andSettlementnoIsNull() {
            addCriterion("settlementNo is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("settlementNo is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(String value) {
            addCriterion("settlementNo =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(String value) {
            addCriterion("settlementNo <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(String value) {
            addCriterion("settlementNo >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(String value) {
            addCriterion("settlementNo >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(String value) {
            addCriterion("settlementNo <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(String value) {
            addCriterion("settlementNo <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLike(String value) {
            addCriterion("settlementNo like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotLike(String value) {
            addCriterion("settlementNo not like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<String> values) {
            addCriterion("settlementNo in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<String> values) {
            addCriterion("settlementNo not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(String value1, String value2) {
            addCriterion("settlementNo between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(String value1, String value2) {
            addCriterion("settlementNo not between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIsNull() {
            addCriterion("settlementType is null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIsNotNull() {
            addCriterion("settlementType is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeEqualTo(Byte value) {
            addCriterion("settlementType =", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotEqualTo(Byte value) {
            addCriterion("settlementType <>", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThan(Byte value) {
            addCriterion("settlementType >", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("settlementType >=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThan(Byte value) {
            addCriterion("settlementType <", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThanOrEqualTo(Byte value) {
            addCriterion("settlementType <=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIn(List<Byte> values) {
            addCriterion("settlementType in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotIn(List<Byte> values) {
            addCriterion("settlementType not in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeBetween(Byte value1, Byte value2) {
            addCriterion("settlementType between", value1, value2, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("settlementType not between", value1, value2, "settlementtype");
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

        public Criteria andAccnameIsNull() {
            addCriterion("accName is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("accName is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("accName =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("accName <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("accName >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("accName >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("accName <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("accName <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("accName like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("accName not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("accName in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("accName not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("accName between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("accName not between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNull() {
            addCriterion("accNo is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("accNo is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("accNo =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("accNo <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("accNo >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("accNo >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("accNo <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("accNo <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("accNo like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("accNo not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("accNo in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("accNo not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("accNo between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("accNo not between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccuserIsNull() {
            addCriterion("accUser is null");
            return (Criteria) this;
        }

        public Criteria andAccuserIsNotNull() {
            addCriterion("accUser is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserEqualTo(String value) {
            addCriterion("accUser =", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserNotEqualTo(String value) {
            addCriterion("accUser <>", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserGreaterThan(String value) {
            addCriterion("accUser >", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserGreaterThanOrEqualTo(String value) {
            addCriterion("accUser >=", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserLessThan(String value) {
            addCriterion("accUser <", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserLessThanOrEqualTo(String value) {
            addCriterion("accUser <=", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserLike(String value) {
            addCriterion("accUser like", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserNotLike(String value) {
            addCriterion("accUser not like", value, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserIn(List<String> values) {
            addCriterion("accUser in", values, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserNotIn(List<String> values) {
            addCriterion("accUser not in", values, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserBetween(String value1, String value2) {
            addCriterion("accUser between", value1, value2, "accuser");
            return (Criteria) this;
        }

        public Criteria andAccuserNotBetween(String value1, String value2) {
            addCriterion("accUser not between", value1, value2, "accuser");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNull() {
            addCriterion("settlementMoney is null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNotNull() {
            addCriterion("settlementMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyEqualTo(BigDecimal value) {
            addCriterion("settlementMoney =", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotEqualTo(BigDecimal value) {
            addCriterion("settlementMoney <>", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThan(BigDecimal value) {
            addCriterion("settlementMoney >", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlementMoney >=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThan(BigDecimal value) {
            addCriterion("settlementMoney <", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlementMoney <=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIn(List<BigDecimal> values) {
            addCriterion("settlementMoney in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotIn(List<BigDecimal> values) {
            addCriterion("settlementMoney not in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlementMoney between", value1, value2, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlementMoney not between", value1, value2, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIsNull() {
            addCriterion("settlementStatus is null");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIsNotNull() {
            addCriterion("settlementStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusEqualTo(Byte value) {
            addCriterion("settlementStatus =", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotEqualTo(Byte value) {
            addCriterion("settlementStatus <>", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusGreaterThan(Byte value) {
            addCriterion("settlementStatus >", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("settlementStatus >=", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusLessThan(Byte value) {
            addCriterion("settlementStatus <", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusLessThanOrEqualTo(Byte value) {
            addCriterion("settlementStatus <=", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIn(List<Byte> values) {
            addCriterion("settlementStatus in", values, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotIn(List<Byte> values) {
            addCriterion("settlementStatus not in", values, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusBetween(Byte value1, Byte value2) {
            addCriterion("settlementStatus between", value1, value2, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("settlementStatus not between", value1, value2, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeIsNull() {
            addCriterion("settlementTime is null");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeIsNotNull() {
            addCriterion("settlementTime is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeEqualTo(Date value) {
            addCriterion("settlementTime =", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeNotEqualTo(Date value) {
            addCriterion("settlementTime <>", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeGreaterThan(Date value) {
            addCriterion("settlementTime >", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlementTime >=", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeLessThan(Date value) {
            addCriterion("settlementTime <", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeLessThanOrEqualTo(Date value) {
            addCriterion("settlementTime <=", value, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeIn(List<Date> values) {
            addCriterion("settlementTime in", values, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeNotIn(List<Date> values) {
            addCriterion("settlementTime not in", values, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeBetween(Date value1, Date value2) {
            addCriterion("settlementTime between", value1, value2, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andSettlementtimeNotBetween(Date value1, Date value2) {
            addCriterion("settlementTime not between", value1, value2, "settlementtime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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