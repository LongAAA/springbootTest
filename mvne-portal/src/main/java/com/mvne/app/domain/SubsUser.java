package com.mvne.app.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table subs_user
 *
 * @mbggenerated do_not_delete_during_merge
 */
 @Component
public class SubsUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.SUBS_USER_ID
     *
     * @mbggenerated
     */
    private Integer subsUserId;

    /**
     * Database Column Remarks:
     *   归属客户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.CUST_ID
     *
     * @mbggenerated
     */
    private Integer custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.ACCT_ID
     *
     * @mbggenerated
     */
    private Integer acctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.BILL_ID
     *
     * @mbggenerated
     */
    private String billId;

    /**
     * Database Column Remarks:
     *   转售平台返回用户标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.IMSI
     *
     * @mbggenerated
     */
    private String imsi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.ICCID
     *
     * @mbggenerated
     */
    private String iccid;

    /**
     * Database Column Remarks:
     *   初始化手机号码后6位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.SVC_PWD
     *
     * @mbggenerated
     */
    private String svcPwd;

    /**
     * Database Column Remarks:
     *   1：开户 2：销户
     *               
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.SUBS_STATUS
     *
     * @mbggenerated
     */
    private String subsStatus;

    /**
     * Database Column Remarks:
     *   01：开机 02：停机 03：半停 04：销户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.SERVICE_STATUS
     *
     * @mbggenerated
     */
    private String serviceStatus;

    /**
     * Database Column Remarks:
     *   0	新装  
     *               1	报开(解挂)
     *               6	报停(挂失)
     *               8	预约销户
     *               9	预约销户撤销
     *               5	强停
     *               3	强开
     *               10	销户
     *               12	强制销户
     *               34	停机保号
     *               35	复机
     *               36            解除强停
     *               37            解除强开
     *               2	帐务开机(清欠自动开机)
     *               4	帐务欠停(欠费全停)
     *               7	帐务欠半停(欠费半停)
     *               50            预开
     *               51            妥投转拒收销户 
     *               52            过账户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    private String statusChgType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    private Date statusChgDate;

    /**
     * Database Column Remarks:
     *   1：开机 2：停机 3：半停 4：销户
     *               
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.LAST_SERVICE_STATUS
     *
     * @mbggenerated
     */
    private String lastServiceStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.LAST_STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    private Date lastStatusChgDate;

    /**
     * Database Column Remarks:
     *   0	新装  
     *               1	报开(解挂)
     *               6	报停(挂失)
     *               8	预约销户
     *               9	预约销户撤销
     *               5	强停
     *               3	强开
     *               10	销户
     *               12	强制销户
     *               34	停机保号
     *               35	复机
     *               2	帐务开机(清欠自动开机)
     *               4	帐务欠停(欠费全停)
     *               7	帐务欠半停(欠费半停)
     *               50            预开
     *               51            妥投转拒收销户 
     *               52            过账户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.LAST_STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    private String lastStatusChgType;

    /**
     * Database Column Remarks:
     *   0：电信 1：移动 2：联通
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.BASIC_ORG_ID
     *
     * @mbggenerated
     */
    private String basicOrgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.MVNO_ID
     *
     * @mbggenerated
     */
    private String mvnoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.PROV_CODE
     *
     * @mbggenerated
     */
    private String provCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.AREA_CODE
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   用户激活时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.EXPIRE_DATE
     *
     * @mbggenerated
     */
    private Date expireDate;

    /**
     * Database Column Remarks:
     *   预留字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.OPER_ID
     *
     * @mbggenerated
     */
    private Integer operId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_user.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.SUBS_USER_ID
     *
     * @return the value of subs_user.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public Integer getSubsUserId() {
        return subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.SUBS_USER_ID
     *
     * @param subsUserId the value for subs_user.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public void setSubsUserId(Integer subsUserId) {
        this.subsUserId = subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.CUST_ID
     *
     * @return the value of subs_user.CUST_ID
     *
     * @mbggenerated
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.CUST_ID
     *
     * @param custId the value for subs_user.CUST_ID
     *
     * @mbggenerated
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.ACCT_ID
     *
     * @return the value of subs_user.ACCT_ID
     *
     * @mbggenerated
     */
    public Integer getAcctId() {
        return acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.ACCT_ID
     *
     * @param acctId the value for subs_user.ACCT_ID
     *
     * @mbggenerated
     */
    public void setAcctId(Integer acctId) {
        this.acctId = acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.BILL_ID
     *
     * @return the value of subs_user.BILL_ID
     *
     * @mbggenerated
     */
    public String getBillId() {
        return billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.BILL_ID
     *
     * @param billId the value for subs_user.BILL_ID
     *
     * @mbggenerated
     */
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.USER_ID
     *
     * @return the value of subs_user.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.USER_ID
     *
     * @param userId the value for subs_user.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.IMSI
     *
     * @return the value of subs_user.IMSI
     *
     * @mbggenerated
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.IMSI
     *
     * @param imsi the value for subs_user.IMSI
     *
     * @mbggenerated
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.ICCID
     *
     * @return the value of subs_user.ICCID
     *
     * @mbggenerated
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.ICCID
     *
     * @param iccid the value for subs_user.ICCID
     *
     * @mbggenerated
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.SVC_PWD
     *
     * @return the value of subs_user.SVC_PWD
     *
     * @mbggenerated
     */
    public String getSvcPwd() {
        return svcPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.SVC_PWD
     *
     * @param svcPwd the value for subs_user.SVC_PWD
     *
     * @mbggenerated
     */
    public void setSvcPwd(String svcPwd) {
        this.svcPwd = svcPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.SUBS_STATUS
     *
     * @return the value of subs_user.SUBS_STATUS
     *
     * @mbggenerated
     */
    public String getSubsStatus() {
        return subsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.SUBS_STATUS
     *
     * @param subsStatus the value for subs_user.SUBS_STATUS
     *
     * @mbggenerated
     */
    public void setSubsStatus(String subsStatus) {
        this.subsStatus = subsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.SERVICE_STATUS
     *
     * @return the value of subs_user.SERVICE_STATUS
     *
     * @mbggenerated
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.SERVICE_STATUS
     *
     * @param serviceStatus the value for subs_user.SERVICE_STATUS
     *
     * @mbggenerated
     */
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.STATUS_CHG_TYPE
     *
     * @return the value of subs_user.STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    public String getStatusChgType() {
        return statusChgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.STATUS_CHG_TYPE
     *
     * @param statusChgType the value for subs_user.STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    public void setStatusChgType(String statusChgType) {
        this.statusChgType = statusChgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.STATUS_CHG_DATE
     *
     * @return the value of subs_user.STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    public Date getStatusChgDate() {
        return statusChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.STATUS_CHG_DATE
     *
     * @param statusChgDate the value for subs_user.STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    public void setStatusChgDate(Date statusChgDate) {
        this.statusChgDate = statusChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.LAST_SERVICE_STATUS
     *
     * @return the value of subs_user.LAST_SERVICE_STATUS
     *
     * @mbggenerated
     */
    public String getLastServiceStatus() {
        return lastServiceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.LAST_SERVICE_STATUS
     *
     * @param lastServiceStatus the value for subs_user.LAST_SERVICE_STATUS
     *
     * @mbggenerated
     */
    public void setLastServiceStatus(String lastServiceStatus) {
        this.lastServiceStatus = lastServiceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.LAST_STATUS_CHG_DATE
     *
     * @return the value of subs_user.LAST_STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    public Date getLastStatusChgDate() {
        return lastStatusChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.LAST_STATUS_CHG_DATE
     *
     * @param lastStatusChgDate the value for subs_user.LAST_STATUS_CHG_DATE
     *
     * @mbggenerated
     */
    public void setLastStatusChgDate(Date lastStatusChgDate) {
        this.lastStatusChgDate = lastStatusChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.LAST_STATUS_CHG_TYPE
     *
     * @return the value of subs_user.LAST_STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    public String getLastStatusChgType() {
        return lastStatusChgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.LAST_STATUS_CHG_TYPE
     *
     * @param lastStatusChgType the value for subs_user.LAST_STATUS_CHG_TYPE
     *
     * @mbggenerated
     */
    public void setLastStatusChgType(String lastStatusChgType) {
        this.lastStatusChgType = lastStatusChgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.BASIC_ORG_ID
     *
     * @return the value of subs_user.BASIC_ORG_ID
     *
     * @mbggenerated
     */
    public String getBasicOrgId() {
        return basicOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.BASIC_ORG_ID
     *
     * @param basicOrgId the value for subs_user.BASIC_ORG_ID
     *
     * @mbggenerated
     */
    public void setBasicOrgId(String basicOrgId) {
        this.basicOrgId = basicOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.MVNO_ID
     *
     * @return the value of subs_user.MVNO_ID
     *
     * @mbggenerated
     */
    public String getMvnoId() {
        return mvnoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.MVNO_ID
     *
     * @param mvnoId the value for subs_user.MVNO_ID
     *
     * @mbggenerated
     */
    public void setMvnoId(String mvnoId) {
        this.mvnoId = mvnoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.PROV_CODE
     *
     * @return the value of subs_user.PROV_CODE
     *
     * @mbggenerated
     */
    public String getProvCode() {
        return provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.PROV_CODE
     *
     * @param provCode the value for subs_user.PROV_CODE
     *
     * @mbggenerated
     */
    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.AREA_CODE
     *
     * @return the value of subs_user.AREA_CODE
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.AREA_CODE
     *
     * @param areaCode the value for subs_user.AREA_CODE
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.CREATE_DATE
     *
     * @return the value of subs_user.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.CREATE_DATE
     *
     * @param createDate the value for subs_user.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.EFFECTIVE_DATE
     *
     * @return the value of subs_user.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.EFFECTIVE_DATE
     *
     * @param effectiveDate the value for subs_user.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.EXPIRE_DATE
     *
     * @return the value of subs_user.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.EXPIRE_DATE
     *
     * @param expireDate the value for subs_user.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.OPER_ID
     *
     * @return the value of subs_user.OPER_ID
     *
     * @mbggenerated
     */
    public Integer getOperId() {
        return operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.OPER_ID
     *
     * @param operId the value for subs_user.OPER_ID
     *
     * @mbggenerated
     */
    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_user.REMARK
     *
     * @return the value of subs_user.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_user.REMARK
     *
     * @param remark the value for subs_user.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}