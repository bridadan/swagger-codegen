module Petstore
  class Endpoint < BaseObject
    attr_accessor :name, :type, :status, :q

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        
        :'name' => :'name',
        
        :'type' => :'type',
        
        :'status' => :'status',
        
        :'q' => :'q'
        
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'name' => :'String',
        :'type' => :'String',
        :'status' => :'String',
        :'q' => :'BOOLEAN'
        
      }
    end

    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'name']
        self.name = attributes[:'name']
      end
      
      if attributes[:'type']
        self.type = attributes[:'type']
      end
      
      if attributes[:'status']
        self.status = attributes[:'status']
      end
      
      if attributes[:'q']
        self.q = attributes[:'q']
      end
      
    end

    # Check equality by comparing each attribute.
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          name == o.name &&
          type == o.type &&
          status == o.status &&
          q == o.q
    end

    # @see the `==` method
    def eql?(o)
      self == o
    end

    # Calculate hash code according to all attributes.
    def hash
      [name, type, status, q].hash
    end
  end
end
