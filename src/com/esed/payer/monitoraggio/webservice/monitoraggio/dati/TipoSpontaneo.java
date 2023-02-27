/**
 * TipoSpontaneo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class TipoSpontaneo  implements java.io.Serializable {
    private java.lang.String causaleServizio;

    private java.lang.String annoRiferimento;

    private java.lang.String cespite;

    public TipoSpontaneo() {
    }

    public TipoSpontaneo(
           java.lang.String causaleServizio,
           java.lang.String annoRiferimento,
           java.lang.String cespite) {
           this.causaleServizio = causaleServizio;
           this.annoRiferimento = annoRiferimento;
           this.cespite = cespite;
    }


    /**
     * Gets the causaleServizio value for this TipoSpontaneo.
     * 
     * @return causaleServizio
     */
    public java.lang.String getCausaleServizio() {
        return causaleServizio;
    }


    /**
     * Sets the causaleServizio value for this TipoSpontaneo.
     * 
     * @param causaleServizio
     */
    public void setCausaleServizio(java.lang.String causaleServizio) {
        this.causaleServizio = causaleServizio;
    }


    /**
     * Gets the annoRiferimento value for this TipoSpontaneo.
     * 
     * @return annoRiferimento
     */
    public java.lang.String getAnnoRiferimento() {
        return annoRiferimento;
    }


    /**
     * Sets the annoRiferimento value for this TipoSpontaneo.
     * 
     * @param annoRiferimento
     */
    public void setAnnoRiferimento(java.lang.String annoRiferimento) {
        this.annoRiferimento = annoRiferimento;
    }


    /**
     * Gets the cespite value for this TipoSpontaneo.
     * 
     * @return cespite
     */
    public java.lang.String getCespite() {
        return cespite;
    }


    /**
     * Sets the cespite value for this TipoSpontaneo.
     * 
     * @param cespite
     */
    public void setCespite(java.lang.String cespite) {
        this.cespite = cespite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoSpontaneo)) return false;
        TipoSpontaneo other = (TipoSpontaneo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causaleServizio==null && other.getCausaleServizio()==null) || 
             (this.causaleServizio!=null &&
              this.causaleServizio.equals(other.getCausaleServizio()))) &&
            ((this.annoRiferimento==null && other.getAnnoRiferimento()==null) || 
             (this.annoRiferimento!=null &&
              this.annoRiferimento.equals(other.getAnnoRiferimento()))) &&
            ((this.cespite==null && other.getCespite()==null) || 
             (this.cespite!=null &&
              this.cespite.equals(other.getCespite())));
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
        if (getCausaleServizio() != null) {
            _hashCode += getCausaleServizio().hashCode();
        }
        if (getAnnoRiferimento() != null) {
            _hashCode += getAnnoRiferimento().hashCode();
        }
        if (getCespite() != null) {
            _hashCode += getCespite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoSpontaneo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "TipoSpontaneo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "causaleServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "annoRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cespite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "cespite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
