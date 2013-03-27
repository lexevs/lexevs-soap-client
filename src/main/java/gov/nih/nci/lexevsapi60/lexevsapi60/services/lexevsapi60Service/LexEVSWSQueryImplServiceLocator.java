/**
 * LexEVSWSQueryImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service;

public class LexEVSWSQueryImplServiceLocator extends org.apache.axis.client.Service implements gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImplService {

    public LexEVSWSQueryImplServiceLocator() {
    }


    public LexEVSWSQueryImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LexEVSWSQueryImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for lexevsapi60Service
    private java.lang.String lexevsapi60Service_address = "http://lexevsapi60.nci.nih.gov/lexevsapi60/services/lexevsapi60Service";

    public java.lang.String getlexevsapi60ServiceAddress() {
        return lexevsapi60Service_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String lexevsapi60ServiceWSDDServiceName = "lexevsapi60Service";

    public java.lang.String getlexevsapi60ServiceWSDDServiceName() {
        return lexevsapi60ServiceWSDDServiceName;
    }

    public void setlexevsapi60ServiceWSDDServiceName(java.lang.String name) {
        lexevsapi60ServiceWSDDServiceName = name;
    }

    public gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl getlexevsapi60Service() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(lexevsapi60Service_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getlexevsapi60Service(endpoint);
    }

    public gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl getlexevsapi60Service(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.Lexevsapi60ServiceSoapBindingStub _stub = new gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.Lexevsapi60ServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getlexevsapi60ServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setlexevsapi60ServiceEndpointAddress(java.lang.String address) {
        lexevsapi60Service_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.Lexevsapi60ServiceSoapBindingStub _stub = new gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.Lexevsapi60ServiceSoapBindingStub(new java.net.URL(lexevsapi60Service_address), this);
                _stub.setPortName(getlexevsapi60ServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("lexevsapi60Service".equals(inputPortName)) {
            return getlexevsapi60Service();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://lexevsapi60.nci.nih.gov/lexevsapi60/services/lexevsapi60Service", "LexEVSWSQueryImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://lexevsapi60.nci.nih.gov/lexevsapi60/services/lexevsapi60Service", "lexevsapi60Service"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("lexevsapi60Service".equals(portName)) {
            setlexevsapi60ServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
