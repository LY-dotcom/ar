package com.wpz.ar.domain;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andPriseCntIsNull() {
            addCriterion("prise_cnt is null");
            return (Criteria) this;
        }

        public Criteria andPriseCntIsNotNull() {
            addCriterion("prise_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andPriseCntEqualTo(Integer value) {
            addCriterion("prise_cnt =", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntNotEqualTo(Integer value) {
            addCriterion("prise_cnt <>", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntGreaterThan(Integer value) {
            addCriterion("prise_cnt >", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("prise_cnt >=", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntLessThan(Integer value) {
            addCriterion("prise_cnt <", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntLessThanOrEqualTo(Integer value) {
            addCriterion("prise_cnt <=", value, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntIn(List<Integer> values) {
            addCriterion("prise_cnt in", values, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntNotIn(List<Integer> values) {
            addCriterion("prise_cnt not in", values, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntBetween(Integer value1, Integer value2) {
            addCriterion("prise_cnt between", value1, value2, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andPriseCntNotBetween(Integer value1, Integer value2) {
            addCriterion("prise_cnt not between", value1, value2, "priseCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntIsNull() {
            addCriterion("view_cnt is null");
            return (Criteria) this;
        }

        public Criteria andViewCntIsNotNull() {
            addCriterion("view_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andViewCntEqualTo(Integer value) {
            addCriterion("view_cnt =", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntNotEqualTo(Integer value) {
            addCriterion("view_cnt <>", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntGreaterThan(Integer value) {
            addCriterion("view_cnt >", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_cnt >=", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntLessThan(Integer value) {
            addCriterion("view_cnt <", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntLessThanOrEqualTo(Integer value) {
            addCriterion("view_cnt <=", value, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntIn(List<Integer> values) {
            addCriterion("view_cnt in", values, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntNotIn(List<Integer> values) {
            addCriterion("view_cnt not in", values, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntBetween(Integer value1, Integer value2) {
            addCriterion("view_cnt between", value1, value2, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andViewCntNotBetween(Integer value1, Integer value2) {
            addCriterion("view_cnt not between", value1, value2, "viewCnt");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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