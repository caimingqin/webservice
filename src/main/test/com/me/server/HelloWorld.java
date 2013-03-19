

/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.me.server;

    /*
     *  HelloWorld java interface
     */

    public interface HelloWorld {
          

        /**
          * Auto generated method signature
          * 
                    * @param get0
                
         */

         
                     public com.me.server.GetResponse get(

                        com.me.server.Get get0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param get0
            
          */
        public void startget(

            com.me.server.Get get0,

            final com.me.server.HelloWorldCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    