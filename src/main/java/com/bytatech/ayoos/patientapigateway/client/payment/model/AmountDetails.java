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
 * AmountDetails
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class AmountDetails   {
  @JsonProperty("handlingFee")
  private Double handlingFee = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("insurance")
  private Double insurance = null;

  @JsonProperty("otherFee")
  private Double otherFee = null;

  @JsonProperty("shipping")
  private Double shipping = null;

  @JsonProperty("shippingDiscount")
  private Double shippingDiscount = null;

  @JsonProperty("subtotal")
  private Double subtotal = null;

  @JsonProperty("tax")
  private Double tax = null;

  public AmountDetails handlingFee(Double handlingFee) {
    this.handlingFee = handlingFee;
    return this;
  }

  /**
   * Get handlingFee
   * @return handlingFee
  **/
  @ApiModelProperty(value = "")


  public Double getHandlingFee() {
    return handlingFee;
  }

  public void setHandlingFee(Double handlingFee) {
    this.handlingFee = handlingFee;
  }

  public AmountDetails id(Long id) {
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

  public AmountDetails insurance(Double insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")


  public Double getInsurance() {
    return insurance;
  }

  public void setInsurance(Double insurance) {
    this.insurance = insurance;
  }

  public AmountDetails otherFee(Double otherFee) {
    this.otherFee = otherFee;
    return this;
  }

  /**
   * Get otherFee
   * @return otherFee
  **/
  @ApiModelProperty(value = "")


  public Double getOtherFee() {
    return otherFee;
  }

  public void setOtherFee(Double otherFee) {
    this.otherFee = otherFee;
  }

  public AmountDetails shipping(Double shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")


  public Double getShipping() {
    return shipping;
  }

  public void setShipping(Double shipping) {
    this.shipping = shipping;
  }

  public AmountDetails shippingDiscount(Double shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
    return this;
  }

  /**
   * Get shippingDiscount
   * @return shippingDiscount
  **/
  @ApiModelProperty(value = "")


  public Double getShippingDiscount() {
    return shippingDiscount;
  }

  public void setShippingDiscount(Double shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
  }

  public AmountDetails subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * Get subtotal
   * @return subtotal
  **/
  @ApiModelProperty(value = "")


  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public AmountDetails tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")


  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountDetails amountDetails = (AmountDetails) o;
    return Objects.equals(this.handlingFee, amountDetails.handlingFee) &&
        Objects.equals(this.id, amountDetails.id) &&
        Objects.equals(this.insurance, amountDetails.insurance) &&
        Objects.equals(this.otherFee, amountDetails.otherFee) &&
        Objects.equals(this.shipping, amountDetails.shipping) &&
        Objects.equals(this.shippingDiscount, amountDetails.shippingDiscount) &&
        Objects.equals(this.subtotal, amountDetails.subtotal) &&
        Objects.equals(this.tax, amountDetails.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlingFee, id, insurance, otherFee, shipping, shippingDiscount, subtotal, tax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountDetails {\n");
    
    sb.append("    handlingFee: ").append(toIndentedString(handlingFee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    otherFee: ").append(toIndentedString(otherFee)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

