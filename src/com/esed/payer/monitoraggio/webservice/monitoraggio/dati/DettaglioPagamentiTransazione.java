/**
 * DettaglioPagamentiTransazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.payer.monitoraggio.webservice.monitoraggio.dati;


/**
 * Indica i dati del dettaglio del pagamento
 */
public class DettaglioPagamentiTransazione  implements java.io.Serializable {
    /* codice dettaglio transazione */
    private java.lang.String codiceDettaglioTransazione;

    /* codice ente */
    private java.lang.String codiceEnte;

    /* tipo ufficio */
    private java.lang.String tipoUfficio;

    /* codice ufficio */
    private java.lang.String codiceUfficio;

    /* codice tipologia servizio del pagamento */
    private java.lang.String tipologiaServizio;

    /* Descrizione della tipologia servizio del
     *     					pagamento */
    private java.lang.String descrizioneTipologiaServizio;

    /* tassonomia pagoPA */
    private java.lang.String tassonomiaPagoPA;

    /* identificativo univoco riscossione */
    private java.lang.String identificativoUnivocoRiscossione;

    /* numero avviso PagoPA */
    private java.lang.String numeroAvvisoPagoPA;

    /* importo in centesimi di euro */
    private java.math.BigDecimal importo;

    /* numero documento */
    private java.lang.String numeroDocumento;

    /* codice fiscale/p. iva */
    private java.lang.String codiceFiscale;

    /* denominazione */
    private java.lang.String denominazione;

    private java.lang.String indirizzo;

    private java.lang.String codiceBelfioreComune;

    private java.lang.String siglaProvincia;

    private java.lang.String CAP;

    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.PagamentoSpontaneo pagamentoSpontaneo;

    /* Dettaglio importi contabili. */
    private com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile[] dettaglioContabile;

    public DettaglioPagamentiTransazione() {
    }

    public DettaglioPagamentiTransazione(
           java.lang.String codiceDettaglioTransazione,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String tipologiaServizio,
           java.lang.String descrizioneTipologiaServizio,
           java.lang.String tassonomiaPagoPA,
           java.lang.String identificativoUnivocoRiscossione,
           java.lang.String numeroAvvisoPagoPA,
           java.math.BigDecimal importo,
           java.lang.String numeroDocumento,
           java.lang.String codiceFiscale,
           java.lang.String denominazione,
           java.lang.String indirizzo,
           java.lang.String codiceBelfioreComune,
           java.lang.String siglaProvincia,
           java.lang.String CAP,
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.PagamentoSpontaneo pagamentoSpontaneo,
           com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile[] dettaglioContabile) {
           this.codiceDettaglioTransazione = codiceDettaglioTransazione;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.tipologiaServizio = tipologiaServizio;
           this.descrizioneTipologiaServizio = descrizioneTipologiaServizio;
           this.tassonomiaPagoPA = tassonomiaPagoPA;
           this.identificativoUnivocoRiscossione = identificativoUnivocoRiscossione;
           this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
           this.importo = importo;
           this.numeroDocumento = numeroDocumento;
           this.codiceFiscale = codiceFiscale;
           this.denominazione = denominazione;
           this.indirizzo = indirizzo;
           this.codiceBelfioreComune = codiceBelfioreComune;
           this.siglaProvincia = siglaProvincia;
           this.CAP = CAP;
           this.pagamentoSpontaneo = pagamentoSpontaneo;
           this.dettaglioContabile = dettaglioContabile;
    }


    /**
     * Gets the codiceDettaglioTransazione value for this DettaglioPagamentiTransazione.
     * 
     * @return codiceDettaglioTransazione   * codice dettaglio transazione
     */
    public java.lang.String getCodiceDettaglioTransazione() {
        return codiceDettaglioTransazione;
    }


    /**
     * Sets the codiceDettaglioTransazione value for this DettaglioPagamentiTransazione.
     * 
     * @param codiceDettaglioTransazione   * codice dettaglio transazione
     */
    public void setCodiceDettaglioTransazione(java.lang.String codiceDettaglioTransazione) {
        this.codiceDettaglioTransazione = codiceDettaglioTransazione;
    }


    /**
     * Gets the codiceEnte value for this DettaglioPagamentiTransazione.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this DettaglioPagamentiTransazione.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this DettaglioPagamentiTransazione.
     * 
     * @return tipoUfficio   * tipo ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this DettaglioPagamentiTransazione.
     * 
     * @param tipoUfficio   * tipo ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this DettaglioPagamentiTransazione.
     * 
     * @return codiceUfficio   * codice ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this DettaglioPagamentiTransazione.
     * 
     * @param codiceUfficio   * codice ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the tipologiaServizio value for this DettaglioPagamentiTransazione.
     * 
     * @return tipologiaServizio   * codice tipologia servizio del pagamento
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this DettaglioPagamentiTransazione.
     * 
     * @param tipologiaServizio   * codice tipologia servizio del pagamento
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the descrizioneTipologiaServizio value for this DettaglioPagamentiTransazione.
     * 
     * @return descrizioneTipologiaServizio   * Descrizione della tipologia servizio del
     *     					pagamento
     */
    public java.lang.String getDescrizioneTipologiaServizio() {
        return descrizioneTipologiaServizio;
    }


    /**
     * Sets the descrizioneTipologiaServizio value for this DettaglioPagamentiTransazione.
     * 
     * @param descrizioneTipologiaServizio   * Descrizione della tipologia servizio del
     *     					pagamento
     */
    public void setDescrizioneTipologiaServizio(java.lang.String descrizioneTipologiaServizio) {
        this.descrizioneTipologiaServizio = descrizioneTipologiaServizio;
    }


    /**
     * Gets the tassonomiaPagoPA value for this DettaglioPagamentiTransazione.
     * 
     * @return tassonomiaPagoPA   * tassonomia pagoPA
     */
    public java.lang.String getTassonomiaPagoPA() {
        return tassonomiaPagoPA;
    }


    /**
     * Sets the tassonomiaPagoPA value for this DettaglioPagamentiTransazione.
     * 
     * @param tassonomiaPagoPA   * tassonomia pagoPA
     */
    public void setTassonomiaPagoPA(java.lang.String tassonomiaPagoPA) {
        this.tassonomiaPagoPA = tassonomiaPagoPA;
    }


    /**
     * Gets the identificativoUnivocoRiscossione value for this DettaglioPagamentiTransazione.
     * 
     * @return identificativoUnivocoRiscossione   * identificativo univoco riscossione
     */
    public java.lang.String getIdentificativoUnivocoRiscossione() {
        return identificativoUnivocoRiscossione;
    }


    /**
     * Sets the identificativoUnivocoRiscossione value for this DettaglioPagamentiTransazione.
     * 
     * @param identificativoUnivocoRiscossione   * identificativo univoco riscossione
     */
    public void setIdentificativoUnivocoRiscossione(java.lang.String identificativoUnivocoRiscossione) {
        this.identificativoUnivocoRiscossione = identificativoUnivocoRiscossione;
    }


    /**
     * Gets the numeroAvvisoPagoPA value for this DettaglioPagamentiTransazione.
     * 
     * @return numeroAvvisoPagoPA   * numero avviso PagoPA
     */
    public java.lang.String getNumeroAvvisoPagoPA() {
        return numeroAvvisoPagoPA;
    }


    /**
     * Sets the numeroAvvisoPagoPA value for this DettaglioPagamentiTransazione.
     * 
     * @param numeroAvvisoPagoPA   * numero avviso PagoPA
     */
    public void setNumeroAvvisoPagoPA(java.lang.String numeroAvvisoPagoPA) {
        this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
    }


    /**
     * Gets the importo value for this DettaglioPagamentiTransazione.
     * 
     * @return importo   * importo in centesimi di euro
     */
    public java.math.BigDecimal getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this DettaglioPagamentiTransazione.
     * 
     * @param importo   * importo in centesimi di euro
     */
    public void setImporto(java.math.BigDecimal importo) {
        this.importo = importo;
    }


    /**
     * Gets the numeroDocumento value for this DettaglioPagamentiTransazione.
     * 
     * @return numeroDocumento   * numero documento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this DettaglioPagamentiTransazione.
     * 
     * @param numeroDocumento   * numero documento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the codiceFiscale value for this DettaglioPagamentiTransazione.
     * 
     * @return codiceFiscale   * codice fiscale/p. iva
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this DettaglioPagamentiTransazione.
     * 
     * @param codiceFiscale   * codice fiscale/p. iva
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the denominazione value for this DettaglioPagamentiTransazione.
     * 
     * @return denominazione   * denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this DettaglioPagamentiTransazione.
     * 
     * @param denominazione   * denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the indirizzo value for this DettaglioPagamentiTransazione.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this DettaglioPagamentiTransazione.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the codiceBelfioreComune value for this DettaglioPagamentiTransazione.
     * 
     * @return codiceBelfioreComune
     */
    public java.lang.String getCodiceBelfioreComune() {
        return codiceBelfioreComune;
    }


    /**
     * Sets the codiceBelfioreComune value for this DettaglioPagamentiTransazione.
     * 
     * @param codiceBelfioreComune
     */
    public void setCodiceBelfioreComune(java.lang.String codiceBelfioreComune) {
        this.codiceBelfioreComune = codiceBelfioreComune;
    }


    /**
     * Gets the siglaProvincia value for this DettaglioPagamentiTransazione.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this DettaglioPagamentiTransazione.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the CAP value for this DettaglioPagamentiTransazione.
     * 
     * @return CAP
     */
    public java.lang.String getCAP() {
        return CAP;
    }


    /**
     * Sets the CAP value for this DettaglioPagamentiTransazione.
     * 
     * @param CAP
     */
    public void setCAP(java.lang.String CAP) {
        this.CAP = CAP;
    }


    /**
     * Gets the pagamentoSpontaneo value for this DettaglioPagamentiTransazione.
     * 
     * @return pagamentoSpontaneo
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.PagamentoSpontaneo getPagamentoSpontaneo() {
        return pagamentoSpontaneo;
    }


    /**
     * Sets the pagamentoSpontaneo value for this DettaglioPagamentiTransazione.
     * 
     * @param pagamentoSpontaneo
     */
    public void setPagamentoSpontaneo(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.PagamentoSpontaneo pagamentoSpontaneo) {
        this.pagamentoSpontaneo = pagamentoSpontaneo;
    }


    /**
     * Gets the dettaglioContabile value for this DettaglioPagamentiTransazione.
     * 
     * @return dettaglioContabile   * Dettaglio importi contabili.
     */
    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile[] getDettaglioContabile() {
        return dettaglioContabile;
    }


    /**
     * Sets the dettaglioContabile value for this DettaglioPagamentiTransazione.
     * 
     * @param dettaglioContabile   * Dettaglio importi contabili.
     */
    public void setDettaglioContabile(com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile[] dettaglioContabile) {
        this.dettaglioContabile = dettaglioContabile;
    }

    public com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile getDettaglioContabile(int i) {
        return this.dettaglioContabile[i];
    }

    public void setDettaglioContabile(int i, com.esed.payer.monitoraggio.webservice.monitoraggio.dati.DettaglioContabile _value) {
        this.dettaglioContabile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioPagamentiTransazione)) return false;
        DettaglioPagamentiTransazione other = (DettaglioPagamentiTransazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceDettaglioTransazione==null && other.getCodiceDettaglioTransazione()==null) || 
             (this.codiceDettaglioTransazione!=null &&
              this.codiceDettaglioTransazione.equals(other.getCodiceDettaglioTransazione()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.tipoUfficio==null && other.getTipoUfficio()==null) || 
             (this.tipoUfficio!=null &&
              this.tipoUfficio.equals(other.getTipoUfficio()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.descrizioneTipologiaServizio==null && other.getDescrizioneTipologiaServizio()==null) || 
             (this.descrizioneTipologiaServizio!=null &&
              this.descrizioneTipologiaServizio.equals(other.getDescrizioneTipologiaServizio()))) &&
            ((this.tassonomiaPagoPA==null && other.getTassonomiaPagoPA()==null) || 
             (this.tassonomiaPagoPA!=null &&
              this.tassonomiaPagoPA.equals(other.getTassonomiaPagoPA()))) &&
            ((this.identificativoUnivocoRiscossione==null && other.getIdentificativoUnivocoRiscossione()==null) || 
             (this.identificativoUnivocoRiscossione!=null &&
              this.identificativoUnivocoRiscossione.equals(other.getIdentificativoUnivocoRiscossione()))) &&
            ((this.numeroAvvisoPagoPA==null && other.getNumeroAvvisoPagoPA()==null) || 
             (this.numeroAvvisoPagoPA!=null &&
              this.numeroAvvisoPagoPA.equals(other.getNumeroAvvisoPagoPA()))) &&
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.codiceBelfioreComune==null && other.getCodiceBelfioreComune()==null) || 
             (this.codiceBelfioreComune!=null &&
              this.codiceBelfioreComune.equals(other.getCodiceBelfioreComune()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia()))) &&
            ((this.CAP==null && other.getCAP()==null) || 
             (this.CAP!=null &&
              this.CAP.equals(other.getCAP()))) &&
            ((this.pagamentoSpontaneo==null && other.getPagamentoSpontaneo()==null) || 
             (this.pagamentoSpontaneo!=null &&
              this.pagamentoSpontaneo.equals(other.getPagamentoSpontaneo()))) &&
            ((this.dettaglioContabile==null && other.getDettaglioContabile()==null) || 
             (this.dettaglioContabile!=null &&
              java.util.Arrays.equals(this.dettaglioContabile, other.getDettaglioContabile())));
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
        if (getCodiceDettaglioTransazione() != null) {
            _hashCode += getCodiceDettaglioTransazione().hashCode();
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
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getDescrizioneTipologiaServizio() != null) {
            _hashCode += getDescrizioneTipologiaServizio().hashCode();
        }
        if (getTassonomiaPagoPA() != null) {
            _hashCode += getTassonomiaPagoPA().hashCode();
        }
        if (getIdentificativoUnivocoRiscossione() != null) {
            _hashCode += getIdentificativoUnivocoRiscossione().hashCode();
        }
        if (getNumeroAvvisoPagoPA() != null) {
            _hashCode += getNumeroAvvisoPagoPA().hashCode();
        }
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getCodiceBelfioreComune() != null) {
            _hashCode += getCodiceBelfioreComune().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        if (getCAP() != null) {
            _hashCode += getCAP().hashCode();
        }
        if (getPagamentoSpontaneo() != null) {
            _hashCode += getPagamentoSpontaneo().hashCode();
        }
        if (getDettaglioContabile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDettaglioContabile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDettaglioContabile(), i);
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
        new org.apache.axis.description.TypeDesc(DettaglioPagamentiTransazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioPagamentiTransazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceDettaglioTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceDettaglioTransazione"));
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
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "descrizioneTipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tassonomiaPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "tassonomiaPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoRiscossione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "identificativoUnivocoRiscossione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "numeroAvvisoPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfioreComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "codiceBelfioreComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "siglaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "CAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagamentoSpontaneo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "pagamentoSpontaneo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "PagamentoSpontaneo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dettaglioContabile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "dettaglioContabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.monitoraggio.webservice.monitoraggio.payer.esed.com", "DettaglioContabile"));
        elemField.setMinOccurs(0);
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
