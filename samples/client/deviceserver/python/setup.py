# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "swagger_client"
VERSION = "1.0.0"



# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.10", "six >= 1.9", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Swagger Petstore (Simple)",
    author_email="foo@example.com",
    url="http://swagger.io",
    keywords=["Swagger", "Swagger Petstore (Simple)"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification
    """
)


