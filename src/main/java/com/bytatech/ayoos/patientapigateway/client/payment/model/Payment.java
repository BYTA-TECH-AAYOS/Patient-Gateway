package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
import com.bytatech.ayoos.patientapigateway.client.payment.model.Payer;
import com.bytatech.ayoos.patientapigateway.client.payment.model.TransactionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class Payment   {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("payer")
  private Payer payer = null;

  @JsonProperty("paymentGatewayProvider")
  private String paymentGatewayProvider = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("transaction")
  private TransactionInfo transaction = null;

  @JsonProperty("updateTime")
  private Instant updateTime = null;

  public Payment createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public Payment id(Long id) {
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

  public Payment intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
  **/
  @ApiModelProperty(value = "")


  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public Payment payer(Payer payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Payer getPayer() {
    return payer;
  }

  public void setPayer(Payer payer) {
    this.payer = payer;
  }

  public Payment paymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
    return this;
  }

  /**
   * Get paymentGatewayProvider
   * @return paymentGatewayProvider
  **/
  @ApiModelProperty(value = "")


  public String getPaymentGatewayProvider() {
    return paymentGatewayProvider;
  }

  public void setPaymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
  }

  public Payment paymentId(String paymentId) {
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

  public Payment state(String state) {
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

  public Payment transaction(TransactionInfo transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionInfo getTransaction() {
    return transaction;
  }

  public void setTransaction(TransactionInfo transaction) {
    this.transaction = transaction;
  }

  public Payment updateTime(Instant updateTime) {
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
    Payment payment = (Payment) o;
    return Objects.equals(this.createTime, payment.createTime) &&
        Objects.equals(this.id, payment.id) &&
        Objects.equals(this.intent, payment.intent) &&
        Objects.equals(this.payer, payment.payer) &&
        Objects.equals(this.paymentGatewayProvider, payment.paymentGatewayProvider) &&
        Objects.equals(this.paymentId, payment.paymentId) &&
        Objects.equals(this.state, payment.state) &&
        Objects.equals(this.transaction, payment.transaction) &&
        Objects.equals(this.updateTime, payment.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, id, intent, payer, paymentGatewayProvider, paymentId, state, transaction, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    paymentGatewayProvider: ").append(toIndentedString(paymentGatewayProvider)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

