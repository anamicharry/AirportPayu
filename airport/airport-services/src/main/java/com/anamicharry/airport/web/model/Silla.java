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
public class Silla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSilla;
	private String clase;
	private String numSilla;
	/**
	 * @return the idSilla
	 */
	public Long getIdSilla() {
		return idSilla;
	}
	/**
	 * @param idSilla the idSilla to set
	 */
	public void setIdSilla(Long idSilla) {
		this.idSilla = idSilla;
	}
	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the numSilla
	 */
	public String getNumSilla() {
		return numSilla;
	}
	/**
	 * @param numSilla the numSilla to set
	 */
	public void setNumSilla(String numSilla) {
		this.numSilla = numSilla;
	}
	
	
}
