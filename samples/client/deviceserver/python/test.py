#!/usr/bin/env python

"""A simple python script template.
"""

import os
import sys
sys.path.append(os.getcwd())
import swagger_client


def main():
    swagger_client.configuration.access_token = "H9YLC6RR89H01I62309O8JO3EBO8NSEQNFORLUUA"
    api_client = swagger_client.ApiClient()
    endpoint_api = swagger_client.EndpointApi(api_client)
    endpoints = endpoint_api.find_endpoints()


    if len(endpoints) > 0:
        for endpoint in endpoints:
           print('Endpoint: ' + endpoint.name)
           print('    Type: ' + endpoint.type)
           print('    Resources:')
           resources = endpoint_api.find_endpoint(endpoint.name)

           for resource in resources:
               print('          URI: ' + resource.uri)
               print('          Observable: %r' % resource.obs)
    else:
        print('No endpoints registered')

if __name__ == '__main__':
    sys.exit(main())
