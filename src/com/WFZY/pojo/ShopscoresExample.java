package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopscoresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopscoresExample() {
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

        public Criteria andScoreidIsNull() {
            addCriterion("scoreId is null");
            return (Criteria) this;
        }

        public Criteria andScoreidIsNotNull() {
            addCriterion("scoreId is not null");
            return (Criteria) this;
        }

        public Criteria andScoreidEqualTo(Integer value) {
            addCriterion("scoreId =", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotEqualTo(Integer value) {
            addCriterion("scoreId <>", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThan(Integer value) {
            addCriterion("scoreId >", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoreId >=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThan(Integer value) {
            addCriterion("scoreId <", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThanOrEqualTo(Integer value) {
            addCriterion("scoreId <=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidIn(List<Integer> values) {
            addCriterion("scoreId in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotIn(List<Integer> values) {
            addCriterion("scoreId not in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidBetween(Integer value1, Integer value2) {
            addCriterion("scoreId between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoreId not between", value1, value2, "scoreid");
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

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Integer value) {
            addCriterion("totalScore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Integer value) {
            addCriterion("totalScore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Integer value) {
            addCriterion("totalScore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalScore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Integer value) {
            addCriterion("totalScore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Integer value) {
            addCriterion("totalScore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Integer> values) {
            addCriterion("totalScore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Integer> values) {
            addCriterion("totalScore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Integer value1, Integer value2) {
            addCriterion("totalScore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("totalScore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalusersIsNull() {
            addCriterion("totalUsers is null");
            return (Criteria) this;
        }

        public Criteria andTotalusersIsNotNull() {
            addCriterion("totalUsers is not null");
            return (Criteria) this;
        }

        public Criteria andTotalusersEqualTo(Integer value) {
            addCriterion("totalUsers =", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersNotEqualTo(Integer value) {
            addCriterion("totalUsers <>", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersGreaterThan(Integer value) {
            addCriterion("totalUsers >", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalUsers >=", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersLessThan(Integer value) {
            addCriterion("totalUsers <", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersLessThanOrEqualTo(Integer value) {
            addCriterion("totalUsers <=", value, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersIn(List<Integer> values) {
            addCriterion("totalUsers in", values, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersNotIn(List<Integer> values) {
            addCriterion("totalUsers not in", values, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersBetween(Integer value1, Integer value2) {
            addCriterion("totalUsers between", value1, value2, "totalusers");
            return (Criteria) this;
        }

        public Criteria andTotalusersNotBetween(Integer value1, Integer value2) {
            addCriterion("totalUsers not between", value1, value2, "totalusers");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreIsNull() {
            addCriterion("goodsScore is null");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreIsNotNull() {
            addCriterion("goodsScore is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreEqualTo(Integer value) {
            addCriterion("goodsScore =", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreNotEqualTo(Integer value) {
            addCriterion("goodsScore <>", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreGreaterThan(Integer value) {
            addCriterion("goodsScore >", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsScore >=", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreLessThan(Integer value) {
            addCriterion("goodsScore <", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreLessThanOrEqualTo(Integer value) {
            addCriterion("goodsScore <=", value, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreIn(List<Integer> values) {
            addCriterion("goodsScore in", values, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreNotIn(List<Integer> values) {
            addCriterion("goodsScore not in", values, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreBetween(Integer value1, Integer value2) {
            addCriterion("goodsScore between", value1, value2, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsScore not between", value1, value2, "goodsscore");
            return (Criteria) this;
        }

        public Criteria andGoodsusersIsNull() {
            addCriterion("goodsUsers is null");
            return (Criteria) this;
        }

        public Criteria andGoodsusersIsNotNull() {
            addCriterion("goodsUsers is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsusersEqualTo(Integer value) {
            addCriterion("goodsUsers =", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersNotEqualTo(Integer value) {
            addCriterion("goodsUsers <>", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersGreaterThan(Integer value) {
            addCriterion("goodsUsers >", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsUsers >=", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersLessThan(Integer value) {
            addCriterion("goodsUsers <", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersLessThanOrEqualTo(Integer value) {
            addCriterion("goodsUsers <=", value, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersIn(List<Integer> values) {
            addCriterion("goodsUsers in", values, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersNotIn(List<Integer> values) {
            addCriterion("goodsUsers not in", values, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersBetween(Integer value1, Integer value2) {
            addCriterion("goodsUsers between", value1, value2, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andGoodsusersNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsUsers not between", value1, value2, "goodsusers");
            return (Criteria) this;
        }

        public Criteria andServicescoreIsNull() {
            addCriterion("serviceScore is null");
            return (Criteria) this;
        }

        public Criteria andServicescoreIsNotNull() {
            addCriterion("serviceScore is not null");
            return (Criteria) this;
        }

        public Criteria andServicescoreEqualTo(Integer value) {
            addCriterion("serviceScore =", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotEqualTo(Integer value) {
            addCriterion("serviceScore <>", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreGreaterThan(Integer value) {
            addCriterion("serviceScore >", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceScore >=", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreLessThan(Integer value) {
            addCriterion("serviceScore <", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreLessThanOrEqualTo(Integer value) {
            addCriterion("serviceScore <=", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreIn(List<Integer> values) {
            addCriterion("serviceScore in", values, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotIn(List<Integer> values) {
            addCriterion("serviceScore not in", values, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreBetween(Integer value1, Integer value2) {
            addCriterion("serviceScore between", value1, value2, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceScore not between", value1, value2, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServiceusersIsNull() {
            addCriterion("serviceUsers is null");
            return (Criteria) this;
        }

        public Criteria andServiceusersIsNotNull() {
            addCriterion("serviceUsers is not null");
            return (Criteria) this;
        }

        public Criteria andServiceusersEqualTo(Integer value) {
            addCriterion("serviceUsers =", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersNotEqualTo(Integer value) {
            addCriterion("serviceUsers <>", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersGreaterThan(Integer value) {
            addCriterion("serviceUsers >", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceUsers >=", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersLessThan(Integer value) {
            addCriterion("serviceUsers <", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersLessThanOrEqualTo(Integer value) {
            addCriterion("serviceUsers <=", value, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersIn(List<Integer> values) {
            addCriterion("serviceUsers in", values, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersNotIn(List<Integer> values) {
            addCriterion("serviceUsers not in", values, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersBetween(Integer value1, Integer value2) {
            addCriterion("serviceUsers between", value1, value2, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andServiceusersNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceUsers not between", value1, value2, "serviceusers");
            return (Criteria) this;
        }

        public Criteria andTimescoreIsNull() {
            addCriterion("timeScore is null");
            return (Criteria) this;
        }

        public Criteria andTimescoreIsNotNull() {
            addCriterion("timeScore is not null");
            return (Criteria) this;
        }

        public Criteria andTimescoreEqualTo(Integer value) {
            addCriterion("timeScore =", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreNotEqualTo(Integer value) {
            addCriterion("timeScore <>", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreGreaterThan(Integer value) {
            addCriterion("timeScore >", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeScore >=", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreLessThan(Integer value) {
            addCriterion("timeScore <", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreLessThanOrEqualTo(Integer value) {
            addCriterion("timeScore <=", value, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreIn(List<Integer> values) {
            addCriterion("timeScore in", values, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreNotIn(List<Integer> values) {
            addCriterion("timeScore not in", values, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreBetween(Integer value1, Integer value2) {
            addCriterion("timeScore between", value1, value2, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("timeScore not between", value1, value2, "timescore");
            return (Criteria) this;
        }

        public Criteria andTimeusersIsNull() {
            addCriterion("timeUsers is null");
            return (Criteria) this;
        }

        public Criteria andTimeusersIsNotNull() {
            addCriterion("timeUsers is not null");
            return (Criteria) this;
        }

        public Criteria andTimeusersEqualTo(Integer value) {
            addCriterion("timeUsers =", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersNotEqualTo(Integer value) {
            addCriterion("timeUsers <>", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersGreaterThan(Integer value) {
            addCriterion("timeUsers >", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeUsers >=", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersLessThan(Integer value) {
            addCriterion("timeUsers <", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersLessThanOrEqualTo(Integer value) {
            addCriterion("timeUsers <=", value, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersIn(List<Integer> values) {
            addCriterion("timeUsers in", values, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersNotIn(List<Integer> values) {
            addCriterion("timeUsers not in", values, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersBetween(Integer value1, Integer value2) {
            addCriterion("timeUsers between", value1, value2, "timeusers");
            return (Criteria) this;
        }

        public Criteria andTimeusersNotBetween(Integer value1, Integer value2) {
            addCriterion("timeUsers not between", value1, value2, "timeusers");
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