<!---
##########################################################
## GeoNext Project
##
## CONFIDENTIAL & PROPRIETARY
##
## Copyright (C) 2004 - 2007 by Geolearning, Inc.
## All Rights Reserved.
##
## Written by Ryan Bergman
##
## $Header: /GeoNext/GeoNext/Public/Geolearning/Webservice/Examples/ColdFusion8/GeoColdFusionWSExmple.cfm,v 1.13 2008/01/12 21:38:02 rbergman Exp $
##########################################################
--->

<!---
*******************************************************************************
 About ColdFusion Web Services and Complex Objects

  ColdFusion implements the Apache Axis engine for its web service functionality.
 Unfortunately CF does not take full advantage of the SOAP object model and allow
 CF developers to "new" the different objects that make up a service.

  Thankfully there is something we can do about that. When you first access a WSDL,
 Axis generates a set of stub objects. These are regular java classes that contain
 getters and setters for the base properties of the object. We need to use these
 stubs to build our object.

  In order to use these stubs however, we need to add them to the ColdFusion
 class path:

 	Step 1) Access the WSDL in any way with coldfusion.
 	Step 2) Look in the CF app directory for the stubs. They are in a "subs"
 			directory, organized by WSDL.like:
 			c:\ColdFusion8\stubs\WS\WS-21028249\com\geolearning\geonext\webservices\
 	Step 3) Copy everything from "com" on down into a new directory that exists in
 			the CF class path. or we can make one like:
 			c:\ColdFusion8\GeoServices\com\geolearning\geonext\webservices\
 	Step 4) If you created a new directory add it to the class path.
 			A, open CF administrator
 			B. click on Server settings >> Java and JVM
 			C. add the path to "ColdFusion Class Path". and click submit
 			D. Restart CF services.
 	Step 5) Use them like any other java object with <CFObject /> or CreateObject()
 			MyObj = CreateObject("java","com.geolearning.geonext.webservices.PostalCodeType");
 			Remember that you can CFDump the object to see the available methods.
 			<cfdump var="#MyObj#" />

 As the geo web services update these stubs will need to update too. You may want to
 create a method of dynamically finding new stubs and copying them to the class path
 folder when you detect a change.

*****

CFScript vs tags:

Generally when working with this much Java, cfscript is the way to go. However
all of this can be done in tags. We use tags for the update example after the
create.

*****************************************************************************
--->
<cfscript>
	// create the web service
	ArgStruct = StructNew();
	ArgStruct.refreshWSDL = True;
	ArgStruct.username = 'TestUserAccount';
	ArgStruct.password = 'MyP@ssw0r3';
	ws = createObject("webservice", "http://localhost/geonext/webservices/geonext.asmx?WSDL",ArgStruct);

	// Create a new user object
	NewUser = ws.GenerateUserObject();


	//lets use a UUID for a username so each request is unique
	ThreadID = javacast("string",CreateUUID());

	// First lets set all of the simple string values.
	// Then we will attack the complex types
	NewUser.SetUserName(ThreadID);
	NewUser.SetPassword('Password1!');
	NewUser.SetFirstName('Ernest');
	NewUser.SetMiddleInitial('E');
	NewUser.SetLastName('Borgnine');
	NewUser.SetEmail('Ernest.Borgnine@geolearning.com');
	NewUser.SetStreetAddress('801 Grand Ave.');
	NewUser.SetCity('Des Moines');
	NewUser.SetState('IOWA');
	NewUser.SetCountry('United States');
	NewUser.SetTelephone('515.555.1257');
	NewUser.SetExtension('42');
	NewUser.SetLocationName('Central Iowa');

	// the users status is part of the superclass. Its also a enum so we have to make a status object
	// if you just want to make users as active you dont have to do this because it will default
	UserStatus = CreateObject("java","com.geolearning.geonext.webservices.Status");
	NewUser.setStatus(UserStatus.Active);

	//the start date is a java calendar instance
	StartDate = CreateObject("java","java.util.Calendar").getInstance();
	NewUser.SetStartDate(StartDate);

	// the postal code type is a enum. because CF doesn't have enums
	// we will new it out of the ws stubs. remember that if you ever want
	NewUser.SetPostalCode('50310');
	PostalCodeType = CreateObject("java","com.geolearning.geonext.webservices.PostalCodeType");
	NewUser.setPostalCodeType(PostalCodeType.US);

	// supervisor names are stored in a ArrayOfString
	// We will need to get this out of the stubs as well
	// But luckily we can pass the init a good ol' CF Array
	CFSupervisors = ArrayNew(1);
	CFSupervisors[1] = 'ryber@geolearning.com';
	CFSupervisors[2] = 'shall@geolearning.com';
	SupervisorArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfString").init(CFSupervisors);
	NewUser.setSupervisorUserNames(SupervisorArray);

	// Same thing with the roles. mmmm rolls
	CFRoles = ArrayNew(1);
	CFRoles[1] = 'Administrator';
	RolesArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfString").init(CFRoles);
	NewUser.setRoleNames(RolesArray);
	NewUser.setDefaultRoleName('Administrator');

	// Groups are mostly the same but in this case we are dealing with the group object which
	// also needs to come out of the stubs.
	//
	// At this time all groups fall under a a hierarchy called "default". The "name" will represent
    // the full path to the group, seperated by slashes down the tree.
	Group = CreateObject("java","com.geolearning.geonext.webservices.Group").init();
	Group.setName("Bulk Manufacturing/Production");
	CFGroupArray = ArrayNew(1);
	CFGroupArray[1] = Group;
	GroupArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfGroup").init(CFGroupArray);
	NewUser.setGroups(GroupArray);

	// and the custom user attributes. Remember that these would need to have already been created in the system.
	CUA = CreateObject("java","com.geolearning.geonext.webservices.CustomUserAttribute").init();
	CUA.setName("Job Code");
	CUA.setValue("197432");
	CFCUAArray =  ArrayNew(1);
	CFCUAArray[1] = CUA;
	CUAArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfCustomUserAttribute").init(CFCUAArray);
	NewUser.setCustomSelectUserAttributes(CUAArray);

	// now some Catalog Access Codes.
	CFCatArray = ArrayNew(1);
	CFCatArray[1] = 'CatalogAccessCode 0 Name';
	CatArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfString").init(CFCatArray);
	NewUser.setCatalogAccessCodeNames(CatArray);


	// finally, we can save the user. note that save and update user return a result object.
	// we can use that result to see messages and potential errors with our process.
	result = ws.CreateUser(NewUser);


	/* ERRORS and WARNINGS
	************************************************************************
	   You would think that a Axis method called geString() would return a string
	   but you would be wrong. getString() actually returns a array of errors or warnings
	   also remember that ColdFusion variables cannot be null. So if getString() returns
	   NULL then the variable we are grabbing it from will cease to exist.
	************************************************************************
	*/
	errors = result.getErrors().getString();
	if(isdefined('errors')){
		// ok, we have an errors. dump out the array
		Writeoutput('Create user: Errors found: <br />#dump(errors)#<br>');
	}else{
		Writeoutput('Create user: ***No errors found***<br>');
	}

	// now warnings. These are non-fatal errors.
	warnings = result.getWarnings().getString();
	if(isdefined('warnings')){
			// ok, we have an warnings. dump out the array
			Writeoutput('Create user: Warnings found:<br /> #dump(warnings)#<br>');
		}else{
			Writeoutput('Create user: ***No warnings found***<br>');
	}

</cfscript>






<!--- Into Tag mode: lets see if we made our user correctly, and then mod him --->
<cfinvoke webservice="#ws#" method="UserExists" returnvariable="NewUserExists">
	<cfinvokeargument name="username" value="#ThreadID#" />
</cfinvoke>

<!--- we can use the return of the UserExists method as a boolean --->
<cfif not NewUserExists>
	Error! user was not found!
<cfelse>

	<!---
	************************************************************************
		 Getting User Info
		 now that we know our user ws made, lets take a look at the info
	************************************************************************
	--->

	<!--- load the user into a new object --->
	<cfinvoke webservice="#ws#" method="LoadUser" returnvariable="MyUser">
		<cfinvokeargument name="username" value="#ThreadID#" />
	</cfinvoke>

	<!--- lets write back some of our vars just to see what we have --->
	<cfoutput>
		<b>Here is the user we just created</b><br />
		<hr>
		<b>Username:</b> #MyUser.getUserName()# <br />
		<b>FirstName:</b> #MyUser.getFirstName()# <br />
		<b>LastName:</b> #MyUser.getLastName()# <br />
		<b>MI:</b> #MyUser.getMiddleInitial()#<br />
		<b>Email:</b> #MyUser.getEmail()#<br />
		<b>Street Address:</b> #MyUser.getStreetAddress()#<br />
		<b>City:</b> #MyUser.getCity()#<br />
		<b>State:</b> #MyUser.getState()#<br />
		<b>Country:</b> #MyUser.getCountry()#<br />
		<b>Telephone:</b> #MyUser.getTelephone()#<br />
		<b>ext:</b> #MyUser.getExtension()#<br />
		<!--- remember that we did not give our user a proper location! --->
		<b>Location Name:</b> #MyUser.getLocationName()#<br />
		<b>Start Date:</b> #dateformat(MyUser.getStartDate(),'mm/dd/yyyy')#<br />
		<b>Postal Code:</b> #MyUser.getPostalCode()# <br />
		<b>Postal Code Type:</b> #MyUser.getPostalCodeType()#<br />

		<!--- remember that these objects are axis arrays! so lets loop over their contents to dump them out --->
		<cfset arrayOfSups = MyUser.getSupervisorUserNames().getString() />
		<cfif isdefined('arrayOfSups')>
			<cfloop from="1" to="#arraylen(arrayOfSups)#" index="S">
				<b>Supervisor #S#:</b> #arrayOfSups[S]# <br />
			</cfloop>
		<cfelse>
			<b>Supervisors:</b> NONE<br />
		</cfif>

		<!--- now the roles --->
		<cfset arrayOfroles = MyUser.getRoleNames().getString() />
		<cfif isdefined('arrayOfroles')>
			<cfloop from="1" to="#arraylen(arrayOfroles)#" index="Role">
				<b>Role #Role#:</b> #arrayOfroles[Role]# <br />
			</cfloop>
		<cfelse>
			<b>Roles:</b> NONE<br />
		</cfif>

		<!--- and the groups. this one is a little different because its a array of GROUPS not strings --->
		<cfset arrayOfGroups = MyUser.getGroups().getGroup() />
		<cfif isdefined('arrayOfGroups')>
			<cfloop from="1" to="#arraylen(arrayOfGroups)#" index="G">
				<b>Group #G#:</b> #arrayOfGroups[G].getName()#<br />
			</cfloop>
		<cfelse>
			<b>Groups:</b> NONE<br />
		</cfif>

		<!--- CUAs --->
		<cfset arrayOfCUA = MyUser.getCustomSelectUserAttributes().getCustomUserAttribute() />
		<cfif isdefined('arrayOfCUA')>
			<cfloop from="1" to="#arraylen(arrayOfCUA)#" index="C">
				<b>CUA #C#:</b> Name: #arrayOfCUA[C].getName()# | Value:#arrayOfCUA[C].getValue()#<br />
			</cfloop>
		<cfelse>
			<b>CUA:</b> NONE<br />
		</cfif>

		<!--- and lastly the CAC's. Back to a arrayofstrings --->
		<cfset arrayOfCAC = MyUser.getCatalogAccessCodeNames().getString() />
		<cfif isdefined('arrayOfCAC')>
			<cfloop from="1" to="#arraylen(arrayOfCAC)#" index="CAC">
				<b>CAC #CAC#:</b> #arrayOfCAC[CAC]# <br />
			</cfloop>
		<cfelse>
			<b>CACs:</b> NONE<br />
		</cfif>


	</cfoutput>



	<!---
		************************************************************************
			 Modifying a user
			 we will now mod a user and save them back
		************************************************************************
	--->
	<!--- first, we can fix that location warning by adding back a location that does exist in the LMS. --->
	<cfset MyUser.setLocationName('ABC Corporation') />

	<!--- now lets add a second CAC. this is kind of tricky. The Axis objects (at least through CF) don't
		  let you just tack on a new value to the existing array. There is no 'addX()' method. So we have to
		  re-create our original array back into CF and then pass the new array to setCatalogAccessCodeNames()
		  you could always just ignore what was in it anyway if your system were the source of truth.
	--->
	<cfset MyNewCACs = ArrayNew(1) />
	<cfset ExistingCACs = MyUser.getCatalogAccessCodeNames().getString() />
	<cfif isdefined('ExistingCACs')>
		<cfloop from="1" to="#arraylen(ExistingCACs)#" index="EC">
			<cfset ArrayAppend(MyNewCACs, ExistingCACs[EC]) />
		</cfloop>
	</cfif>

	<cfset ArrayAppend(MyNewCACs,'CatalogAccessCode 1 Name') />

	<cfset NewCatArray = CreateObject("java","com.geolearning.geonext.webservices.ArrayOfString").init(MyNewCACs) />

	<cfset MyUser.setCatalogAccessCodeNames(NewCatArray) />


	<!--- now lets save back our user and check out the results --->
	<cfinvoke webservice="#ws#" method="UpdateUser" returnvariable="UpdateResult">
		<cfinvokeargument name="User" value="#MyUser#" />
	</cfinvoke>

	<!--- now lets check the errors and warnings --->
	<cfset errors = UpdateResult.getErrors().getString() />
	<cfif isdefined('errors')>
		<!--- ok, we have an errors. dump out the array --->
		Update user: Errors found:<br> <cfdump var="#errors#" /><br />
	<cfelse>
		Update user: ***No errors found***<br />
	</cfif>

	<!--- warnings. These are non-fatal errors. --->
	<cfset warnings = UpdateResult.getWarnings().getString() />
	<cfif isdefined('warnings')>
		<!--- ok, we have an warnings. dump out the array --->
		Update user: Warnings found: <br>#dump(warnings)#<br />
	<cfelse>
		Update user: ***No warnings found***<br />
	</cfif>

</cfif>




<!--- A couple of nice debugging tags thrown into functions so you can use them in cfscript --->
<cffunction name="Dump" returntype="any" output="yes">
		<cfargument name="thing" type="any" required="true" />
		<cfdump var="#arguments.thing#" />
</cffunction>

<cffunction name="Abort" returntype="void" output="no">
		<cfabort />
</cffunction>