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
public class Aeropuerto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAeropuerto;
	private String nombreAeropuerto;
	/**
	 * @return the idAeropuerto
	 */
	public Long getIdAeropuerto() {
		return idAeropuerto;
	}
	/**
	 * @param idAeropuerto the idAeropuerto to set
	 */
	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	/**
	 * @return the nombreAeropuerto
	 */
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	/**
	 * @param nombreAeropuerto the nombreAeropuerto to set
	 */
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}	
}
