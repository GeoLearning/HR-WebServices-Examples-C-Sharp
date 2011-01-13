/*
##########################################################
## CONFIDENTIAL & PROPRIETARY
## Copyright (C) 2004 - 2007 by Geolearning, Inc.
##########################################################
*/
using System;

namespace GeolearningSharpExample {
    public class GeolearningCSharpExample {
        private readonly TestUtilityServices testUtility;
        private readonly WebServices service;

        public GeolearningCSharpExample() {
            testUtility = new TestUtilityServices();
            service = testUtility.GetWsConnection();
        }
        
        protected String CreateNewUser() {
            Console.WriteLine("***CreateNewUser begin***");

            // Create a new user object
            var user = testUtility.GetNewFullyLoadedUser();
  
            Console.WriteLine("***creating new user: " + user.UserName + " ***");
            
            // finally, we can save the user. note that save and update user return a "result" object.
            // we can use that result to see messages and potential errors with our process.
            var userResult = service.CreateUser(user);

            testUtility.PrintErrorsAndWarnings(userResult);

            Console.WriteLine("***CreateNewUser end***");
            
            return user.UserName;
        }


        protected void UpdateUser(String userName) {
            Console.WriteLine("***UpdateUser begin***");

            var user = service.LoadUser(userName);
            user.City = "New " + user.City;

            var rolesTemp = new string[2];
            rolesTemp[0]=user.RoleNames.GetValue(0).ToString();
            rolesTemp[1]="Instructor";
            user.RoleNames = rolesTemp;
            
            var result = service.UpdateUser(user);

            testUtility.PrintErrorsAndWarnings(result);
            
            Console.WriteLine("***UpdateUser end***");
        }

        protected void LoadUser(String userName) {
            Console.WriteLine("***LoadUser begin***");

            var user = service.LoadUser(userName);

            testUtility.PrintUserObject(user);

            Console.WriteLine("***LoadUser end***");
        }

        public static void Main(string[] args) {
            try {
                var gcse = new GeolearningCSharpExample();
                var userName = gcse.CreateNewUser();
                gcse.UpdateUser(userName);
                gcse.LoadUser(userName);
            } catch (Exception e) {
                Console.WriteLine("Caught Exception: " + e.Message + " " + e.GetType().FullName);
            }
          
        }
    }
}