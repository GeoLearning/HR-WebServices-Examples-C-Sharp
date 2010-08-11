
using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Xml;
using fit;
using fitlibrary;

public class WsdlHasNotChangedTest : WebServiceTestBase
{
    public ArrayFixture TheCurrentWsdlonTheServerMatchesTheLastKnownGoodWsdl()
    {
        var lastKnownGoodWsdl = new XmlDocument();
        lastKnownGoodWsdl.Load("geonext.wsdl");

        var remoteWsdl = GetWsdlFromServer();
		return new ResultRowFixture(GetChangeLog(lastKnownGoodWsdl.InnerXml, remoteWsdl.InnerXml));

    }

	public class DiffMessage
	{
		public DiffMessage(string message)
		{
			Message = message;
		}
		public string Message;
	}

	public ICollection GetChangeLog(string old, string newbie)
	{
		var position = 0;
		var result = new List<DiffMessage>();
	
		foreach (var s in old)
		{
			if(newbie[position] != s)
			{
				var orgLIne = old.Substring(0, position + 8);
				var difLine = newbie.Substring(0, position + 8);
				result.Add(new DiffMessage(string.Format("DIFF AT Position {0}!",position)));
				result.Add(new DiffMessage(string.Format("OLD: {0}", orgLIne)));
				result.Add(new DiffMessage(string.Format("NEW: {0}", difLine)));

				ConsoleIt(result);

				break;
			}
			position++;
		}

		return result;
	}

	private void ConsoleIt(List<DiffMessage> messages)
	{
		foreach (var message in messages)
		{
			Console.WriteLine(message.Message);
		}
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

public class ResultRowFixture : ArrayFixture
{
	public ResultRowFixture(ICollection theCollection) : base(theCollection)
	{
	}
}
