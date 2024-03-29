package com.mvne.app.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table subs_basic_prod
 *
 * @mbggenerated do_not_delete_during_merge
 */
@Component
public class SubsBasicProd {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.SUBS_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    private Integer subsOfferProdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.SUBS_ELEMENT_ID
     *
     * @mbggenerated
     */
    private Integer subsElementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    private Integer subsProductId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.SUBS_USER_ID
     *
     * @mbggenerated
     */
    private Integer subsUserId;

    /**
     * Database Column Remarks:
     *   BSS核心:新增
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.ELEMENT_ID
     *
     * @mbggenerated
     */
    private Integer elementId;

    /**
     * Database Column Remarks:
     *   模组下的产品需要填写对应的模组
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.MVNO_OFFER_ID
     *
     * @mbggenerated
     */
    private Integer mvnoOfferId;

    /**
     * Database Column Remarks:
     *   模组下的产品需要填写对应的模组
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.OFFER_ID
     *
     * @mbggenerated
     */
    private String offerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.MVNO_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    private Integer mvnoOfferProdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.OFFER_PROD_ID
     *
     * @mbggenerated
     */
    private String offerProdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.OFFER_PROD_TYPE
     *
     * @mbggenerated
     */
    private String offerProdType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.COMPONENT_ID
     *
     * @mbggenerated
     */
    private Integer componentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.EXPIRE_DATE
     *
     * @mbggenerated
     */
    private Date expireDate;

    /**
     * Database Column Remarks:
     *   回写
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.PROD_INS_ID
     *
     * @mbggenerated
     */
    private String prodInsId;

    /**
     * Database Column Remarks:
     *   回写
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.ABS_ACTIVE_DATE
     *
     * @mbggenerated
     */
    private Date absActiveDate;

    /**
     * Database Column Remarks:
     *   回写
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.ABS_INACTIVE_DATE
     *
     * @mbggenerated
     */
    private Date absInactiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.PROV_CODE
     *
     * @mbggenerated
     */
    private String provCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.AREA_CODE
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subs_basic_prod.OPER_ID
     *
     * @mbggenerated
     */
    private Integer operId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.SUBS_OFFER_PROD_ID
     *
     * @return the value of subs_basic_prod.SUBS_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public Integer getSubsOfferProdId() {
        return subsOfferProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.SUBS_OFFER_PROD_ID
     *
     * @param subsOfferProdId the value for subs_basic_prod.SUBS_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public void setSubsOfferProdId(Integer subsOfferProdId) {
        this.subsOfferProdId = subsOfferProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.SUBS_ELEMENT_ID
     *
     * @return the value of subs_basic_prod.SUBS_ELEMENT_ID
     *
     * @mbggenerated
     */
    public Integer getSubsElementId() {
        return subsElementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.SUBS_ELEMENT_ID
     *
     * @param subsElementId the value for subs_basic_prod.SUBS_ELEMENT_ID
     *
     * @mbggenerated
     */
    public void setSubsElementId(Integer subsElementId) {
        this.subsElementId = subsElementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.SUBS_PRODUCT_ID
     *
     * @return the value of subs_basic_prod.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    public Integer getSubsProductId() {
        return subsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.SUBS_PRODUCT_ID
     *
     * @param subsProductId the value for subs_basic_prod.SUBS_PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setSubsProductId(Integer subsProductId) {
        this.subsProductId = subsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.SUBS_USER_ID
     *
     * @return the value of subs_basic_prod.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public Integer getSubsUserId() {
        return subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.SUBS_USER_ID
     *
     * @param subsUserId the value for subs_basic_prod.SUBS_USER_ID
     *
     * @mbggenerated
     */
    public void setSubsUserId(Integer subsUserId) {
        this.subsUserId = subsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.ELEMENT_ID
     *
     * @return the value of subs_basic_prod.ELEMENT_ID
     *
     * @mbggenerated
     */
    public Integer getElementId() {
        return elementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.ELEMENT_ID
     *
     * @param elementId the value for subs_basic_prod.ELEMENT_ID
     *
     * @mbggenerated
     */
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.MVNO_OFFER_ID
     *
     * @return the value of subs_basic_prod.MVNO_OFFER_ID
     *
     * @mbggenerated
     */
    public Integer getMvnoOfferId() {
        return mvnoOfferId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.MVNO_OFFER_ID
     *
     * @param mvnoOfferId the value for subs_basic_prod.MVNO_OFFER_ID
     *
     * @mbggenerated
     */
    public void setMvnoOfferId(Integer mvnoOfferId) {
        this.mvnoOfferId = mvnoOfferId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.OFFER_ID
     *
     * @return the value of subs_basic_prod.OFFER_ID
     *
     * @mbggenerated
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.OFFER_ID
     *
     * @param offerId the value for subs_basic_prod.OFFER_ID
     *
     * @mbggenerated
     */
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.MVNO_OFFER_PROD_ID
     *
     * @return the value of subs_basic_prod.MVNO_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public Integer getMvnoOfferProdId() {
        return mvnoOfferProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.MVNO_OFFER_PROD_ID
     *
     * @param mvnoOfferProdId the value for subs_basic_prod.MVNO_OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public void setMvnoOfferProdId(Integer mvnoOfferProdId) {
        this.mvnoOfferProdId = mvnoOfferProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.OFFER_PROD_ID
     *
     * @return the value of subs_basic_prod.OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public String getOfferProdId() {
        return offerProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.OFFER_PROD_ID
     *
     * @param offerProdId the value for subs_basic_prod.OFFER_PROD_ID
     *
     * @mbggenerated
     */
    public void setOfferProdId(String offerProdId) {
        this.offerProdId = offerProdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.OFFER_PROD_TYPE
     *
     * @return the value of subs_basic_prod.OFFER_PROD_TYPE
     *
     * @mbggenerated
     */
    public String getOfferProdType() {
        return offerProdType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.OFFER_PROD_TYPE
     *
     * @param offerProdType the value for subs_basic_prod.OFFER_PROD_TYPE
     *
     * @mbggenerated
     */
    public void setOfferProdType(String offerProdType) {
        this.offerProdType = offerProdType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.COMPONENT_ID
     *
     * @return the value of subs_basic_prod.COMPONENT_ID
     *
     * @mbggenerated
     */
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.COMPONENT_ID
     *
     * @param componentId the value for subs_basic_prod.COMPONENT_ID
     *
     * @mbggenerated
     */
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.CREATE_DATE
     *
     * @return the value of subs_basic_prod.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.CREATE_DATE
     *
     * @param createDate the value for subs_basic_prod.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.EFFECTIVE_DATE
     *
     * @return the value of subs_basic_prod.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.EFFECTIVE_DATE
     *
     * @param effectiveDate the value for subs_basic_prod.EFFECTIVE_DATE
     *
     * @mbggenerated
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.EXPIRE_DATE
     *
     * @return the value of subs_basic_prod.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.EXPIRE_DATE
     *
     * @param expireDate the value for subs_basic_prod.EXPIRE_DATE
     *
     * @mbggenerated
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.PROD_INS_ID
     *
     * @return the value of subs_basic_prod.PROD_INS_ID
     *
     * @mbggenerated
     */
    public String getProdInsId() {
        return prodInsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.PROD_INS_ID
     *
     * @param prodInsId the value for subs_basic_prod.PROD_INS_ID
     *
     * @mbggenerated
     */
    public void setProdInsId(String prodInsId) {
        this.prodInsId = prodInsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.ABS_ACTIVE_DATE
     *
     * @return the value of subs_basic_prod.ABS_ACTIVE_DATE
     *
     * @mbggenerated
     */
    public Date getAbsActiveDate() {
        return absActiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.ABS_ACTIVE_DATE
     *
     * @param absActiveDate the value for subs_basic_prod.ABS_ACTIVE_DATE
     *
     * @mbggenerated
     */
    public void setAbsActiveDate(Date absActiveDate) {
        this.absActiveDate = absActiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.ABS_INACTIVE_DATE
     *
     * @return the value of subs_basic_prod.ABS_INACTIVE_DATE
     *
     * @mbggenerated
     */
    public Date getAbsInactiveDate() {
        return absInactiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.ABS_INACTIVE_DATE
     *
     * @param absInactiveDate the value for subs_basic_prod.ABS_INACTIVE_DATE
     *
     * @mbggenerated
     */
    public void setAbsInactiveDate(Date absInactiveDate) {
        this.absInactiveDate = absInactiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.PROV_CODE
     *
     * @return the value of subs_basic_prod.PROV_CODE
     *
     * @mbggenerated
     */
    public String getProvCode() {
        return provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.PROV_CODE
     *
     * @param provCode the value for subs_basic_prod.PROV_CODE
     *
     * @mbggenerated
     */
    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.AREA_CODE
     *
     * @return the value of subs_basic_prod.AREA_CODE
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.AREA_CODE
     *
     * @param areaCode the value for subs_basic_prod.AREA_CODE
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subs_basic_prod.OPER_ID
     *
     * @return the value of subs_basic_prod.OPER_ID
     *
     * @mbggenerated
     */
    public Integer getOperId() {
        return operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subs_basic_prod.OPER_ID
     *
     * @param operId the value for subs_basic_prod.OPER_ID
     *
     * @mbggenerated
     */
    public void setOperId(Integer operId) {
        this.operId = operId;
    }
}