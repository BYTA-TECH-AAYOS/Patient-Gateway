package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundingInstrumentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class FundingInstrumentDTO   {
  @JsonProperty("creditCardId")
  private Long creditCardId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("payerId")
  private Long payerId = null;

  public FundingInstrumentDTO creditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
    return this;
  }

  /**
   * Get creditCardId
   * @return creditCardId
  **/
  @ApiModelProperty(value = "")


  public Long getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
  }

  public FundingInstrumentDTO id(Long id) {
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

  public FundingInstrumentDTO payerId(Long payerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingInstrumentDTO fundingInstrumentDTO = (FundingInstrumentDTO) o;
    return Objects.equals(this.creditCardId, fundingInstrumentDTO.creditCardId) &&
        Objects.equals(this.id, fundingInstrumentDTO.id) &&
        Objects.equals(this.payerId, fundingInstrumentDTO.payerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardId, id, payerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingInstrumentDTO {\n");
    
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
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

