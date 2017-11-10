package com.mvne.app.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table subs_product
 *
 * @mbggenerated do_not_delete_during_merge
 */
@Component
public class SubsProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    private Integer subsProductId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.SUBS_USER_ID
     *
     * @mbggenerated
     */
    private Integer subsUserId;

    /**
     * Database Column Remarks:
     *   归属客户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.CUST_ID
     *
     * @mbggenerated
     */
    private Integer custId;

    /**
     * Database Column Remarks:
     *   1、user
     *               2、group
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.SUBS_TYPE
     *
     * @mbggenerated
     */
    private String subsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.PRODUCT_ID
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.PRODUCT_NAME
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * Database Column Remarks:
     *   1 主产品
     *               2 子产品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.PRODUCT_CLASS
     *
     * @mbggenerated
     */
    private String productClass;

    /**
     * Database Column Remarks:
     *   参考pm_product_type_def
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.PRODUCT_TYPE
     *
     * @mbggenerated
     */
    private String productType;

    /**
     * Database Column Remarks:
     *   01：独享
     *               02：共享
     *               03：应用类
     *               
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.SHARE_FLAG
     *
     * @mbggenerated
     */
    private String shareFlag;

    /**
     * Database Column Remarks:
     *   MOD-模组套餐
     *               RES-资源池
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.INTF_FLAG
     *
     * @mbggenerated
     */
    private String intfFlag;

    /**
     * Database Column Remarks:
     *   1-月结型产品用户
     *               2-资源专用型产品用户
     *               3-资源通用型产品用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.SVC_PRODUCT_TYPE
     *
     * @mbggenerated
     */
    private String svcProductType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.EFFECITVE_DATE
     *
     * @mbggenerated
     */
    private Date effecitveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.EXPIRE_DATE
     *
     * @mbggenerated
     */
    private Date expireDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.PROV_CODE
     *
     * @mbggenerated
     */
    private String provCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.AREA_CODE
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_product.OPER_ID
     *
     * @mbggenerated
     */
    private Integer operId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.SUBS_PRODUCT_ID
     *
     * @return the value of subs_product.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    public Integer getSubsProductId() {
        return subsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.SUBS_PRODUCT_ID
     *
     * @param subsProductId the value for subs_product.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setSubsProductId(Integer subsProductId) {
        this.subsProductId = subsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.SUBS_USER_ID
     *
     * @return the value of subs_product.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public Integer getSubsUserId() {
        return subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.SUBS_USER_ID
     *
     * @param subsUserId the value for subs_product.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public void setSubsUserId(Integer subsUserId) {
        this.subsUserId = subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.CUST_ID
     *
     * @return the value of subs_product.CUST_ID
     *
     * @mbggenerated
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.CUST_ID
     *
     * @param custId the value for subs_product.CUST_ID
     *
     * @mbggenerated
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.SUBS_TYPE
     *
     * @return the value of subs_product.SUBS_TYPE
     *
     * @mbggenerated
     */
    public String getSubsType() {
        return subsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.SUBS_TYPE
     *
     * @param subsType the value for subs_product.SUBS_TYPE
     *
     * @mbggenerated
     */
    public void setSubsType(String subsType) {
        this.subsType = subsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.PRODUCT_ID
     *
     * @return the value of subs_product.PRODUCT_ID
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.PRODUCT_ID
     *
     * @param productId the value for subs_product.PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.PRODUCT_NAME
     *
     * @return the value of subs_product.PRODUCT_NAME
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.PRODUCT_NAME
     *
     * @param productName the value for subs_product.PRODUCT_NAME
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.PRODUCT_CLASS
     *
     * @return the value of subs_product.PRODUCT_CLASS
     *
     * @mbggenerated
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.PRODUCT_CLASS
     *
     * @param productClass the value for subs_product.PRODUCT_CLASS
     *
     * @mbggenerated
     */
    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.PRODUCT_TYPE
     *
     * @return the value of subs_product.PRODUCT_TYPE
     *
     * @mbggenerated
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.PRODUCT_TYPE
     *
     * @param productType the value for subs_product.PRODUCT_TYPE
     *
     * @mbggenerated
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.SHARE_FLAG
     *
     * @return the value of subs_product.SHARE_FLAG
     *
     * @mbggenerated
     */
    public String getShareFlag() {
        return shareFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.SHARE_FLAG
     *
     * @param shareFlag the value for subs_product.SHARE_FLAG
     *
     * @mbggenerated
     */
    public void setShareFlag(String shareFlag) {
        this.shareFlag = shareFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.INTF_FLAG
     *
     * @return the value of subs_product.INTF_FLAG
     *
     * @mbggenerated
     */
    public String getIntfFlag() {
        return intfFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.INTF_FLAG
     *
     * @param intfFlag the value for subs_product.INTF_FLAG
     *
     * @mbggenerated
     */
    public void setIntfFlag(String intfFlag) {
        this.intfFlag = intfFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.SVC_PRODUCT_TYPE
     *
     * @return the value of subs_product.SVC_PRODUCT_TYPE
     *
     * @mbggenerated
     */
    public String getSvcProductType() {
        return svcProductType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.SVC_PRODUCT_TYPE
     *
     * @param svcProductType the value for subs_product.SVC_PRODUCT_TYPE
     *
     * @mbggenerated
     */
    public void setSvcProductType(String svcProductType) {
        this.svcProductType = svcProductType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.CREATE_DATE
     *
     * @return the value of subs_product.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.CREATE_DATE
     *
     * @param createDate the value for subs_product.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.EFFECITVE_DATE
     *
     * @return the value of subs_product.EFFECITVE_DATE
     *
     * @mbggenerated
     */
    public Date getEffecitveDate() {
        return effecitveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.EFFECITVE_DATE
     *
     * @param effecitveDate the value for subs_product.EFFECITVE_DATE
     *
     * @mbggenerated
     */
    public void setEffecitveDate(Date effecitveDate) {
        this.effecitveDate = effecitveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.EXPIRE_DATE
     *
     * @return the value of subs_product.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.EXPIRE_DATE
     *
     * @param expireDate the value for subs_product.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.PROV_CODE
     *
     * @return the value of subs_product.PROV_CODE
     *
     * @mbggenerated
     */
    public String getProvCode() {
        return provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.PROV_CODE
     *
     * @param provCode the value for subs_product.PROV_CODE
     *
     * @mbggenerated
     */
    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.AREA_CODE
     *
     * @return the value of subs_product.AREA_CODE
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.AREA_CODE
     *
     * @param areaCode the value for subs_product.AREA_CODE
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_product.OPER_ID
     *
     * @return the value of subs_product.OPER_ID
     *
     * @mbggenerated
     */
    public Integer getOperId() {
        return operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_product.OPER_ID
     *
     * @param operId the value for subs_product.OPER_ID
     *
     * @mbggenerated
     */
    public void setOperId(Integer operId) {
        this.operId = operId;
    }
}