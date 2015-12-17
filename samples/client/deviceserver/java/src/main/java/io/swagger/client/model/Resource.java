package io.swagger.client.model;

import io.swagger.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-16T11:31:51.462-06:00")
public class Resource   {
  
  private String uri = null;
  private String rt = null;
  private String type = null;
  private Boolean obs = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rt")
  public String getRt() {
    return rt;
  }
  public void setRt(String rt) {
    this.rt = rt;
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
  @JsonProperty("obs")
  public Boolean getObs() {
    return obs;
  }
  public void setObs(Boolean obs) {
    this.obs = obs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(uri, resource.uri) &&
        Objects.equals(rt, resource.rt) &&
        Objects.equals(type, resource.type) &&
        Objects.equals(obs, resource.obs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, rt, type, obs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    rt: ").append(StringUtil.toIndentedString(rt)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    obs: ").append(StringUtil.toIndentedString(obs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
