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
 * CreditCardDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class CreditCardDTO   {
  @JsonProperty("cvv2")
  private Integer cvv2 = null;

  @JsonProperty("expireMonth")
  private Integer expireMonth = null;

  @JsonProperty("expireYear")
  private Integer expireYear = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("type")
  private String type = null;

  public CreditCardDTO cvv2(Integer cvv2) {
    this.cvv2 = cvv2;
    return this;
  }

  /**
   * Get cvv2
   * @return cvv2
  **/
  @ApiModelProperty(value = "")


  public Integer getCvv2() {
    return cvv2;
  }

  public void setCvv2(Integer cvv2) {
    this.cvv2 = cvv2;
  }

  public CreditCardDTO expireMonth(Integer expireMonth) {
    this.expireMonth = expireMonth;
    return this;
  }

  /**
   * Get expireMonth
   * @return expireMonth
  **/
  @ApiModelProperty(value = "")


  public Integer getExpireMonth() {
    return expireMonth;
  }

  public void setExpireMonth(Integer expireMonth) {
    this.expireMonth = expireMonth;
  }

  public CreditCardDTO expireYear(Integer expireYear) {
    this.expireYear = expireYear;
    return this;
  }

  /**
   * Get expireYear
   * @return expireYear
  **/
  @ApiModelProperty(value = "")


  public Integer getExpireYear() {
    return expireYear;
  }

  public void setExpireYear(Integer expireYear) {
    this.expireYear = expireYear;
  }

  public CreditCardDTO id(Long id) {
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

  public CreditCardDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreditCardDTO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardDTO creditCardDTO = (CreditCardDTO) o;
    return Objects.equals(this.cvv2, creditCardDTO.cvv2) &&
        Objects.equals(this.expireMonth, creditCardDTO.expireMonth) &&
        Objects.equals(this.expireYear, creditCardDTO.expireYear) &&
        Objects.equals(this.id, creditCardDTO.id) &&
        Objects.equals(this.number, creditCardDTO.number) &&
        Objects.equals(this.type, creditCardDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvv2, expireMonth, expireYear, id, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardDTO {\n");
    
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    expireMonth: ").append(toIndentedString(expireMonth)).append("\n");
    sb.append("    expireYear: ").append(toIndentedString(expireYear)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

