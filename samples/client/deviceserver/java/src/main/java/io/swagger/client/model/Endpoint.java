package io.swagger.client.model;

import io.swagger.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-16T11:31:51.462-06:00")
public class Endpoint   {
  
  private String name = null;
  private String type = null;
  private String status = null;
  private Boolean q = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("q")
  public Boolean getQ() {
    return q;
  }
  public void setQ(Boolean q) {
    this.q = q;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(name, endpoint.name) &&
        Objects.equals(type, endpoint.type) &&
        Objects.equals(status, endpoint.status) &&
        Objects.equals(q, endpoint.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, status, q);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    q: ").append(StringUtil.toIndentedString(q)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
