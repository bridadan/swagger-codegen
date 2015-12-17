/*
 * @javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavascriptClientCodegen", date = "2015-12-09T17:37:13.156-06:00")
 */

//export module
if ( typeof define === "function" && define.amd ) {     
	define(['jquery'], function($) {
        return DefaultApi;
	 });
}

var DefaultApi = function DefaultApi() {
	var self = this;
  
  /**
   * 
   * Returns all endpoints
   * @param {String}  type Filter endpoints by endpoint-type
   * @param {function} callback the callback function
   * @return Array
   */
  self.findEndpoints = function(type, callback) {
    
    var postBody = null;
    var postBinaryBody = null;
    
    // create path and map variables
    var basePath = 'https://api.connector.mbed.com/';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
	var path = basePath + replaceAll(replaceAll("/endpoints", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    queryParams.type = type;
    
    
    

	path += createQueryString(queryParams);

	//if (console) {
		//console.log('path: ' + path);
		//console.log('queryParams: ' + queryParams);
	//}

    

    
    
    //TypeRef returnType = new TypeRef<Array>() {};
    //return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
	var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);
    //request.fail(function(jqXHR, textStatus, errorThrown){
    //    errorHandler(jqXHR, textStatus, errorThrown);
    //});
    
		
	request.done(function(response, textStatus, jqXHR){
		/**
		  * @returns Array
		  */
		
		 var myResponse = new  Array();
		myResponse.constructFromObject(response);
		
    	callback(myResponse, textStatus, jqXHR);
	});
    
    
    


  }
  


 	function replaceAll (haystack, needle, replace) {
		var result= haystack;
		if (needle !=null && replace!=null) {
			result= haystack.replace(new RegExp(needle, 'g'), replace);
		}
		return result;
	}

 	function createQueryString (queryParams) {
		var queryString ='';
		var i = 0;
		for (var queryParamName in queryParams) {
			if (i==0) {
				queryString += '?' ;
			} else {
				queryString += '&' ;
			}
			
			queryString +=  queryParamName + '=' + encodeURIComponent(queryParams[queryParamName]);
			i++;
		}
		
		return queryString;
	}
}
