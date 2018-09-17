package com.bytatech.ayoos.patientapigateway.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.Symptom;
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
 * ConsultationInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-17T16:20:18.161+05:30[Asia/Kolkata]")

public class ConsultationInfo   {
  @JsonProperty("height")
  private Float height = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("symptoms")
  @Valid
  private List<Symptom> symptoms = null;

  @JsonProperty("weight")
  private Float weight = null;

  public ConsultationInfo height(Float height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }

  public ConsultationInfo id(Long id) {
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

  public ConsultationInfo symptoms(List<Symptom> symptoms) {
    this.symptoms = symptoms;
    return this;
  }

  public ConsultationInfo addSymptomsItem(Symptom symptomsItem) {
    if (this.symptoms == null) {
      this.symptoms = new ArrayList<Symptom>();
    }
    this.symptoms.add(symptomsItem);
    return this;
  }

  /**
   * Get symptoms
   * @return symptoms
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Symptom> getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(List<Symptom> symptoms) {
    this.symptoms = symptoms;
  }

  public ConsultationInfo weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultationInfo consultationInfo = (ConsultationInfo) o;
    return Objects.equals(this.height, consultationInfo.height) &&
        Objects.equals(this.id, consultationInfo.id) &&
        Objects.equals(this.symptoms, consultationInfo.symptoms) &&
        Objects.equals(this.weight, consultationInfo.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, symptoms, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultationInfo {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symptoms: ").append(toIndentedString(symptoms)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

