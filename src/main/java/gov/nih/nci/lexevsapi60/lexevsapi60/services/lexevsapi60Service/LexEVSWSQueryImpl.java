/**
 * LexEVSWSQueryImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service;

public interface LexEVSWSQueryImpl extends java.rmi.Remote {
    public java.lang.Object[] query(java.lang.String targetClassName, java.lang.Object criteria, int startIndex) throws java.rmi.RemoteException;
    public java.lang.String getVersion() throws java.rmi.RemoteException;
    public java.lang.Object[] getAssociation(java.lang.Object source, java.lang.String associationName, int startIndex) throws java.rmi.RemoteException;
    public int getRecordsPerQuery() throws java.rmi.RemoteException;
    public int getMaximumRecordsPerQuery() throws java.rmi.RemoteException;
    public int getTotalNumberOfRecords(java.lang.String targetClassName, java.lang.Object criteria) throws java.rmi.RemoteException;
    public java.lang.Object[] queryObject(java.lang.String targetClassName, java.lang.Object criteria) throws java.rmi.RemoteException;
}
