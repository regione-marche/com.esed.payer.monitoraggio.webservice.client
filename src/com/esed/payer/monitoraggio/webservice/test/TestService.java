package com.esed.payer.monitoraggio.webservice.test;

import java.net.URL;

import com.esed.payer.monitoraggio.webservice.monitoraggio.dati.MonitoraggioTransazioniRequest;
import com.esed.payer.monitoraggio.webservice.monitoraggio.dati.MonitoraggioTransazioniResponse;
import com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioInterface;
import com.esed.payer.monitoraggio.webservice.monitoraggio.source.MonitoraggioServiceLocator;

public class TestService {

	public static void main(String[] args) {
		
		MonitoraggioTransazioniResponse response = null;
		
		try {
			MonitoraggioServiceLocator locator = new MonitoraggioServiceLocator();
			MonitoraggioInterface _interface = locator.getMonitoraggioPort(new URL("http://localhost:8081/MonitoraggioService/Monitoraggio"));
			MonitoraggioTransazioniRequest request = new MonitoraggioTransazioniRequest();
			
			request.setPortaleID("PTest");
			request.setUsername("test");
			request.setPassword("lOLmr6HxG5FJbM7UT3nR3Q==");
			
			request.setCodiceUtente("000TO");
			request.setCodiceSocieta("00004");
			request.setCodiceEnte("01683");
			request.setTipoUfficio(null);
			request.setCodiceUfficio(null);
			request.setDataDA("2020-01-01");
			request.setDataA(null);
			request.setNumeroAvvisoPagoPA(null);
			request.setIdentificativoUnivocoVersamento(null);
			request.setIdentificativoUnivocoRiscossione(null);
			request.setIdentificativoFlussoRendicontazioneNodo(null);
			
			response = _interface.monitoraggioTransazioni(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(response.getResponse().getRetCode());
	}

}
