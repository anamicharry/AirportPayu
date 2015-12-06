/**
 * 
 */
package com.anamicharry.airport.web.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NamedQuery;

/**
 * @author Ana Barragán
 *
 */
@Entity
@NamedQuery(name="Ruta.findAll", query="SELECT r FROM Ruta r")
public class Ruta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRuta;
	private Date duracion;
	
	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="aeropuertodestino_idaeropuerto", referencedColumnName="idaeropuerto")	
	private Aeropuerto aeropuerto1;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="aeropuertoorigen_idaeropuerto", referencedColumnName="idaeropuerto")
	private Aeropuerto aeropuerto2;
	
	//bi-directional many-to-one association to Vuelo
	@OneToMany(mappedBy="ruta")
	private List<Vuelo> vuelos;
		
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
	
	public Aeropuerto getAeropuerto1() {
		return this.aeropuerto1;
	}

	public void setAeropuerto1(Aeropuerto aeropuerto1) {
		this.aeropuerto1 = aeropuerto1;
	}

	public Aeropuerto getAeropuerto2() {
		return this.aeropuerto2;
	}

	public void setAeropuerto2(Aeropuerto aeropuerto2) {
		this.aeropuerto2 = aeropuerto2;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public Vuelo addVuelo(Vuelo vuelo) {
		getVuelos().add(vuelo);
		vuelo.setRuta(this);

		return vuelo;
	}

	public Vuelo removeVuelo(Vuelo vuelo) {
		getVuelos().remove(vuelo);
		vuelo.setRuta(null);

		return vuelo;
	}
	
}
