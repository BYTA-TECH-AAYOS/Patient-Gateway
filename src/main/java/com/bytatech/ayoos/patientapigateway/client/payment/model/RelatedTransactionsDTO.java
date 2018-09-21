package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
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
 * RelatedTransactionsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class RelatedTransactionsDTO   {
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

  @JsonProperty("transactionInfoId")
  private Long transactionInfoId = null;

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
  private OffsetDateTime updateTime = null;

  public RelatedTransactionsDTO authValidUntil(Instant authValidUntil) {
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

  public RelatedTransactionsDTO createTime(Instant createTime) {
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

  public RelatedTransactionsDTO description(String description) {
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

  public RelatedTransactionsDTO id(Long id) {
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

  public RelatedTransactionsDTO intentId(String intentId) {
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

  public RelatedTransactionsDTO orderPendingReason(String orderPendingReason) {
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

  public RelatedTransactionsDTO paymentId(String paymentId) {
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

  public RelatedTransactionsDTO paymentMode(String paymentMode) {
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

  public RelatedTransactionsDTO receiptId(String receiptId) {
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

  public RelatedTransactionsDTO refundReason(String refundReason) {
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

  public RelatedTransactionsDTO refundSaleId(String refundSaleId) {
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

  public RelatedTransactionsDTO saleReasonCode(String saleReasonCode) {
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

  public RelatedTransactionsDTO state(String state) {
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

  public RelatedTransactionsDTO transactionInfoId(Long transactionInfoId) {
    this.transactionInfoId = transactionInfoId;
    return this;
  }

  /**
   * Get transactionInfoId
   * @return transactionInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getTransactionInfoId() {
    return transactionInfoId;
  }

  public void setTransactionInfoId(Long transactionInfoId) {
    this.transactionInfoId = transactionInfoId;
  }

  public RelatedTransactionsDTO transactionType(TransactionTypeEnum transactionType) {
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

  public RelatedTransactionsDTO updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
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
    RelatedTransactionsDTO relatedTransactionsDTO = (RelatedTransactionsDTO) o;
    return Objects.equals(this.authValidUntil, relatedTransactionsDTO.authValidUntil) &&
        Objects.equals(this.createTime, relatedTransactionsDTO.createTime) &&
        Objects.equals(this.description, relatedTransactionsDTO.description) &&
        Objects.equals(this.id, relatedTransactionsDTO.id) &&
        Objects.equals(this.intentId, relatedTransactionsDTO.intentId) &&
        Objects.equals(this.orderPendingReason, relatedTransactionsDTO.orderPendingReason) &&
        Objects.equals(this.paymentId, relatedTransactionsDTO.paymentId) &&
        Objects.equals(this.paymentMode, relatedTransactionsDTO.paymentMode) &&
        Objects.equals(this.receiptId, relatedTransactionsDTO.receiptId) &&
        Objects.equals(this.refundReason, relatedTransactionsDTO.refundReason) &&
        Objects.equals(this.refundSaleId, relatedTransactionsDTO.refundSaleId) &&
        Objects.equals(this.saleReasonCode, relatedTransactionsDTO.saleReasonCode) &&
        Objects.equals(this.state, relatedTransactionsDTO.state) &&
        Objects.equals(this.transactionInfoId, relatedTransactionsDTO.transactionInfoId) &&
        Objects.equals(this.transactionType, relatedTransactionsDTO.transactionType) &&
        Objects.equals(this.updateTime, relatedTransactionsDTO.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authValidUntil, createTime, description, id, intentId, orderPendingReason, paymentId, paymentMode, receiptId, refundReason, refundSaleId, saleReasonCode, state, transactionInfoId, transactionType, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTransactionsDTO {\n");
    
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
    sb.append("    transactionInfoId: ").append(toIndentedString(transactionInfoId)).append("\n");
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

