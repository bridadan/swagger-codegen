


//export module
if ( typeof define === "function" && define.amd ) {     
	define('Endpoint', ['jquery'], 
		function($) {
        return Endpoint;
	 });
}


var Endpoint = function Endpoint(status, name, type) { 
  	var self = this;
  	
  	/**
	  * datatype: String
	  * required
	  **/
	  self.name = name;
	 
  	/**
	  * datatype: String
	  * required
	  **/
	  self.type = type;
	 
  	/**
	  * datatype: String
	  * required
	  **/
	  self.status = status;
	 
  	/**
	  * datatype: Boolean
	  **/
	  self.q = null;
	 
  
  	self.constructFromObject = function(data) {
	  	
	  	self.name = data.name;
	  	
	  	self.type = data.type;
	  	
	  	self.status = data.status;
	  	
	  	self.q = data.q;
	  	
	}
  
  
  /**
   * @return {String}
   **/
  self.getName = function() {
    return self.name;
  }
  
  /**
   * @param {String} name
   **/
  self.setName = function (name) {
    self.name = name;
  }
  
  /**
   * @return {String}
   **/
  self.getType = function() {
    return self.type;
  }
  
  /**
   * @param {String} type
   **/
  self.setType = function (type) {
    self.type = type;
  }
  
  /**
   * @return {String}
   **/
  self.getStatus = function() {
    return self.status;
  }
  
  /**
   * @param {String} status
   **/
  self.setStatus = function (status) {
    self.status = status;
  }
  
  /**
   * @return {Boolean}
   **/
  self.getQ = function() {
    return self.q;
  }
  
  /**
   * @param {Boolean} q
   **/
  self.setQ = function (q) {
    self.q = q;
  }
  

  self.toJson = function () {
  	return JSON.stringify(self);
  }
}
