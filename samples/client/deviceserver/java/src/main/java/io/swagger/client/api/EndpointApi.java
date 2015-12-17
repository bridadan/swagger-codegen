package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.Endpoint;
import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.Resource;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-16T11:31:51.462-06:00")
public class EndpointApi {
  private ApiClient apiClient;

  public EndpointApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EndpointApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * Returns all endpoints
   * @param type Filter endpoints by endpoint-type
   * @return List<Endpoint>
   */
  public List<Endpoint> findEndpoints(String type) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/endpoints".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "type", type));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "accessKey" };

    

    
    
    TypeRef returnType = new TypeRef<List<Endpoint>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * 
   * Returns endpoint given be endpoingName
   * @param endpointName Endpoint name
   * @return List<Resource>
   */
  public List<Resource> findEndpoint(String endpointName) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'endpointName' is set
     if (endpointName == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointName' when calling findEndpoint");
     }
     
    // create path and map variables
    String path = "/endpoints/{endpointName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "endpointName" + "\\}", apiClient.escapeString(endpointName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "accessKey" };

    

    
    
    TypeRef returnType = new TypeRef<List<Resource>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
