using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

namespace ClientIntegrations
{
    public interface ICertificateValidator
    {
        bool Validate(object sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors);
    }
}