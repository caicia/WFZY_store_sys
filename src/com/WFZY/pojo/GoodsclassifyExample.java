package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsclassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsclassifyExample() {
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

        public Criteria andGoodsclassifyidIsNull() {
            addCriterion("goodsClassifyId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidIsNotNull() {
            addCriterion("goodsClassifyId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidEqualTo(Integer value) {
            addCriterion("goodsClassifyId =", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidNotEqualTo(Integer value) {
            addCriterion("goodsClassifyId <>", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidGreaterThan(Integer value) {
            addCriterion("goodsClassifyId >", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyId >=", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidLessThan(Integer value) {
            addCriterion("goodsClassifyId <", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyId <=", value, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidIn(List<Integer> values) {
            addCriterion("goodsClassifyId in", values, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidNotIn(List<Integer> values) {
            addCriterion("goodsClassifyId not in", values, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyId between", value1, value2, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyId not between", value1, value2, "goodsclassifyid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidIsNull() {
            addCriterion("goodsClassifyParentId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidIsNotNull() {
            addCriterion("goodsClassifyParentId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidEqualTo(Integer value) {
            addCriterion("goodsClassifyParentId =", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidNotEqualTo(Integer value) {
            addCriterion("goodsClassifyParentId <>", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidGreaterThan(Integer value) {
            addCriterion("goodsClassifyParentId >", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyParentId >=", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidLessThan(Integer value) {
            addCriterion("goodsClassifyParentId <", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyParentId <=", value, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidIn(List<Integer> values) {
            addCriterion("goodsClassifyParentId in", values, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidNotIn(List<Integer> values) {
            addCriterion("goodsClassifyParentId not in", values, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyParentId between", value1, value2, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyParentId not between", value1, value2, "goodsclassifyparentid");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeIsNull() {
            addCriterion("goodsClassifyGrade is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeIsNotNull() {
            addCriterion("goodsClassifyGrade is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeEqualTo(Integer value) {
            addCriterion("goodsClassifyGrade =", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeNotEqualTo(Integer value) {
            addCriterion("goodsClassifyGrade <>", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeGreaterThan(Integer value) {
            addCriterion("goodsClassifyGrade >", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyGrade >=", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeLessThan(Integer value) {
            addCriterion("goodsClassifyGrade <", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeLessThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifyGrade <=", value, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeIn(List<Integer> values) {
            addCriterion("goodsClassifyGrade in", values, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeNotIn(List<Integer> values) {
            addCriterion("goodsClassifyGrade not in", values, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyGrade between", value1, value2, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifygradeNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifyGrade not between", value1, value2, "goodsclassifygrade");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameIsNull() {
            addCriterion("goodsClassifyName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameIsNotNull() {
            addCriterion("goodsClassifyName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameEqualTo(String value) {
            addCriterion("goodsClassifyName =", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameNotEqualTo(String value) {
            addCriterion("goodsClassifyName <>", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameGreaterThan(String value) {
            addCriterion("goodsClassifyName >", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsClassifyName >=", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameLessThan(String value) {
            addCriterion("goodsClassifyName <", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameLessThanOrEqualTo(String value) {
            addCriterion("goodsClassifyName <=", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameLike(String value) {
            addCriterion("goodsClassifyName like", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameNotLike(String value) {
            addCriterion("goodsClassifyName not like", value, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameIn(List<String> values) {
            addCriterion("goodsClassifyName in", values, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameNotIn(List<String> values) {
            addCriterion("goodsClassifyName not in", values, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameBetween(String value1, String value2) {
            addCriterion("goodsClassifyName between", value1, value2, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifynameNotBetween(String value1, String value2) {
            addCriterion("goodsClassifyName not between", value1, value2, "goodsclassifyname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameIsNull() {
            addCriterion("goodsClassifyParentName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameIsNotNull() {
            addCriterion("goodsClassifyParentName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameEqualTo(String value) {
            addCriterion("goodsClassifyParentName =", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameNotEqualTo(String value) {
            addCriterion("goodsClassifyParentName <>", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameGreaterThan(String value) {
            addCriterion("goodsClassifyParentName >", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsClassifyParentName >=", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameLessThan(String value) {
            addCriterion("goodsClassifyParentName <", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameLessThanOrEqualTo(String value) {
            addCriterion("goodsClassifyParentName <=", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameLike(String value) {
            addCriterion("goodsClassifyParentName like", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameNotLike(String value) {
            addCriterion("goodsClassifyParentName not like", value, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameIn(List<String> values) {
            addCriterion("goodsClassifyParentName in", values, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameNotIn(List<String> values) {
            addCriterion("goodsClassifyParentName not in", values, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameBetween(String value1, String value2) {
            addCriterion("goodsClassifyParentName between", value1, value2, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifyparentnameNotBetween(String value1, String value2) {
            addCriterion("goodsClassifyParentName not between", value1, value2, "goodsclassifyparentname");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortIsNull() {
            addCriterion("goodsClassifySort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortIsNotNull() {
            addCriterion("goodsClassifySort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortEqualTo(Integer value) {
            addCriterion("goodsClassifySort =", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortNotEqualTo(Integer value) {
            addCriterion("goodsClassifySort <>", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortGreaterThan(Integer value) {
            addCriterion("goodsClassifySort >", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifySort >=", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortLessThan(Integer value) {
            addCriterion("goodsClassifySort <", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortLessThanOrEqualTo(Integer value) {
            addCriterion("goodsClassifySort <=", value, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortIn(List<Integer> values) {
            addCriterion("goodsClassifySort in", values, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortNotIn(List<Integer> values) {
            addCriterion("goodsClassifySort not in", values, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifySort between", value1, value2, "goodsclassifysort");
            return (Criteria) this;
        }

        public Criteria andGoodsclassifysortNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsClassifySort not between", value1, value2, "goodsclassifysort");
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