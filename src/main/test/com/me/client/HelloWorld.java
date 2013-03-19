

/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.me.client;

    /*
     *  HelloWorld java interface
     */

    public interface HelloWorld {
          

        /**
          * Auto generated method signature
          * 
                    * @param get0
                
         */

         
                     public com.me.client.GetResponse get(

                        com.me.client.Get get0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param get0
            
          */
        public void startget(

            com.me.client.Get get0,

            final com.me.client.HelloWorldCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    