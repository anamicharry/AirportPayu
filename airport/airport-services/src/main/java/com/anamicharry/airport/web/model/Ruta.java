/**
 * 
 */
package com.anamicharry.airport.web.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ana Barragán
 *
 */
@Entity
public class Ruta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRuta;
	private Date duracion;
	/**
	 * @return the idRuta
	 */
	public Long getIdRuta() {
		return idRuta;
	}
	/**
	 * @param idRuta the idRuta to set
	 */
	public void setIdRuta(Long idRuta) {
		this.idRuta = idRuta;
	}
	/**
	 * @return the duracion
	 */
	public Date getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Date duracion) {
		this.duracion = duracion;
	}
	
	
}
