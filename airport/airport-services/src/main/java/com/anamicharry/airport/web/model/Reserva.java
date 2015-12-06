/**
 * 
 */
package com.anamicharry.airport.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NamedQuery;

/**
 * @author Ana Barragán
 *
 */
@Entity
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idReserva;

	//bi-directional many-to-one association to Pasajero
	@ManyToOne
	private Pasajero pasajero;
	
	//bi-directional many-to-one association to Vuelo
	@ManyToOne	
	@JoinColumn(name="vuelo_idvuelo", referencedColumnName="idvuelo")		
	private Vuelo vuelo;
		
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
	
	public Pasajero getPasajero() {
		return this.pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public Vuelo getVuelo() {
		return this.vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}	
}
