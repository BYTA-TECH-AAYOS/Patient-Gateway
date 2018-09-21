package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
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
 * PaymentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class PaymentDTO   {
  @JsonProperty("createTime")
  private Instant createTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("payerId")
  private Long payerId = null;

  @JsonProperty("paymentGatewayProvider")
  private String paymentGatewayProvider = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("transactionId")
  private Long transactionId = null;

  @JsonProperty("updateTime")
  private Instant updateTime = null;

  public PaymentDTO createTime(Instant createTime) {
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

  public PaymentDTO id(Long id) {
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

  public PaymentDTO intent(String intent) {
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

  public PaymentDTO payerId(Long payerId) {
    this.payerId = payerId;
    return this;
  }

  /**
   * Get payerId
   * @return payerId
  **/
  @ApiModelProperty(value = "")


  public Long getPayerId() {
    return payerId;
  }

  public void setPayerId(Long payerId) {
    this.payerId = payerId;
  }

  public PaymentDTO paymentGatewayProvider(String paymentGatewayProvider) {
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

  public PaymentDTO paymentId(String paymentId) {
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

  public PaymentDTO state(String state) {
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

  public PaymentDTO transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentDTO updateTime(Instant updateTime) {
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
    PaymentDTO paymentDTO = (PaymentDTO) o;
    return Objects.equals(this.createTime, paymentDTO.createTime) &&
        Objects.equals(this.id, paymentDTO.id) &&
        Objects.equals(this.intent, paymentDTO.intent) &&
        Objects.equals(this.payerId, paymentDTO.payerId) &&
        Objects.equals(this.paymentGatewayProvider, paymentDTO.paymentGatewayProvider) &&
        Objects.equals(this.paymentId, paymentDTO.paymentId) &&
        Objects.equals(this.state, paymentDTO.state) &&
        Objects.equals(this.transactionId, paymentDTO.transactionId) &&
        Objects.equals(this.updateTime, paymentDTO.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, id, intent, payerId, paymentGatewayProvider, paymentId, state, transactionId, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDTO {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    paymentGatewayProvider: ").append(toIndentedString(paymentGatewayProvider)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

