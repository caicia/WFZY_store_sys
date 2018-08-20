package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopclassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopclassifyExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameIsNull() {
            addCriterion("shopClassifyName is null");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameIsNotNull() {
            addCriterion("shopClassifyName is not null");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameEqualTo(String value) {
            addCriterion("shopClassifyName =", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameNotEqualTo(String value) {
            addCriterion("shopClassifyName <>", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameGreaterThan(String value) {
            addCriterion("shopClassifyName >", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameGreaterThanOrEqualTo(String value) {
            addCriterion("shopClassifyName >=", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameLessThan(String value) {
            addCriterion("shopClassifyName <", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameLessThanOrEqualTo(String value) {
            addCriterion("shopClassifyName <=", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameLike(String value) {
            addCriterion("shopClassifyName like", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameNotLike(String value) {
            addCriterion("shopClassifyName not like", value, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameIn(List<String> values) {
            addCriterion("shopClassifyName in", values, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameNotIn(List<String> values) {
            addCriterion("shopClassifyName not in", values, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameBetween(String value1, String value2) {
            addCriterion("shopClassifyName between", value1, value2, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifynameNotBetween(String value1, String value2) {
            addCriterion("shopClassifyName not between", value1, value2, "shopclassifyname");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortIsNull() {
            addCriterion("shopClassifySort is null");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortIsNotNull() {
            addCriterion("shopClassifySort is not null");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortEqualTo(Integer value) {
            addCriterion("shopClassifySort =", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortNotEqualTo(Integer value) {
            addCriterion("shopClassifySort <>", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortGreaterThan(Integer value) {
            addCriterion("shopClassifySort >", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopClassifySort >=", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortLessThan(Integer value) {
            addCriterion("shopClassifySort <", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortLessThanOrEqualTo(Integer value) {
            addCriterion("shopClassifySort <=", value, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortIn(List<Integer> values) {
            addCriterion("shopClassifySort in", values, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortNotIn(List<Integer> values) {
            addCriterion("shopClassifySort not in", values, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortBetween(Integer value1, Integer value2) {
            addCriterion("shopClassifySort between", value1, value2, "shopclassifysort");
            return (Criteria) this;
        }

        public Criteria andShopclassifysortNotBetween(Integer value1, Integer value2) {
            addCriterion("shopClassifySort not between", value1, value2, "shopclassifysort");
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