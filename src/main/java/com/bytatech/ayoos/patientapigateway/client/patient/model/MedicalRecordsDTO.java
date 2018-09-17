package com.bytatech.ayoos.patientapigateway.client.patient.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MedicalRecordsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

public class MedicalRecordsDTO   {
  @JsonProperty("diseaseName")
  private String diseaseName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  public MedicalRecordsDTO diseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
    return this;
  }

  /**
   * Get diseaseName
   * @return diseaseName
  **/
  @ApiModelProperty(value = "")


  public String getDiseaseName() {
    return diseaseName;
  }

  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }

  public MedicalRecordsDTO id(Long id) {
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

  public MedicalRecordsDTO patientId(Long patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * Get patientId
   * @return patientId
  **/
  @ApiModelProperty(value = "")


  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedicalRecordsDTO medicalRecordsDTO = (MedicalRecordsDTO) o;
    return Objects.equals(this.diseaseName, medicalRecordsDTO.diseaseName) &&
        Objects.equals(this.id, medicalRecordsDTO.id) &&
        Objects.equals(this.patientId, medicalRecordsDTO.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diseaseName, id, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalRecordsDTO {\n");
    
    sb.append("    diseaseName: ").append(toIndentedString(diseaseName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
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

