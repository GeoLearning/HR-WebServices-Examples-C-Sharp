
using System;
using System.IO;
using System.Net;
using System.Xml;

public class WsdlHasNotChangedTest : WebServiceTestBase
{
    public bool TheCurrentWsdlonTheServerMatchesTheLastKnownGoodWsdl()
    {
        var lastKnownGoodWsdl = new XmlDocument();
        lastKnownGoodWsdl.Load("geonext.wsdl");

        var remoteWsdl = GetWsdlFromServer();

        return lastKnownGoodWsdl.InnerXml == remoteWsdl.InnerXml;
    }

    private XmlDocument GetWsdlFromServer()
    {
        var request = WebRequest.Create(GeoMaestroServices.Url);
        request.Credentials = GeoMaestroServices.Credentials;
        var response = request.GetResponse();
        
        String content;
        using (var reader = new StreamReader(response.GetResponseStream()))
        {
            content = reader.ReadToEnd();
        }

        string remoteUrl = GeoMaestroServices.Url.Replace("?wsdl", "");
        content = content.Replace(remoteUrl,"https://localhost/geonext/webservices/geonext.asmx");

        var remoteWsdl = new XmlDocument();
        remoteWsdl.LoadXml(content);
        return remoteWsdl;
    }
}
