package com.mvne.app.domain;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cm_pwd_protect
 *
 * @mbggenerated do_not_delete_during_merge
 */
@Component
public class CmPwdProtect {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.PWD_PROTECT_ID
     *
     * @mbggenerated
     */
    private Integer pwdProtectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.SUBS_USER_ID
     *
     * @mbggenerated
     */
    private Integer subsUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.BILL_ID
     *
     * @mbggenerated
     */
    private String billId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.FIRST_QUESTION
     *
     * @mbggenerated
     */
    private String firstQuestion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.FIRST_ANSWER
     *
     * @mbggenerated
     */
    private String firstAnswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.SECOND_QUESTION
     *
     * @mbggenerated
     */
    private String secondQuestion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.SECOND_ANSWER
     *
     * @mbggenerated
     */
    private String secondAnswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.THIRD_QUESTION
     *
     * @mbggenerated
     */
    private String thirdQuestion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.THIRD_ANSWER
     *
     * @mbggenerated
     */
    private String thirdAnswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.LAST_CHG_DATE
     *
     * @mbggenerated
     */
    private Date lastChgDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_pwd_protect.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.PWD_PROTECT_ID
     *
     * @return the value of cm_pwd_protect.PWD_PROTECT_ID
     *
     * @mbggenerated
     */
    public Integer getPwdProtectId() {
        return pwdProtectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.PWD_PROTECT_ID
     *
     * @param pwdProtectId the value for cm_pwd_protect.PWD_PROTECT_ID
     *
     * @mbggenerated
     */
    public void setPwdProtectId(Integer pwdProtectId) {
        this.pwdProtectId = pwdProtectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.SUBS_USER_ID
     *
     * @return the value of cm_pwd_protect.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public Integer getSubsUserId() {
        return subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.SUBS_USER_ID
     *
     * @param subsUserId the value for cm_pwd_protect.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public void setSubsUserId(Integer subsUserId) {
        this.subsUserId = subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.BILL_ID
     *
     * @return the value of cm_pwd_protect.BILL_ID
     *
     * @mbggenerated
     */
    public String getBillId() {
        return billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.BILL_ID
     *
     * @param billId the value for cm_pwd_protect.BILL_ID
     *
     * @mbggenerated
     */
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.FIRST_QUESTION
     *
     * @return the value of cm_pwd_protect.FIRST_QUESTION
     *
     * @mbggenerated
     */
    public String getFirstQuestion() {
        return firstQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.FIRST_QUESTION
     *
     * @param firstQuestion the value for cm_pwd_protect.FIRST_QUESTION
     *
     * @mbggenerated
     */
    public void setFirstQuestion(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.FIRST_ANSWER
     *
     * @return the value of cm_pwd_protect.FIRST_ANSWER
     *
     * @mbggenerated
     */
    public String getFirstAnswer() {
        return firstAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.FIRST_ANSWER
     *
     * @param firstAnswer the value for cm_pwd_protect.FIRST_ANSWER
     *
     * @mbggenerated
     */
    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.SECOND_QUESTION
     *
     * @return the value of cm_pwd_protect.SECOND_QUESTION
     *
     * @mbggenerated
     */
    public String getSecondQuestion() {
        return secondQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.SECOND_QUESTION
     *
     * @param secondQuestion the value for cm_pwd_protect.SECOND_QUESTION
     *
     * @mbggenerated
     */
    public void setSecondQuestion(String secondQuestion) {
        this.secondQuestion = secondQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.SECOND_ANSWER
     *
     * @return the value of cm_pwd_protect.SECOND_ANSWER
     *
     * @mbggenerated
     */
    public String getSecondAnswer() {
        return secondAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.SECOND_ANSWER
     *
     * @param secondAnswer the value for cm_pwd_protect.SECOND_ANSWER
     *
     * @mbggenerated
     */
    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.THIRD_QUESTION
     *
     * @return the value of cm_pwd_protect.THIRD_QUESTION
     *
     * @mbggenerated
     */
    public String getThirdQuestion() {
        return thirdQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.THIRD_QUESTION
     *
     * @param thirdQuestion the value for cm_pwd_protect.THIRD_QUESTION
     *
     * @mbggenerated
     */
    public void setThirdQuestion(String thirdQuestion) {
        this.thirdQuestion = thirdQuestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.THIRD_ANSWER
     *
     * @return the value of cm_pwd_protect.THIRD_ANSWER
     *
     * @mbggenerated
     */
    public String getThirdAnswer() {
        return thirdAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.THIRD_ANSWER
     *
     * @param thirdAnswer the value for cm_pwd_protect.THIRD_ANSWER
     *
     * @mbggenerated
     */
    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.CREATE_DATE
     *
     * @return the value of cm_pwd_protect.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.CREATE_DATE
     *
     * @param createDate the value for cm_pwd_protect.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.LAST_CHG_DATE
     *
     * @return the value of cm_pwd_protect.LAST_CHG_DATE
     *
     * @mbggenerated
     */
    public Date getLastChgDate() {
        return lastChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.LAST_CHG_DATE
     *
     * @param lastChgDate the value for cm_pwd_protect.LAST_CHG_DATE
     *
     * @mbggenerated
     */
    public void setLastChgDate(Date lastChgDate) {
        this.lastChgDate = lastChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_pwd_protect.REMARK
     *
     * @return the value of cm_pwd_protect.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_pwd_protect.REMARK
     *
     * @param remark the value for cm_pwd_protect.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}