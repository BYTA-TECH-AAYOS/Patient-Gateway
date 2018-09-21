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
 * AmountDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class AmountDTO   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("detailsId")
  private Long detailsId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("total")
  private Double total = null;

  public AmountDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AmountDTO detailsId(Long detailsId) {
    this.detailsId = detailsId;
    return this;
  }

  /**
   * Get detailsId
   * @return detailsId
  **/
  @ApiModelProperty(value = "")


  public Long getDetailsId() {
    return detailsId;
  }

  public void setDetailsId(Long detailsId) {
    this.detailsId = detailsId;
  }

  public AmountDTO id(Long id) {
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

  public AmountDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountDTO amountDTO = (AmountDTO) o;
    return Objects.equals(this.currency, amountDTO.currency) &&
        Objects.equals(this.detailsId, amountDTO.detailsId) &&
        Objects.equals(this.id, amountDTO.id) &&
        Objects.equals(this.total, amountDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, detailsId, id, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountDTO {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    detailsId: ").append(toIndentedString(detailsId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

