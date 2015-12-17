


//export module
if ( typeof define === "function" && define.amd ) {     
	define('ErrorModel', ['jquery'], 
		function($) {
        return ErrorModel;
	 });
}


var ErrorModel = function ErrorModel(message, code) { 
  	var self = this;
  	
  	/**
	  * datatype: Integer
	  * required
	  **/
	  self.code = code;
	 
  	/**
	  * datatype: String
	  * required
	  **/
	  self.message = message;
	 
  
  	self.constructFromObject = function(data) {
	  	
	  	self.code = data.code;
	  	
	  	self.message = data.message;
	  	
	}
  
  
  /**
   * @return {Integer}
   **/
  self.getCode = function() {
    return self.code;
  }
  
  /**
   * @param {Integer} code
   **/
  self.setCode = function (code) {
    self.code = code;
  }
  
  /**
   * @return {String}
   **/
  self.getMessage = function() {
    return self.message;
  }
  
  /**
   * @param {String} message
   **/
  self.setMessage = function (message) {
    self.message = message;
  }
  

  self.toJson = function () {
  	return JSON.stringify(self);
  }
}
