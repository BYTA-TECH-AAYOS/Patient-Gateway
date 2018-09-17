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
 * ContactInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

public class ContactInfoDTO   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("facebookURL")
  private String facebookURL = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("twitterURL")
  private String twitterURL = null;

  @JsonProperty("websiteURL")
  private String websiteURL = null;

  public ContactInfoDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactInfoDTO facebookURL(String facebookURL) {
    this.facebookURL = facebookURL;
    return this;
  }

  /**
   * Get facebookURL
   * @return facebookURL
  **/
  @ApiModelProperty(value = "")


  public String getFacebookURL() {
    return facebookURL;
  }

  public void setFacebookURL(String facebookURL) {
    this.facebookURL = facebookURL;
  }

  public ContactInfoDTO id(Long id) {
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

  public ContactInfoDTO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ContactInfoDTO twitterURL(String twitterURL) {
    this.twitterURL = twitterURL;
    return this;
  }

  /**
   * Get twitterURL
   * @return twitterURL
  **/
  @ApiModelProperty(value = "")


  public String getTwitterURL() {
    return twitterURL;
  }

  public void setTwitterURL(String twitterURL) {
    this.twitterURL = twitterURL;
  }

  public ContactInfoDTO websiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
    return this;
  }

  /**
   * Get websiteURL
   * @return websiteURL
  **/
  @ApiModelProperty(value = "")


  public String getWebsiteURL() {
    return websiteURL;
  }

  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfoDTO contactInfoDTO = (ContactInfoDTO) o;
    return Objects.equals(this.email, contactInfoDTO.email) &&
        Objects.equals(this.facebookURL, contactInfoDTO.facebookURL) &&
        Objects.equals(this.id, contactInfoDTO.id) &&
        Objects.equals(this.phoneNumber, contactInfoDTO.phoneNumber) &&
        Objects.equals(this.twitterURL, contactInfoDTO.twitterURL) &&
        Objects.equals(this.websiteURL, contactInfoDTO.websiteURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, facebookURL, id, phoneNumber, twitterURL, websiteURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfoDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    facebookURL: ").append(toIndentedString(facebookURL)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    twitterURL: ").append(toIndentedString(twitterURL)).append("\n");
    sb.append("    websiteURL: ").append(toIndentedString(websiteURL)).append("\n");
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

