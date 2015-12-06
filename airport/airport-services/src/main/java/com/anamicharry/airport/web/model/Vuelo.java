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
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idVuelo;
	private Date fechaVuelo;
	private Date HoraInicio;
	private Date Horafin;
	/**
	 * @return the idVuelo
	 */
	public long getIdVuelo() {
		return idVuelo;
	}
	/**
	 * @param idVuelo the idVuelo to set
	 */
	public void setIdVuelo(long idVuelo) {
		this.idVuelo = idVuelo;
	}
	/**
	 * @return the fechaVuelo
	 */
	public Date getFechaVuelo() {
		return fechaVuelo;
	}
	/**
	 * @param fechaVuelo the fechaVuelo to set
	 */
	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	/**
	 * @return the horaInicio
	 */
	public Date getHoraInicio() {
		return HoraInicio;
	}
	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(Date horaInicio) {
		HoraInicio = horaInicio;
	}
	/**
	 * @return the horafin
	 */
	public Date getHorafin() {
		return Horafin;
	}
	/**
	 * @param horafin the horafin to set
	 */
	public void setHorafin(Date horafin) {
		Horafin = horafin;
	}	
}
