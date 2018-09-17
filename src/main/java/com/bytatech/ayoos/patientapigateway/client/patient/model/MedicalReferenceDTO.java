package com.bytatech.ayoos.patientapigateway.client.patient.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MedicalReferenceDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

public class MedicalReferenceDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("medicalRecordsId")
  private Long medicalRecordsId = null;

  @JsonProperty("reference")
  private String reference = null;

  public MedicalReferenceDTO id(Long id) {
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

  public MedicalReferenceDTO medicalRecordsId(Long medicalRecordsId) {
    this.medicalRecordsId = medicalRecordsId;
    return this;
  }

  /**
   * Get medicalRecordsId
   * @return medicalRecordsId
  **/
  @ApiModelProperty(value = "")


  public Long getMedicalRecordsId() {
    return medicalRecordsId;
  }

  public void setMedicalRecordsId(Long medicalRecordsId) {
    this.medicalRecordsId = medicalRecordsId;
  }

  public MedicalReferenceDTO reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedicalReferenceDTO medicalReferenceDTO = (MedicalReferenceDTO) o;
    return Objects.equals(this.id, medicalReferenceDTO.id) &&
        Objects.equals(this.medicalRecordsId, medicalReferenceDTO.medicalRecordsId) &&
        Objects.equals(this.reference, medicalReferenceDTO.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medicalRecordsId, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalReferenceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medicalRecordsId: ").append(toIndentedString(medicalRecordsId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

