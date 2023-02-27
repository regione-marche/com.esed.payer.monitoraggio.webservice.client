/**
 * DettaglioContabile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;


/**
 * Indica i dettagli contabili del pagamento
 */
public class DettaglioContabile  implements java.io.Serializable {
    /* importo in centesimi di euro */
    private java.lang.String importo;

    private java.lang.String codiceContabilita;

    private java.lang.String capitolo;
    private java.lang.String articolo;

    private java.lang.String annoCompetenza;

    public DettaglioContabile() {
    }

    public DettaglioContabile(
           java.lang.String importo,
           java.lang.String codiceContabilita,
           java.lang.String capitolo,
           java.lang.String articolo,
           java.lang.String annoCompetenza) {
           this.importo = importo;
           this.codiceContabilita = codiceContabilita;
           this.capitolo = capitolo;
           this.articolo = articolo;
           this.annoCompetenza = annoCompetenza;
    }


    /**
     * Gets the importo value for this DettaglioContabile.
     * 
     * @return importo   * importo in centesimi di euro
     */
    public java.lang.String getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this DettaglioContabile.
     * 
     * @param importo   * importo in centesimi di euro
     */
    public void setImporto(java.lang.String importo) {
        this.importo = importo;
    }


    /**
     * Gets the codiceContabilita value for this DettaglioContabile.
     * 
     * @return codiceContabilita
     */
    public java.lang.String getCodiceContabilita() {
        return codiceContabilita;
    }


    /**
     * Sets the codiceContabilita value for this DettaglioContabile.
     * 
     * @param codiceContabilita
     */
    public void setCodiceContabilita(java.lang.String codiceContabilita) {
        this.codiceContabilita = codiceContabilita;
    }


    /**
     * Gets the capitolo value for this DettaglioContabile.
     * 
     * @return capitolo
     */
    public java.lang.String getCapitolo() {
        return capitolo;
    }


    /**
     * Sets the capitolo value for this DettaglioContabile.
     * 
     * @param capitolo
     */
    public void setCapitolo(java.lang.String capitolo) {
        this.capitolo = capitolo;
    }


    /**
     * Gets the articolo value for this DettaglioContabile.
     * 
     * @return articolo
     */
    public java.lang.String getArticolo() {
        return articolo;
    }


    /**
     * Sets the articolo value for this DettaglioContabile.
     * 
     * @param articolo
     */
    public void setArticolo(java.lang.String articolo) {
        this.articolo = articolo;
    }


    /**
     * Gets the annoCompetenza value for this DettaglioContabile.
     * 
     * @return annoCompetenza
     */
    public java.lang.String getAnnoCompetenza() {
        return annoCompetenza;
    }


    /**
     * Sets the annoCompetenza value for this DettaglioContabile.
     * 
     * @param annoCompetenza
     */
    public void setAnnoCompetenza(java.lang.String annoCompetenza) {
        this.annoCompetenza = annoCompetenza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioContabile)) return false;
        DettaglioContabile other = (DettaglioContabile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            ((this.codiceContabilita==null && other.getCodiceContabilita()==null) || 
             (this.codiceContabilita!=null &&
              this.codiceContabilita.equals(other.getCodiceContabilita()))) &&
            ((this.capitolo==null && other.getCapitolo()==null) || 
             (this.capitolo!=null &&
              this.capitolo.equals(other.getCapitolo()))) &&
            ((this.articolo==null && other.getArticolo()==null) || 
             (this.articolo!=null &&
              this.articolo.equals(other.getArticolo()))) &&
            ((this.annoCompetenza==null && other.getAnnoCompetenza()==null) || 
             (this.annoCompetenza!=null &&
              this.annoCompetenza.equals(other.getAnnoCompetenza())));
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
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        if (getCodiceContabilita() != null) {
            _hashCode += getCodiceContabilita().hashCode();
        }
        if (getCapitolo() != null) {
            _hashCode += getCapitolo().hashCode();
        }
        if (getArticolo() != null) {
            _hashCode += getArticolo().hashCode();
        }
        if (getAnnoCompetenza() != null) {
            _hashCode += getAnnoCompetenza().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioContabile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioContabile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceContabilita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceContabilita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capitolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "capitolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "articolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoCompetenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "annoCompetenza"));
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
