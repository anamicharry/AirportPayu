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
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPais;
	private String nombrePais;
	/**
	 * @return the idPais
	 */
	public Long getIdPais() {
		return idPais;
	}
	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}
	/**
	 * @return the nombrePais
	 */
	public String getNombrePais() {
		return nombrePais;
	}
	/**
	 * @param nombrePais the nombrePais to set
	 */
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
}
