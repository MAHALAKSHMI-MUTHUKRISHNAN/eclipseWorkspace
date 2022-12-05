/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.axis;

public interface CalculatorService extends java.rmi.Remote {
    public int add(int a, int b) throws java.rmi.RemoteException;
    public int mul(int a, int b) throws java.rmi.RemoteException;
    public int sub(int a, int b) throws java.rmi.RemoteException;
    public int div(int a, int b) throws java.rmi.RemoteException;
}
