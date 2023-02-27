/**
 * MonitoraggioTransazioniRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;

public class MonitoraggioTransazioniRequest  implements java.io.Serializable {
    /* Identificativo del portale abilitato */
    private java.lang.String portaleID;

    /* username */
    private java.lang.String username;

    /* password */
    private java.lang.String password;

    /* codice società */
    private java.lang.String codiceSocieta;

    /* codice utente */
    private java.lang.String codiceUtente;

    /* codice ente */
    private java.lang.String codiceEnte;

    /* tipo ufficio */
    private java.lang.String tipoUfficio;

    /* codice ufficio */
    private java.lang.String codiceUfficio;

    /* Data Da, formato AAAA-MM-GG */
    private java.lang.String dataDA;

    /* Data A, formato AAAA-MM-GG */
    private java.lang.String dataA;

    /* numero avviso PagoPA */
    private java.lang.String numeroAvvisoPagoPA;

    /* Identificativo Univoco Versamento - IUV */
    private java.lang.String identificativoUnivocoVersamento;

    /* Identificativo Univoco Riscossione - IUR */
    private java.lang.String identificativoUnivocoRiscossione;

    private java.lang.String identificativoFlussoRendicontazioneNodo;

    public MonitoraggioTransazioniRequest() {
    }

    public MonitoraggioTransazioniRequest(
           java.lang.String portaleID,
           java.lang.String username,
           java.lang.String password,
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String dataDA,
           java.lang.String dataA,
           java.lang.String numeroAvvisoPagoPA,
           java.lang.String identificativoUnivocoVersamento,
           java.lang.String identificativoUnivocoRiscossione,
           java.lang.String identificativoFlussoRendicontazioneNodo) {
           this.portaleID = portaleID;
           this.username = username;
           this.password = password;
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.dataDA = dataDA;
           this.dataA = dataA;
           this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
           this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
           this.identificativoUnivocoRiscossione = identificativoUnivocoRiscossione;
           this.identificativoFlussoRendicontazioneNodo = identificativoFlussoRendicontazioneNodo;
    }


    /**
     * Gets the portaleID value for this MonitoraggioTransazioniRequest.
     * 
     * @return portaleID   * Identificativo del portale abilitato
     */
    public java.lang.String getPortaleID() {
        return portaleID;
    }


    /**
     * Sets the portaleID value for this MonitoraggioTransazioniRequest.
     * 
     * @param portaleID   * Identificativo del portale abilitato
     */
    public void setPortaleID(java.lang.String portaleID) {
        this.portaleID = portaleID;
    }


    /**
     * Gets the username value for this MonitoraggioTransazioniRequest.
     * 
     * @return username   * username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this MonitoraggioTransazioniRequest.
     * 
     * @param username   * username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this MonitoraggioTransazioniRequest.
     * 
     * @return password   * password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this MonitoraggioTransazioniRequest.
     * 
     * @param password   * password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the codiceSocieta value for this MonitoraggioTransazioniRequest.
     * 
     * @return codiceSocieta   * codice società
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this MonitoraggioTransazioniRequest.
     * 
     * @param codiceSocieta   * codice società
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this MonitoraggioTransazioniRequest.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this MonitoraggioTransazioniRequest.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this MonitoraggioTransazioniRequest.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this MonitoraggioTransazioniRequest.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this MonitoraggioTransazioniRequest.
     * 
     * @return tipoUfficio   * tipo ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this MonitoraggioTransazioniRequest.
     * 
     * @param tipoUfficio   * tipo ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this MonitoraggioTransazioniRequest.
     * 
     * @return codiceUfficio   * codice ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this MonitoraggioTransazioniRequest.
     * 
     * @param codiceUfficio   * codice ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the dataDA value for this MonitoraggioTransazioniRequest.
     * 
     * @return dataDA   * Data Da, formato AAAA-MM-GG
     */
    public java.lang.String getDataDA() {
        return dataDA;
    }


    /**
     * Sets the dataDA value for this MonitoraggioTransazioniRequest.
     * 
     * @param dataDA   * Data Da, formato AAAA-MM-GG
     */
    public void setDataDA(java.lang.String dataDA) {
        this.dataDA = dataDA;
    }


    /**
     * Gets the dataA value for this MonitoraggioTransazioniRequest.
     * 
     * @return dataA   * Data A, formato AAAA-MM-GG
     */
    public java.lang.String getDataA() {
        return dataA;
    }


    /**
     * Sets the dataA value for this MonitoraggioTransazioniRequest.
     * 
     * @param dataA   * Data A, formato AAAA-MM-GG
     */
    public void setDataA(java.lang.String dataA) {
        this.dataA = dataA;
    }


    /**
     * Gets the numeroAvvisoPagoPA value for this MonitoraggioTransazioniRequest.
     * 
     * @return numeroAvvisoPagoPA   * numero avviso PagoPA
     */
    public java.lang.String getNumeroAvvisoPagoPA() {
        return numeroAvvisoPagoPA;
    }


    /**
     * Sets the numeroAvvisoPagoPA value for this MonitoraggioTransazioniRequest.
     * 
     * @param numeroAvvisoPagoPA   * numero avviso PagoPA
     */
    public void setNumeroAvvisoPagoPA(java.lang.String numeroAvvisoPagoPA) {
        this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
    }


    /**
     * Gets the identificativoUnivocoVersamento value for this MonitoraggioTransazioniRequest.
     * 
     * @return identificativoUnivocoVersamento   * Identificativo Univoco Versamento - IUV
     */
    public java.lang.String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }


    /**
     * Sets the identificativoUnivocoVersamento value for this MonitoraggioTransazioniRequest.
     * 
     * @param identificativoUnivocoVersamento   * Identificativo Univoco Versamento - IUV
     */
    public void setIdentificativoUnivocoVersamento(java.lang.String identificativoUnivocoVersamento) {
        this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }


    /**
     * Gets the identificativoUnivocoRiscossione value for this MonitoraggioTransazioniRequest.
     * 
     * @return identificativoUnivocoRiscossione   * Identificativo Univoco Riscossione - IUR
     */
    public java.lang.String getIdentificativoUnivocoRiscossione() {
        return identificativoUnivocoRiscossione;
    }


    /**
     * Sets the identificativoUnivocoRiscossione value for this MonitoraggioTransazioniRequest.
     * 
     * @param identificativoUnivocoRiscossione   * Identificativo Univoco Riscossione - IUR
     */
    public void setIdentificativoUnivocoRiscossione(java.lang.String identificativoUnivocoRiscossione) {
        this.identificativoUnivocoRiscossione = identificativoUnivocoRiscossione;
    }


    /**
     * Gets the identificativoFlussoRendicontazioneNodo value for this MonitoraggioTransazioniRequest.
     * 
     * @return identificativoFlussoRendicontazioneNodo
     */
    public java.lang.String getIdentificativoFlussoRendicontazioneNodo() {
        return identificativoFlussoRendicontazioneNodo;
    }


    /**
     * Sets the identificativoFlussoRendicontazioneNodo value for this MonitoraggioTransazioniRequest.
     * 
     * @param identificativoFlussoRendicontazioneNodo
     */
    public void setIdentificativoFlussoRendicontazioneNodo(java.lang.String identificativoFlussoRendicontazioneNodo) {
        this.identificativoFlussoRendicontazioneNodo = identificativoFlussoRendicontazioneNodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonitoraggioTransazioniRequest)) return false;
        MonitoraggioTransazioniRequest other = (MonitoraggioTransazioniRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.portaleID==null && other.getPortaleID()==null) || 
             (this.portaleID!=null &&
              this.portaleID.equals(other.getPortaleID()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.codiceSocieta==null && other.getCodiceSocieta()==null) || 
             (this.codiceSocieta!=null &&
              this.codiceSocieta.equals(other.getCodiceSocieta()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.tipoUfficio==null && other.getTipoUfficio()==null) || 
             (this.tipoUfficio!=null &&
              this.tipoUfficio.equals(other.getTipoUfficio()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.dataDA==null && other.getDataDA()==null) || 
             (this.dataDA!=null &&
              this.dataDA.equals(other.getDataDA()))) &&
            ((this.dataA==null && other.getDataA()==null) || 
             (this.dataA!=null &&
              this.dataA.equals(other.getDataA()))) &&
            ((this.numeroAvvisoPagoPA==null && other.getNumeroAvvisoPagoPA()==null) || 
             (this.numeroAvvisoPagoPA!=null &&
              this.numeroAvvisoPagoPA.equals(other.getNumeroAvvisoPagoPA()))) &&
            ((this.identificativoUnivocoVersamento==null && other.getIdentificativoUnivocoVersamento()==null) || 
             (this.identificativoUnivocoVersamento!=null &&
              this.identificativoUnivocoVersamento.equals(other.getIdentificativoUnivocoVersamento()))) &&
            ((this.identificativoUnivocoRiscossione==null && other.getIdentificativoUnivocoRiscossione()==null) || 
             (this.identificativoUnivocoRiscossione!=null &&
              this.identificativoUnivocoRiscossione.equals(other.getIdentificativoUnivocoRiscossione()))) &&
            ((this.identificativoFlussoRendicontazioneNodo==null && other.getIdentificativoFlussoRendicontazioneNodo()==null) || 
             (this.identificativoFlussoRendicontazioneNodo!=null &&
              this.identificativoFlussoRendicontazioneNodo.equals(other.getIdentificativoFlussoRendicontazioneNodo())));
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
        if (getPortaleID() != null) {
            _hashCode += getPortaleID().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCodiceSocieta() != null) {
            _hashCode += getCodiceSocieta().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getTipoUfficio() != null) {
            _hashCode += getTipoUfficio().hashCode();
        }
        if (getCodiceUfficio() != null) {
            _hashCode += getCodiceUfficio().hashCode();
        }
        if (getDataDA() != null) {
            _hashCode += getDataDA().hashCode();
        }
        if (getDataA() != null) {
            _hashCode += getDataA().hashCode();
        }
        if (getNumeroAvvisoPagoPA() != null) {
            _hashCode += getNumeroAvvisoPagoPA().hashCode();
        }
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        if (getIdentificativoUnivocoRiscossione() != null) {
            _hashCode += getIdentificativoUnivocoRiscossione().hashCode();
        }
        if (getIdentificativoFlussoRendicontazioneNodo() != null) {
            _hashCode += getIdentificativoFlussoRendicontazioneNodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonitoraggioTransazioniRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "MonitoraggioTransazioniRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "portaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "tipoUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dataDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dataA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "numeroAvvisoPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoUnivocoVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoRiscossione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoUnivocoRiscossione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoFlussoRendicontazioneNodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoFlussoRendicontazioneNodo"));
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
