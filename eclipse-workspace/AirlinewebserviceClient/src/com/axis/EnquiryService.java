/**
 * EnquiryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.axis;

public interface EnquiryService extends java.rmi.Remote {
    public java.lang.String getName(int flightNum, int seatNum) throws java.rmi.RemoteException;
    public java.lang.String getDetails(java.lang.String from, java.lang.String to) throws java.rmi.RemoteException;
}
