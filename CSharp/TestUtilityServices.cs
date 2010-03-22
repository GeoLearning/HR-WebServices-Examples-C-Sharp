/*
##########################################################
## GeoNext Project
##
## CONFIDENTIAL & PROPRIETARY
##
## Copyright (C) 2008 by Geolearning, Inc.
## All Rights Reserved.
##
## Written by Ryan Bergman
## 
##########################################################
*/
using System;
using System.Collections.Generic;
using System.Net;
using System.Xml;

namespace GeolearningSharpExample
{

    public class TestUtilityServices
    {
        private readonly WebServices geoWS;
        public string username;
        public string password;
        public string host;
        public static XmlDocument config;

        public TestUtilityServices()
        {
            config = new XmlDocument();
            config.Load("Settings.xml");
  
            geoWS = new WebServices();
            host = getSetting("/settings/connection/url"); 
            username = getSetting("/settings/connection/username");
            password = getSetting("/settings/connection/password");
            
            geoWS.Url = host;
            

            geoWS.Credentials = new System.Net.NetworkCredential(username, password);

            Console.WriteLine("*************************");
            Console.WriteLine("Initilize Successfull!");
            Console.WriteLine("Host:" + host);
            Console.WriteLine("Username:" + username);
            Console.WriteLine("Password:" + password);
            Console.WriteLine("*************************");
        }

        public string getSetting(string xmlPath) {
            try{
            return config.SelectSingleNode(xmlPath).InnerText;
                }catch(NullReferenceException) {
                    throw new Exception("You refrenced a XML element in settings that did not exist. Check your path.");
                }
        }


        public User GetNewRandomUser()
        {
            User newUser = geoWS.GenerateUserObject();
            string newusername = GetRandomString();
            newUser.UserName = newusername;
            newUser.Password = getSetting("/settings/user/password"); 
            
            newUser.FirstName = "John";
            newUser.MiddleInitial = "Q";
            newUser.LastName = "Jinglehimershmitz";
            newUser.Email = newusername + "@geolearning.com";

            string roleToAssign = getSetting("/settings/user/role");
            newUser.RoleNames = new String[] { roleToAssign };
            newUser.DefaultRoleName = roleToAssign;
            newUser.UniqueId = newusername;
            return newUser;
        }

        public User GetNewFullyLoadedUser() {
            User newUser = GetNewRandomUser();

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
           
            DateTime birthDate = new DateTime(1988, 02, 26);
            newUser.BirthDate = birthDate;
            newUser.SocialSecurityNumber = "555-55-5555";

            newUser.EHRIEmployeeID = "1234";
            newUser.AgencySubElementCode = "AB00";


            newUser.LocationName = getSetting("/settings/user/location");
            newUser.StartDate = DateTime.Now.AddDays(-10);

            // supervisor names are stored in a ArrayOfString. we will use the user we are connecting with because he obviously exists.
            newUser.SupervisorUserNames = new String[] { username };

            // Groups are mostly the same but in this case we are dealing with the group object which
            // also needs to come out of the stubs. 
            // 
            // At this time all groups fall under a hierarchy. The "name" will represent
            // the full path to the group, seperated by slashes down the tree.
            Group group = new Group();
            group.Name = getSetting("/settings/user/group");
            newUser.Groups = new Group[] { group };

            // and the custom user attributes. Remember that these would need to have already been created in the system.
            CustomUserAttribute cua = new CustomUserAttribute();
            cua.Name = getSetting("/settings/user/cua/name");
            cua.Value = getSetting("/settings/user/cua/value");
            newUser.CustomUserAttributes = new CustomUserAttribute[] { cua };

            CustomUserAttribute existingCUSA = new CustomUserAttribute();
            existingCUSA.Name = getSetting("/settings/user/cusa/name");
            existingCUSA.Value = getSetting("/settings/user/cusa/value");
            newUser.CustomSelectUserAttributes = new CustomUserAttribute[] { existingCUSA };

            // now some Catalog Access Codes.
            newUser.CatalogAccessCodeNames = new string[] { getSetting("/settings/user/cac") };

            return newUser;
        }

        public User GetRandomUserWithCUASet() {
            User newUser = GetNewRandomUser();
            newUser.CustomSelectUserAttributes = GetCUASelectSet();
            newUser.CustomUserAttributes = GetCUASet();
            return newUser;
        }

        public string GetRandomString()
        {
            return Guid.NewGuid().ToString();
        }

        public void PrintErrorsAndWarnings(Result result)
        {

            if(result.Errors.Length == 0 && result.Warnings.Length == 0) {
                Console.WriteLine("No Errors or Warnings found");
            }else{
                foreach (string error in result.Errors)
                {
                    Console.WriteLine("ERROR: " + error);
                }
                foreach (string warning in result.Warnings)
                {
                    Console.WriteLine("WARNING: " + warning);
                }
            }
        }

        public bool SearchResultsForString(Result result, string searchString)
        {
            String[] warningsanderrors = new string[result.Errors.Length + result.Warnings.Length];
            result.Errors.CopyTo(warningsanderrors, 0);
            result.Warnings.CopyTo(warningsanderrors, result.Errors.Length);

            foreach (string line in warningsanderrors)
            {
                if (line.Equals(searchString))
                {
                    return true;
                }
            }
            return false;
        }

        public WebServices GetWSConnection()
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
            Console.WriteLine("EHRI Employee ID:" + user.EHRIEmployeeID);
            Console.WriteLine("Agency Sub Elment Code:" + user.AgencySubElementCode);
            Console.WriteLine("Birth Date:" + user.BirthDate);
            Console.WriteLine("SSN:" + user.SocialSecurityNumber);
            Console.WriteLine("Language:" + user.Language);
            Console.WriteLine("Time Zone:" + user.TimeZone);

            Console.WriteLine("Default Role: " + user.DefaultRoleName);
            foreach (string thisRole in user.RoleNames) {
                Console.WriteLine("Role: "+ thisRole);
            }

            foreach (string supervisor in user.SupervisorUserNames) {
                Console.WriteLine("Supervisor: " + supervisor);
            }

            foreach (CustomUserAttribute CUSA in user.CustomSelectUserAttributes) {
                Console.WriteLine("CUSA: " + CUSA);
            }

            foreach (CustomUserAttribute CUA in user.CustomUserAttributes) {
                Console.WriteLine("CUA: " + CUA);
            }

            foreach (Group thisGroup in user.Groups) {
                Console.WriteLine("Group: " + thisGroup.Name);
            }
            
            foreach (string cac in user.CatalogAccessCodeNames) {
                Console.WriteLine("CAC: " + cac);
            }
        }

        public CustomUserAttribute[] GetCUASet()
        {
            IList<String> CUAList = new List<String>();
            CUAList.Add("A");
            CUAList.Add("B");
            CUAList.Add("C");
            CUAList.Add("D");
            CUAList.Add("E");
            CUAList.Add("F");
            CUAList.Add("G");
            CUAList.Add("H");
            CUAList.Add("I");
            CUAList.Add("J");
            CUAList.Add("K");
            CUAList.Add("L");

            CustomUserAttribute[] CUAs = new CustomUserAttribute[12];
            int ArrayPos = 0;

            foreach (String letter in CUAList) {
     
                CustomUserAttribute CUA = new CustomUserAttribute();
                CUA.Name = letter;
                CUA.Value = Guid.NewGuid().ToString();
                CUAs.SetValue(CUA, ArrayPos);
                ArrayPos++;
            }

            return CUAs;
        }


        public CustomUserAttribute[] GetCUASelectSet()
        {
            IList<String> CUAList = new List<String>();
            CUAList.Add("M");
            CUAList.Add("N");
            CUAList.Add("O");
            CUAList.Add("P");
            CUAList.Add("Q");
            CUAList.Add("R");
            CUAList.Add("S");
            CUAList.Add("T");
            CUAList.Add("U");
            CUAList.Add("V");
            CUAList.Add("W");
            CUAList.Add("X");
            CUAList.Add("Y");
            CUAList.Add("Z");

            CustomUserAttribute[] CUAs = new CustomUserAttribute[14];
            Random RandomClass = new Random();
            int ArrayPos = 0;

            foreach (String letter in CUAList)
            {
                CustomUserAttribute CUA = new CustomUserAttribute();
                CUA.Name = letter;
                int RandomNumber = RandomClass.Next(1, 9);
                CUA.Value = RandomNumber.ToString();
                CUAs.SetValue(CUA,ArrayPos);
                ArrayPos++;
            }

            return CUAs;
        }
    }


}
