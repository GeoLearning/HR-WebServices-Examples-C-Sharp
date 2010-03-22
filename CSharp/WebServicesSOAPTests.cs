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
using System.Net;
using System.Xml;
using NUnit.Framework;
using NUnit.Framework.SyntaxHelpers;

namespace GeolearningSharpExample {
	[TestFixture]
	public class SimpleInteractions {
		private WebServices geoWS;
		private TestUtilityServices utilities;

		[TestFixtureSetUp]
		public void SetUp() {
            ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
            ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate; 
            utilities = new TestUtilityServices();
			geoWS = utilities.GetWSConnection();
            
		}


		[Test]
		public void GetEmptyUserObject() {
			User myuser = geoWS.GenerateUserObject();
			Type theType = typeof(User);
			Assert.IsInstanceOfType(theType, myuser);
		}


		[Test]
		public void CanSaveNewUser() {
            User userToTest = utilities.GetNewFullyLoadedUser();
			Result myResult = geoWS.CreateUser(userToTest);
			Console.WriteLine("Attempting to create user: " + userToTest.UserName);
			utilities.PrintErrorsAndWarnings(myResult);
			Assert.AreEqual(0, myResult.Errors.Length);
		}

		[Test]
		public void CanLoadUser() {
			string usernameOfAuthenticatedPerson = utilities.username;
			User loadedUser = geoWS.LoadUser(usernameOfAuthenticatedPerson);
			Assert.AreEqual(usernameOfAuthenticatedPerson, loadedUser.UserName);
		}

		[Test]
		public void UserExists() {
			bool exists = geoWS.UserExists(utilities.username);
			Assert.IsTrue(exists);
		}

		[Test]
		public void UserDoesNoExists() {
			bool exists = geoWS.UserExists("021E9F08-C380-480e-B683-658A521E9BA9");
			Assert.IsFalse(exists);
		}
	}




	[TestFixture]
	public class WorkingWithExistingObjects {
		private WebServices geoWS;
		private TestUtilityServices utilities;
		private User reloadedUser;
		private User preSaveUser;
		public static XmlDocument config;

		[TestFixtureSetUp]
		public void SetUp() {
            ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
            ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate; 
			utilities = new TestUtilityServices();
			geoWS = utilities.GetWSConnection();
			preSaveUser = utilities.GetNewFullyLoadedUser();
            Console.WriteLine("Attempting to create user: " + preSaveUser.UserName);
            Result myResult = geoWS.CreateUser(preSaveUser);

			
			
			utilities.PrintErrorsAndWarnings(myResult);
			reloadedUser = geoWS.LoadUser(preSaveUser.UserName);
		}

		[Test]
		public void CanUpdateExistingUser() {
			Console.WriteLine("Attempting to update user: " + reloadedUser.UserName);
		    reloadedUser.FirstName = "Mel";
            Result myResult = geoWS.UpdateUser(reloadedUser);
			utilities.PrintErrorsAndWarnings(myResult);
			Assert.AreEqual(0, myResult.Errors.Length);


		    User reloadAgain = geoWS.LoadUser(reloadedUser.UserName);
            Assert.That(reloadAgain.FirstName, Is.EqualTo("Mel"));


		}

		[Test]
		public void Address1WasSaved() {
			Assert.AreEqual(preSaveUser.StreetAddress, reloadedUser.StreetAddress);
		}

		[Test]
		public void Address2WasSaved() {
			Assert.AreEqual(preSaveUser.StreetAddress2, reloadedUser.StreetAddress2);
		}

		[Test]
		public void PostalCodeWasSaved() {
			Assert.AreEqual(preSaveUser.PostalCode, reloadedUser.PostalCode);
		}

		[Test]
		public void PostalCodeTypeWasSaved() {
			Assert.AreEqual(preSaveUser.PostalCodeType, reloadedUser.PostalCodeType);
		}

		[Test]
		public void CityWasSaved() {
			Assert.AreEqual(preSaveUser.City, reloadedUser.City);
		}

		[Test]
		public void StateWasSaved() {
			//The state is aways returned as a long name rather than the short? hrmmm
			Assert.AreEqual(preSaveUser.State, reloadedUser.State);
		}

		[Test]
		public void CountryWasSaved() {
			Assert.AreEqual(preSaveUser.Country, reloadedUser.Country);
		}

		[Test]
		public void TelephoneWasSaved() {
			Assert.AreEqual(preSaveUser.Telephone, reloadedUser.Telephone);
		}

		[Test]
		public void ExtensionWasSaved() {
			Assert.AreEqual(preSaveUser.Extension, reloadedUser.Extension);
		}

		[Test]
		public void StartDateWasSaved() {
			Assert.AreEqual(preSaveUser.StartDate.ToShortDateString(), reloadedUser.StartDate.ToShortDateString());
		}

        

		[Test]
		public void CustomUserSelectAttributeWasSaved() {
			if (reloadedUser.CustomSelectUserAttributes.Length == 0) {
				Assert.Fail("No Custom Select User Attribute exists for user. Expected: " + preSaveUser.CustomSelectUserAttributes[0].Name + "/" + preSaveUser.CustomSelectUserAttributes[0].Value);
			} else {
				Assert.AreEqual(reloadedUser.CustomSelectUserAttributes[0].Name, preSaveUser.CustomSelectUserAttributes[0].Name);
				Assert.AreEqual(reloadedUser.CustomSelectUserAttributes[0].Value, preSaveUser.CustomSelectUserAttributes[0].Value);
			}
		}

		[Test]
		public void CustomUserAttributeWasSaved() {
			if (reloadedUser.CustomUserAttributes.Length == 0) {
				Assert.Fail("No CUA exists for user. Expected: " + preSaveUser.CustomUserAttributes[0].Name + "/" + preSaveUser.CustomUserAttributes[0].Value);
			} else {
				Assert.AreEqual(reloadedUser.CustomUserAttributes[0].Name, preSaveUser.CustomUserAttributes[0].Name);
				Assert.AreEqual(reloadedUser.CustomUserAttributes[0].Value, preSaveUser.CustomUserAttributes[0].Value);
			}
		}

		[Test]
		public void CatalogAccessCodeWasSaved() {
			if (reloadedUser.CatalogAccessCodeNames.Length == 0) {
				Assert.Fail("No Catalog Access Code exists for user. Expected: " + preSaveUser.CatalogAccessCodeNames[0]);
			} else {
				Assert.AreEqual(reloadedUser.CatalogAccessCodeNames[0], preSaveUser.CatalogAccessCodeNames[0]);
			}
		}

		[Test]
		public void SupervisorAssignmentWasSaved() {
			if (reloadedUser.SupervisorUserNames.Length == 0) {
				Assert.Fail("No Supervisor assignments found. Expected: " + preSaveUser.SupervisorUserNames[0]);
			}
			Assert.AreEqual(reloadedUser.SupervisorUserNames[0], preSaveUser.SupervisorUserNames[0]);
		}

		[Test]
		public void GroupAssignmentWasSaved() {
			if (reloadedUser.Groups.Length == 0) {
				Assert.Fail("No Groups are assigned to the user. Expected: " + preSaveUser.Groups[0].Name);
			} else {
				Assert.AreEqual(reloadedUser.Groups[0].Name, preSaveUser.Groups[0].Name);
			}
		}

		[Test]
		public void LocationWasSaved() {
			Assert.AreEqual(preSaveUser.LocationName, reloadedUser.LocationName);
		}

        [Test]
        public void LanguageWasSaved()
        {
            Assert.AreEqual(preSaveUser.Language, reloadedUser.Language);
        }

        [Test]
        public void TimeZoneWasSaved()
        {
            Assert.AreEqual(preSaveUser.TimeZone, reloadedUser.TimeZone);
        }
        
	}

    [TestFixture]
    public class UniqueIdTests
    {
        private WebServices geoWS;
        private TestUtilityServices utilities;
        private User reloadedUser;
        private User preSaveUser;
        public static XmlDocument config;

        [TestFixtureSetUp]
        public void SetUp()
        {
            ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
            ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate;
            utilities = new TestUtilityServices();
            geoWS = utilities.GetWSConnection();
            preSaveUser = utilities.GetNewFullyLoadedUser();
            Console.WriteLine("Attempting to create user: " + preSaveUser.UserName);
            Result myResult = geoWS.CreateUser(preSaveUser);

            utilities.PrintErrorsAndWarnings(myResult);
            reloadedUser = geoWS.LoadUserByUniqueId(preSaveUser.UniqueId);
            if (reloadedUser == null)
            {
                throw new Exception("User not returned.  Is the Unique Id set to required in the LMS?");
            }
        }

        [Test]
        public void UniqueIdWasSaved()
        {
            Assert.AreEqual(preSaveUser.UniqueId, reloadedUser.UniqueId);
        }

        [Test]
        public void DoesNotChangeUserNameToOneThatAlreadyExists()
        {
            reloadedUser.UserName = "geoadmin";
            reloadedUser.RoleNames = new string[] { "Supervisor" };

            Result result = geoWS.UpdateUser(reloadedUser);
            utilities.PrintErrorsAndWarnings(result);

            reloadedUser = geoWS.LoadUserByUniqueId(reloadedUser.UniqueId);

            Assert.That(reloadedUser.UserName, Is.Not.EqualTo("geoadmin"));
        }

        [Test]
        public void LMSTrimsUserName()
        {
            reloadedUser.UserName = "   " + reloadedUser.UserName + "   ";
            reloadedUser.RoleNames = new string[] { "Supervisor" };

            Result result = geoWS.UpdateUser(reloadedUser);
            utilities.PrintErrorsAndWarnings(result);

            reloadedUser = geoWS.LoadUserByUniqueId(reloadedUser.UniqueId);

            Assert.That(reloadedUser.UserName, Is.EqualTo(reloadedUser.UserName.Trim()));
        }
    }

	[TestFixture]
	public class ConfirmNonRequiredValidations {
		private WebServices geoWS;
		private TestUtilityServices utilities;
		private User invalidUser;
		private String randomstring;
		private Result result;

		[TestFixtureSetUp]
		public void SetUp() {
            ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
            ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate; 
			utilities = new TestUtilityServices();
			geoWS = utilities.GetWSConnection();
			invalidUser = utilities.GetNewRandomUser();
			randomstring = utilities.GetRandomString();

			invalidUser.Password = "A";

			invalidUser.DefaultRoleName = randomstring;
			invalidUser.RoleNames = new String[] { randomstring };
			invalidUser.SupervisorUserNames = new String[] { randomstring };

			Group badGroup = new Group();
			badGroup.Name = randomstring;
			invalidUser.Groups = new Group[] { badGroup };

			CustomUserAttribute badCUA = new CustomUserAttribute();
			badCUA.Name = randomstring;
			badCUA.Value = randomstring;
			invalidUser.CustomSelectUserAttributes = new CustomUserAttribute[] { badCUA };
			invalidUser.CustomUserAttributes = new CustomUserAttribute[] { badCUA };

			invalidUser.CatalogAccessCodeNames = new String[] { randomstring };

            invalidUser.Language = randomstring;

		    invalidUser.TimeZone = randomstring;

			result = geoWS.CreateUser(invalidUser);
			//utilities.PrintErrorsAndWarnings(result);
		}

		[Test]
		public void FailOnNoDefaultRole() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'Default Role' is null."));
		}

		[Test]
		public void FailOnNoValidRoles() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'Roles' contains no valid values."));
		}

		[Test]
		public void FailOnInvalidSupervisor() {
			string expectedError = "Supervisor: '" + randomstring + "' does not exist.";
			Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
		}

		[Test]
		public void FailOnInvalidGroup() {
			string expectedError = "Group: '" + randomstring + "' does not exist.";
			Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
		}

		[Test]
		public void FailOnInvalidCUA() {
			string expectedError = "Custom User Attribute: '" + randomstring + "' does not exist.";
			Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
		}

		[Test]
		public void FailOnInvalidCSUA() {
			string expectedError = "Custom Select User Attribute: " + randomstring + " does not exist.";
			Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
		}

		[Test]
		public void FailOnInvalidCatalogAccessCode() {
			string expectedError = "Catalog Access Code: " + randomstring + " does not exist.";
			Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
		}

        [Test]
        public void FailOnInvalidCultureCode()
        {
            string expectedError = "Language Code: " + randomstring + " does not exist.";
            Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
        }

        [Test]
        public void FailOnInvalidTimeZone()
        {
            string expectedError = "Time Zone: " + randomstring + " does not exist.";
            Assert.IsTrue(utilities.SearchResultsForString(result, expectedError));
        }

	}

	[TestFixture]
	public class ConfirmRequiredValidations {
		private WebServices geoWS;
		private TestUtilityServices utilities;
		private User invalidUser;
		private Result result;

		[TestFixtureSetUp]
		public void TestFixtureSetUp() {
            ICertificateValidator certificateValidator = new AlwaysValidCertificateValidator();
            ServicePointManager.ServerCertificateValidationCallback = certificateValidator.Validate; 
			utilities = new TestUtilityServices();
			geoWS = utilities.GetWSConnection();
			invalidUser = geoWS.GenerateUserObject();
			result = geoWS.CreateUser(invalidUser);

			//utilities.PrintErrorsAndWarnings(result);
		}

		[Test]
		public void FailOnNoFirstName() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'First Name' must be specified."));
		}

		[Test]
		public void FailOnNoLastName() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'Last Name' must be specified."));
		}

		[Test]
		public void FailOnNoUserName() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'User Name' must be specified."));
		}

		[Test]
		public void FailOnNoRoles() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'Roles' contains no valid values."));
		}

		[Test]
		public void FailOnNoDefaultRole() {
			Assert.IsTrue(utilities.SearchResultsForString(result, "'Default Role' is null."));
		}
	}
}