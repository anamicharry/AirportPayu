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
public class Pasajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimineto;
	/**
	 * @return the identificacion
	 */
	public Long getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}
	/**
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}
	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}
	/**
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the fechaNacimineto
	 */
	public Date getFechaNacimineto() {
		return fechaNacimineto;
	}
	/**
	 * @param fechaNacimineto the fechaNacimineto to set
	 */
	public void setFechaNacimineto(Date fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}
	
	
}
