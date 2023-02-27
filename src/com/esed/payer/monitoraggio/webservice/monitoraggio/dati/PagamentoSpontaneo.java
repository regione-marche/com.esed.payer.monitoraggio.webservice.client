/**
 * PagamentoSpontaneo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class PagamentoSpontaneo  implements java.io.Serializable {
    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoSpontaneo tipoSpontaneo;

    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoCDS tipoCDS;

    public PagamentoSpontaneo() {
    }

    public PagamentoSpontaneo(
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoSpontaneo tipoSpontaneo,
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoCDS tipoCDS) {
           this.tipoSpontaneo = tipoSpontaneo;
           this.tipoCDS = tipoCDS;
    }


    /**
     * Gets the tipoSpontaneo value for this PagamentoSpontaneo.
     * 
     * @return tipoSpontaneo
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoSpontaneo getTipoSpontaneo() {
        return tipoSpontaneo;
    }


    /**
     * Sets the tipoSpontaneo value for this PagamentoSpontaneo.
     * 
     * @param tipoSpontaneo
     */
    public void setTipoSpontaneo(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoSpontaneo tipoSpontaneo) {
        this.tipoSpontaneo = tipoSpontaneo;
    }


    /**
     * Gets the tipoCDS value for this PagamentoSpontaneo.
     * 
     * @return tipoCDS
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoCDS getTipoCDS() {
        return tipoCDS;
    }


    /**
     * Sets the tipoCDS value for this PagamentoSpontaneo.
     * 
     * @param tipoCDS
     */
    public void setTipoCDS(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.TipoCDS tipoCDS) {
        this.tipoCDS = tipoCDS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagamentoSpontaneo)) return false;
        PagamentoSpontaneo other = (PagamentoSpontaneo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoSpontaneo==null && other.getTipoSpontaneo()==null) || 
             (this.tipoSpontaneo!=null &&
              this.tipoSpontaneo.equals(other.getTipoSpontaneo()))) &&
            ((this.tipoCDS==null && other.getTipoCDS()==null) || 
             (this.tipoCDS!=null &&
              this.tipoCDS.equals(other.getTipoCDS())));
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
        if (getTipoSpontaneo() != null) {
            _hashCode += getTipoSpontaneo().hashCode();
        }
        if (getTipoCDS() != null) {
            _hashCode += getTipoCDS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagamentoSpontaneo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "PagamentoSpontaneo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSpontaneo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "tipoSpontaneo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "TipoSpontaneo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "tipoCDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "TipoCDS"));
        elemField.setMinOccurs(0);
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
