package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarouselExample() {
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

        public Criteria andCarouselidIsNull() {
            addCriterion("carouselId is null");
            return (Criteria) this;
        }

        public Criteria andCarouselidIsNotNull() {
            addCriterion("carouselId is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselidEqualTo(Integer value) {
            addCriterion("carouselId =", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidNotEqualTo(Integer value) {
            addCriterion("carouselId <>", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidGreaterThan(Integer value) {
            addCriterion("carouselId >", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carouselId >=", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidLessThan(Integer value) {
            addCriterion("carouselId <", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidLessThanOrEqualTo(Integer value) {
            addCriterion("carouselId <=", value, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidIn(List<Integer> values) {
            addCriterion("carouselId in", values, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidNotIn(List<Integer> values) {
            addCriterion("carouselId not in", values, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidBetween(Integer value1, Integer value2) {
            addCriterion("carouselId between", value1, value2, "carouselid");
            return (Criteria) this;
        }

        public Criteria andCarouselidNotBetween(Integer value1, Integer value2) {
            addCriterion("carouselId not between", value1, value2, "carouselid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andCarouselTypeIsNull() {
            addCriterion("carousel_type is null");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeIsNotNull() {
            addCriterion("carousel_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeEqualTo(Integer value) {
            addCriterion("carousel_type =", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeNotEqualTo(Integer value) {
            addCriterion("carousel_type <>", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeGreaterThan(Integer value) {
            addCriterion("carousel_type >", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("carousel_type >=", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeLessThan(Integer value) {
            addCriterion("carousel_type <", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeLessThanOrEqualTo(Integer value) {
            addCriterion("carousel_type <=", value, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeIn(List<Integer> values) {
            addCriterion("carousel_type in", values, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeNotIn(List<Integer> values) {
            addCriterion("carousel_type not in", values, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeBetween(Integer value1, Integer value2) {
            addCriterion("carousel_type between", value1, value2, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("carousel_type not between", value1, value2, "carouselType");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusIsNull() {
            addCriterion("carouselStatus is null");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusIsNotNull() {
            addCriterion("carouselStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusEqualTo(Byte value) {
            addCriterion("carouselStatus =", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusNotEqualTo(Byte value) {
            addCriterion("carouselStatus <>", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusGreaterThan(Byte value) {
            addCriterion("carouselStatus >", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("carouselStatus >=", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusLessThan(Byte value) {
            addCriterion("carouselStatus <", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusLessThanOrEqualTo(Byte value) {
            addCriterion("carouselStatus <=", value, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusIn(List<Byte> values) {
            addCriterion("carouselStatus in", values, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusNotIn(List<Byte> values) {
            addCriterion("carouselStatus not in", values, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusBetween(Byte value1, Byte value2) {
            addCriterion("carouselStatus between", value1, value2, "carouselstatus");
            return (Criteria) this;
        }

        public Criteria andCarouselstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("carouselStatus not between", value1, value2, "carouselstatus");
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