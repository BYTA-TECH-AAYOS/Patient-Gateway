package com.bytatech.ayoos.patientapigateway.client.patient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NoteDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

public class NoteDTO   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("medicalRecordsId")
  private Long medicalRecordsId = null;

  public NoteDTO description(String description) {
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

  public NoteDTO id(Long id) {
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

  public NoteDTO medicalRecordsId(Long medicalRecordsId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteDTO noteDTO = (NoteDTO) o;
    return Objects.equals(this.description, noteDTO.description) &&
        Objects.equals(this.id, noteDTO.id) &&
        Objects.equals(this.medicalRecordsId, noteDTO.medicalRecordsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, medicalRecordsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medicalRecordsId: ").append(toIndentedString(medicalRecordsId)).append("\n");
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

