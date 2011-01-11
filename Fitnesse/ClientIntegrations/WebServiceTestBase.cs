using System.Net;
using ClientIntegrations;
using fitlibrary;


public class WebServiceTestBase : DoFixture
{
   

    public WebServices GeoMaestroServices { get; private set; }
    public Result Result { get; set;}
    public User LastCreatedUser { get; set;}

    public void CreateServiceWithUrlUserNamePassword(string url, string username, string password)
    {
        ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
        ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate; 

        GeoMaestroServices = new WebServices
                                 {
                                     Url = url,
                                     Credentials = new NetworkCredential(username, password)
                                 };

    }



    public WarninngResultValidator ResultsContainWarnings()
    {
        return new WarninngResultValidator(Result);
    }

    public ErrorsResultValidator ResultsContainErrors()
    {
        return new ErrorsResultValidator(Result);
    }

    public void Debug()
    {
        System.Diagnostics.Debugger.Launch();
    }


    public InspectUserRowFixture InspectLastUserCreated()
    {
        var reloadedUser = GeoMaestroServices.LoadUser(LastCreatedUser.UserName);
        return new InspectUserRowFixture(reloadedUser);
    }
}