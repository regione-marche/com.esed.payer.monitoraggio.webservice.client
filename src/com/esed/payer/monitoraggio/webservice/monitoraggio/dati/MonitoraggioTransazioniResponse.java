/**
 * MonitoraggioTransazioniResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class MonitoraggioTransazioniResponse  implements java.io.Serializable {
    /* lista dettaglio transazioni */
    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione[] listDettaglioTransazione;

    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.ResponseType response;

    public MonitoraggioTransazioniResponse() {
    }

    public MonitoraggioTransazioniResponse(
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione[] listDettaglioTransazione,
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.ResponseType response) {
           this.listDettaglioTransazione = listDettaglioTransazione;
           this.response = response;
    }


    /**
     * Gets the listDettaglioTransazione value for this MonitoraggioTransazioniResponse.
     * 
     * @return listDettaglioTransazione   * lista dettaglio transazioni
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione[] getListDettaglioTransazione() {
        return listDettaglioTransazione;
    }


    /**
     * Sets the listDettaglioTransazione value for this MonitoraggioTransazioniResponse.
     * 
     * @param listDettaglioTransazione   * lista dettaglio transazioni
     */
    public void setListDettaglioTransazione(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione[] listDettaglioTransazione) {
        this.listDettaglioTransazione = listDettaglioTransazione;
    }

    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione getListDettaglioTransazione(int i) {
        return this.listDettaglioTransazione[i];
    }

    public void setListDettaglioTransazione(int i, com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioTransazione _value) {
        this.listDettaglioTransazione[i] = _value;
    }


    /**
     * Gets the response value for this MonitoraggioTransazioniResponse.
     * 
     * @return response
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this MonitoraggioTransazioniResponse.
     * 
     * @param response
     */
    public void setResponse(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonitoraggioTransazioniResponse)) return false;
        MonitoraggioTransazioniResponse other = (MonitoraggioTransazioniResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listDettaglioTransazione==null && other.getListDettaglioTransazione()==null) || 
             (this.listDettaglioTransazione!=null &&
              java.util.Arrays.equals(this.listDettaglioTransazione, other.getListDettaglioTransazione()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListDettaglioTransazione() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDettaglioTransazione());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDettaglioTransazione(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonitoraggioTransazioniResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "MonitoraggioTransazioniResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDettaglioTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "listDettaglioTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioTransazione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "ResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
