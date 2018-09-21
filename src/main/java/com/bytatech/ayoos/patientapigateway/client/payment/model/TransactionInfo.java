package com.bytatech.ayoos.patientapigateway.client.payment.model;

import java.util.Objects;
import com.bytatech.ayoos.patientapigateway.client.payment.model.Amount;
import com.bytatech.ayoos.patientapigateway.client.payment.model.Payee;
import com.bytatech.ayoos.patientapigateway.client.payment.model.RelatedTransactions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-18T12:45:05.497+05:30[Asia/Kolkata]")

public class TransactionInfo   {
  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("invoiceNumber")
  private String invoiceNumber = null;

  @JsonProperty("noteToPayee")
  private String noteToPayee = null;

  @JsonProperty("payee")
  private Payee payee = null;

  @JsonProperty("transactionDetails")
  @Valid
  private List<RelatedTransactions> transactionDetails = null;

  public TransactionInfo amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public TransactionInfo description(String description) {
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

  public TransactionInfo id(Long id) {
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

  public TransactionInfo invoiceNumber(String invoiceNumber) {
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

  public TransactionInfo noteToPayee(String noteToPayee) {
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

  public TransactionInfo payee(Payee payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Get payee
   * @return payee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Payee getPayee() {
    return payee;
  }

  public void setPayee(Payee payee) {
    this.payee = payee;
  }

  public TransactionInfo transactionDetails(List<RelatedTransactions> transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  public TransactionInfo addTransactionDetailsItem(RelatedTransactions transactionDetailsItem) {
    if (this.transactionDetails == null) {
      this.transactionDetails = new ArrayList<RelatedTransactions>();
    }
    this.transactionDetails.add(transactionDetailsItem);
    return this;
  }

  /**
   * Get transactionDetails
   * @return transactionDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedTransactions> getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(List<RelatedTransactions> transactionDetails) {
    this.transactionDetails = transactionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfo transactionInfo = (TransactionInfo) o;
    return Objects.equals(this.amount, transactionInfo.amount) &&
        Objects.equals(this.description, transactionInfo.description) &&
        Objects.equals(this.id, transactionInfo.id) &&
        Objects.equals(this.invoiceNumber, transactionInfo.invoiceNumber) &&
        Objects.equals(this.noteToPayee, transactionInfo.noteToPayee) &&
        Objects.equals(this.payee, transactionInfo.payee) &&
        Objects.equals(this.transactionDetails, transactionInfo.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, id, invoiceNumber, noteToPayee, payee, transactionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfo {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    noteToPayee: ").append(toIndentedString(noteToPayee)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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

