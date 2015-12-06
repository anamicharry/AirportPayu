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
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAvion;
	private String modelo;
	private String fabricante;
	private String capacidad;
	/**
	 * @return the idAvion
	 */
	public long getIdAvion() {
		return idAvion;
	}
	/**
	 * @param idAvion the idAvion to set
	 */
	public void setIdAvion(long idAvion) {
		this.idAvion = idAvion;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the capacidad
	 */
	public String getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
