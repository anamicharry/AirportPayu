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
@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPais;
	private String nombrePais;
	
	//bi-directional many-to-one association to Aeropuerto
	@OneToMany(mappedBy="pais")
	private List<Aeropuerto> aeropuertos;

	//bi-directional many-to-one association to Ciudad
	@OneToMany(mappedBy="pais")
	private List<Ciudad> ciudads;
		
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
	
	public List<Aeropuerto> getAeropuertos() {
		return this.aeropuertos;
	}

	public void setAeropuertos(List<Aeropuerto> aeropuertos) {
		this.aeropuertos = aeropuertos;
	}

	public Aeropuerto addAeropuerto(Aeropuerto aeropuerto) {
		getAeropuertos().add(aeropuerto);
		aeropuerto.setPais(this);

		return aeropuerto;
	}

	public Aeropuerto removeAeropuerto(Aeropuerto aeropuerto) {
		getAeropuertos().remove(aeropuerto);
		aeropuerto.setPais(null);

		return aeropuerto;
	}

	public List<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(List<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

	public Ciudad addCiudad(Ciudad ciudad) {
		getCiudads().add(ciudad);
		ciudad.setPais(this);

		return ciudad;
	}

	public Ciudad removeCiudad(Ciudad ciudad) {
		getCiudads().remove(ciudad);
		ciudad.setPais(null);

		return ciudad;
	}
}