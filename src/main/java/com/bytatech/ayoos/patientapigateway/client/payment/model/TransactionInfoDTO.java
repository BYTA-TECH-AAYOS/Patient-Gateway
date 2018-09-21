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
 * TransactionInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class TransactionInfoDTO   {
  @JsonProperty("amountId")
  private Long amountId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("invoiceNumber")
  private String invoiceNumber = null;

  @JsonProperty("noteToPayee")
  private String noteToPayee = null;

  @JsonProperty("payeeId")
  private Long payeeId = null;

  public TransactionInfoDTO amountId(Long amountId) {
    this.amountId = amountId;
    return this;
  }

  /**
   * Get amountId
   * @return amountId
  **/
  @ApiModelProperty(value = "")


  public Long getAmountId() {
    return amountId;
  }

  public void setAmountId(Long amountId) {
    this.amountId = amountId;
  }

  public TransactionInfoDTO description(String description) {
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

  public TransactionInfoDTO id(Long id) {
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

  public TransactionInfoDTO invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")


  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public TransactionInfoDTO noteToPayee(String noteToPayee) {
    this.noteToPayee = noteToPayee;
    return this;
  }

  /**
   * Get noteToPayee
   * @return noteToPayee
  **/
  @ApiModelProperty(value = "")


  public String getNoteToPayee() {
    return noteToPayee;
  }

  public void setNoteToPayee(String noteToPayee) {
    this.noteToPayee = noteToPayee;
  }

  public TransactionInfoDTO payeeId(Long payeeId) {
    this.payeeId = payeeId;
    return this;
  }

  /**
   * Get payeeId
   * @return payeeId
  **/
  @ApiModelProperty(value = "")


  public Long getPayeeId() {
    return payeeId;
  }

  public void setPayeeId(Long payeeId) {
    this.payeeId = payeeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfoDTO transactionInfoDTO = (TransactionInfoDTO) o;
    return Objects.equals(this.amountId, transactionInfoDTO.amountId) &&
        Objects.equals(this.description, transactionInfoDTO.description) &&
        Objects.equals(this.id, transactionInfoDTO.id) &&
        Objects.equals(this.invoiceNumber, transactionInfoDTO.invoiceNumber) &&
        Objects.equals(this.noteToPayee, transactionInfoDTO.noteToPayee) &&
        Objects.equals(this.payeeId, transactionInfoDTO.payeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountId, description, id, invoiceNumber, noteToPayee, payeeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfoDTO {\n");
    
    sb.append("    amountId: ").append(toIndentedString(amountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    noteToPayee: ").append(toIndentedString(noteToPayee)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
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

