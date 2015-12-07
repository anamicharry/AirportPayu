/**
 * 
 */
package com.anamicharry.airport.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NamedQuery;

/**
 * @author Ana Barragán
 *
 */
@Entity
@NamedQuery(name="Avion.findAll", query="SELECT a FROM Avion a")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAvion;
	private String modelo;
	private String fabricante;
	private String capacidad;
	
	//bi-directional many-to-one association to Silla
	@OneToMany(mappedBy="avion")
	private List<Silla> sillas;

	//bi-directional many-to-one association to Vuelo
	@OneToMany(mappedBy="avion")
	private List<Vuelo> vuelos;
		
	/**
	 * @return the idAvion
	 */
	public Long getIdAvion() {
		return idAvion;
	}
	/**
	 * @param idAvion the idAvion to set
	 */
	public void setIdAvion(Long idAvion) {
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
	
	public List<Silla> getSillas() {
		return this.sillas;
	}

	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}

	public Silla addSilla(Silla silla) {
		getSillas().add(silla);
		silla.setAvion(this);

		return silla;
	}

	public Silla removeSilla(Silla silla) {
		getSillas().remove(silla);
		silla.setAvion(null);

		return silla;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public Vuelo addVuelo(Vuelo vuelo) {
		getVuelos().add(vuelo);
		vuelo.setAvion(this);

		return vuelo;
	}

	public Vuelo removeVuelo(Vuelo vuelo) {
		getVuelos().remove(vuelo);
		vuelo.setAvion(null);

		return vuelo;
	}
	
}
