using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

namespace ClientIntegrations
{
    public class AlwaysValidCertificateValidator : ICertificateValidator
    {
        public virtual bool Validate(object sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors)
        {
            return true;
        }
    }
}