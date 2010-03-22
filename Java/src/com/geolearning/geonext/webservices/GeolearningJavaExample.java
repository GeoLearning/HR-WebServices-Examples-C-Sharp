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

package com.geolearning.geonext.webservices;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.Constants;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;


public class GeolearningJavaExample {
    private WebServicesWebServicesSoap12Stub SERVICE;

	
	
	
    public GeolearningJavaExample() {
    }

    
    
    
    

    protected void initialize() throws AxisFault {
        EndpointReference targetEPR = new EndpointReference("http://gm1.geolearning.com/geonext/geo_testing/webservices/geonext.asmx");

        HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
        auth.setUsername("The UserName Of a Admin");
        auth.setPassword("The Admins Password");
	auth.setPreemptiveAuthentication(true);
	    
        Options options = new Options();
        options.setProperty(HTTPConstants.AUTHENTICATE, auth);
        options.setTo(targetEPR);
        options.setTransportInProtocol(Constants.TRANSPORT_HTTP);

        SERVICE = new WebServicesWebServicesSoap12Stub();

        SERVICE._getServiceClient().setOptions(options);
    }


    
    
    
    
    
    

    protected void displayAttribute(String name, String value)  {
        System.out.println(name + ": " + value);
    }
    
    
    
    
    
    
    
    public String getRandomString(){
	UUID uuid = UUID.randomUUID();
       return uuid.randomUUID() .toString();
    }


    
    
    
    
    protected String createNewUser() throws RemoteException {
        System.out.println("***createNewUser begin***");

        String userName = getRandomString();
	System.out.println("Random username generated: " + userName);
	    
	//Check to see if the user already exists.    
	WebServicesWebServicesSoap12Stub.UserExists userExists = new WebServicesWebServicesSoap12Stub.UserExists();
        userExists.setUserName(userName);
	if(SERVICE.UserExists(userExists).getUserExistsResult()){
		System.out.println("By some crazy act of Thor the user already exists!");
		return userName;
	}
	    
	//Grab a empty shell user from the service 
	WebServicesWebServicesSoap12Stub.User user =SERVICE.GenerateUserObject(new WebServicesWebServicesSoap12Stub.GenerateUserObject()).getGenerateUserObjectResult();
	
	// First lets set all of the simple string values.
	// Then we will attack the complex types
	user.setUserName(userName);
	
	// You can either set a password that conforms to the sites password rules or you can not set the password and let the system generate one
	user.setPassword("Passsssword1!");
	user.setFirstName("John");
        user.setMiddleInitial("Q");
        user.setLastName("Public" );
        user.setEmail(userName + "@geolearning.com");
        user.setStreetAddress("1555 Pond Ln.");
        user.setCity("Des Moines");
        user.setState("IOWA");
        user.setCountry("UNITED STATES");
        user.setTelephone("555-555-1212");
        user.setExtension("234");
        user.setLocationName("QA_Location1");
        user.setStartDate(Calendar.getInstance());
       
	// the postal code type is a enum.
	user.setPostalCode("55512");
        user.setPostalCodeType(WebServicesWebServicesSoap12Stub.PostalCodeType.US);
	
	// Supervisor takes the username of the supervisors in a array of strings
	WebServicesWebServicesSoap12Stub.ArrayOfString supervisorNames = new WebServicesWebServicesSoap12Stub.ArrayOfString();
        supervisorNames.addString("Geo_Testing");
        user.setSupervisorUserNames(supervisorNames);
	
	// roles must be valid roles. Also Default role name must be in the list of roles already.
	user.setDefaultRoleName("Administrator");
        WebServicesWebServicesSoap12Stub.ArrayOfString roleNames = new WebServicesWebServicesSoap12Stub.ArrayOfString();
        roleNames.addString("Administrator");
        user.setRoleNames(roleNames);
	
	// Groups are mostly the same but in this case we are dealing with the group object which
	// also needs to come out of the stubs.
	//The "name" will represent the full path to the group, seperated by slashes down the tree.
        WebServicesWebServicesSoap12Stub.ArrayOfGroup arrayOfGroup = new WebServicesWebServicesSoap12Stub.ArrayOfGroup();
        WebServicesWebServicesSoap12Stub.Group group = new WebServicesWebServicesSoap12Stub.Group();
        group.setName("Tim's Group/My Test Group");
        arrayOfGroup.addGroup(group);
        user.setGroups(arrayOfGroup);
	
	// now some Catalog Access Codes.
        WebServicesWebServicesSoap12Stub.ArrayOfString catalogAccessCodeNames = new WebServicesWebServicesSoap12Stub.ArrayOfString();
        catalogAccessCodeNames.addString("CrazyCatalogAccessCode");
        user.setCatalogAccessCodeNames(catalogAccessCodeNames);
	
	// Custom User Attributes. emember that these would need to have already been created in the system.
	WebServicesWebServicesSoap12Stub.ArrayOfCustomUserAttribute arrayOfCustomUserAttribute = new WebServicesWebServicesSoap12Stub.ArrayOfCustomUserAttribute();
	WebServicesWebServicesSoap12Stub.CustomUserAttribute cua = new WebServicesWebServicesSoap12Stub.CustomUserAttribute();
	cua.setName("Rep ID");
        cua.setValue("8675309");
        arrayOfCustomUserAttribute.addCustomUserAttribute(cua);
        user.setCustomUserAttributes(arrayOfCustomUserAttribute);
	
	//Custom SELECT user attributes.
	arrayOfCustomUserAttribute = new WebServicesWebServicesSoap12Stub.ArrayOfCustomUserAttribute();
        cua = new WebServicesWebServicesSoap12Stub.CustomUserAttribute();
        cua.setName("Niko-Niko");
        cua.setValue("Sad");
        arrayOfCustomUserAttribute.addCustomUserAttribute(cua);
        user.setCustomSelectUserAttributes(arrayOfCustomUserAttribute);

	
	
	// finally, we can save the user. note that save and update user return a result object.
	// we can use that result to see messages and potential errors with our process.
	WebServicesWebServicesSoap12Stub.CreateUser createUser = new WebServicesWebServicesSoap12Stub.CreateUser();
        createUser.setUser(user);
	WebServicesWebServicesSoap12Stub.CreateUserResponse createUserResponse = SERVICE.CreateUser(createUser);
	WebServicesWebServicesSoap12Stub.UserResult userResult = createUserResponse.getCreateUserResult();
	printUserResult(userResult);
	
	//System.out.println(userName + "'s new Password is " + userResult.getDefaultPassword());

	return userName;
    }
    
    
    
    
    
    
    
    public void printUserResult(WebServicesWebServicesSoap12Stub.UserResult userResult){
	// ERRORS and WARNINGS
	// ************************************************************************
	//	   You would think that a Axis method called getString() would return a string
	//	   but you would be wrong. getString() actually returns a array of errors or warnings (which are strings)
	// ************************************************************************
	String[] errors = userResult.getErrors().getString();
        if (errors != null) {
            for (String error : errors) {
                System.out.println("ERROR: " + error);
            }
        } else {
            System.out.println("***No Errors Found***");
        }

        String[] warnings = userResult.getWarnings().getString();
        if (warnings != null) {
            for (String warning : warnings) {
                System.out.println("WARNING: " + warning);
            }
        } else {
            System.out.println("***No Warnings Found***");
        }
    }


    
    
    
    

    protected void updateUser(WebServicesWebServicesSoap12Stub.User user) throws RemoteException {
        System.out.println("***updateUser begin for " + user.getUserName() +" ***");

        user.setCity("New " + user.getCity());

        WebServicesWebServicesSoap12Stub.UpdateUser updateUser = new WebServicesWebServicesSoap12Stub.UpdateUser();
        updateUser.setUser(user);

        WebServicesWebServicesSoap12Stub.Result result = SERVICE.UpdateUser(updateUser).getUpdateUserResult();

        String[] errors = result.getErrors().getString();
        if (errors != null) {
            for (int j=0; j<errors.length; j++) {
                System.out.println("ERROR: " + errors[j]);
            }
        } else {
            System.out.println("***No errors found***");
        }

        String[] warnings = result.getWarnings().getString();
        if (warnings != null) {
            for (int j=0; j<warnings.length; j++) {
                System.out.println("WARNING: " + warnings[j]);
            }
        } else {
            System.out.println("***No warning found***");
        }

        System.out.println("***updateUser end***");
    }


    
    
    
    

    public WebServicesWebServicesSoap12Stub.User loadUser(String userName) throws RemoteException {
        System.out.println("***loadUser begin for " + userName + " ***");

        WebServicesWebServicesSoap12Stub.LoadUser loadUser = new WebServicesWebServicesSoap12Stub.LoadUser();
        loadUser.setUserName(userName);

        WebServicesWebServicesSoap12Stub.LoadUserResponse loadUserResponse = SERVICE.LoadUser(loadUser);
        WebServicesWebServicesSoap12Stub.User user = loadUserResponse.getLoadUserResult();
	
	if(user != null){
		System.out.println("***User Found!***");
		PrintUserRecord(user);
	}else{
		System.out.println("***User Not found!***");
	}
	    
        System.out.println("***loadUser end***");
	
	return user;
    }
    
    
    
    
    
    
    public void PrintUserRecord(WebServicesWebServicesSoap12Stub.User user){
	    
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	displayAttribute("User Name", user.getUserName());
	displayAttribute("External Id", user.getExternalId());
	displayAttribute("First Name", user.getFirstName());
        displayAttribute("Middle Initial", user.getMiddleInitial());
        displayAttribute("Last Name", user.getLastName());
        displayAttribute("Email", user.getEmail());
        displayAttribute("Created", simpleDateFormat.format(user.getCreationTime().getTime()));
        displayAttribute("Last Modified", simpleDateFormat.format(user.getModifiedTime().getTime()));
        displayAttribute("Street Address", user.getStreetAddress());
        displayAttribute("City", user.getCity());
        displayAttribute("State", user.getState());
        displayAttribute("Country", user.getCountry());
        displayAttribute("Postal Code", user.getPostalCode());
        displayAttribute("Postal Code Type", user.getPostalCodeType().getValue());
        displayAttribute("Telephone", user.getTelephone());
        displayAttribute("Extension", user.getExtension());
        displayAttribute("Location Name", user.getLocationName());
        simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        displayAttribute("Start Date", simpleDateFormat.format(user.getStartDate().getTime()));
        

	System.out.println("***Supervisors***");
        String[] supervisorUserNames = user.getSupervisorUserNames().getString();
	if (supervisorUserNames != null) {
		for(String name : supervisorUserNames) {
			displayAttribute("Supervisor:", name);
		}
	}else{
		System.out.println("***No Supervisors found***");
	}
	
        
	System.out.println("***Roles***");
        String[] roleNames = user.getRoleNames().getString();
        if (roleNames != null) {
            for (String role : roleNames) {
                displayAttribute("Role:",role);
            }
        } else {
            System.out.println("***No Roles found***");
        }

        displayAttribute("Default Role", user.getDefaultRoleName());

	System.out.println("***Groups***");
        WebServicesWebServicesSoap12Stub.Group[] groups = user.getGroups().getGroup();
        if (groups != null) {
            for (WebServicesWebServicesSoap12Stub.Group group : groups) {
                 displayAttribute("Group:", group.getName());
            }
        } else {
            System.out.println("***No Groups found***");
        }

	System.out.println("***Custom User Attributes***");
        WebServicesWebServicesSoap12Stub.CustomUserAttribute[] cuas = user.getCustomUserAttributes().getCustomUserAttribute();
        if (cuas != null) {
            for (WebServicesWebServicesSoap12Stub.CustomUserAttribute cua : cuas) {
                displayAttribute("CUA:", cua.getName() + " : " + cua.getValue());
            }
        } else {
            System.out.println("***No Custom User Attributes Found***");
        }

	System.out.println("***Custom Select User Attributes***");
        cuas = user.getCustomSelectUserAttributes().getCustomUserAttribute();
        if (cuas != null) {
            for (WebServicesWebServicesSoap12Stub.CustomUserAttribute csua : cuas) {
                displayAttribute("CSUA:", csua.getName() + " : " + csua.getValue());
            }
        } else {
            System.out.println("***No Custom Select User Attributes Found***");
        }

	System.out.println("***Catalog Access Codes***");
        String[] catalogAccessCodeNames = user.getCatalogAccessCodeNames().getString();
        if (catalogAccessCodeNames != null) {
            for (String cac : catalogAccessCodeNames) {
                displayAttribute("Catalog Access Code:", cac);
            }
        } else {
            System.out.println("***No Catalog Access Codes found***");
        }
	
    }


    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        try {
	
	GeolearningJavaExample gje = new GeolearningJavaExample();
	gje.initialize();
	System.out.println("*******************************************");
	String userName = gje.createNewUser();
	System.out.println("*******************************************");
	WebServicesWebServicesSoap12Stub.User testUser = gje.loadUser(userName);
	System.out.println("*******************************************");
	gje.updateUser(testUser);
	System.out.println("*******************************************");
		
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage() + " " + e.getClass().getName());
        }
    }
}
























