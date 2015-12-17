# Common files
require 'petstore/api_client'
require 'petstore/api_error'
require 'petstore/version'
require 'petstore/configuration'

# Models
require 'petstore/models/base_object'
require 'petstore/models/endpoint'
require 'petstore/models/error_model'

# APIs
require 'petstore/api/default_api'

module Petstore
  class << self
    # Configure sdk using block.
    # Petstore.configure do |config|
    #   config.username = "xxx"
    #   config.password = "xxx"
    # end
    # If no block given, return the configuration singleton instance.
    def configure
      if block_given?
        yield Configuration.instance
      else
        Configuration.instance
      end
    end
  end
end
