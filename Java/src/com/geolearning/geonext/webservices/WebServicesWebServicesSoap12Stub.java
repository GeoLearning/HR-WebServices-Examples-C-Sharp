
        /**
        * WebServicesWebServicesSoap12Stub.java
        *
        * This file was auto-generated from WSDL
        * by the Apache Axis2 version: 1.2 Apr 27, 2007 (04:35:37 IST)
        */
        package com.geolearning.geonext.webservices;

        

        /*
        *  WebServicesWebServicesSoap12Stub java implementation
        */

        
        public class WebServicesWebServicesSoap12Stub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("WebServices" + this.hashCode());
     
    

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;
    


        _operations = new org.apache.axis2.description.AxisOperation[9];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "UserExistsByExternalId"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "LoadUserByExternalId"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "UserExistsByUniqueId"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "LoadUserByUniqueId"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "CreateUser"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "UpdateUser"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "LoadUser"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "GenerateUserObject"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("", "UserExists"));
	    _service.addOperation(__operation);
	    
	    
	    
            _operations[8]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

   /**
    Constructor that takes in a configContext
    */
   public WebServicesWebServicesSoap12Stub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public WebServicesWebServicesSoap12Stub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost/geonext/webservices/geonext.asmx" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public WebServicesWebServicesSoap12Stub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#UserExistsByExternalId
                        * @param userExistsByExternalId0
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse UserExistsByExternalId(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId userExistsByExternalId0)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExistsByExternalId");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExistsByExternalId0,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExistsByExternalId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startUserExistsByExternalId
                    * @param userExistsByExternalId0
                
                */
                public  void startUserExistsByExternalId(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId userExistsByExternalId0,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExistsByExternalId");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExistsByExternalId0,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExistsByExternalId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultUserExistsByExternalId(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorUserExistsByExternalId(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#LoadUserByExternalId
                        * @param loadUserByExternalId2
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse LoadUserByExternalId(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId loadUserByExternalId2)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUserByExternalId");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUserByExternalId2,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUserByExternalId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startLoadUserByExternalId
                    * @param loadUserByExternalId2
                
                */
                public  void startLoadUserByExternalId(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId loadUserByExternalId2,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUserByExternalId");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUserByExternalId2,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUserByExternalId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultLoadUserByExternalId(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorLoadUserByExternalId(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#UserExistsByUniqueId
                        * @param userExistsByUniqueId4
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse UserExistsByUniqueId(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId userExistsByUniqueId4)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExistsByUniqueId");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExistsByUniqueId4,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExistsByUniqueId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startUserExistsByUniqueId
                    * @param userExistsByUniqueId4
                
                */
                public  void startUserExistsByUniqueId(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId userExistsByUniqueId4,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExistsByUniqueId");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExistsByUniqueId4,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExistsByUniqueId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultUserExistsByUniqueId(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorUserExistsByUniqueId(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#LoadUserByUniqueId
                        * @param loadUserByUniqueId6
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse LoadUserByUniqueId(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId loadUserByUniqueId6)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUserByUniqueId");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUserByUniqueId6,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUserByUniqueId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startLoadUserByUniqueId
                    * @param loadUserByUniqueId6
                
                */
                public  void startLoadUserByUniqueId(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId loadUserByUniqueId6,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUserByUniqueId");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUserByUniqueId6,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUserByUniqueId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultLoadUserByUniqueId(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorLoadUserByUniqueId(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#CreateUser
                        * @param createUser8
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse CreateUser(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser createUser8)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/CreateUser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createUser8,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "CreateUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startCreateUser
                    * @param createUser8
                
                */
                public  void startCreateUser(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser createUser8,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/CreateUser");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createUser8,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "CreateUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultCreateUser(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorCreateUser(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#UpdateUser
                        * @param updateUser10
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse UpdateUser(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser updateUser10)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UpdateUser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateUser10,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UpdateUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startUpdateUser
                    * @param updateUser10
                
                */
                public  void startUpdateUser(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser updateUser10,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UpdateUser");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateUser10,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UpdateUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultUpdateUser(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorUpdateUser(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#LoadUser
                        * @param loadUser12
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse LoadUser(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser loadUser12)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUser12,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startLoadUser
                    * @param loadUser12
                
                */
                public  void startLoadUser(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser loadUser12,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/LoadUser");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loadUser12,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "LoadUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultLoadUser(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorLoadUser(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#GenerateUserObject
                        * @param generateUserObject14
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse GenerateUserObject(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject generateUserObject14)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/GenerateUserObject");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    generateUserObject14,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "GenerateUserObject")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startGenerateUserObject
                    * @param generateUserObject14
                
                */
                public  void startGenerateUserObject(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject generateUserObject14,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/GenerateUserObject");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    generateUserObject14,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "GenerateUserObject")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultGenerateUserObject(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorGenerateUserObject(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                    * Auto generated method signature
                    * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#UserExists
                        * @param userExists16
                    
                    */

                    
                            public  com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse UserExists(

                            com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists userExists16)
                        

                    throws java.rmi.RemoteException
                    
                    {

              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExists");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExists16,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExists")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                           java.lang.Object object = fromOM(
                                        _returnEnv.getBody().getFirstElement() ,
                                        com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse.class,
                                         getEnvelopeNamespaces(_returnEnv));
                           _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                          
                                   return (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse)object;
                              
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
        }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * @see com.geolearning.geonext.webservices.WebServicesWebServicesSoap12#startUserExists
                    * @param userExists16
                
                */
                public  void startUserExists(

                 com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists userExists16,

                  final com.geolearning.geonext.webservices.WebServicesWebServicesSoap12CallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("http://geolearning.com/geonext/webservices/UserExists");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

          

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userExists16,
                                                    optimizeContent(new javax.xml.namespace.QName("",
                                                    "UserExists")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                           _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                    public void onComplete(
                            org.apache.axis2.client.async.AsyncResult result) {
                        java.lang.Object object = fromOM(result.getResponseEnvelope().getBody().getFirstElement(),
                               com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse.class,
                               getEnvelopeNamespaces(result.getResponseEnvelope())
                            );
                        callback.receiveResultUserExists(
                            
                                   (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse)object);
                                

                    }

                    public void onError(java.lang.Exception e) {
                        callback.receiveErrorUserExists(e);
                    }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost/geonext/webservices/geonext.asmx

        public static class LoadUserByUniqueId
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUserByUniqueId",
                "ns1");

            

                        /**
                        * field for UniqueId
                        */

                        
                            protected java.lang.String localUniqueId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUniqueId(){
                               return localUniqueId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueId
                               */
                               public void setUniqueId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUniqueIdTracker = true;
                                       } else {
                                          localUniqueIdTracker = false;
                                              
                                       }
                                   
                                            this.localUniqueId=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUserByUniqueId.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUniqueIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"uniqueId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"uniqueId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("uniqueId");
                                    }
                                

                                          if (localUniqueId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("uniqueId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUniqueId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUniqueIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "uniqueId"));
                            
                                        if (localUniqueId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUniqueId));
                                        } else {
                                           throw new RuntimeException("uniqueId cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUserByUniqueId parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUserByUniqueId object = new LoadUserByUniqueId();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUserByUniqueId".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUserByUniqueId)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","uniqueId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUniqueId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UpdateUser
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UpdateUser",
                "ns1");

            

                        /**
                        * field for User
                        */

                        
                            protected User localUser ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getUser(){
                               return localUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param User
                               */
                               public void setUser(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserTracker = true;
                                       } else {
                                          localUserTracker = false;
                                              
                                       }
                                   
                                            this.localUser=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UpdateUser.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUserTracker){
                                    if (localUser==null){
                                         throw new RuntimeException("user cannot be null!!");
                                    }
                                   localUser.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","user"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUserTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "user"));
                            
                            
                                    if (localUser==null){
                                         throw new RuntimeException("user cannot be null!!");
                                    }
                                    elementList.add(localUser);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UpdateUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UpdateUser object = new UpdateUser();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UpdateUser".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdateUser)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","user").equals(reader.getName())){
                                
                                        object.setUser(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExistsByExternalId
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExistsByExternalId",
                "ns1");

            

                        /**
                        * field for ExternalId
                        */

                        
                            protected java.lang.String localExternalId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExternalId(){
                               return localExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalId
                               */
                               public void setExternalId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExternalIdTracker = true;
                                       } else {
                                          localExternalIdTracker = false;
                                              
                                       }
                                   
                                            this.localExternalId=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExistsByExternalId.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localExternalIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"externalId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"externalId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("externalId");
                                    }
                                

                                          if (localExternalId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("externalId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExternalId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localExternalIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "externalId"));
                            
                                        if (localExternalId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalId));
                                        } else {
                                           throw new RuntimeException("externalId cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExistsByExternalId parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExistsByExternalId object = new UserExistsByExternalId();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExistsByExternalId".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExistsByExternalId)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","externalId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExternalId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class PostalCodeType
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "PostalCodeType",
                "ns1");

            

                        /**
                        * field for PostalCodeType
                        */

                        
                            protected java.lang.String localPostalCodeType ;
                        
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected PostalCodeType(java.lang.String value, boolean isRegisterValue) {
                                    localPostalCodeType = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localPostalCodeType, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _APO =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("APO");
                                
                                    public static final java.lang.String _Foreign =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Foreign");
                                
                                    public static final java.lang.String _US =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("US");
                                
                                    public static final java.lang.String _Undefined =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Undefined");
                                
                                public static final PostalCodeType APO =
                                    new PostalCodeType(_APO,true);
                            
                                public static final PostalCodeType Foreign =
                                    new PostalCodeType(_Foreign,true);
                            
                                public static final PostalCodeType US =
                                    new PostalCodeType(_US,true);
                            
                                public static final PostalCodeType Undefined =
                                    new PostalCodeType(_Undefined,true);
                            

                                public java.lang.String getValue() { return localPostalCodeType;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localPostalCodeType.toString();
                                    

                                }

                        

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       PostalCodeType.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String localName = parentQName.getLocalPart();
                        
                            if (! namespace.equals("")) {
                                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                                if (prefix == null) {
                                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                    xmlWriter.writeStartElement(prefix, localName, namespace);
                                    xmlWriter.writeNamespace(prefix, namespace);
                                    xmlWriter.setPrefix(prefix, namespace);

                                } else {
                                    xmlWriter.writeStartElement(namespace, localName);
                                }

                            } else {
                                xmlWriter.writeStartElement(localName);
                            }
                            
                                          if (localPostalCodeType==null){
                                            
                                                     throw new RuntimeException("Value cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localPostalCodeType);
                                            
                                         }
                                    

                       xmlWriter.writeEndElement();
                    

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalCodeType)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static PostalCodeType fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    PostalCodeType enumeration = (PostalCodeType)
                       
                               _table_.get(value);
                           

                    if (enumeration==null) throw new java.lang.IllegalArgumentException();
                    return enumeration;
                }
                public static PostalCodeType fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static PostalCodeType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PostalCodeType object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                    
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = PostalCodeType.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = PostalCodeType.Factory.fromString(content,"");
                                        }
                                        
                                        
                             } else reader.next();  
                            }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserResult extends Result
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UserResult
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DefaultPassword
                        */

                        
                            protected java.lang.String localDefaultPassword ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultPasswordTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultPassword(){
                               return localDefaultPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultPassword
                               */
                               public void setDefaultPassword(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDefaultPasswordTracker = true;
                                       } else {
                                          localDefaultPasswordTracker = false;
                                              
                                       }
                                   
                                            this.localDefaultPassword=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserResult.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                       registerPrefix(xmlWriter,"http://geolearning.com/geonext/webservices/")+":UserResult",
                       xmlWriter);
                if (localErrorsTracker){
                                    if (localErrors==null){
                                         throw new RuntimeException("Errors cannot be null!!");
                                    }
                                   localErrors.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Errors"),
                                       factory,xmlWriter);
                                } if (localWarningsTracker){
                                    if (localWarnings==null){
                                         throw new RuntimeException("Warnings cannot be null!!");
                                    }
                                   localWarnings.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Warnings"),
                                       factory,xmlWriter);
                                } if (localDefaultPasswordTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"DefaultPassword", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DefaultPassword");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DefaultPassword");
                                    }
                                

                                          if (localDefaultPassword==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("DefaultPassword cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localErrorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Errors"));
                            
                            
                                    if (localErrors==null){
                                         throw new RuntimeException("Errors cannot be null!!");
                                    }
                                    elementList.add(localErrors);
                                } if (localWarningsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Warnings"));
                            
                            
                                    if (localWarnings==null){
                                         throw new RuntimeException("Warnings cannot be null!!");
                                    }
                                    elementList.add(localWarnings);
                                } if (localDefaultPasswordTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "DefaultPassword"));
                            
                                        if (localDefaultPassword != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultPassword));
                                        } else {
                                           throw new RuntimeException("DefaultPassword cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserResult object = new UserResult();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserResult)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Errors").equals(reader.getName())){
                                
                                        object.setErrors(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Warnings").equals(reader.getName())){
                                
                                        object.setWarnings(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","DefaultPassword").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExistsByUniqueId
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExistsByUniqueId",
                "ns1");

            

                        /**
                        * field for UniqueId
                        */

                        
                            protected java.lang.String localUniqueId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUniqueId(){
                               return localUniqueId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueId
                               */
                               public void setUniqueId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUniqueIdTracker = true;
                                       } else {
                                          localUniqueIdTracker = false;
                                              
                                       }
                                   
                                            this.localUniqueId=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExistsByUniqueId.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUniqueIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"uniqueId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"uniqueId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("uniqueId");
                                    }
                                

                                          if (localUniqueId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("uniqueId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUniqueId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUniqueIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "uniqueId"));
                            
                                        if (localUniqueId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUniqueId));
                                        } else {
                                           throw new RuntimeException("uniqueId cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExistsByUniqueId parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExistsByUniqueId object = new UserExistsByUniqueId();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExistsByUniqueId".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExistsByUniqueId)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","uniqueId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUniqueId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class CreateUser
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "CreateUser",
                "ns1");

            

                        /**
                        * field for User
                        */

                        
                            protected User localUser ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getUser(){
                               return localUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param User
                               */
                               public void setUser(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserTracker = true;
                                       } else {
                                          localUserTracker = false;
                                              
                                       }
                                   
                                            this.localUser=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       CreateUser.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUserTracker){
                                    if (localUser==null){
                                         throw new RuntimeException("user cannot be null!!");
                                    }
                                   localUser.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","user"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUserTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "user"));
                            
                            
                                    if (localUser==null){
                                         throw new RuntimeException("user cannot be null!!");
                                    }
                                    elementList.add(localUser);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static CreateUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreateUser object = new CreateUser();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"CreateUser".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreateUser)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","user").equals(reader.getName())){
                                
                                        object.setUser(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class LoadUserByUniqueIdResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUserByUniqueIdResponse",
                "ns1");

            

                        /**
                        * field for LoadUserByUniqueIdResult
                        */

                        
                            protected User localLoadUserByUniqueIdResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoadUserByUniqueIdResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getLoadUserByUniqueIdResult(){
                               return localLoadUserByUniqueIdResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoadUserByUniqueIdResult
                               */
                               public void setLoadUserByUniqueIdResult(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLoadUserByUniqueIdResultTracker = true;
                                       } else {
                                          localLoadUserByUniqueIdResultTracker = false;
                                              
                                       }
                                   
                                            this.localLoadUserByUniqueIdResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUserByUniqueIdResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localLoadUserByUniqueIdResultTracker){
                                    if (localLoadUserByUniqueIdResult==null){
                                         throw new RuntimeException("LoadUserByUniqueIdResult cannot be null!!");
                                    }
                                   localLoadUserByUniqueIdResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserByUniqueIdResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localLoadUserByUniqueIdResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "LoadUserByUniqueIdResult"));
                            
                            
                                    if (localLoadUserByUniqueIdResult==null){
                                         throw new RuntimeException("LoadUserByUniqueIdResult cannot be null!!");
                                    }
                                    elementList.add(localLoadUserByUniqueIdResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUserByUniqueIdResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUserByUniqueIdResponse object = new LoadUserByUniqueIdResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUserByUniqueIdResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUserByUniqueIdResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserByUniqueIdResult").equals(reader.getName())){
                                
                                        object.setLoadUserByUniqueIdResult(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class Group
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Group
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Name
                        */

                        
                            protected java.lang.String localName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = false;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       Group.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Name"));
                            
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new RuntimeException("Name cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Group parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Group object = new Group();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Group".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Group)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class LoadUserByExternalIdResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUserByExternalIdResponse",
                "ns1");

            

                        /**
                        * field for LoadUserByExternalIdResult
                        */

                        
                            protected User localLoadUserByExternalIdResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoadUserByExternalIdResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getLoadUserByExternalIdResult(){
                               return localLoadUserByExternalIdResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoadUserByExternalIdResult
                               */
                               public void setLoadUserByExternalIdResult(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLoadUserByExternalIdResultTracker = true;
                                       } else {
                                          localLoadUserByExternalIdResultTracker = false;
                                              
                                       }
                                   
                                            this.localLoadUserByExternalIdResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUserByExternalIdResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localLoadUserByExternalIdResultTracker){
                                    if (localLoadUserByExternalIdResult==null){
                                         throw new RuntimeException("LoadUserByExternalIdResult cannot be null!!");
                                    }
                                   localLoadUserByExternalIdResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserByExternalIdResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localLoadUserByExternalIdResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "LoadUserByExternalIdResult"));
                            
                            
                                    if (localLoadUserByExternalIdResult==null){
                                         throw new RuntimeException("LoadUserByExternalIdResult cannot be null!!");
                                    }
                                    elementList.add(localLoadUserByExternalIdResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUserByExternalIdResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUserByExternalIdResponse object = new LoadUserByExternalIdResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUserByExternalIdResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUserByExternalIdResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserByExternalIdResult").equals(reader.getName())){
                                
                                        object.setLoadUserByExternalIdResult(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class CustomUserAttribute
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CustomUserAttribute
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Name
                        */

                        
                            protected java.lang.String localName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = false;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Value
                        */

                        
                            protected java.lang.String localValue ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValue(){
                               return localValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Value
                               */
                               public void setValue(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localValueTracker = true;
                                       } else {
                                          localValueTracker = false;
                                              
                                       }
                                   
                                            this.localValue=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       CustomUserAttribute.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValueTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Value", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Value");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Value");
                                    }
                                

                                          if (localValue==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Value cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Name"));
                            
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new RuntimeException("Name cannot be null!!");
                                        }
                                    } if (localValueTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Value"));
                            
                                        if (localValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValue));
                                        } else {
                                           throw new RuntimeException("Value cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static CustomUserAttribute parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CustomUserAttribute object = new CustomUserAttribute();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"CustomUserAttribute".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CustomUserAttribute)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Value").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class GenerateUserObjectResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "GenerateUserObjectResponse",
                "ns1");

            

                        /**
                        * field for GenerateUserObjectResult
                        */

                        
                            protected User localGenerateUserObjectResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGenerateUserObjectResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getGenerateUserObjectResult(){
                               return localGenerateUserObjectResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GenerateUserObjectResult
                               */
                               public void setGenerateUserObjectResult(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGenerateUserObjectResultTracker = true;
                                       } else {
                                          localGenerateUserObjectResultTracker = false;
                                              
                                       }
                                   
                                            this.localGenerateUserObjectResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       GenerateUserObjectResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localGenerateUserObjectResultTracker){
                                    if (localGenerateUserObjectResult==null){
                                         throw new RuntimeException("GenerateUserObjectResult cannot be null!!");
                                    }
                                   localGenerateUserObjectResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","GenerateUserObjectResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localGenerateUserObjectResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "GenerateUserObjectResult"));
                            
                            
                                    if (localGenerateUserObjectResult==null){
                                         throw new RuntimeException("GenerateUserObjectResult cannot be null!!");
                                    }
                                    elementList.add(localGenerateUserObjectResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static GenerateUserObjectResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GenerateUserObjectResponse object = new GenerateUserObjectResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"GenerateUserObjectResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GenerateUserObjectResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","GenerateUserObjectResult").equals(reader.getName())){
                                
                                        object.setGenerateUserObjectResult(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "ArrayOfCustomUserAttribute".equals(typeName)){
                   
                            return  ArrayOfCustomUserAttribute.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "Group".equals(typeName)){
                   
                            return  Group.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "CustomUserAttribute".equals(typeName)){
                   
                            return  CustomUserAttribute.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "ArrayOfString".equals(typeName)){
                   
                            return  ArrayOfString.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "UserResult".equals(typeName)){
                   
                            return  UserResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "PostalCodeType".equals(typeName)){
                   
                            return  PostalCodeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "ArrayOfGroup".equals(typeName)){
                   
                            return  ArrayOfGroup.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "PersistentOfUserUserUserResult".equals(typeName)){
                   
                            return  PersistentOfUserUserUserResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "Result".equals(typeName)){
                   
                            return  Result.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geolearning.com/geonext/webservices/".equals(namespaceURI) &&
                  "Status".equals(typeName)){
                   
                            return  Status.Factory.parse(reader);
                        

                  }

              
             throw new java.lang.RuntimeException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

        public static class CreateUserResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "CreateUserResponse",
                "ns1");

            

                        /**
                        * field for CreateUserResult
                        */

                        
                            protected UserResult localCreateUserResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateUserResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return UserResult
                           */
                           public  UserResult getCreateUserResult(){
                               return localCreateUserResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateUserResult
                               */
                               public void setCreateUserResult(UserResult param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreateUserResultTracker = true;
                                       } else {
                                          localCreateUserResultTracker = false;
                                              
                                       }
                                   
                                            this.localCreateUserResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       CreateUserResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localCreateUserResultTracker){
                                    if (localCreateUserResult==null){
                                         throw new RuntimeException("CreateUserResult cannot be null!!");
                                    }
                                   localCreateUserResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CreateUserResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCreateUserResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CreateUserResult"));
                            
                            
                                    if (localCreateUserResult==null){
                                         throw new RuntimeException("CreateUserResult cannot be null!!");
                                    }
                                    elementList.add(localCreateUserResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static CreateUserResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreateUserResponse object = new CreateUserResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"CreateUserResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreateUserResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CreateUserResult").equals(reader.getName())){
                                
                                        object.setCreateUserResult(UserResult.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class LoadUserResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUserResponse",
                "ns1");

            

                        /**
                        * field for LoadUserResult
                        */

                        
                            protected User localLoadUserResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoadUserResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return User
                           */
                           public  User getLoadUserResult(){
                               return localLoadUserResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoadUserResult
                               */
                               public void setLoadUserResult(User param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLoadUserResultTracker = true;
                                       } else {
                                          localLoadUserResultTracker = false;
                                              
                                       }
                                   
                                            this.localLoadUserResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUserResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localLoadUserResultTracker){
                                    if (localLoadUserResult==null){
                                         throw new RuntimeException("LoadUserResult cannot be null!!");
                                    }
                                   localLoadUserResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localLoadUserResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "LoadUserResult"));
                            
                            
                                    if (localLoadUserResult==null){
                                         throw new RuntimeException("LoadUserResult cannot be null!!");
                                    }
                                    elementList.add(localLoadUserResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUserResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUserResponse object = new LoadUserResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUserResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUserResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LoadUserResult").equals(reader.getName())){
                                
                                        object.setLoadUserResult(User.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class User extends PersistentOfUserUserUserResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = User
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for FirstName
                        */

                        
                            protected java.lang.String localFirstName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFirstName(){
                               return localFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstName
                               */
                               public void setFirstName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFirstNameTracker = true;
                                       } else {
                                          localFirstNameTracker = false;
                                              
                                       }
                                   
                                            this.localFirstName=param;
                                    

                               }
                            

                        /**
                        * field for MiddleInitial
                        */

                        
                            protected java.lang.String localMiddleInitial ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiddleInitialTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMiddleInitial(){
                               return localMiddleInitial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MiddleInitial
                               */
                               public void setMiddleInitial(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMiddleInitialTracker = true;
                                       } else {
                                          localMiddleInitialTracker = false;
                                              
                                       }
                                   
                                            this.localMiddleInitial=param;
                                    

                               }
                            

                        /**
                        * field for LastName
                        */

                        
                            protected java.lang.String localLastName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastName(){
                               return localLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastName
                               */
                               public void setLastName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastNameTracker = true;
                                       } else {
                                          localLastNameTracker = false;
                                              
                                       }
                                   
                                            this.localLastName=param;
                                    

                               }
                            

                        /**
                        * field for Email
                        */

                        
                            protected java.lang.String localEmail ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmail(){
                               return localEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Email
                               */
                               public void setEmail(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEmailTracker = true;
                                       } else {
                                          localEmailTracker = false;
                                              
                                       }
                                   
                                            this.localEmail=param;
                                    

                               }
                            

                        /**
                        * field for StreetAddress
                        */

                        
                            protected java.lang.String localStreetAddress ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreetAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreetAddress(){
                               return localStreetAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreetAddress
                               */
                               public void setStreetAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStreetAddressTracker = true;
                                       } else {
                                          localStreetAddressTracker = false;
                                              
                                       }
                                   
                                            this.localStreetAddress=param;
                                    

                               }
                            

                        /**
                        * field for StreetAddress2
                        */

                        
                            protected java.lang.String localStreetAddress2 ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreetAddress2Tracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreetAddress2(){
                               return localStreetAddress2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreetAddress2
                               */
                               public void setStreetAddress2(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStreetAddress2Tracker = true;
                                       } else {
                                          localStreetAddress2Tracker = false;
                                              
                                       }
                                   
                                            this.localStreetAddress2=param;
                                    

                               }
                            

                        /**
                        * field for City
                        */

                        
                            protected java.lang.String localCity ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCity(){
                               return localCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param City
                               */
                               public void setCity(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCityTracker = true;
                                       } else {
                                          localCityTracker = false;
                                              
                                       }
                                   
                                            this.localCity=param;
                                    

                               }
                            

                        /**
                        * field for State
                        */

                        
                            protected java.lang.String localState ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStateTracker = true;
                                       } else {
                                          localStateTracker = false;
                                              
                                       }
                                   
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for Country
                        */

                        
                            protected java.lang.String localCountry ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCountry(){
                               return localCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Country
                               */
                               public void setCountry(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCountryTracker = true;
                                       } else {
                                          localCountryTracker = false;
                                              
                                       }
                                   
                                            this.localCountry=param;
                                    

                               }
                            

                        /**
                        * field for PostalCode
                        */

                        
                            protected java.lang.String localPostalCode ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostalCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostalCode(){
                               return localPostalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostalCode
                               */
                               public void setPostalCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPostalCodeTracker = true;
                                       } else {
                                          localPostalCodeTracker = false;
                                              
                                       }
                                   
                                            this.localPostalCode=param;
                                    

                               }
                            

                        /**
                        * field for PostalCodeType
                        */

                        
                            protected PostalCodeType localPostalCodeType ;
                        

                           /**
                           * Auto generated getter method
                           * @return PostalCodeType
                           */
                           public  PostalCodeType getPostalCodeType(){
                               return localPostalCodeType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostalCodeType
                               */
                               public void setPostalCodeType(PostalCodeType param){
                            
                                            this.localPostalCodeType=param;
                                    

                               }
                            

                        /**
                        * field for Telephone
                        */

                        
                            protected java.lang.String localTelephone ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTelephoneTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTelephone(){
                               return localTelephone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Telephone
                               */
                               public void setTelephone(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTelephoneTracker = true;
                                       } else {
                                          localTelephoneTracker = false;
                                              
                                       }
                                   
                                            this.localTelephone=param;
                                    

                               }
                            

                        /**
                        * field for Extension
                        */

                        
                            protected java.lang.String localExtension ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtensionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExtension(){
                               return localExtension;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Extension
                               */
                               public void setExtension(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExtensionTracker = true;
                                       } else {
                                          localExtensionTracker = false;
                                              
                                       }
                                   
                                            this.localExtension=param;
                                    

                               }
                            

                        /**
                        * field for LocationName
                        */

                        
                            protected java.lang.String localLocationName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLocationName(){
                               return localLocationName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocationName
                               */
                               public void setLocationName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLocationNameTracker = true;
                                       } else {
                                          localLocationNameTracker = false;
                                              
                                       }
                                   
                                            this.localLocationName=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                            protected java.util.Calendar localStartDate ;
                        

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Calendar param){
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for UserName
                        */

                        
                            protected java.lang.String localUserName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserName(){
                               return localUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserName
                               */
                               public void setUserName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserNameTracker = true;
                                       } else {
                                          localUserNameTracker = false;
                                              
                                       }
                                   
                                            this.localUserName=param;
                                    

                               }
                            

                        /**
                        * field for Password
                        */

                        
                            protected java.lang.String localPassword ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPasswordTracker = true;
                                       } else {
                                          localPasswordTracker = false;
                                              
                                       }
                                   
                                            this.localPassword=param;
                                    

                               }
                            

                        /**
                        * field for BirthDate
                        */

                        
                            protected java.util.Calendar localBirthDate ;
                        

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getBirthDate(){
                               return localBirthDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BirthDate
                               */
                               public void setBirthDate(java.util.Calendar param){
                            
                                            this.localBirthDate=param;
                                    

                               }
                            

                        /**
                        * field for SocialSecurityNumber
                        */

                        
                            protected java.lang.String localSocialSecurityNumber ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSocialSecurityNumberTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSocialSecurityNumber(){
                               return localSocialSecurityNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SocialSecurityNumber
                               */
                               public void setSocialSecurityNumber(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSocialSecurityNumberTracker = true;
                                       } else {
                                          localSocialSecurityNumberTracker = false;
                                              
                                       }
                                   
                                            this.localSocialSecurityNumber=param;
                                    

                               }
                            

                        /**
                        * field for SupervisorUserNames
                        */

                        
                            protected ArrayOfString localSupervisorUserNames ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupervisorUserNamesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfString
                           */
                           public  ArrayOfString getSupervisorUserNames(){
                               return localSupervisorUserNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupervisorUserNames
                               */
                               public void setSupervisorUserNames(ArrayOfString param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSupervisorUserNamesTracker = true;
                                       } else {
                                          localSupervisorUserNamesTracker = false;
                                              
                                       }
                                   
                                            this.localSupervisorUserNames=param;
                                    

                               }
                            

                        /**
                        * field for Groups
                        */

                        
                            protected ArrayOfGroup localGroups ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfGroup
                           */
                           public  ArrayOfGroup getGroups(){
                               return localGroups;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Groups
                               */
                               public void setGroups(ArrayOfGroup param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGroupsTracker = true;
                                       } else {
                                          localGroupsTracker = false;
                                              
                                       }
                                   
                                            this.localGroups=param;
                                    

                               }
                            

                        /**
                        * field for RoleNames
                        */

                        
                            protected ArrayOfString localRoleNames ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoleNamesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfString
                           */
                           public  ArrayOfString getRoleNames(){
                               return localRoleNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoleNames
                               */
                               public void setRoleNames(ArrayOfString param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRoleNamesTracker = true;
                                       } else {
                                          localRoleNamesTracker = false;
                                              
                                       }
                                   
                                            this.localRoleNames=param;
                                    

                               }
                            

                        /**
                        * field for DefaultRoleName
                        */

                        
                            protected java.lang.String localDefaultRoleName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultRoleNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultRoleName(){
                               return localDefaultRoleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultRoleName
                               */
                               public void setDefaultRoleName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDefaultRoleNameTracker = true;
                                       } else {
                                          localDefaultRoleNameTracker = false;
                                              
                                       }
                                   
                                            this.localDefaultRoleName=param;
                                    

                               }
                            

                        /**
                        * field for ExternalId
                        */

                        
                            protected java.lang.String localExternalId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExternalId(){
                               return localExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalId
                               */
                               public void setExternalId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExternalIdTracker = true;
                                       } else {
                                          localExternalIdTracker = false;
                                              
                                       }
                                   
                                            this.localExternalId=param;
                                    

                               }
                            

                        /**
                        * field for TimeZone
                        */

                        
                            protected java.lang.String localTimeZone ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeZoneTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeZone(){
                               return localTimeZone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeZone
                               */
                               public void setTimeZone(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeZoneTracker = true;
                                       } else {
                                          localTimeZoneTracker = false;
                                              
                                       }
                                   
                                            this.localTimeZone=param;
                                    

                               }
                            

                        /**
                        * field for Currency
                        */

                        
                            protected java.lang.String localCurrency ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCurrency(){
                               return localCurrency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Currency
                               */
                               public void setCurrency(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCurrencyTracker = true;
                                       } else {
                                          localCurrencyTracker = false;
                                              
                                       }
                                   
                                            this.localCurrency=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                            protected java.lang.String localLanguage ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLanguageTracker = true;
                                       } else {
                                          localLanguageTracker = false;
                                              
                                       }
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for EHRIEmployeeID
                        */

                        
                            protected java.lang.String localEHRIEmployeeID ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEHRIEmployeeIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEHRIEmployeeID(){
                               return localEHRIEmployeeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EHRIEmployeeID
                               */
                               public void setEHRIEmployeeID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEHRIEmployeeIDTracker = true;
                                       } else {
                                          localEHRIEmployeeIDTracker = false;
                                              
                                       }
                                   
                                            this.localEHRIEmployeeID=param;
                                    

                               }
                            

                        /**
                        * field for AgencySubElementCode
                        */

                        
                            protected java.lang.String localAgencySubElementCode ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySubElementCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencySubElementCode(){
                               return localAgencySubElementCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySubElementCode
                               */
                               public void setAgencySubElementCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgencySubElementCodeTracker = true;
                                       } else {
                                          localAgencySubElementCodeTracker = false;
                                              
                                       }
                                   
                                            this.localAgencySubElementCode=param;
                                    

                               }
                            

                        /**
                        * field for DoChangePasswordNextLogin
                        */

                        
                            protected java.lang.String localDoChangePasswordNextLogin ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoChangePasswordNextLoginTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDoChangePasswordNextLogin(){
                               return localDoChangePasswordNextLogin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoChangePasswordNextLogin
                               */
                               public void setDoChangePasswordNextLogin(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDoChangePasswordNextLoginTracker = true;
                                       } else {
                                          localDoChangePasswordNextLoginTracker = false;
                                              
                                       }
                                   
                                            this.localDoChangePasswordNextLogin=param;
                                    

                               }
                            

                        /**
                        * field for UniqueId
                        */

                        
                            protected java.lang.String localUniqueId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUniqueId(){
                               return localUniqueId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueId
                               */
                               public void setUniqueId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUniqueIdTracker = true;
                                       } else {
                                          localUniqueIdTracker = false;
                                              
                                       }
                                   
                                            this.localUniqueId=param;
                                    

                               }
                            

                        /**
                        * field for CustomUserAttributes
                        */

                        
                            protected ArrayOfCustomUserAttribute localCustomUserAttributes ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomUserAttributesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfCustomUserAttribute
                           */
                           public  ArrayOfCustomUserAttribute getCustomUserAttributes(){
                               return localCustomUserAttributes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomUserAttributes
                               */
                               public void setCustomUserAttributes(ArrayOfCustomUserAttribute param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCustomUserAttributesTracker = true;
                                       } else {
                                          localCustomUserAttributesTracker = false;
                                              
                                       }
                                   
                                            this.localCustomUserAttributes=param;
                                    

                               }
                            

                        /**
                        * field for CustomSelectUserAttributes
                        */

                        
                            protected ArrayOfCustomUserAttribute localCustomSelectUserAttributes ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomSelectUserAttributesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfCustomUserAttribute
                           */
                           public  ArrayOfCustomUserAttribute getCustomSelectUserAttributes(){
                               return localCustomSelectUserAttributes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomSelectUserAttributes
                               */
                               public void setCustomSelectUserAttributes(ArrayOfCustomUserAttribute param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCustomSelectUserAttributesTracker = true;
                                       } else {
                                          localCustomSelectUserAttributesTracker = false;
                                              
                                       }
                                   
                                            this.localCustomSelectUserAttributes=param;
                                    

                               }
                            

                        /**
                        * field for CatalogAccessCodeNames
                        */

                        
                            protected ArrayOfString localCatalogAccessCodeNames ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCatalogAccessCodeNamesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfString
                           */
                           public  ArrayOfString getCatalogAccessCodeNames(){
                               return localCatalogAccessCodeNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CatalogAccessCodeNames
                               */
                               public void setCatalogAccessCodeNames(ArrayOfString param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCatalogAccessCodeNamesTracker = true;
                                       } else {
                                          localCatalogAccessCodeNamesTracker = false;
                                              
                                       }
                                   
                                            this.localCatalogAccessCodeNames=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       User.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                       registerPrefix(xmlWriter,"http://geolearning.com/geonext/webservices/")+":User",
                       xmlWriter);
               
                                    if (localStatus==null){
                                         throw new RuntimeException("Status cannot be null!!");
                                    }
                                   localStatus.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Status"),
                                       factory,xmlWriter);
                                
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"CreationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CreationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CreationTime");
                                    }
                                

                                          if (localCreationTime==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("CreationTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"ModifiedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ModifiedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ModifiedTime");
                                    }
                                

                                          if (localModifiedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("ModifiedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModifiedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localFirstNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"FirstName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FirstName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FirstName");
                                    }
                                

                                          if (localFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("FirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMiddleInitialTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"MiddleInitial", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MiddleInitial");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MiddleInitial");
                                    }
                                

                                          if (localMiddleInitial==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("MiddleInitial cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMiddleInitial);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"LastName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastName");
                                    }
                                

                                          if (localLastName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("LastName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Email", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Email");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Email");
                                    }
                                

                                          if (localEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Email cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreetAddressTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"StreetAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"StreetAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("StreetAddress");
                                    }
                                

                                          if (localStreetAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("StreetAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreetAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreetAddress2Tracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"StreetAddress2", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"StreetAddress2");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("StreetAddress2");
                                    }
                                

                                          if (localStreetAddress2==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("StreetAddress2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreetAddress2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCityTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"City", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"City");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("City");
                                    }
                                

                                          if (localCity==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("City cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"State", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"State");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("State");
                                    }
                                

                                          if (localState==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("State cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localState);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountryTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Country", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Country");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Country");
                                    }
                                

                                          if (localCountry==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Country cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountry);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostalCodeTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"PostalCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PostalCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PostalCode");
                                    }
                                

                                          if (localPostalCode==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("PostalCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostalCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    if (localPostalCodeType==null){
                                         throw new RuntimeException("PostalCodeType cannot be null!!");
                                    }
                                   localPostalCodeType.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","PostalCodeType"),
                                       factory,xmlWriter);
                                 if (localTelephoneTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Telephone", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Telephone");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Telephone");
                                    }
                                

                                          if (localTelephone==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Telephone cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTelephone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExtensionTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Extension", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Extension");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Extension");
                                    }
                                

                                          if (localExtension==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Extension cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExtension);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLocationNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"LocationName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LocationName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LocationName");
                                    }
                                

                                          if (localLocationName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("LocationName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLocationName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"StartDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"StartDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("StartDate");
                                    }
                                

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("StartDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localUserNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"UserName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UserName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UserName");
                                    }
                                

                                          if (localUserName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("UserName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Password", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Password");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Password");
                                    }
                                

                                          if (localPassword==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Password cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"BirthDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"BirthDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("BirthDate");
                                    }
                                

                                          if (localBirthDate==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("BirthDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSocialSecurityNumberTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"SocialSecurityNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SocialSecurityNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SocialSecurityNumber");
                                    }
                                

                                          if (localSocialSecurityNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("SocialSecurityNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSocialSecurityNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSupervisorUserNamesTracker){
                                    if (localSupervisorUserNames==null){
                                         throw new RuntimeException("SupervisorUserNames cannot be null!!");
                                    }
                                   localSupervisorUserNames.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","SupervisorUserNames"),
                                       factory,xmlWriter);
                                } if (localGroupsTracker){
                                    if (localGroups==null){
                                         throw new RuntimeException("Groups cannot be null!!");
                                    }
                                   localGroups.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Groups"),
                                       factory,xmlWriter);
                                } if (localRoleNamesTracker){
                                    if (localRoleNames==null){
                                         throw new RuntimeException("RoleNames cannot be null!!");
                                    }
                                   localRoleNames.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","RoleNames"),
                                       factory,xmlWriter);
                                } if (localDefaultRoleNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"DefaultRoleName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DefaultRoleName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DefaultRoleName");
                                    }
                                

                                          if (localDefaultRoleName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("DefaultRoleName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultRoleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExternalIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"ExternalId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ExternalId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ExternalId");
                                    }
                                

                                          if (localExternalId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("ExternalId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExternalId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeZoneTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"TimeZone", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeZone");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeZone");
                                    }
                                

                                          if (localTimeZone==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("TimeZone cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeZone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCurrencyTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Currency", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Currency");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Currency");
                                    }
                                

                                          if (localCurrency==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Currency cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCurrency);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLanguageTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"Language", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Language");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Language");
                                    }
                                

                                          if (localLanguage==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("Language cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLanguage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEHRIEmployeeIDTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"EHRIEmployeeID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EHRIEmployeeID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EHRIEmployeeID");
                                    }
                                

                                          if (localEHRIEmployeeID==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("EHRIEmployeeID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEHRIEmployeeID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySubElementCodeTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"AgencySubElementCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AgencySubElementCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AgencySubElementCode");
                                    }
                                

                                          if (localAgencySubElementCode==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("AgencySubElementCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencySubElementCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoChangePasswordNextLoginTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"DoChangePasswordNextLogin", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DoChangePasswordNextLogin");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DoChangePasswordNextLogin");
                                    }
                                

                                          if (localDoChangePasswordNextLogin==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("DoChangePasswordNextLogin cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDoChangePasswordNextLogin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUniqueIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"UniqueId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UniqueId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UniqueId");
                                    }
                                

                                          if (localUniqueId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("UniqueId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUniqueId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCustomUserAttributesTracker){
                                    if (localCustomUserAttributes==null){
                                         throw new RuntimeException("CustomUserAttributes cannot be null!!");
                                    }
                                   localCustomUserAttributes.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomUserAttributes"),
                                       factory,xmlWriter);
                                } if (localCustomSelectUserAttributesTracker){
                                    if (localCustomSelectUserAttributes==null){
                                         throw new RuntimeException("CustomSelectUserAttributes cannot be null!!");
                                    }
                                   localCustomSelectUserAttributes.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomSelectUserAttributes"),
                                       factory,xmlWriter);
                                } if (localCatalogAccessCodeNamesTracker){
                                    if (localCatalogAccessCodeNames==null){
                                         throw new RuntimeException("CatalogAccessCodeNames cannot be null!!");
                                    }
                                   localCatalogAccessCodeNames.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CatalogAccessCodeNames"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new RuntimeException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CreationTime"));
                            
                                        if (localCreationTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationTime));
                                        } else {
                                           throw new RuntimeException("CreationTime cannot be null!!");
                                        }
                                    
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "ModifiedTime"));
                            
                                        if (localModifiedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModifiedTime));
                                        } else {
                                           throw new RuntimeException("ModifiedTime cannot be null!!");
                                        }
                                     if (localFirstNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "FirstName"));
                            
                                        if (localFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstName));
                                        } else {
                                           throw new RuntimeException("FirstName cannot be null!!");
                                        }
                                    } if (localMiddleInitialTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "MiddleInitial"));
                            
                                        if (localMiddleInitial != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMiddleInitial));
                                        } else {
                                           throw new RuntimeException("MiddleInitial cannot be null!!");
                                        }
                                    } if (localLastNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "LastName"));
                            
                                        if (localLastName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastName));
                                        } else {
                                           throw new RuntimeException("LastName cannot be null!!");
                                        }
                                    } if (localEmailTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Email"));
                            
                                        if (localEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
                                        } else {
                                           throw new RuntimeException("Email cannot be null!!");
                                        }
                                    } if (localStreetAddressTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "StreetAddress"));
                            
                                        if (localStreetAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreetAddress));
                                        } else {
                                           throw new RuntimeException("StreetAddress cannot be null!!");
                                        }
                                    } if (localStreetAddress2Tracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "StreetAddress2"));
                            
                                        if (localStreetAddress2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreetAddress2));
                                        } else {
                                           throw new RuntimeException("StreetAddress2 cannot be null!!");
                                        }
                                    } if (localCityTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "City"));
                            
                                        if (localCity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCity));
                                        } else {
                                           throw new RuntimeException("City cannot be null!!");
                                        }
                                    } if (localStateTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "State"));
                            
                                        if (localState != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                                        } else {
                                           throw new RuntimeException("State cannot be null!!");
                                        }
                                    } if (localCountryTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Country"));
                            
                                        if (localCountry != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountry));
                                        } else {
                                           throw new RuntimeException("Country cannot be null!!");
                                        }
                                    } if (localPostalCodeTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "PostalCode"));
                            
                                        if (localPostalCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalCode));
                                        } else {
                                           throw new RuntimeException("PostalCode cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "PostalCodeType"));
                            
                            
                                    if (localPostalCodeType==null){
                                         throw new RuntimeException("PostalCodeType cannot be null!!");
                                    }
                                    elementList.add(localPostalCodeType);
                                 if (localTelephoneTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Telephone"));
                            
                                        if (localTelephone != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelephone));
                                        } else {
                                           throw new RuntimeException("Telephone cannot be null!!");
                                        }
                                    } if (localExtensionTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Extension"));
                            
                                        if (localExtension != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtension));
                                        } else {
                                           throw new RuntimeException("Extension cannot be null!!");
                                        }
                                    } if (localLocationNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "LocationName"));
                            
                                        if (localLocationName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationName));
                                        } else {
                                           throw new RuntimeException("LocationName cannot be null!!");
                                        }
                                    }
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "StartDate"));
                            
                                        if (localStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                        } else {
                                           throw new RuntimeException("StartDate cannot be null!!");
                                        }
                                     if (localUserNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UserName"));
                            
                                        if (localUserName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
                                        } else {
                                           throw new RuntimeException("UserName cannot be null!!");
                                        }
                                    } if (localPasswordTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Password"));
                            
                                        if (localPassword != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
                                        } else {
                                           throw new RuntimeException("Password cannot be null!!");
                                        }
                                    }
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "BirthDate"));
                            
                                        if (localBirthDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthDate));
                                        } else {
                                           throw new RuntimeException("BirthDate cannot be null!!");
                                        }
                                     if (localSocialSecurityNumberTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "SocialSecurityNumber"));
                            
                                        if (localSocialSecurityNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSocialSecurityNumber));
                                        } else {
                                           throw new RuntimeException("SocialSecurityNumber cannot be null!!");
                                        }
                                    } if (localSupervisorUserNamesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "SupervisorUserNames"));
                            
                            
                                    if (localSupervisorUserNames==null){
                                         throw new RuntimeException("SupervisorUserNames cannot be null!!");
                                    }
                                    elementList.add(localSupervisorUserNames);
                                } if (localGroupsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Groups"));
                            
                            
                                    if (localGroups==null){
                                         throw new RuntimeException("Groups cannot be null!!");
                                    }
                                    elementList.add(localGroups);
                                } if (localRoleNamesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "RoleNames"));
                            
                            
                                    if (localRoleNames==null){
                                         throw new RuntimeException("RoleNames cannot be null!!");
                                    }
                                    elementList.add(localRoleNames);
                                } if (localDefaultRoleNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "DefaultRoleName"));
                            
                                        if (localDefaultRoleName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultRoleName));
                                        } else {
                                           throw new RuntimeException("DefaultRoleName cannot be null!!");
                                        }
                                    } if (localExternalIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "ExternalId"));
                            
                                        if (localExternalId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalId));
                                        } else {
                                           throw new RuntimeException("ExternalId cannot be null!!");
                                        }
                                    } if (localTimeZoneTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "TimeZone"));
                            
                                        if (localTimeZone != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeZone));
                                        } else {
                                           throw new RuntimeException("TimeZone cannot be null!!");
                                        }
                                    } if (localCurrencyTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Currency"));
                            
                                        if (localCurrency != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrency));
                                        } else {
                                           throw new RuntimeException("Currency cannot be null!!");
                                        }
                                    } if (localLanguageTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Language"));
                            
                                        if (localLanguage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
                                        } else {
                                           throw new RuntimeException("Language cannot be null!!");
                                        }
                                    } if (localEHRIEmployeeIDTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "EHRIEmployeeID"));
                            
                                        if (localEHRIEmployeeID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEHRIEmployeeID));
                                        } else {
                                           throw new RuntimeException("EHRIEmployeeID cannot be null!!");
                                        }
                                    } if (localAgencySubElementCodeTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "AgencySubElementCode"));
                            
                                        if (localAgencySubElementCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySubElementCode));
                                        } else {
                                           throw new RuntimeException("AgencySubElementCode cannot be null!!");
                                        }
                                    } if (localDoChangePasswordNextLoginTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "DoChangePasswordNextLogin"));
                            
                                        if (localDoChangePasswordNextLogin != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoChangePasswordNextLogin));
                                        } else {
                                           throw new RuntimeException("DoChangePasswordNextLogin cannot be null!!");
                                        }
                                    } if (localUniqueIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UniqueId"));
                            
                                        if (localUniqueId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUniqueId));
                                        } else {
                                           throw new RuntimeException("UniqueId cannot be null!!");
                                        }
                                    } if (localCustomUserAttributesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CustomUserAttributes"));
                            
                            
                                    if (localCustomUserAttributes==null){
                                         throw new RuntimeException("CustomUserAttributes cannot be null!!");
                                    }
                                    elementList.add(localCustomUserAttributes);
                                } if (localCustomSelectUserAttributesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CustomSelectUserAttributes"));
                            
                            
                                    if (localCustomSelectUserAttributes==null){
                                         throw new RuntimeException("CustomSelectUserAttributes cannot be null!!");
                                    }
                                    elementList.add(localCustomSelectUserAttributes);
                                } if (localCatalogAccessCodeNamesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CatalogAccessCodeNames"));
                            
                            
                                    if (localCatalogAccessCodeNames==null){
                                         throw new RuntimeException("CatalogAccessCodeNames cannot be null!!");
                                    }
                                    elementList.add(localCatalogAccessCodeNames);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static User parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            User object = new User();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"User".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (User)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Status").equals(reader.getName())){
                                
                                        object.setStatus(Status.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CreationTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","ModifiedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setModifiedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","FirstName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","MiddleInitial").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMiddleInitial(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LastName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Email").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","StreetAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreetAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","StreetAddress2").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreetAddress2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","City").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","State").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Country").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","PostalCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","PostalCodeType").equals(reader.getName())){
                                
                                        object.setPostalCodeType(PostalCodeType.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Telephone").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTelephone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Extension").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExtension(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","LocationName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLocationName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","StartDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UserName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Password").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","BirthDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBirthDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","SocialSecurityNumber").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSocialSecurityNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","SupervisorUserNames").equals(reader.getName())){
                                
                                        object.setSupervisorUserNames(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Groups").equals(reader.getName())){
                                
                                        object.setGroups(ArrayOfGroup.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","RoleNames").equals(reader.getName())){
                                
                                        object.setRoleNames(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","DefaultRoleName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultRoleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","ExternalId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExternalId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","TimeZone").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeZone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Currency").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCurrency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Language").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLanguage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","EHRIEmployeeID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEHRIEmployeeID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","AgencySubElementCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySubElementCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","DoChangePasswordNextLogin").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoChangePasswordNextLogin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UniqueId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUniqueId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomUserAttributes").equals(reader.getName())){
                                
                                        object.setCustomUserAttributes(ArrayOfCustomUserAttribute.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomSelectUserAttributes").equals(reader.getName())){
                                
                                        object.setCustomSelectUserAttributes(ArrayOfCustomUserAttribute.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CatalogAccessCodeNames").equals(reader.getName())){
                                
                                        object.setCatalogAccessCodeNames(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExistsByExternalIdResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExistsByExternalIdResponse",
                "ns1");

            

                        /**
                        * field for UserExistsByExternalIdResult
                        */

                        
                            protected boolean localUserExistsByExternalIdResult ;
                        

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUserExistsByExternalIdResult(){
                               return localUserExistsByExternalIdResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserExistsByExternalIdResult
                               */
                               public void setUserExistsByExternalIdResult(boolean param){
                            
                                            this.localUserExistsByExternalIdResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExistsByExternalIdResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"UserExistsByExternalIdResult", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UserExistsByExternalIdResult");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UserExistsByExternalIdResult");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new RuntimeException("UserExistsByExternalIdResult cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsByExternalIdResult));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UserExistsByExternalIdResult"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsByExternalIdResult));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExistsByExternalIdResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExistsByExternalIdResponse object = new UserExistsByExternalIdResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExistsByExternalIdResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExistsByExternalIdResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UserExistsByExternalIdResult").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserExistsByExternalIdResult(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExistsResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExistsResponse",
                "ns1");

            

                        /**
                        * field for UserExistsResult
                        */

                        
                            protected boolean localUserExistsResult ;
                        

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUserExistsResult(){
                               return localUserExistsResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserExistsResult
                               */
                               public void setUserExistsResult(boolean param){
                            
                                            this.localUserExistsResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExistsResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"UserExistsResult", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UserExistsResult");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UserExistsResult");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new RuntimeException("UserExistsResult cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsResult));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UserExistsResult"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsResult));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExistsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExistsResponse object = new UserExistsResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExistsResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExistsResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UserExistsResult").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserExistsResult(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class ArrayOfGroup
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArrayOfGroup
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Group
                        * This was an Array!
                        */

                        
                            protected Group[] localGroup ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return Group[]
                           */
                           public  Group[] getGroup(){
                               return localGroup;
                           }

                           
                        


                               
                              /**
                               * validate the array for Group
                               */
                              protected void validateGroup(Group[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Group
                              */
                              public void setGroup(Group[] param){
                              
                                   validateGroup(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localGroupTracker = true;
                                          } else {
                                             localGroupTracker = true;
                                                 
                                          }
                                      
                                      this.localGroup=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param Group
                             */
                             public void addGroup(Group param){
                                   if (localGroup == null){
                                   localGroup = new Group[]{};
                                   }

                            
                                 //update the setting tracker
                                localGroupTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localGroup);
                               list.add(param);
                               this.localGroup =
                             (Group[])list.toArray(
                            new Group[list.size()]);

                             }
                             

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       ArrayOfGroup.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localGroupTracker){
                             if (localGroup!=null){
                                    for (int i = 0;i < localGroup.length;i++){
                                        if (localGroup[i] != null){
                                         localGroup[i].serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Group"),
                                                   factory,xmlWriter);
                                        } else {
                                           
                                                    // write null attribute
                                                    java.lang.String namespace2 = "http://geolearning.com/geonext/webservices/";
                                                    if (! namespace2.equals("")) {
                                                        java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                        if (prefix2 == null) {
                                                            prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                            xmlWriter.writeStartElement(prefix2,"Group", namespace2);
                                                            xmlWriter.writeNamespace(prefix2, namespace2);
                                                            xmlWriter.setPrefix(prefix2, namespace2);

                                                        } else {
                                                            xmlWriter.writeStartElement(namespace2,"Group");
                                                        }

                                                    } else {
                                                        xmlWriter.writeStartElement("Group");
                                                    }

                                                   // write the nil attribute
                                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                   xmlWriter.writeEndElement();
                                            
                                        }

                                    }
                             } else {
                                
                                        // write null attribute
                                        java.lang.String namespace2 = "http://geolearning.com/geonext/webservices/";
                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                xmlWriter.writeStartElement(prefix2,"Group", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Group");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Group");
                                        }

                                       // write the nil attribute
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                       xmlWriter.writeEndElement();
                                
                            }
                        }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localGroupTracker){
                             if (localGroup!=null) {
                                 for (int i = 0;i < localGroup.length;i++){

                                    if (localGroup[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "Group"));
                                         elementList.add(localGroup[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "Group"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "Group"));
                                        elementList.add(localGroup);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ArrayOfGroup parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ArrayOfGroup object = new ArrayOfGroup();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ArrayOfGroup".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfGroup)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Group").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list1.add(null);
                                                  reader.next();
                                              } else {
                                            list1.add(Group.Factory.parse(reader));
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // We should be at the end element, but make sure
                                                while (!reader.isEndElement())
                                                    reader.next();
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Group").equals(reader.getName())){
                                                        
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(Group.Factory.parse(reader));
                                                        }
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setGroup((Group[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    Group.class,
                                                    list1));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class GenerateUserObject
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "GenerateUserObject",
                "ns1");

            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       GenerateUserObject.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static GenerateUserObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GenerateUserObject object = new GenerateUserObject();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"GenerateUserObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GenerateUserObject)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class Status
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "Status",
                "ns1");

            

                        /**
                        * field for Status
                        */

                        
                            protected java.lang.String localStatus ;
                        
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected Status(java.lang.String value, boolean isRegisterValue) {
                                    localStatus = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localStatus, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _Active =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Active");
                                
                                    public static final java.lang.String _Archived =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Archived");
                                
                                    public static final java.lang.String _Cancelled =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Cancelled");
                                
                                    public static final java.lang.String _Inactive =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Inactive");
                                
                                    public static final java.lang.String _Suspended =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Suspended");
                                
                                    public static final java.lang.String _Tentative =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Tentative");
                                
                                    public static final java.lang.String _Undefined =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Undefined");
                                
                                public static final Status Active =
                                    new Status(_Active,true);
                            
                                public static final Status Archived =
                                    new Status(_Archived,true);
                            
                                public static final Status Cancelled =
                                    new Status(_Cancelled,true);
                            
                                public static final Status Inactive =
                                    new Status(_Inactive,true);
                            
                                public static final Status Suspended =
                                    new Status(_Suspended,true);
                            
                                public static final Status Tentative =
                                    new Status(_Tentative,true);
                            
                                public static final Status Undefined =
                                    new Status(_Undefined,true);
                            

                                public java.lang.String getValue() { return localStatus;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localStatus.toString();
                                    

                                }

                        

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       Status.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String localName = parentQName.getLocalPart();
                        
                            if (! namespace.equals("")) {
                                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                                if (prefix == null) {
                                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                    xmlWriter.writeStartElement(prefix, localName, namespace);
                                    xmlWriter.writeNamespace(prefix, namespace);
                                    xmlWriter.setPrefix(prefix, namespace);

                                } else {
                                    xmlWriter.writeStartElement(namespace, localName);
                                }

                            } else {
                                xmlWriter.writeStartElement(localName);
                            }
                            
                                          if (localStatus==null){
                                            
                                                     throw new RuntimeException("Value cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localStatus);
                                            
                                         }
                                    

                       xmlWriter.writeEndElement();
                    

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static Status fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    Status enumeration = (Status)
                       
                               _table_.get(value);
                           

                    if (enumeration==null) throw new java.lang.IllegalArgumentException();
                    return enumeration;
                }
                public static Status fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Status parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Status object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                    
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = Status.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = Status.Factory.fromString(content,"");
                                        }
                                        
                                        
                             } else reader.next();  
                            }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class ArrayOfCustomUserAttribute
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArrayOfCustomUserAttribute
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CustomUserAttribute
                        * This was an Array!
                        */

                        
                            protected CustomUserAttribute[] localCustomUserAttribute ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomUserAttributeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return CustomUserAttribute[]
                           */
                           public  CustomUserAttribute[] getCustomUserAttribute(){
                               return localCustomUserAttribute;
                           }

                           
                        


                               
                              /**
                               * validate the array for CustomUserAttribute
                               */
                              protected void validateCustomUserAttribute(CustomUserAttribute[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CustomUserAttribute
                              */
                              public void setCustomUserAttribute(CustomUserAttribute[] param){
                              
                                   validateCustomUserAttribute(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localCustomUserAttributeTracker = true;
                                          } else {
                                             localCustomUserAttributeTracker = true;
                                                 
                                          }
                                      
                                      this.localCustomUserAttribute=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param CustomUserAttribute
                             */
                             public void addCustomUserAttribute(CustomUserAttribute param){
                                   if (localCustomUserAttribute == null){
                                   localCustomUserAttribute = new CustomUserAttribute[]{};
                                   }

                            
                                 //update the setting tracker
                                localCustomUserAttributeTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustomUserAttribute);
                               list.add(param);
                               this.localCustomUserAttribute =
                             (CustomUserAttribute[])list.toArray(
                            new CustomUserAttribute[list.size()]);

                             }
                             

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       ArrayOfCustomUserAttribute.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localCustomUserAttributeTracker){
                             if (localCustomUserAttribute!=null){
                                    for (int i = 0;i < localCustomUserAttribute.length;i++){
                                        if (localCustomUserAttribute[i] != null){
                                         localCustomUserAttribute[i].serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomUserAttribute"),
                                                   factory,xmlWriter);
                                        } else {
                                           
                                                    // write null attribute
                                                    java.lang.String namespace2 = "http://geolearning.com/geonext/webservices/";
                                                    if (! namespace2.equals("")) {
                                                        java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                        if (prefix2 == null) {
                                                            prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                            xmlWriter.writeStartElement(prefix2,"CustomUserAttribute", namespace2);
                                                            xmlWriter.writeNamespace(prefix2, namespace2);
                                                            xmlWriter.setPrefix(prefix2, namespace2);

                                                        } else {
                                                            xmlWriter.writeStartElement(namespace2,"CustomUserAttribute");
                                                        }

                                                    } else {
                                                        xmlWriter.writeStartElement("CustomUserAttribute");
                                                    }

                                                   // write the nil attribute
                                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                   xmlWriter.writeEndElement();
                                            
                                        }

                                    }
                             } else {
                                
                                        // write null attribute
                                        java.lang.String namespace2 = "http://geolearning.com/geonext/webservices/";
                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                xmlWriter.writeStartElement(prefix2,"CustomUserAttribute", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CustomUserAttribute");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CustomUserAttribute");
                                        }

                                       // write the nil attribute
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                       xmlWriter.writeEndElement();
                                
                            }
                        }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCustomUserAttributeTracker){
                             if (localCustomUserAttribute!=null) {
                                 for (int i = 0;i < localCustomUserAttribute.length;i++){

                                    if (localCustomUserAttribute[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "CustomUserAttribute"));
                                         elementList.add(localCustomUserAttribute[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "CustomUserAttribute"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                          "CustomUserAttribute"));
                                        elementList.add(localCustomUserAttribute);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ArrayOfCustomUserAttribute parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ArrayOfCustomUserAttribute object = new ArrayOfCustomUserAttribute();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ArrayOfCustomUserAttribute".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfCustomUserAttribute)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomUserAttribute").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list1.add(null);
                                                  reader.next();
                                              } else {
                                            list1.add(CustomUserAttribute.Factory.parse(reader));
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // We should be at the end element, but make sure
                                                while (!reader.isEndElement())
                                                    reader.next();
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CustomUserAttribute").equals(reader.getName())){
                                                        
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(CustomUserAttribute.Factory.parse(reader));
                                                        }
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setCustomUserAttribute((CustomUserAttribute[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    CustomUserAttribute.class,
                                                    list1));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExistsByUniqueIdResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExistsByUniqueIdResponse",
                "ns1");

            

                        /**
                        * field for UserExistsByUniqueIdResult
                        */

                        
                            protected boolean localUserExistsByUniqueIdResult ;
                        

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUserExistsByUniqueIdResult(){
                               return localUserExistsByUniqueIdResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserExistsByUniqueIdResult
                               */
                               public void setUserExistsByUniqueIdResult(boolean param){
                            
                                            this.localUserExistsByUniqueIdResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExistsByUniqueIdResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"UserExistsByUniqueIdResult", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UserExistsByUniqueIdResult");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UserExistsByUniqueIdResult");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new RuntimeException("UserExistsByUniqueIdResult cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsByUniqueIdResult));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UserExistsByUniqueIdResult"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserExistsByUniqueIdResult));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExistsByUniqueIdResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExistsByUniqueIdResponse object = new UserExistsByUniqueIdResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExistsByUniqueIdResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExistsByUniqueIdResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UserExistsByUniqueIdResult").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserExistsByUniqueIdResult(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UpdateUserResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UpdateUserResponse",
                "ns1");

            

                        /**
                        * field for UpdateUserResult
                        */

                        
                            protected Result localUpdateUserResult ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateUserResultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return Result
                           */
                           public  Result getUpdateUserResult(){
                               return localUpdateUserResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateUserResult
                               */
                               public void setUpdateUserResult(Result param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUpdateUserResultTracker = true;
                                       } else {
                                          localUpdateUserResultTracker = false;
                                              
                                       }
                                   
                                            this.localUpdateUserResult=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UpdateUserResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUpdateUserResultTracker){
                                    if (localUpdateUserResult==null){
                                         throw new RuntimeException("UpdateUserResult cannot be null!!");
                                    }
                                   localUpdateUserResult.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UpdateUserResult"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUpdateUserResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "UpdateUserResult"));
                            
                            
                                    if (localUpdateUserResult==null){
                                         throw new RuntimeException("UpdateUserResult cannot be null!!");
                                    }
                                    elementList.add(localUpdateUserResult);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UpdateUserResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UpdateUserResponse object = new UpdateUserResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UpdateUserResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdateUserResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","UpdateUserResult").equals(reader.getName())){
                                
                                        object.setUpdateUserResult(Result.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class LoadUser
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUser",
                "ns1");

            

                        /**
                        * field for UserName
                        */

                        
                            protected java.lang.String localUserName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserName(){
                               return localUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserName
                               */
                               public void setUserName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserNameTracker = true;
                                       } else {
                                          localUserNameTracker = false;
                                              
                                       }
                                   
                                            this.localUserName=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUser.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUserNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"userName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"userName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("userName");
                                    }
                                

                                          if (localUserName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("userName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUserNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "userName"));
                            
                                        if (localUserName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
                                        } else {
                                           throw new RuntimeException("userName cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUser object = new LoadUser();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUser".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUser)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","userName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class UserExists
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "UserExists",
                "ns1");

            

                        /**
                        * field for UserName
                        */

                        
                            protected java.lang.String localUserName ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserName(){
                               return localUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserName
                               */
                               public void setUserName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserNameTracker = true;
                                       } else {
                                          localUserNameTracker = false;
                                              
                                       }
                                   
                                            this.localUserName=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       UserExists.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localUserNameTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"userName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"userName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("userName");
                                    }
                                

                                          if (localUserName==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("userName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localUserNameTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "userName"));
                            
                                        if (localUserName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
                                        } else {
                                           throw new RuntimeException("userName cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UserExists parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserExists object = new UserExists();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UserExists".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserExists)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","userName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class ArrayOfString
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArrayOfString
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for String
                        * This was an Array!
                        */

                        
                            protected java.lang.String[] localString ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStringTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getString(){
                               return localString;
                           }

                           
                        


                               
                              /**
                               * validate the array for String
                               */
                              protected void validateString(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param String
                              */
                              public void setString(java.lang.String[] param){
                              
                                   validateString(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localStringTracker = true;
                                          } else {
                                             localStringTracker = true;
                                                 
                                          }
                                      
                                      this.localString=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addString(java.lang.String param){
                                   if (localString == null){
                                   localString = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localStringTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localString);
                               list.add(param);
                               this.localString =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       ArrayOfString.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localStringTracker){
                             if (localString!=null) {
                                   namespace = "http://geolearning.com/geonext/webservices/";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localString.length;i++){
                                        
                                            if (localString[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                        xmlWriter.writeStartElement(prefix2,"string", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"string");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("string");
                                                }

                                            
                                                        xmlWriter.writeCharacters(localString[i]);
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://geolearning.com/geonext/webservices/";
                                                            if (! namespace.equals("")) {
                                                                prefix = xmlWriter.getPrefix(namespace);

                                                                if (prefix == null) {
                                                                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                                    xmlWriter.writeStartElement(prefix,"string", namespace);
                                                                    xmlWriter.writeNamespace(prefix, namespace);
                                                                    xmlWriter.setPrefix(prefix, namespace);

                                                                } else {
                                                                    xmlWriter.writeStartElement(namespace,"string");
                                                                }

                                                            } else {
                                                                xmlWriter.writeStartElement("string");
                                                            }
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                            java.lang.String namespace2 = "http://geolearning.com/geonext/webservices/";
                                            if (! namespace2.equals("")) {
                                                java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                if (prefix2 == null) {
                                                    prefix2 = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                                    xmlWriter.writeStartElement(prefix2,"string", namespace2);
                                                    xmlWriter.writeNamespace(prefix2, namespace2);
                                                    xmlWriter.setPrefix(prefix2, namespace2);

                                                } else {
                                                    xmlWriter.writeStartElement(namespace2,"string");
                                                }

                                            } else {
                                                xmlWriter.writeStartElement("string");
                                            }

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localStringTracker){
                            if (localString!=null){
                                  for (int i = 0;i < localString.length;i++){
                                      
                                         if (localString[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                              "string"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localString[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                              "string"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                              "string"));
                                    elementList.add(null);
                                
                            }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ArrayOfString parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ArrayOfString object = new ArrayOfString();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ArrayOfString".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfString)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","string").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list1.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list1.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","string").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list1.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setString((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class PersistentOfUserUserUserResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PersistentOfUserUserUserResult
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Status
                        */

                        
                            protected Status localStatus ;
                        

                           /**
                           * Auto generated getter method
                           * @return Status
                           */
                           public  Status getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(Status param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for CreationTime
                        */

                        
                            protected java.util.Calendar localCreationTime ;
                        

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreationTime(){
                               return localCreationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreationTime
                               */
                               public void setCreationTime(java.util.Calendar param){
                            
                                            this.localCreationTime=param;
                                    

                               }
                            

                        /**
                        * field for ModifiedTime
                        */

                        
                            protected java.util.Calendar localModifiedTime ;
                        

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getModifiedTime(){
                               return localModifiedTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ModifiedTime
                               */
                               public void setModifiedTime(java.util.Calendar param){
                            
                                            this.localModifiedTime=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       PersistentOfUserUserUserResult.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
               
                                    if (localStatus==null){
                                         throw new RuntimeException("Status cannot be null!!");
                                    }
                                   localStatus.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Status"),
                                       factory,xmlWriter);
                                
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"CreationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CreationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CreationTime");
                                    }
                                

                                          if (localCreationTime==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("CreationTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"ModifiedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ModifiedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ModifiedTime");
                                    }
                                

                                          if (localModifiedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("ModifiedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModifiedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new RuntimeException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "CreationTime"));
                            
                                        if (localCreationTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationTime));
                                        } else {
                                           throw new RuntimeException("CreationTime cannot be null!!");
                                        }
                                    
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "ModifiedTime"));
                            
                                        if (localModifiedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModifiedTime));
                                        } else {
                                           throw new RuntimeException("ModifiedTime cannot be null!!");
                                        }
                                    

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static PersistentOfUserUserUserResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PersistentOfUserUserUserResult object = new PersistentOfUserUserUserResult();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"PersistentOfUserUserUserResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PersistentOfUserUserUserResult)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Status").equals(reader.getName())){
                                
                                        object.setStatus(Status.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","CreationTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","ModifiedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setModifiedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class LoadUserByExternalId
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://geolearning.com/geonext/webservices/",
                "LoadUserByExternalId",
                "ns1");

            

                        /**
                        * field for ExternalId
                        */

                        
                            protected java.lang.String localExternalId ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExternalId(){
                               return localExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalId
                               */
                               public void setExternalId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExternalIdTracker = true;
                                       } else {
                                          localExternalIdTracker = false;
                                              
                                       }
                                   
                                            this.localExternalId=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       LoadUserByExternalId.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localExternalIdTracker){
                                    namespace = "http://geolearning.com/geonext/webservices/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                                            xmlWriter.writeStartElement(prefix,"externalId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"externalId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("externalId");
                                    }
                                

                                          if (localExternalId==null){
                                              // write the nil attribute
                                              
                                                     throw new RuntimeException("externalId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExternalId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localExternalIdTracker){
                             elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "externalId"));
                            
                                        if (localExternalId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalId));
                                        } else {
                                           throw new RuntimeException("externalId cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LoadUserByExternalId parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LoadUserByExternalId object = new LoadUserByExternalId();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LoadUserByExternalId".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LoadUserByExternalId)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","externalId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExternalId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          

        public static class Result
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Result
                Namespace URI = http://geolearning.com/geonext/webservices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Errors
                        */

                        
                            protected ArrayOfString localErrors ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfString
                           */
                           public  ArrayOfString getErrors(){
                               return localErrors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Errors
                               */
                               public void setErrors(ArrayOfString param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorsTracker = true;
                                       } else {
                                          localErrorsTracker = false;
                                              
                                       }
                                   
                                            this.localErrors=param;
                                    

                               }
                            

                        /**
                        * field for Warnings
                        */

                        
                            protected ArrayOfString localWarnings ;
                        
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWarningsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ArrayOfString
                           */
                           public  ArrayOfString getWarnings(){
                               return localWarnings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Warnings
                               */
                               public void setWarnings(ArrayOfString param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localWarningsTracker = true;
                                       } else {
                                          localWarningsTracker = false;
                                              
                                       }
                                   
                                            this.localWarnings=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement(
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory){


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       Result.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }



         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

                java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
                    xmlWriter.writeStartElement(parentQName.getLocalPart());
                }

                
                if (localErrorsTracker){
                                    if (localErrors==null){
                                         throw new RuntimeException("Errors cannot be null!!");
                                    }
                                   localErrors.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Errors"),
                                       factory,xmlWriter);
                                } if (localWarningsTracker){
                                    if (localWarnings==null){
                                         throw new RuntimeException("Warnings cannot be null!!");
                                    }
                                   localWarnings.serialize(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Warnings"),
                                       factory,xmlWriter);
                                }
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    	  	  if (namespace.equals(""))
        	  {
        		  xmlWriter.writeAttribute(attName,attValue);
        	  }
        	  else
        	  {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localErrorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Errors"));
                            
                            
                                    if (localErrors==null){
                                         throw new RuntimeException("Errors cannot be null!!");
                                    }
                                    elementList.add(localErrors);
                                } if (localWarningsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/",
                                                                      "Warnings"));
                            
                            
                                    if (localWarnings==null){
                                         throw new RuntimeException("Warnings cannot be null!!");
                                    }
                                    elementList.add(localWarnings);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Result parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Result object = new Result();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Result".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Result)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }

                }
                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Errors").equals(reader.getName())){
                                
                                        object.setErrors(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://geolearning.com/geonext/webservices/","Warnings").equals(reader.getName())){
                                
                                        object.setWarnings(ArrayOfString.Factory.parse(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse param, boolean optimizeContent){
            
                     return param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             
                            
                            private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser param, boolean optimizeContent){
                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                 
                                        emptyEnvelope.getBody().addChild(param.getOMElement(com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser.MY_QNAME,factory));
                                    
                             return emptyEnvelope;
                            }

                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces){

        try {
        
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.CreateUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObject.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.GenerateUserObjectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByExternalIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByUniqueIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExists.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UserExistsByExternalIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.LoadUserByUniqueIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse.class.equals(type)){
                
                           return com.geolearning.geonext.webservices.WebServicesWebServicesSoap12Stub.UpdateUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
           return null;
        }



    
            private void setOpNameArray(){
            opNameArray = new javax.xml.namespace.QName[] {
            
            };
           }
           
   }
   