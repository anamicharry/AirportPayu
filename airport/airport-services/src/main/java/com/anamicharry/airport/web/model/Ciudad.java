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
public class Ciudad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCiudad;
	private String nombreCiudad;
	/**
	 * @return the idCiudad
	 */
	public Long getIdCiudad() {
		return idCiudad;
	}
	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}
	/**
	 * @return the nombreCiudad
	 */
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	/**
	 * @param nombreCiudad the nombreCiudad to set
	 */
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
}
