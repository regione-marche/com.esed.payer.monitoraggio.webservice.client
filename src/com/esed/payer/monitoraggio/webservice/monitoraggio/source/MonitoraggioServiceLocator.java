/**
 * MonitoraggioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.source;

public class MonitoraggioServiceLocator extends org.apache.axis.client.Service implements com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioService {

    public MonitoraggioServiceLocator() {
    }


    public MonitoraggioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MonitoraggioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MonitoraggioPort
    private java.lang.String MonitoraggioPort_address = "http://localhost:9071/MonitoraggioService/monitoraggio";

    public java.lang.String getMonitoraggioPortAddress() {
        return MonitoraggioPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MonitoraggioPortWSDDServiceName = "MonitoraggioPort";

    public java.lang.String getMonitoraggioPortWSDDServiceName() {
        return MonitoraggioPortWSDDServiceName;
    }

    public void setMonitoraggioPortWSDDServiceName(java.lang.String name) {
        MonitoraggioPortWSDDServiceName = name;
    }

    public com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioInterface getMonitoraggioPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MonitoraggioPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMonitoraggioPort(endpoint);
    }

    public com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioInterface getMonitoraggioPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioSOAPBindingStub _stub = new com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioSOAPBindingStub(portAddress, this);
            _stub.setPortName(getMonitoraggioPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMonitoraggioPortEndpointAddress(java.lang.String address) {
        MonitoraggioPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioSOAPBindingStub _stub = new com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioSOAPBindingStub(new java.net.URL(MonitoraggioPort_address), this);
                _stub.setPortName(getMonitoraggioPortWSDDServiceName());
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
        if ("MonitoraggioPort".equals(inputPortName)) {
            return getMonitoraggioPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.monitoraggio.webservice.monitoraggio.payer.esed.com", "MonitoraggioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.monitoraggio.webservice.monitoraggio.payer.esed.com", "MonitoraggioPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MonitoraggioPort".equals(portName)) {
            setMonitoraggioPortEndpointAddress(address);
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
