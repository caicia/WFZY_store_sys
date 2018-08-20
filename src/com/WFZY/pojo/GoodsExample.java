package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodssnIsNull() {
            addCriterion("goodsSn is null");
            return (Criteria) this;
        }

        public Criteria andGoodssnIsNotNull() {
            addCriterion("goodsSn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssnEqualTo(String value) {
            addCriterion("goodsSn =", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnNotEqualTo(String value) {
            addCriterion("goodsSn <>", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnGreaterThan(String value) {
            addCriterion("goodsSn >", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnGreaterThanOrEqualTo(String value) {
            addCriterion("goodsSn >=", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnLessThan(String value) {
            addCriterion("goodsSn <", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnLessThanOrEqualTo(String value) {
            addCriterion("goodsSn <=", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnLike(String value) {
            addCriterion("goodsSn like", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnNotLike(String value) {
            addCriterion("goodsSn not like", value, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnIn(List<String> values) {
            addCriterion("goodsSn in", values, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnNotIn(List<String> values) {
            addCriterion("goodsSn not in", values, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnBetween(String value1, String value2) {
            addCriterion("goodsSn between", value1, value2, "goodssn");
            return (Criteria) this;
        }

        public Criteria andGoodssnNotBetween(String value1, String value2) {
            addCriterion("goodsSn not between", value1, value2, "goodssn");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("productNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productNo not between", value1, value2, "productno");
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

        public Criteria andGoodsimgIsNull() {
            addCriterion("goodsImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNotNull() {
            addCriterion("goodsImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgEqualTo(String value) {
            addCriterion("goodsImg =", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotEqualTo(String value) {
            addCriterion("goodsImg <>", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThan(String value) {
            addCriterion("goodsImg >", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg >=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThan(String value) {
            addCriterion("goodsImg <", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThanOrEqualTo(String value) {
            addCriterion("goodsImg <=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLike(String value) {
            addCriterion("goodsImg like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotLike(String value) {
            addCriterion("goodsImg not like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIn(List<String> values) {
            addCriterion("goodsImg in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotIn(List<String> values) {
            addCriterion("goodsImg not in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgBetween(String value1, String value2) {
            addCriterion("goodsImg between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotBetween(String value1, String value2) {
            addCriterion("goodsImg not between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNull() {
            addCriterion("goodsStatus is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNotNull() {
            addCriterion("goodsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusEqualTo(Byte value) {
            addCriterion("goodsStatus =", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotEqualTo(Byte value) {
            addCriterion("goodsStatus <>", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThan(Byte value) {
            addCriterion("goodsStatus >", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("goodsStatus >=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThan(Byte value) {
            addCriterion("goodsStatus <", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThanOrEqualTo(Byte value) {
            addCriterion("goodsStatus <=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIn(List<Byte> values) {
            addCriterion("goodsStatus in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotIn(List<Byte> values) {
            addCriterion("goodsStatus not in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusBetween(Byte value1, Byte value2) {
            addCriterion("goodsStatus between", value1, value2, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("goodsStatus not between", value1, value2, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNull() {
            addCriterion("saleTime is null");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNotNull() {
            addCriterion("saleTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaletimeEqualTo(Date value) {
            addCriterion("saleTime =", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotEqualTo(Date value) {
            addCriterion("saleTime <>", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThan(Date value) {
            addCriterion("saleTime >", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saleTime >=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThan(Date value) {
            addCriterion("saleTime <", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThanOrEqualTo(Date value) {
            addCriterion("saleTime <=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeIn(List<Date> values) {
            addCriterion("saleTime in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotIn(List<Date> values) {
            addCriterion("saleTime not in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeBetween(Date value1, Date value2) {
            addCriterion("saleTime between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotBetween(Date value1, Date value2) {
            addCriterion("saleTime not between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andVisitnumIsNull() {
            addCriterion("visitNum is null");
            return (Criteria) this;
        }

        public Criteria andVisitnumIsNotNull() {
            addCriterion("visitNum is not null");
            return (Criteria) this;
        }

        public Criteria andVisitnumEqualTo(Integer value) {
            addCriterion("visitNum =", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumNotEqualTo(Integer value) {
            addCriterion("visitNum <>", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumGreaterThan(Integer value) {
            addCriterion("visitNum >", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitNum >=", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumLessThan(Integer value) {
            addCriterion("visitNum <", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumLessThanOrEqualTo(Integer value) {
            addCriterion("visitNum <=", value, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumIn(List<Integer> values) {
            addCriterion("visitNum in", values, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumNotIn(List<Integer> values) {
            addCriterion("visitNum not in", values, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumBetween(Integer value1, Integer value2) {
            addCriterion("visitNum between", value1, value2, "visitnum");
            return (Criteria) this;
        }

        public Criteria andVisitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("visitNum not between", value1, value2, "visitnum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumIsNull() {
            addCriterion("appraiseNum is null");
            return (Criteria) this;
        }

        public Criteria andAppraisenumIsNotNull() {
            addCriterion("appraiseNum is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisenumEqualTo(Integer value) {
            addCriterion("appraiseNum =", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumNotEqualTo(Integer value) {
            addCriterion("appraiseNum <>", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumGreaterThan(Integer value) {
            addCriterion("appraiseNum >", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraiseNum >=", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumLessThan(Integer value) {
            addCriterion("appraiseNum <", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumLessThanOrEqualTo(Integer value) {
            addCriterion("appraiseNum <=", value, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumIn(List<Integer> values) {
            addCriterion("appraiseNum in", values, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumNotIn(List<Integer> values) {
            addCriterion("appraiseNum not in", values, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumBetween(Integer value1, Integer value2) {
            addCriterion("appraiseNum between", value1, value2, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andAppraisenumNotBetween(Integer value1, Integer value2) {
            addCriterion("appraiseNum not between", value1, value2, "appraisenum");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("marketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("marketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("marketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("marketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("marketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("marketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNull() {
            addCriterion("shopPrice is null");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNotNull() {
            addCriterion("shopPrice is not null");
            return (Criteria) this;
        }

        public Criteria andShoppriceEqualTo(BigDecimal value) {
            addCriterion("shopPrice =", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotEqualTo(BigDecimal value) {
            addCriterion("shopPrice <>", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThan(BigDecimal value) {
            addCriterion("shopPrice >", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shopPrice >=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThan(BigDecimal value) {
            addCriterion("shopPrice <", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shopPrice <=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceIn(List<BigDecimal> values) {
            addCriterion("shopPrice in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotIn(List<BigDecimal> values) {
            addCriterion("shopPrice not in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopPrice between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopPrice not between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNull() {
            addCriterion("saleNum is null");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNotNull() {
            addCriterion("saleNum is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumEqualTo(Integer value) {
            addCriterion("saleNum =", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotEqualTo(Integer value) {
            addCriterion("saleNum <>", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThan(Integer value) {
            addCriterion("saleNum >", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleNum >=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThan(Integer value) {
            addCriterion("saleNum <", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThanOrEqualTo(Integer value) {
            addCriterion("saleNum <=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumIn(List<Integer> values) {
            addCriterion("saleNum in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotIn(List<Integer> values) {
            addCriterion("saleNum not in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumBetween(Integer value1, Integer value2) {
            addCriterion("saleNum between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("saleNum not between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNull() {
            addCriterion("goodsStock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNotNull() {
            addCriterion("goodsStock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockEqualTo(Integer value) {
            addCriterion("goodsStock =", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotEqualTo(Integer value) {
            addCriterion("goodsStock <>", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThan(Integer value) {
            addCriterion("goodsStock >", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsStock >=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThan(Integer value) {
            addCriterion("goodsStock <", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThanOrEqualTo(Integer value) {
            addCriterion("goodsStock <=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIn(List<Integer> values) {
            addCriterion("goodsStock in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotIn(List<Integer> values) {
            addCriterion("goodsStock not in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockBetween(Integer value1, Integer value2) {
            addCriterion("goodsStock between", value1, value2, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsStock not between", value1, value2, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNull() {
            addCriterion("isSale is null");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNotNull() {
            addCriterion("isSale is not null");
            return (Criteria) this;
        }

        public Criteria andIssaleEqualTo(Byte value) {
            addCriterion("isSale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(Byte value) {
            addCriterion("isSale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(Byte value) {
            addCriterion("isSale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(Byte value) {
            addCriterion("isSale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(Byte value) {
            addCriterion("isSale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(Byte value) {
            addCriterion("isSale <=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleIn(List<Byte> values) {
            addCriterion("isSale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<Byte> values) {
            addCriterion("isSale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(Byte value1, Byte value2) {
            addCriterion("isSale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(Byte value1, Byte value2) {
            addCriterion("isSale not between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIsbestIsNull() {
            addCriterion("isBest is null");
            return (Criteria) this;
        }

        public Criteria andIsbestIsNotNull() {
            addCriterion("isBest is not null");
            return (Criteria) this;
        }

        public Criteria andIsbestEqualTo(Byte value) {
            addCriterion("isBest =", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestNotEqualTo(Byte value) {
            addCriterion("isBest <>", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestGreaterThan(Byte value) {
            addCriterion("isBest >", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestGreaterThanOrEqualTo(Byte value) {
            addCriterion("isBest >=", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestLessThan(Byte value) {
            addCriterion("isBest <", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestLessThanOrEqualTo(Byte value) {
            addCriterion("isBest <=", value, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestIn(List<Byte> values) {
            addCriterion("isBest in", values, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestNotIn(List<Byte> values) {
            addCriterion("isBest not in", values, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestBetween(Byte value1, Byte value2) {
            addCriterion("isBest between", value1, value2, "isbest");
            return (Criteria) this;
        }

        public Criteria andIsbestNotBetween(Byte value1, Byte value2) {
            addCriterion("isBest not between", value1, value2, "isbest");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("isHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("isHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Byte value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Byte value) {
            addCriterion("isHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Byte value) {
            addCriterion("isHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Byte value) {
            addCriterion("isHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Byte value) {
            addCriterion("isHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Byte value) {
            addCriterion("isHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Byte> values) {
            addCriterion("isHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Byte> values) {
            addCriterion("isHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Byte value1, Byte value2) {
            addCriterion("isHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Byte value1, Byte value2) {
            addCriterion("isHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("isNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("isNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Byte value) {
            addCriterion("isNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Byte value) {
            addCriterion("isNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Byte value) {
            addCriterion("isNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Byte value) {
            addCriterion("isNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Byte value) {
            addCriterion("isNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Byte value) {
            addCriterion("isNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Byte> values) {
            addCriterion("isNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Byte> values) {
            addCriterion("isNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Byte value1, Byte value2) {
            addCriterion("isNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Byte value1, Byte value2) {
            addCriterion("isNew not between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsrecomIsNull() {
            addCriterion("isRecom is null");
            return (Criteria) this;
        }

        public Criteria andIsrecomIsNotNull() {
            addCriterion("isRecom is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecomEqualTo(Byte value) {
            addCriterion("isRecom =", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotEqualTo(Byte value) {
            addCriterion("isRecom <>", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomGreaterThan(Byte value) {
            addCriterion("isRecom >", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomGreaterThanOrEqualTo(Byte value) {
            addCriterion("isRecom >=", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomLessThan(Byte value) {
            addCriterion("isRecom <", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomLessThanOrEqualTo(Byte value) {
            addCriterion("isRecom <=", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomIn(List<Byte> values) {
            addCriterion("isRecom in", values, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotIn(List<Byte> values) {
            addCriterion("isRecom not in", values, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomBetween(Byte value1, Byte value2) {
            addCriterion("isRecom between", value1, value2, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotBetween(Byte value1, Byte value2) {
            addCriterion("isRecom not between", value1, value2, "isrecom");
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