/**
 * CalculatorServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.axis;

public interface CalculatorServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCalculatorServiceAddress();

    public org.axis.CalculatorService getCalculatorService() throws javax.xml.rpc.ServiceException;

    public org.axis.CalculatorService getCalculatorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
