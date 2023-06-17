package com.wpz.ar.domain;

import java.util.ArrayList;
import java.util.List;

public class ResumeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeDetailExample() {
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

        public Criteria andApplicantIdIsNull() {
            addCriterion("applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNotNull() {
            addCriterion("applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdEqualTo(Integer value) {
            addCriterion("applicant_id =", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotEqualTo(Integer value) {
            addCriterion("applicant_id <>", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThan(Integer value) {
            addCriterion("applicant_id >", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicant_id >=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThan(Integer value) {
            addCriterion("applicant_id <", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThanOrEqualTo(Integer value) {
            addCriterion("applicant_id <=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIn(List<Integer> values) {
            addCriterion("applicant_id in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotIn(List<Integer> values) {
            addCriterion("applicant_id not in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdBetween(Integer value1, Integer value2) {
            addCriterion("applicant_id between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("applicant_id not between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdIsNull() {
            addCriterion("station_type_id is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdIsNotNull() {
            addCriterion("station_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdEqualTo(Integer value) {
            addCriterion("station_type_id =", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdNotEqualTo(Integer value) {
            addCriterion("station_type_id <>", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdGreaterThan(Integer value) {
            addCriterion("station_type_id >", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_type_id >=", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdLessThan(Integer value) {
            addCriterion("station_type_id <", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_type_id <=", value, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdIn(List<Integer> values) {
            addCriterion("station_type_id in", values, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdNotIn(List<Integer> values) {
            addCriterion("station_type_id not in", values, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("station_type_id between", value1, value2, "stationTypeId");
            return (Criteria) this;
        }

        public Criteria andStationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_type_id not between", value1, value2, "stationTypeId");
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

        public Criteria andMinSalaryIsNull() {
            addCriterion("min_salary is null");
            return (Criteria) this;
        }

        public Criteria andMinSalaryIsNotNull() {
            addCriterion("min_salary is not null");
            return (Criteria) this;
        }

        public Criteria andMinSalaryEqualTo(Integer value) {
            addCriterion("min_salary =", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotEqualTo(Integer value) {
            addCriterion("min_salary <>", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryGreaterThan(Integer value) {
            addCriterion("min_salary >", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_salary >=", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryLessThan(Integer value) {
            addCriterion("min_salary <", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("min_salary <=", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryIn(List<Integer> values) {
            addCriterion("min_salary in", values, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotIn(List<Integer> values) {
            addCriterion("min_salary not in", values, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryBetween(Integer value1, Integer value2) {
            addCriterion("min_salary between", value1, value2, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("min_salary not between", value1, value2, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIsNull() {
            addCriterion("max_salary is null");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIsNotNull() {
            addCriterion("max_salary is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryEqualTo(Integer value) {
            addCriterion("max_salary =", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotEqualTo(Integer value) {
            addCriterion("max_salary <>", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryGreaterThan(Integer value) {
            addCriterion("max_salary >", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_salary >=", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryLessThan(Integer value) {
            addCriterion("max_salary <", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("max_salary <=", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIn(List<Integer> values) {
            addCriterion("max_salary in", values, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotIn(List<Integer> values) {
            addCriterion("max_salary not in", values, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryBetween(Integer value1, Integer value2) {
            addCriterion("max_salary between", value1, value2, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("max_salary not between", value1, value2, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andEducationInfoIsNull() {
            addCriterion("education_info is null");
            return (Criteria) this;
        }

        public Criteria andEducationInfoIsNotNull() {
            addCriterion("education_info is not null");
            return (Criteria) this;
        }

        public Criteria andEducationInfoEqualTo(String value) {
            addCriterion("education_info =", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoNotEqualTo(String value) {
            addCriterion("education_info <>", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoGreaterThan(String value) {
            addCriterion("education_info >", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoGreaterThanOrEqualTo(String value) {
            addCriterion("education_info >=", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoLessThan(String value) {
            addCriterion("education_info <", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoLessThanOrEqualTo(String value) {
            addCriterion("education_info <=", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoLike(String value) {
            addCriterion("education_info like", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoNotLike(String value) {
            addCriterion("education_info not like", value, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoIn(List<String> values) {
            addCriterion("education_info in", values, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoNotIn(List<String> values) {
            addCriterion("education_info not in", values, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoBetween(String value1, String value2) {
            addCriterion("education_info between", value1, value2, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andEducationInfoNotBetween(String value1, String value2) {
            addCriterion("education_info not between", value1, value2, "educationInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoIsNull() {
            addCriterion("program_info is null");
            return (Criteria) this;
        }

        public Criteria andProgramInfoIsNotNull() {
            addCriterion("program_info is not null");
            return (Criteria) this;
        }

        public Criteria andProgramInfoEqualTo(String value) {
            addCriterion("program_info =", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoNotEqualTo(String value) {
            addCriterion("program_info <>", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoGreaterThan(String value) {
            addCriterion("program_info >", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoGreaterThanOrEqualTo(String value) {
            addCriterion("program_info >=", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoLessThan(String value) {
            addCriterion("program_info <", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoLessThanOrEqualTo(String value) {
            addCriterion("program_info <=", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoLike(String value) {
            addCriterion("program_info like", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoNotLike(String value) {
            addCriterion("program_info not like", value, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoIn(List<String> values) {
            addCriterion("program_info in", values, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoNotIn(List<String> values) {
            addCriterion("program_info not in", values, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoBetween(String value1, String value2) {
            addCriterion("program_info between", value1, value2, "programInfo");
            return (Criteria) this;
        }

        public Criteria andProgramInfoNotBetween(String value1, String value2) {
            addCriterion("program_info not between", value1, value2, "programInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNull() {
            addCriterion("work_info is null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNotNull() {
            addCriterion("work_info is not null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoEqualTo(String value) {
            addCriterion("work_info =", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotEqualTo(String value) {
            addCriterion("work_info <>", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThan(String value) {
            addCriterion("work_info >", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("work_info >=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThan(String value) {
            addCriterion("work_info <", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThanOrEqualTo(String value) {
            addCriterion("work_info <=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLike(String value) {
            addCriterion("work_info like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotLike(String value) {
            addCriterion("work_info not like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIn(List<String> values) {
            addCriterion("work_info in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotIn(List<String> values) {
            addCriterion("work_info not in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoBetween(String value1, String value2) {
            addCriterion("work_info between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotBetween(String value1, String value2) {
            addCriterion("work_info not between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoIsNull() {
            addCriterion("self_info is null");
            return (Criteria) this;
        }

        public Criteria andSelfInfoIsNotNull() {
            addCriterion("self_info is not null");
            return (Criteria) this;
        }

        public Criteria andSelfInfoEqualTo(String value) {
            addCriterion("self_info =", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoNotEqualTo(String value) {
            addCriterion("self_info <>", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoGreaterThan(String value) {
            addCriterion("self_info >", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoGreaterThanOrEqualTo(String value) {
            addCriterion("self_info >=", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoLessThan(String value) {
            addCriterion("self_info <", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoLessThanOrEqualTo(String value) {
            addCriterion("self_info <=", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoLike(String value) {
            addCriterion("self_info like", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoNotLike(String value) {
            addCriterion("self_info not like", value, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoIn(List<String> values) {
            addCriterion("self_info in", values, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoNotIn(List<String> values) {
            addCriterion("self_info not in", values, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoBetween(String value1, String value2) {
            addCriterion("self_info between", value1, value2, "selfInfo");
            return (Criteria) this;
        }

        public Criteria andSelfInfoNotBetween(String value1, String value2) {
            addCriterion("self_info not between", value1, value2, "selfInfo");
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