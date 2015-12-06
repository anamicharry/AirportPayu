/**
 * 
 */
package com.anamicharry.airport.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.anamicharry.airport.services.PasajeroDao;
import com.anamicharry.airport.web.model.Pasajero;


/**
 * @author Ana Barragán
 *
 */
@Component("PasajeroBB")
@Scope("request")
public class PasajeroBean {
	
	private static final Logger logger = LoggerFactory.getLogger(PasajeroBean.class);
	private Pasajero pasajero = new Pasajero();
	private List<Pasajero> pasajeros;
	
	@Autowired
	private PasajeroDao parajeroDao;
	
	public String getMessage() {
		logger.debug("Returning message from Pasajero home bean");
		return "Hello from Spring";
	}
	
	

	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}



	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}



	public void savePasajero() {
		parajeroDao.save(pasajero);
		pasajero = new Pasajero();
		invalidatePasajeros();
	
	}

	private void invalidatePasajeros() {
		pasajeros = null;
	}

	public List<Pasajero> getTasks() {
		if (pasajeros == null) {
			pasajeros = parajeroDao.list();
		}
		return pasajeros;
		
	}

}
