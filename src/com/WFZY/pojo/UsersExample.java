package com.WFZY.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLoginnameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNull() {
            addCriterion("loginPwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNotNull() {
            addCriterion("loginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdEqualTo(String value) {
            addCriterion("loginPwd =", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotEqualTo(String value) {
            addCriterion("loginPwd <>", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThan(String value) {
            addCriterion("loginPwd >", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("loginPwd >=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThan(String value) {
            addCriterion("loginPwd <", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("loginPwd <=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLike(String value) {
            addCriterion("loginPwd like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotLike(String value) {
            addCriterion("loginPwd not like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIn(List<String> values) {
            addCriterion("loginPwd in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotIn(List<String> values) {
            addCriterion("loginPwd not in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdBetween(String value1, String value2) {
            addCriterion("loginPwd between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotBetween(String value1, String value2) {
            addCriterion("loginPwd not between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Byte value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Byte value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Byte value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Byte value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Byte value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Byte> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Byte> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Byte value1, Byte value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Byte value1, Byte value2) {
            addCriterion("userType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(Byte value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(Byte value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(Byte value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(Byte value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(Byte value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(Byte value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<Byte> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<Byte> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(Byte value1, Byte value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(Byte value1, Byte value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
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

        public Criteria andUserrealnameIsNull() {
            addCriterion("userRealName is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("userRealName is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("userRealName =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("userRealName <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("userRealName >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("userRealName >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("userRealName <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("userRealName <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("userRealName like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("userRealName not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("userRealName in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("userRealName not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("userRealName between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("userRealName not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayIsNull() {
            addCriterion("userBrithday is null");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayIsNotNull() {
            addCriterion("userBrithday is not null");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayEqualTo(Date value) {
            addCriterionForJDBCDate("userBrithday =", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("userBrithday <>", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayGreaterThan(Date value) {
            addCriterionForJDBCDate("userBrithday >", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBrithday >=", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayLessThan(Date value) {
            addCriterionForJDBCDate("userBrithday <", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBrithday <=", value, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayIn(List<Date> values) {
            addCriterionForJDBCDate("userBrithday in", values, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("userBrithday not in", values, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBrithday between", value1, value2, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserbrithdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBrithday not between", value1, value2, "userbrithday");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNull() {
            addCriterion("userPhoto is null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNotNull() {
            addCriterion("userPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotoEqualTo(String value) {
            addCriterion("userPhoto =", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotEqualTo(String value) {
            addCriterion("userPhoto <>", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThan(String value) {
            addCriterion("userPhoto >", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThanOrEqualTo(String value) {
            addCriterion("userPhoto >=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThan(String value) {
            addCriterion("userPhoto <", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThanOrEqualTo(String value) {
            addCriterion("userPhoto <=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLike(String value) {
            addCriterion("userPhoto like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotLike(String value) {
            addCriterion("userPhoto not like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoIn(List<String> values) {
            addCriterion("userPhoto in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotIn(List<String> values) {
            addCriterion("userPhoto not in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoBetween(String value1, String value2) {
            addCriterion("userPhoto between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotBetween(String value1, String value2) {
            addCriterion("userPhoto not between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNull() {
            addCriterion("userGrade is null");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNotNull() {
            addCriterion("userGrade is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradeEqualTo(String value) {
            addCriterion("userGrade =", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotEqualTo(String value) {
            addCriterion("userGrade <>", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThan(String value) {
            addCriterion("userGrade >", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThanOrEqualTo(String value) {
            addCriterion("userGrade >=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThan(String value) {
            addCriterion("userGrade <", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThanOrEqualTo(String value) {
            addCriterion("userGrade <=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLike(String value) {
            addCriterion("userGrade like", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotLike(String value) {
            addCriterion("userGrade not like", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeIn(List<String> values) {
            addCriterion("userGrade in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotIn(List<String> values) {
            addCriterion("userGrade not in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeBetween(String value1, String value2) {
            addCriterion("userGrade between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotBetween(String value1, String value2) {
            addCriterion("userGrade not between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUserqqIsNull() {
            addCriterion("userQQ is null");
            return (Criteria) this;
        }

        public Criteria andUserqqIsNotNull() {
            addCriterion("userQQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserqqEqualTo(String value) {
            addCriterion("userQQ =", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotEqualTo(String value) {
            addCriterion("userQQ <>", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqGreaterThan(String value) {
            addCriterion("userQQ >", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqGreaterThanOrEqualTo(String value) {
            addCriterion("userQQ >=", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLessThan(String value) {
            addCriterion("userQQ <", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLessThanOrEqualTo(String value) {
            addCriterion("userQQ <=", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLike(String value) {
            addCriterion("userQQ like", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotLike(String value) {
            addCriterion("userQQ not like", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqIn(List<String> values) {
            addCriterion("userQQ in", values, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotIn(List<String> values) {
            addCriterion("userQQ not in", values, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqBetween(String value1, String value2) {
            addCriterion("userQQ between", value1, value2, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotBetween(String value1, String value2) {
            addCriterion("userQQ not between", value1, value2, "userqq");
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

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIsNull() {
            addCriterion("userSignature is null");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIsNotNull() {
            addCriterion("userSignature is not null");
            return (Criteria) this;
        }

        public Criteria andUsersignatureEqualTo(String value) {
            addCriterion("userSignature =", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotEqualTo(String value) {
            addCriterion("userSignature <>", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureGreaterThan(String value) {
            addCriterion("userSignature >", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureGreaterThanOrEqualTo(String value) {
            addCriterion("userSignature >=", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLessThan(String value) {
            addCriterion("userSignature <", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLessThanOrEqualTo(String value) {
            addCriterion("userSignature <=", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLike(String value) {
            addCriterion("userSignature like", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotLike(String value) {
            addCriterion("userSignature not like", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIn(List<String> values) {
            addCriterion("userSignature in", values, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotIn(List<String> values) {
            addCriterion("userSignature not in", values, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureBetween(String value1, String value2) {
            addCriterion("userSignature between", value1, value2, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotBetween(String value1, String value2) {
            addCriterion("userSignature not between", value1, value2, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUserremarkIsNull() {
            addCriterion("userRemark is null");
            return (Criteria) this;
        }

        public Criteria andUserremarkIsNotNull() {
            addCriterion("userRemark is not null");
            return (Criteria) this;
        }

        public Criteria andUserremarkEqualTo(String value) {
            addCriterion("userRemark =", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotEqualTo(String value) {
            addCriterion("userRemark <>", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkGreaterThan(String value) {
            addCriterion("userRemark >", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkGreaterThanOrEqualTo(String value) {
            addCriterion("userRemark >=", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLessThan(String value) {
            addCriterion("userRemark <", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLessThanOrEqualTo(String value) {
            addCriterion("userRemark <=", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLike(String value) {
            addCriterion("userRemark like", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotLike(String value) {
            addCriterion("userRemark not like", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkIn(List<String> values) {
            addCriterion("userRemark in", values, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotIn(List<String> values) {
            addCriterion("userRemark not in", values, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkBetween(String value1, String value2) {
            addCriterion("userRemark between", value1, value2, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotBetween(String value1, String value2) {
            addCriterion("userRemark not between", value1, value2, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserdomicileIsNull() {
            addCriterion("userDomicile is null");
            return (Criteria) this;
        }

        public Criteria andUserdomicileIsNotNull() {
            addCriterion("userDomicile is not null");
            return (Criteria) this;
        }

        public Criteria andUserdomicileEqualTo(String value) {
            addCriterion("userDomicile =", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileNotEqualTo(String value) {
            addCriterion("userDomicile <>", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileGreaterThan(String value) {
            addCriterion("userDomicile >", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileGreaterThanOrEqualTo(String value) {
            addCriterion("userDomicile >=", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileLessThan(String value) {
            addCriterion("userDomicile <", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileLessThanOrEqualTo(String value) {
            addCriterion("userDomicile <=", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileLike(String value) {
            addCriterion("userDomicile like", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileNotLike(String value) {
            addCriterion("userDomicile not like", value, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileIn(List<String> values) {
            addCriterion("userDomicile in", values, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileNotIn(List<String> values) {
            addCriterion("userDomicile not in", values, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileBetween(String value1, String value2) {
            addCriterion("userDomicile between", value1, value2, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andUserdomicileNotBetween(String value1, String value2) {
            addCriterion("userDomicile not between", value1, value2, "userdomicile");
            return (Criteria) this;
        }

        public Criteria andLoginlastipIsNull() {
            addCriterion("loginLastIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginlastipIsNotNull() {
            addCriterion("loginLastIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginlastipEqualTo(String value) {
            addCriterion("loginLastIP =", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipNotEqualTo(String value) {
            addCriterion("loginLastIP <>", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipGreaterThan(String value) {
            addCriterion("loginLastIP >", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipGreaterThanOrEqualTo(String value) {
            addCriterion("loginLastIP >=", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipLessThan(String value) {
            addCriterion("loginLastIP <", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipLessThanOrEqualTo(String value) {
            addCriterion("loginLastIP <=", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipLike(String value) {
            addCriterion("loginLastIP like", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipNotLike(String value) {
            addCriterion("loginLastIP not like", value, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipIn(List<String> values) {
            addCriterion("loginLastIP in", values, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipNotIn(List<String> values) {
            addCriterion("loginLastIP not in", values, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipBetween(String value1, String value2) {
            addCriterion("loginLastIP between", value1, value2, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlastipNotBetween(String value1, String value2) {
            addCriterion("loginLastIP not between", value1, value2, "loginlastip");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeIsNull() {
            addCriterion("loginLastTime is null");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeIsNotNull() {
            addCriterion("loginLastTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeEqualTo(Date value) {
            addCriterion("loginLastTime =", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeNotEqualTo(Date value) {
            addCriterion("loginLastTime <>", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeGreaterThan(Date value) {
            addCriterion("loginLastTime >", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginLastTime >=", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeLessThan(Date value) {
            addCriterion("loginLastTime <", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeLessThanOrEqualTo(Date value) {
            addCriterion("loginLastTime <=", value, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeIn(List<Date> values) {
            addCriterion("loginLastTime in", values, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeNotIn(List<Date> values) {
            addCriterion("loginLastTime not in", values, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeBetween(Date value1, Date value2) {
            addCriterion("loginLastTime between", value1, value2, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andLoginlasttimeNotBetween(Date value1, Date value2) {
            addCriterion("loginLastTime not between", value1, value2, "loginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNull() {
            addCriterion("userStatus is null");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNotNull() {
            addCriterion("userStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatusEqualTo(Byte value) {
            addCriterion("userStatus =", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotEqualTo(Byte value) {
            addCriterion("userStatus <>", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThan(Byte value) {
            addCriterion("userStatus >", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("userStatus >=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThan(Byte value) {
            addCriterion("userStatus <", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThanOrEqualTo(Byte value) {
            addCriterion("userStatus <=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusIn(List<Byte> values) {
            addCriterion("userStatus in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotIn(List<Byte> values) {
            addCriterion("userStatus not in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusBetween(Byte value1, Byte value2) {
            addCriterion("userStatus between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("userStatus not between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserdataflagIsNull() {
            addCriterion("userDataFlag is null");
            return (Criteria) this;
        }

        public Criteria andUserdataflagIsNotNull() {
            addCriterion("userDataFlag is not null");
            return (Criteria) this;
        }

        public Criteria andUserdataflagEqualTo(Byte value) {
            addCriterion("userDataFlag =", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagNotEqualTo(Byte value) {
            addCriterion("userDataFlag <>", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagGreaterThan(Byte value) {
            addCriterion("userDataFlag >", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("userDataFlag >=", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagLessThan(Byte value) {
            addCriterion("userDataFlag <", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagLessThanOrEqualTo(Byte value) {
            addCriterion("userDataFlag <=", value, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagIn(List<Byte> values) {
            addCriterion("userDataFlag in", values, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagNotIn(List<Byte> values) {
            addCriterion("userDataFlag not in", values, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagBetween(Byte value1, Byte value2) {
            addCriterion("userDataFlag between", value1, value2, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andUserdataflagNotBetween(Byte value1, Byte value2) {
            addCriterion("userDataFlag not between", value1, value2, "userdataflag");
            return (Criteria) this;
        }

        public Criteria andLoginnumberIsNull() {
            addCriterion("loginNumber is null");
            return (Criteria) this;
        }

        public Criteria andLoginnumberIsNotNull() {
            addCriterion("loginNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnumberEqualTo(String value) {
            addCriterion("loginNumber =", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberNotEqualTo(String value) {
            addCriterion("loginNumber <>", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberGreaterThan(String value) {
            addCriterion("loginNumber >", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberGreaterThanOrEqualTo(String value) {
            addCriterion("loginNumber >=", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberLessThan(String value) {
            addCriterion("loginNumber <", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberLessThanOrEqualTo(String value) {
            addCriterion("loginNumber <=", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberLike(String value) {
            addCriterion("loginNumber like", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberNotLike(String value) {
            addCriterion("loginNumber not like", value, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberIn(List<String> values) {
            addCriterion("loginNumber in", values, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberNotIn(List<String> values) {
            addCriterion("loginNumber not in", values, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberBetween(String value1, String value2) {
            addCriterion("loginNumber between", value1, value2, "loginnumber");
            return (Criteria) this;
        }

        public Criteria andLoginnumberNotBetween(String value1, String value2) {
            addCriterion("loginNumber not between", value1, value2, "loginnumber");
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