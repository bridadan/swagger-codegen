module Petstore
  class ErrorModel < BaseObject
    attr_accessor :code, :message

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        
        :'code' => :'code',
        
        :'message' => :'message'
        
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'code' => :'Integer',
        :'message' => :'String'
        
      }
    end

    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'code']
        self.code = attributes[:'code']
      end
      
      if attributes[:'message']
        self.message = attributes[:'message']
      end
      
    end

    # Check equality by comparing each attribute.
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          code == o.code &&
          message == o.message
    end

    # @see the `==` method
    def eql?(o)
      self == o
    end

    # Calculate hash code according to all attributes.
    def hash
      [code, message].hash
    end
  end
end
