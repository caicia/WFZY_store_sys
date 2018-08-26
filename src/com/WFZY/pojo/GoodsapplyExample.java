package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsapplyExample() {
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

        public Criteria andGoodsapplyidIsNull() {
            addCriterion("goodsApplyId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidIsNotNull() {
            addCriterion("goodsApplyId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidEqualTo(Integer value) {
            addCriterion("goodsApplyId =", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidNotEqualTo(Integer value) {
            addCriterion("goodsApplyId <>", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidGreaterThan(Integer value) {
            addCriterion("goodsApplyId >", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsApplyId >=", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidLessThan(Integer value) {
            addCriterion("goodsApplyId <", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsApplyId <=", value, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidIn(List<Integer> values) {
            addCriterion("goodsApplyId in", values, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidNotIn(List<Integer> values) {
            addCriterion("goodsApplyId not in", values, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidBetween(Integer value1, Integer value2) {
            addCriterion("goodsApplyId between", value1, value2, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodsapplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsApplyId not between", value1, value2, "goodsapplyid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNull() {
            addCriterion("goodsType is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNotNull() {
            addCriterion("goodsType is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeEqualTo(Byte value) {
            addCriterion("goodsType =", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotEqualTo(Byte value) {
            addCriterion("goodsType <>", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThan(Byte value) {
            addCriterion("goodsType >", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("goodsType >=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThan(Byte value) {
            addCriterion("goodsType <", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThanOrEqualTo(Byte value) {
            addCriterion("goodsType <=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIn(List<Byte> values) {
            addCriterion("goodsType in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotIn(List<Byte> values) {
            addCriterion("goodsType not in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeBetween(Byte value1, Byte value2) {
            addCriterion("goodsType between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotBetween(Byte value1, Byte value2) {
            addCriterion("goodsType not between", value1, value2, "goodstype");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStorknumIsNull() {
            addCriterion("storkNum is null");
            return (Criteria) this;
        }

        public Criteria andStorknumIsNotNull() {
            addCriterion("storkNum is not null");
            return (Criteria) this;
        }

        public Criteria andStorknumEqualTo(Integer value) {
            addCriterion("storkNum =", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumNotEqualTo(Integer value) {
            addCriterion("storkNum <>", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumGreaterThan(Integer value) {
            addCriterion("storkNum >", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("storkNum >=", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumLessThan(Integer value) {
            addCriterion("storkNum <", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumLessThanOrEqualTo(Integer value) {
            addCriterion("storkNum <=", value, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumIn(List<Integer> values) {
            addCriterion("storkNum in", values, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumNotIn(List<Integer> values) {
            addCriterion("storkNum not in", values, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumBetween(Integer value1, Integer value2) {
            addCriterion("storkNum between", value1, value2, "storknum");
            return (Criteria) this;
        }

        public Criteria andStorknumNotBetween(Integer value1, Integer value2) {
            addCriterion("storkNum not between", value1, value2, "storknum");
            return (Criteria) this;
        }

        public Criteria andIshandleIsNull() {
            addCriterion("ishandle is null");
            return (Criteria) this;
        }

        public Criteria andIshandleIsNotNull() {
            addCriterion("ishandle is not null");
            return (Criteria) this;
        }

        public Criteria andIshandleEqualTo(Byte value) {
            addCriterion("ishandle =", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleNotEqualTo(Byte value) {
            addCriterion("ishandle <>", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleGreaterThan(Byte value) {
            addCriterion("ishandle >", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleGreaterThanOrEqualTo(Byte value) {
            addCriterion("ishandle >=", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleLessThan(Byte value) {
            addCriterion("ishandle <", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleLessThanOrEqualTo(Byte value) {
            addCriterion("ishandle <=", value, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleIn(List<Byte> values) {
            addCriterion("ishandle in", values, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleNotIn(List<Byte> values) {
            addCriterion("ishandle not in", values, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleBetween(Byte value1, Byte value2) {
            addCriterion("ishandle between", value1, value2, "ishandle");
            return (Criteria) this;
        }

        public Criteria andIshandleNotBetween(Byte value1, Byte value2) {
            addCriterion("ishandle not between", value1, value2, "ishandle");
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