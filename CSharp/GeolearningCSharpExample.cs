/*
##########################################################
## GeoNext Project
##
## CONFIDENTIAL & PROPRIETARY
##
## Copyright (C) 2004 - 2007 by Geolearning, Inc.
## All Rights Reserved.
##
## Written by Jeff Bartolotta
## 
##########################################################
*/
using System;

namespace GeolearningSharpExample {
    public class GeolearningCSharpExample {
        private readonly TestUtilityServices TESTUTILITY;
        private readonly WebServices SERVICE;

        public GeolearningCSharpExample() {
            TESTUTILITY = new TestUtilityServices();
            SERVICE = TESTUTILITY.GetWSConnection();
        }
        

        protected String createNewUser() {
            Console.WriteLine("***createNewUser begin***");

            // Create a new user object
            User user = TESTUTILITY.GetNewFullyLoadedUser();
  
            Console.WriteLine("***creating new user: " + user.UserName + " ***");
            
            // finally, we can save the user. note that save and update user return a "result" object.
            // we can use that result to see messages and potential errors with our process.
            UserResult userResult = SERVICE.CreateUser(user);

            TESTUTILITY.PrintErrorsAndWarnings(userResult);

            Console.WriteLine("***createNewUser end***");
            

            return user.UserName;
        }




        protected void updateUser(String userName) {
            Console.WriteLine("***updateUser begin***");


            User user = SERVICE.LoadUser(userName);
            user.City = "New " + user.City;

            string[] rolesTemp = new string[2];
            rolesTemp[0]=user.RoleNames.GetValue(0).ToString();
            rolesTemp[1]="Instructor";
            user.RoleNames = rolesTemp;
            
            Result result = SERVICE.UpdateUser(user);

            TESTUTILITY.PrintErrorsAndWarnings(result);
            
            Console.WriteLine("***updateUser end***");
        }

        protected void loadUser(String userName) {
            Console.WriteLine("***loadUser begin***");

            User user = SERVICE.LoadUser(userName);

            TESTUTILITY.PrintUserObject(user);

            Console.WriteLine("***loadUser end***");
        }

        public static void Main(string[] args) {
            try {
                GeolearningCSharpExample gcse = new GeolearningCSharpExample();
                String userName = gcse.createNewUser();
                gcse.updateUser(userName);
                gcse.loadUser(userName);
            } catch (Exception e) {
                Console.WriteLine("Caught Exception: " + e.Message + " " + e.GetType().FullName);
            }
            Console.ReadLine();
        }
    }
}