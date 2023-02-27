/**
 * DettaglioTransazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class DettaglioTransazione  implements java.io.Serializable {
    /* codice transazione */
    private java.lang.String codiceTransazione;

    /* data inizio transazione */
    private java.util.Calendar dataTransazione;

    /* data effettivo pagamento */
    private java.util.Calendar dataPagamento;

    /* identificativo Univoco Versamento */
    private java.lang.String identificativoUnivocoVersamento;

    private java.lang.String identificativoFlussoRendicontazioneNodo;

    /* importo totale transazione in centesimi di euro */
    private java.math.BigDecimal importoTotaleTransazione;

    /* Lista dei dettagli del pagamento */
    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione[] listaDettagliTransazione;

    public DettaglioTransazione() {
    }

    public DettaglioTransazione(
           java.lang.String codiceTransazione,
           java.util.Calendar dataTransazione,
           java.util.Calendar dataPagamento,
           java.lang.String identificativoUnivocoVersamento,
           java.lang.String identificativoFlussoRendicontazioneNodo,
           java.math.BigDecimal importoTotaleTransazione,
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione[] listaDettagliTransazione) {
           this.codiceTransazione = codiceTransazione;
           this.dataTransazione = dataTransazione;
           this.dataPagamento = dataPagamento;
           this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
           this.identificativoFlussoRendicontazioneNodo = identificativoFlussoRendicontazioneNodo;
           this.importoTotaleTransazione = importoTotaleTransazione;
           this.listaDettagliTransazione = listaDettagliTransazione;
    }


    /**
     * Gets the codiceTransazione value for this DettaglioTransazione.
     * 
     * @return codiceTransazione   * codice transazione
     */
    public java.lang.String getCodiceTransazione() {
        return codiceTransazione;
    }


    /**
     * Sets the codiceTransazione value for this DettaglioTransazione.
     * 
     * @param codiceTransazione   * codice transazione
     */
    public void setCodiceTransazione(java.lang.String codiceTransazione) {
        this.codiceTransazione = codiceTransazione;
    }


    /**
     * Gets the dataTransazione value for this DettaglioTransazione.
     * 
     * @return dataTransazione   * data inizio transazione
     */
    public java.util.Calendar getDataTransazione() {
        return dataTransazione;
    }


    /**
     * Sets the dataTransazione value for this DettaglioTransazione.
     * 
     * @param dataTransazione   * data inizio transazione
     */
    public void setDataTransazione(java.util.Calendar dataTransazione) {
        this.dataTransazione = dataTransazione;
    }


    /**
     * Gets the dataPagamento value for this DettaglioTransazione.
     * 
     * @return dataPagamento   * data effettivo pagamento
     */
    public java.util.Calendar getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this DettaglioTransazione.
     * 
     * @param dataPagamento   * data effettivo pagamento
     */
    public void setDataPagamento(java.util.Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the identificativoUnivocoVersamento value for this DettaglioTransazione.
     * 
     * @return identificativoUnivocoVersamento   * identificativo Univoco Versamento
     */
    public java.lang.String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }


    /**
     * Sets the identificativoUnivocoVersamento value for this DettaglioTransazione.
     * 
     * @param identificativoUnivocoVersamento   * identificativo Univoco Versamento
     */
    public void setIdentificativoUnivocoVersamento(java.lang.String identificativoUnivocoVersamento) {
        this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }


    /**
     * Gets the identificativoFlussoRendicontazioneNodo value for this DettaglioTransazione.
     * 
     * @return identificativoFlussoRendicontazioneNodo
     */
    public java.lang.String getIdentificativoFlussoRendicontazioneNodo() {
        return identificativoFlussoRendicontazioneNodo;
    }


    /**
     * Sets the identificativoFlussoRendicontazioneNodo value for this DettaglioTransazione.
     * 
     * @param identificativoFlussoRendicontazioneNodo
     */
    public void setIdentificativoFlussoRendicontazioneNodo(java.lang.String identificativoFlussoRendicontazioneNodo) {
        this.identificativoFlussoRendicontazioneNodo = identificativoFlussoRendicontazioneNodo;
    }


    /**
     * Gets the importoTotaleTransazione value for this DettaglioTransazione.
     * 
     * @return importoTotaleTransazione   * importo totale transazione in centesimi di euro
     */
    public java.math.BigDecimal getImportoTotaleTransazione() {
        return importoTotaleTransazione;
    }


    /**
     * Sets the importoTotaleTransazione value for this DettaglioTransazione.
     * 
     * @param importoTotaleTransazione   * importo totale transazione in centesimi di euro
     */
    public void setImportoTotaleTransazione(java.math.BigDecimal importoTotaleTransazione) {
        this.importoTotaleTransazione = importoTotaleTransazione;
    }


    /**
     * Gets the listaDettagliTransazione value for this DettaglioTransazione.
     * 
     * @return listaDettagliTransazione   * Lista dei dettagli del pagamento
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione[] getListaDettagliTransazione() {
        return listaDettagliTransazione;
    }


    /**
     * Sets the listaDettagliTransazione value for this DettaglioTransazione.
     * 
     * @param listaDettagliTransazione   * Lista dei dettagli del pagamento
     */
    public void setListaDettagliTransazione(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione[] listaDettagliTransazione) {
        this.listaDettagliTransazione = listaDettagliTransazione;
    }

    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione getListaDettagliTransazione(int i) {
        return this.listaDettagliTransazione[i];
    }

    public void setListaDettagliTransazione(int i, com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioPagamentiTransazione _value) {
        this.listaDettagliTransazione[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioTransazione)) return false;
        DettaglioTransazione other = (DettaglioTransazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceTransazione==null && other.getCodiceTransazione()==null) || 
             (this.codiceTransazione!=null &&
              this.codiceTransazione.equals(other.getCodiceTransazione()))) &&
            ((this.dataTransazione==null && other.getDataTransazione()==null) || 
             (this.dataTransazione!=null &&
              this.dataTransazione.equals(other.getDataTransazione()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.identificativoUnivocoVersamento==null && other.getIdentificativoUnivocoVersamento()==null) || 
             (this.identificativoUnivocoVersamento!=null &&
              this.identificativoUnivocoVersamento.equals(other.getIdentificativoUnivocoVersamento()))) &&
            ((this.identificativoFlussoRendicontazioneNodo==null && other.getIdentificativoFlussoRendicontazioneNodo()==null) || 
             (this.identificativoFlussoRendicontazioneNodo!=null &&
              this.identificativoFlussoRendicontazioneNodo.equals(other.getIdentificativoFlussoRendicontazioneNodo()))) &&
            ((this.importoTotaleTransazione==null && other.getImportoTotaleTransazione()==null) || 
             (this.importoTotaleTransazione!=null &&
              this.importoTotaleTransazione.equals(other.getImportoTotaleTransazione()))) &&
            ((this.listaDettagliTransazione==null && other.getListaDettagliTransazione()==null) || 
             (this.listaDettagliTransazione!=null &&
              java.util.Arrays.equals(this.listaDettagliTransazione, other.getListaDettagliTransazione())));
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
        if (getCodiceTransazione() != null) {
            _hashCode += getCodiceTransazione().hashCode();
        }
        if (getDataTransazione() != null) {
            _hashCode += getDataTransazione().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        if (getIdentificativoFlussoRendicontazioneNodo() != null) {
            _hashCode += getIdentificativoFlussoRendicontazioneNodo().hashCode();
        }
        if (getImportoTotaleTransazione() != null) {
            _hashCode += getImportoTotaleTransazione().hashCode();
        }
        if (getListaDettagliTransazione() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaDettagliTransazione());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaDettagliTransazione(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioTransazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioTransazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dataTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoUnivocoVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoFlussoRendicontazioneNodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoFlussoRendicontazioneNodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotaleTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "importoTotaleTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDettagliTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "listaDettagliTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioPagamentiTransazione"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
