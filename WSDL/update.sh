#!/bin/sh
############################################################################
# This script will update the wsdl and sample stubs. It assumes that wsdl.exe
# is on the path and that JAVA_HOME are set properly. It also assumes that
# it is being run on the same machine as IIS.
############################################################################
# Update the wsdl
wget http://localhost/geonext/webservices/geonext.asmx?WSDL --user=username --password=Password --output-document=GeoNext.wsdl --no-check-certificate
# Generate new C# 
#stubswsdl GeoNext.wsdl /out:../CSharp/

# Generate new Java stub../Java/src/com/geolearning/geonext/webservices/WebServicesWebServicesSoap * 
./axis/bin/wsdl2java.sh -uri GeoNext.wsdl -o ../Java/GeolearningJavaExample/
