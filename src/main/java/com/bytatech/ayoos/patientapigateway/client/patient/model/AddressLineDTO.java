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
 * AddressLineDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

public class AddressLineDTO   {
  @JsonProperty("contactInfoId")
  private Long contactInfoId = null;

  @JsonProperty("countryId")
  private Long countryId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("locationId")
  private Long locationId = null;

  @JsonProperty("streetOrHouseNumber")
  private String streetOrHouseNumber = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public AddressLineDTO contactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
    return this;
  }

  /**
   * Get contactInfoId
   * @return contactInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getContactInfoId() {
    return contactInfoId;
  }

  public void setContactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
  }

  public AddressLineDTO countryId(Long countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
  **/
  @ApiModelProperty(value = "")


  public Long getCountryId() {
    return countryId;
  }

  public void setCountryId(Long countryId) {
    this.countryId = countryId;
  }

  public AddressLineDTO id(Long id) {
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

  public AddressLineDTO locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public AddressLineDTO streetOrHouseNumber(String streetOrHouseNumber) {
    this.streetOrHouseNumber = streetOrHouseNumber;
    return this;
  }

  /**
   * Get streetOrHouseNumber
   * @return streetOrHouseNumber
  **/
  @ApiModelProperty(value = "")


  public String getStreetOrHouseNumber() {
    return streetOrHouseNumber;
  }

  public void setStreetOrHouseNumber(String streetOrHouseNumber) {
    this.streetOrHouseNumber = streetOrHouseNumber;
  }

  public AddressLineDTO zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressLineDTO addressLineDTO = (AddressLineDTO) o;
    return Objects.equals(this.contactInfoId, addressLineDTO.contactInfoId) &&
        Objects.equals(this.countryId, addressLineDTO.countryId) &&
        Objects.equals(this.id, addressLineDTO.id) &&
        Objects.equals(this.locationId, addressLineDTO.locationId) &&
        Objects.equals(this.streetOrHouseNumber, addressLineDTO.streetOrHouseNumber) &&
        Objects.equals(this.zipCode, addressLineDTO.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfoId, countryId, id, locationId, streetOrHouseNumber, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressLineDTO {\n");
    
    sb.append("    contactInfoId: ").append(toIndentedString(contactInfoId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    streetOrHouseNumber: ").append(toIndentedString(streetOrHouseNumber)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

