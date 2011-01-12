using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

namespace GeolearningSharpExample
{
    public interface ICertificateValidator
    {
        bool Validate(object sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors);
    }

    public class AlwaysValidCertificateValidator : ICertificateValidator
    {
        public virtual bool Validate(object sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors)
        {
            return true;
        }
    }
}