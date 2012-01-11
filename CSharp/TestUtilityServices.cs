/*
##########################################################
## CONFIDENTIAL & PROPRIETARY
## Copyright (C) 2008 by Geolearning, Inc.
## All Rights Reserved.
##########################################################
*/
using System;

namespace GeolearningSharpExample
{
    public class TestUtilityServices
    {
        private readonly WebServices geoWS;

        public TestUtilityServices()
        {
            const string username = "geoadmin";
            const string password = "";
            
            geoWS = new WebServices
                        {
                            Url = "http://localhost/geonext/webservices/geonext.asmx",
                            Credentials = new System.Net.NetworkCredential(username, password)
                        };


            Console.WriteLine("*************************");
            Console.WriteLine("Initilize Successfull!");
            Console.WriteLine("Host:" + geoWS.Url);
            Console.WriteLine("Username:" + username);
            Console.WriteLine("Password:" + password);
            Console.WriteLine("*************************");
        }


        public User GetNewFullyLoadedUser() {
            var newUser = geoWS.GenerateUserObject();
            string newusername = Guid.NewGuid().ToString();
            newUser.UserName = newusername;
            newUser.Password = "Password1!";

            newUser.FirstName = "John";
            newUser.MiddleInitial = "Q";
            newUser.LastName = "Jinglehimershmitz";
            newUser.Email = newusername + "@geolearning.com";
            newUser.ReceiveAutomatedEmails = false;

        
            newUser.RoleNames = new[] { "Administrator" };
            newUser.DefaultRoleName = "Administrator";
            newUser.UniqueId = newusername;
      

            newUser.StreetAddress = "4600 Westown Pkwy";
            newUser.StreetAddress2 = "Suite 301";
            newUser.City = "Des Moines";
            newUser.State = "IOWA";
            newUser.Country = "United States";
            newUser.Telephone = "555-555-1212";
            newUser.Extension = "234";
            // the postal code type is a enum. 
            newUser.PostalCodeType = PostalCodeType.US;
            newUser.PostalCode = "55512";
            newUser.UniqueId = newUser.UserName;
            newUser.Language = "en-US";
            newUser.DoChangePasswordNextLogin = "false";
            newUser.TimeZone = "America/Cayman";
           
            var birthDate = new DateTime(1988, 02, 26);
            newUser.BirthDate = birthDate;
            newUser.SocialSecurityNumber = "555-55-5555";

            newUser.EHRIEmployeeID = "1234";
            newUser.AgencySubElementCode = "AB00";
            

            newUser.LocationName = "Cocomo";
            newUser.StartDate = DateTime.Now.AddDays(-10);

            // supervisor names are stored in a ArrayOfString. we will use the user we are connecting with because he obviously exists.
            // If the directSupervisor name is not in the list of supervisors it will automatically be added.
            newUser.SupervisorUserNames = new[] { "SupervisorsUserName" };
            newUser.DirectSupervisorName = "SupervisorsUserName";

            // Groups are mostly the same but in this case we are dealing with the group object which
            // also needs to come out of the stubs. 
            // 
            // At this time all groups fall under a hierarchy. Code is the prefered way to load groups because it is always unique 
            // The "name" can also be used and will represent the full path to the group, seperated by slashes down the tree.
            var groupByPath = new Group
            {
                Code = "GroupCode"
            }; 
            
            var groupByNamePath = new Group
            {
                Name = "Group A/Child A/Child AA",
                IsDefault = true
            };

            
            newUser.Groups = new[] { groupByNamePath, groupByPath };

            // and the custom user attributes. Remember that these would need to have already been created in the system.
            var cua = new CustomUserAttribute
                          {
                              Name = "Job Title",
                              Value = "Developer"
                          };
            newUser.CustomUserAttributes = new[] { cua };

            var existingCUSA = new CustomUserAttribute
                                   {
                                       Name = "Hair Color",
                                       Value = "Pink"
                                   };
            newUser.CustomSelectUserAttributes = new[] { existingCUSA };

            // now some Catalog Access Codes.
            newUser.CatalogAccessCodeNames = new[] { "Code A", "Code B" };

            return newUser;
        }





        public void PrintErrorsAndWarnings(Result result)
        {

            if(result.Errors.Length == 0 && result.Warnings.Length == 0) {
                Console.WriteLine("No Errors or Warnings found");
            }else{
                foreach (var error in result.Errors)
                {
                    Console.WriteLine("ERROR: " + error);
                }
                foreach (var warning in result.Warnings)
                {
                    Console.WriteLine("WARNING: " + warning);
                }
            }
        }



        public WebServices GetWsConnection()
        {
            return geoWS;
        }

        public void PrintUserObject(User user) {
            Console.WriteLine("Username: " + user.UserName);
            Console.WriteLine("Geo ExternalID: " + user.ExternalId);
            Console.WriteLine("FirstName: " + user.FirstName);
            Console.WriteLine("Lastname: " + user.LastName);
            Console.WriteLine("MI: " + user.MiddleInitial);
            Console.WriteLine("Email: " + user.Email);
            Console.WriteLine("Location: " + user.LocationName);
            Console.WriteLine("Addr1: " + user.StreetAddress);
            Console.WriteLine("Addr2: " + user.StreetAddress2);
            Console.WriteLine("City: " + user.City);
            Console.WriteLine("State: " + user.State);
            Console.WriteLine("Country: " + user.Country);
            Console.WriteLine("Postal Code: " + user.PostalCode);
            Console.WriteLine("Postal Code Type: " + user.PostalCodeType);
            Console.WriteLine("Phone: " + user.Telephone);
            Console.WriteLine("Extention: " + user.Extension);
            Console.WriteLine("Start Date: " + user.StartDate);
            Console.WriteLine("EHRI Employee ID: " + user.EHRIEmployeeID);
            Console.WriteLine("Agency Sub Elment Code: " + user.AgencySubElementCode);
            Console.WriteLine("Birth Date: " + user.BirthDate);
            Console.WriteLine("SSN: " + user.SocialSecurityNumber);
            Console.WriteLine("Language: " + user.Language);
            Console.WriteLine("Time Zone: " + user.TimeZone);
            Console.WriteLine("Receive Automated Emails: " + user.ReceiveAutomatedEmails);

            Console.WriteLine("Default Role: " + user.DefaultRoleName);
            foreach (var thisRole in user.RoleNames) {
                Console.WriteLine("Role: "+ thisRole);
            }

            foreach (var supervisor in user.SupervisorUserNames) {
                Console.WriteLine("Supervisor: " + supervisor);
            }

            foreach (var cusa in user.CustomSelectUserAttributes) {
                Console.WriteLine("CUSA: " + cusa);
            }

            foreach (var cua in user.CustomUserAttributes) {
                Console.WriteLine("CUA: " + cua);
            }

            foreach (var thisGroup in user.Groups) {
                Console.WriteLine("Group: " + thisGroup.Name);
            }
            
            foreach (var cac in user.CatalogAccessCodeNames) {
                Console.WriteLine("CAC: " + cac);
            }
        }
    }
}
