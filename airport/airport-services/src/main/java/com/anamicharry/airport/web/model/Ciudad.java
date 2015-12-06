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
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCiudad;
	private String nombreCiudad;
	
	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="pais_idpais")
	private Pais pais;
		
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
	
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
