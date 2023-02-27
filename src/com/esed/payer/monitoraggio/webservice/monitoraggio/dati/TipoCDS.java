/**
 * TipoCDS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class TipoCDS  implements java.io.Serializable {
    private java.lang.String numeroVerbale;

    private java.lang.String dataVerbale;

    private java.lang.String targa;

    public TipoCDS() {
    }

    public TipoCDS(
           java.lang.String numeroVerbale,
           java.lang.String dataVerbale,
           java.lang.String targa) {
           this.numeroVerbale = numeroVerbale;
           this.dataVerbale = dataVerbale;
           this.targa = targa;
    }


    /**
     * Gets the numeroVerbale value for this TipoCDS.
     * 
     * @return numeroVerbale
     */
    public java.lang.String getNumeroVerbale() {
        return numeroVerbale;
    }


    /**
     * Sets the numeroVerbale value for this TipoCDS.
     * 
     * @param numeroVerbale
     */
    public void setNumeroVerbale(java.lang.String numeroVerbale) {
        this.numeroVerbale = numeroVerbale;
    }


    /**
     * Gets the dataVerbale value for this TipoCDS.
     * 
     * @return dataVerbale
     */
    public java.lang.String getDataVerbale() {
        return dataVerbale;
    }


    /**
     * Sets the dataVerbale value for this TipoCDS.
     * 
     * @param dataVerbale
     */
    public void setDataVerbale(java.lang.String dataVerbale) {
        this.dataVerbale = dataVerbale;
    }


    /**
     * Gets the targa value for this TipoCDS.
     * 
     * @return targa
     */
    public java.lang.String getTarga() {
        return targa;
    }


    /**
     * Sets the targa value for this TipoCDS.
     * 
     * @param targa
     */
    public void setTarga(java.lang.String targa) {
        this.targa = targa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoCDS)) return false;
        TipoCDS other = (TipoCDS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroVerbale==null && other.getNumeroVerbale()==null) || 
             (this.numeroVerbale!=null &&
              this.numeroVerbale.equals(other.getNumeroVerbale()))) &&
            ((this.dataVerbale==null && other.getDataVerbale()==null) || 
             (this.dataVerbale!=null &&
              this.dataVerbale.equals(other.getDataVerbale()))) &&
            ((this.targa==null && other.getTarga()==null) || 
             (this.targa!=null &&
              this.targa.equals(other.getTarga())));
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
        if (getNumeroVerbale() != null) {
            _hashCode += getNumeroVerbale().hashCode();
        }
        if (getDataVerbale() != null) {
            _hashCode += getDataVerbale().hashCode();
        }
        if (getTarga() != null) {
            _hashCode += getTarga().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoCDS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "TipoCDS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "numeroVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dataVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "targa"));
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
