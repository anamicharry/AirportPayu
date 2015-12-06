/**
 * 
 */
package com.anamicharry.airport.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ana Barragán
 *
 */
@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idReserva;

	/**
	 * @return the idReserva
	 */
	public Long getIdReserva() {
		return idReserva;
	}

	/**
	 * @param idReserva the idReserva to set
	 */
	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}
	
	
}
