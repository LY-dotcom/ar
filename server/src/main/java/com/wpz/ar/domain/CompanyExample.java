package com.wpz.ar.domain;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("build_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("build_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(String value) {
            addCriterion("build_date =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(String value) {
            addCriterion("build_date <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(String value) {
            addCriterion("build_date >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(String value) {
            addCriterion("build_date >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(String value) {
            addCriterion("build_date <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(String value) {
            addCriterion("build_date <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLike(String value) {
            addCriterion("build_date like", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotLike(String value) {
            addCriterion("build_date not like", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<String> values) {
            addCriterion("build_date in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<String> values) {
            addCriterion("build_date not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(String value1, String value2) {
            addCriterion("build_date between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(String value1, String value2) {
            addCriterion("build_date not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalIsNull() {
            addCriterion("build_capital is null");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalIsNotNull() {
            addCriterion("build_capital is not null");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalEqualTo(Integer value) {
            addCriterion("build_capital =", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalNotEqualTo(Integer value) {
            addCriterion("build_capital <>", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalGreaterThan(Integer value) {
            addCriterion("build_capital >", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_capital >=", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalLessThan(Integer value) {
            addCriterion("build_capital <", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("build_capital <=", value, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalIn(List<Integer> values) {
            addCriterion("build_capital in", values, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalNotIn(List<Integer> values) {
            addCriterion("build_capital not in", values, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalBetween(Integer value1, Integer value2) {
            addCriterion("build_capital between", value1, value2, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andBuildCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("build_capital not between", value1, value2, "buildCapital");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNull() {
            addCriterion("logo_path is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("logo_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("logo_path =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("logo_path <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("logo_path >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("logo_path >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("logo_path <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("logo_path <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("logo_path like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("logo_path not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("logo_path in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("logo_path not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("logo_path between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("logo_path not between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andProfilePathIsNull() {
            addCriterion("profile_path is null");
            return (Criteria) this;
        }

        public Criteria andProfilePathIsNotNull() {
            addCriterion("profile_path is not null");
            return (Criteria) this;
        }

        public Criteria andProfilePathEqualTo(String value) {
            addCriterion("profile_path =", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathNotEqualTo(String value) {
            addCriterion("profile_path <>", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathGreaterThan(String value) {
            addCriterion("profile_path >", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathGreaterThanOrEqualTo(String value) {
            addCriterion("profile_path >=", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathLessThan(String value) {
            addCriterion("profile_path <", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathLessThanOrEqualTo(String value) {
            addCriterion("profile_path <=", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathLike(String value) {
            addCriterion("profile_path like", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathNotLike(String value) {
            addCriterion("profile_path not like", value, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathIn(List<String> values) {
            addCriterion("profile_path in", values, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathNotIn(List<String> values) {
            addCriterion("profile_path not in", values, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathBetween(String value1, String value2) {
            addCriterion("profile_path between", value1, value2, "profilePath");
            return (Criteria) this;
        }

        public Criteria andProfilePathNotBetween(String value1, String value2) {
            addCriterion("profile_path not between", value1, value2, "profilePath");
            return (Criteria) this;
        }

        public Criteria andLocationDetailIsNull() {
            addCriterion("location_detail is null");
            return (Criteria) this;
        }

        public Criteria andLocationDetailIsNotNull() {
            addCriterion("location_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDetailEqualTo(String value) {
            addCriterion("location_detail =", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailNotEqualTo(String value) {
            addCriterion("location_detail <>", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailGreaterThan(String value) {
            addCriterion("location_detail >", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailGreaterThanOrEqualTo(String value) {
            addCriterion("location_detail >=", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailLessThan(String value) {
            addCriterion("location_detail <", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailLessThanOrEqualTo(String value) {
            addCriterion("location_detail <=", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailLike(String value) {
            addCriterion("location_detail like", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailNotLike(String value) {
            addCriterion("location_detail not like", value, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailIn(List<String> values) {
            addCriterion("location_detail in", values, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailNotIn(List<String> values) {
            addCriterion("location_detail not in", values, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailBetween(String value1, String value2) {
            addCriterion("location_detail between", value1, value2, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andLocationDetailNotBetween(String value1, String value2) {
            addCriterion("location_detail not between", value1, value2, "locationDetail");
            return (Criteria) this;
        }

        public Criteria andCheckInfoIsNull() {
            addCriterion("check_info is null");
            return (Criteria) this;
        }

        public Criteria andCheckInfoIsNotNull() {
            addCriterion("check_info is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInfoEqualTo(String value) {
            addCriterion("check_info =", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoNotEqualTo(String value) {
            addCriterion("check_info <>", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoGreaterThan(String value) {
            addCriterion("check_info >", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoGreaterThanOrEqualTo(String value) {
            addCriterion("check_info >=", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoLessThan(String value) {
            addCriterion("check_info <", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoLessThanOrEqualTo(String value) {
            addCriterion("check_info <=", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoLike(String value) {
            addCriterion("check_info like", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoNotLike(String value) {
            addCriterion("check_info not like", value, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoIn(List<String> values) {
            addCriterion("check_info in", values, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoNotIn(List<String> values) {
            addCriterion("check_info not in", values, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoBetween(String value1, String value2) {
            addCriterion("check_info between", value1, value2, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andCheckInfoNotBetween(String value1, String value2) {
            addCriterion("check_info not between", value1, value2, "checkInfo");
            return (Criteria) this;
        }

        public Criteria andProsessionIsNull() {
            addCriterion("prosession is null");
            return (Criteria) this;
        }

        public Criteria andProsessionIsNotNull() {
            addCriterion("prosession is not null");
            return (Criteria) this;
        }

        public Criteria andProsessionEqualTo(String value) {
            addCriterion("prosession =", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionNotEqualTo(String value) {
            addCriterion("prosession <>", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionGreaterThan(String value) {
            addCriterion("prosession >", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionGreaterThanOrEqualTo(String value) {
            addCriterion("prosession >=", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionLessThan(String value) {
            addCriterion("prosession <", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionLessThanOrEqualTo(String value) {
            addCriterion("prosession <=", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionLike(String value) {
            addCriterion("prosession like", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionNotLike(String value) {
            addCriterion("prosession not like", value, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionIn(List<String> values) {
            addCriterion("prosession in", values, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionNotIn(List<String> values) {
            addCriterion("prosession not in", values, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionBetween(String value1, String value2) {
            addCriterion("prosession between", value1, value2, "prosession");
            return (Criteria) this;
        }

        public Criteria andProsessionNotBetween(String value1, String value2) {
            addCriterion("prosession not between", value1, value2, "prosession");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
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