package com.mvne.app.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cm_receive_addr
 *
 * @mbggenerated do_not_delete_during_merge
 */
@Component
public class CmReceiveAddr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.RECEIVE_ADDR_ID
     *
     * @mbggenerated
     */
    private Integer receiveAddrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.CUST_ID
     *
     * @mbggenerated
     */
    private Integer custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.RECEIVE_NAME
     *
     * @mbggenerated
     */
    private String receiveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.RECEIVE_TEL
     *
     * @mbggenerated
     */
    private String receiveTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.RECEIVE_ADDR
     *
     * @mbggenerated
     */
    private String receiveAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.ZIP_CODE
     *
     * @mbggenerated
     */
    private String zipCode;

    /**
     * Database Column Remarks:
     *   1：默认地址   0：非默认
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.IS_DEFAULT
     *
     * @mbggenerated
     */
    private String isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_receive_addr.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.RECEIVE_ADDR_ID
     *
     * @return the value of cm_receive_addr.RECEIVE_ADDR_ID
     *
     * @mbggenerated
     */
    public Integer getReceiveAddrId() {
        return receiveAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.RECEIVE_ADDR_ID
     *
     * @param receiveAddrId the value for cm_receive_addr.RECEIVE_ADDR_ID
     *
     * @mbggenerated
     */
    public void setReceiveAddrId(Integer receiveAddrId) {
        this.receiveAddrId = receiveAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.CUST_ID
     *
     * @return the value of cm_receive_addr.CUST_ID
     *
     * @mbggenerated
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.CUST_ID
     *
     * @param custId the value for cm_receive_addr.CUST_ID
     *
     * @mbggenerated
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.RECEIVE_NAME
     *
     * @return the value of cm_receive_addr.RECEIVE_NAME
     *
     * @mbggenerated
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.RECEIVE_NAME
     *
     * @param receiveName the value for cm_receive_addr.RECEIVE_NAME
     *
     * @mbggenerated
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.RECEIVE_TEL
     *
     * @return the value of cm_receive_addr.RECEIVE_TEL
     *
     * @mbggenerated
     */
    public String getReceiveTel() {
        return receiveTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.RECEIVE_TEL
     *
     * @param receiveTel the value for cm_receive_addr.RECEIVE_TEL
     *
     * @mbggenerated
     */
    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.RECEIVE_ADDR
     *
     * @return the value of cm_receive_addr.RECEIVE_ADDR
     *
     * @mbggenerated
     */
    public String getReceiveAddr() {
        return receiveAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.RECEIVE_ADDR
     *
     * @param receiveAddr the value for cm_receive_addr.RECEIVE_ADDR
     *
     * @mbggenerated
     */
    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.ZIP_CODE
     *
     * @return the value of cm_receive_addr.ZIP_CODE
     *
     * @mbggenerated
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.ZIP_CODE
     *
     * @param zipCode the value for cm_receive_addr.ZIP_CODE
     *
     * @mbggenerated
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.IS_DEFAULT
     *
     * @return the value of cm_receive_addr.IS_DEFAULT
     *
     * @mbggenerated
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.IS_DEFAULT
     *
     * @param isDefault the value for cm_receive_addr.IS_DEFAULT
     *
     * @mbggenerated
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_receive_addr.CREATE_DATE
     *
     * @return the value of cm_receive_addr.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_receive_addr.CREATE_DATE
     *
     * @param createDate the value for cm_receive_addr.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}