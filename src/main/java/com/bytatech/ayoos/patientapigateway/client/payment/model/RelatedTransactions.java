package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
import com.bytatech.ayoos.patientapigateway.client.payment.model.TransactionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedTransactions
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class RelatedTransactions   {
  @JsonProperty("authValidUntil")
  private Instant authValidUntil = null;

  @JsonProperty("createTime")
  private Instant createTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("intentId")
  private String intentId = null;

  @JsonProperty("orderPendingReason")
  private String orderPendingReason = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("receiptId")
  private String receiptId = null;

  @JsonProperty("refundReason")
  private String refundReason = null;

  @JsonProperty("refundSaleId")
  private String refundSaleId = null;

  @JsonProperty("saleReasonCode")
  private String saleReasonCode = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("transactionInfo")
  private TransactionInfo transactionInfo = null;

  /**
   * Gets or Sets transactionType
   */
  public enum TransactionTypeEnum {
    SALE("SALE"),
    
    AUTHORIZATION("AUTHORIZATION"),
    
    ORDER("ORDER"),
    
    REFUND("REFUND"),
    
    CAPTURE("CAPTURE");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionTypeEnum fromValue(String text) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("transactionType")
  private TransactionTypeEnum transactionType = null;

  @JsonProperty("updateTime")
  private Instant updateTime = null;

  public RelatedTransactions authValidUntil(Instant authValidUntil) {
    this.authValidUntil = authValidUntil;
    return this;
  }

  /**
   * Get authValidUntil
   * @return authValidUntil
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getAuthValidUntil() {
    return authValidUntil;
  }

  public void setAuthValidUntil(Instant authValidUntil) {
    this.authValidUntil = authValidUntil;
  }

  public RelatedTransactions createTime(Instant createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public RelatedTransactions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RelatedTransactions id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RelatedTransactions intentId(String intentId) {
    this.intentId = intentId;
    return this;
  }

  /**
   * Get intentId
   * @return intentId
  **/
  @ApiModelProperty(value = "")


  public String getIntentId() {
    return intentId;
  }

  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }

  public RelatedTransactions orderPendingReason(String orderPendingReason) {
    this.orderPendingReason = orderPendingReason;
    return this;
  }

  /**
   * Get orderPendingReason
   * @return orderPendingReason
  **/
  @ApiModelProperty(value = "")


  public String getOrderPendingReason() {
    return orderPendingReason;
  }

  public void setOrderPendingReason(String orderPendingReason) {
    this.orderPendingReason = orderPendingReason;
  }

  public RelatedTransactions paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public RelatedTransactions paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public RelatedTransactions receiptId(String receiptId) {
    this.receiptId = receiptId;
    return this;
  }

  /**
   * Get receiptId
   * @return receiptId
  **/
  @ApiModelProperty(value = "")


  public String getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(String receiptId) {
    this.receiptId = receiptId;
  }

  public RelatedTransactions refundReason(String refundReason) {
    this.refundReason = refundReason;
    return this;
  }

  /**
   * Get refundReason
   * @return refundReason
  **/
  @ApiModelProperty(value = "")


  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }

  public RelatedTransactions refundSaleId(String refundSaleId) {
    this.refundSaleId = refundSaleId;
    return this;
  }

  /**
   * Get refundSaleId
   * @return refundSaleId
  **/
  @ApiModelProperty(value = "")


  public String getRefundSaleId() {
    return refundSaleId;
  }

  public void setRefundSaleId(String refundSaleId) {
    this.refundSaleId = refundSaleId;
  }

  public RelatedTransactions saleReasonCode(String saleReasonCode) {
    this.saleReasonCode = saleReasonCode;
    return this;
  }

  /**
   * Get saleReasonCode
   * @return saleReasonCode
  **/
  @ApiModelProperty(value = "")


  public String getSaleReasonCode() {
    return saleReasonCode;
  }

  public void setSaleReasonCode(String saleReasonCode) {
    this.saleReasonCode = saleReasonCode;
  }

  public RelatedTransactions state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public RelatedTransactions transactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   * @return transactionInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public RelatedTransactions transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")


  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public RelatedTransactions updateTime(Instant updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Instant updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTransactions relatedTransactions = (RelatedTransactions) o;
    return Objects.equals(this.authValidUntil, relatedTransactions.authValidUntil) &&
        Objects.equals(this.createTime, relatedTransactions.createTime) &&
        Objects.equals(this.description, relatedTransactions.description) &&
        Objects.equals(this.id, relatedTransactions.id) &&
        Objects.equals(this.intentId, relatedTransactions.intentId) &&
        Objects.equals(this.orderPendingReason, relatedTransactions.orderPendingReason) &&
        Objects.equals(this.paymentId, relatedTransactions.paymentId) &&
        Objects.equals(this.paymentMode, relatedTransactions.paymentMode) &&
        Objects.equals(this.receiptId, relatedTransactions.receiptId) &&
        Objects.equals(this.refundReason, relatedTransactions.refundReason) &&
        Objects.equals(this.refundSaleId, relatedTransactions.refundSaleId) &&
        Objects.equals(this.saleReasonCode, relatedTransactions.saleReasonCode) &&
        Objects.equals(this.state, relatedTransactions.state) &&
        Objects.equals(this.transactionInfo, relatedTransactions.transactionInfo) &&
        Objects.equals(this.transactionType, relatedTransactions.transactionType) &&
        Objects.equals(this.updateTime, relatedTransactions.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authValidUntil, createTime, description, id, intentId, orderPendingReason, paymentId, paymentMode, receiptId, refundReason, refundSaleId, saleReasonCode, state, transactionInfo, transactionType, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTransactions {\n");
    
    sb.append("    authValidUntil: ").append(toIndentedString(authValidUntil)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
    sb.append("    orderPendingReason: ").append(toIndentedString(orderPendingReason)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    refundSaleId: ").append(toIndentedString(refundSaleId)).append("\n");
    sb.append("    saleReasonCode: ").append(toIndentedString(saleReasonCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

