

/**
 * StudentManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.student.mgt.stub;

    /*
     *  StudentManager java interface
     */

    public interface StudentManager {
          

        /**
          * Auto generated method signature
          * 
                    * @param getStudents0
                
         */

         
                     public org.wso2.carbon.student.mgt.data.xsd.Student[] getStudents(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getStudents0
            
          */
        public void startgetStudents(

            

            final org.wso2.carbon.student.mgt.stub.StudentManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    