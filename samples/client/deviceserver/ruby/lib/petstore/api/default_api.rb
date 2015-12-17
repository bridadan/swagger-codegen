require "uri"

module Petstore
  class DefaultApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # 
    # Returns all endpoints
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type Filter endpoints by endpoint-type
    # @return [Array<endpoint>]
    def find_endpoints(opts = {})
      data, status_code, headers = find_endpoints_with_http_info(opts)
      return data
    end

    # 
    # Returns all endpoints
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type Filter endpoints by endpoint-type
    # @return [Array<(Array<endpoint>, Fixnum, Hash)>] Array<endpoint> data, response status code and response headers
    def find_endpoints_with_http_info(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: DefaultApi#find_endpoints ..."
      end
      
      # resource path
      path = "/endpoints".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'type'] = opts[:'type'] if opts[:'type']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<endpoint>')
      if Configuration.debugging
        Configuration.logger.debug "API called: DefaultApi#find_endpoints\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end




