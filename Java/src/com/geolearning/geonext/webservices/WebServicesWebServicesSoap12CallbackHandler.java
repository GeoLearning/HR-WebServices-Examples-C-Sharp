
    /**
     * WebServicesWebServicesSoap12CallbackHandler.java
     *
     * This file was auto-generated from WSDL
     * by the Apache Axis2 version: 1.2 Apr 27, 2007 (04:35:37 IST)
     */
    package com.geolearning.geonext.webservices;

    /**
     *  WebServicesWebServicesSoap12CallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServicesWebServicesSoap12CallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServicesWebServicesSoap12CallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServicesWebServicesSoap12CallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for UserExistsByExternalId method
            * override this method for handling normal response from UserExistsByExternalId operation
            */
           public void receiveResultUserExistsByExternalId(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserExistsByExternalId operation
           */
            public void receiveErrorUserExistsByExternalId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LoadUserByExternalId method
            * override this method for handling normal response from LoadUserByExternalId operation
            */
           public void receiveResultLoadUserByExternalId(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LoadUserByExternalId operation
           */
            public void receiveErrorLoadUserByExternalId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UserExistsByUniqueId method
            * override this method for handling normal response from UserExistsByUniqueId operation
            */
           public void receiveResultUserExistsByUniqueId(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserExistsByUniqueId operation
           */
            public void receiveErrorUserExistsByUniqueId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LoadUserByUniqueId method
            * override this method for handling normal response from LoadUserByUniqueId operation
            */
           public void receiveResultLoadUserByUniqueId(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LoadUserByUniqueId operation
           */
            public void receiveErrorLoadUserByUniqueId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CreateUser method
            * override this method for handling normal response from CreateUser operation
            */
           public void receiveResultCreateUser(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CreateUser operation
           */
            public void receiveErrorCreateUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UpdateUser method
            * override this method for handling normal response from UpdateUser operation
            */
           public void receiveResultUpdateUser(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UpdateUser operation
           */
            public void receiveErrorUpdateUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LoadUser method
            * override this method for handling normal response from LoadUser operation
            */
           public void receiveResultLoadUser(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LoadUser operation
           */
            public void receiveErrorLoadUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GenerateUserObject method
            * override this method for handling normal response from GenerateUserObject operation
            */
           public void receiveResultGenerateUserObject(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GenerateUserObject operation
           */
            public void receiveErrorGenerateUserObject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UserExists method
            * override this method for handling normal response from UserExists operation
            */
           public void receiveResultUserExists(
                    com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserExists operation
           */
            public void receiveErrorUserExists(java.lang.Exception e) {
            }
                


    }
    