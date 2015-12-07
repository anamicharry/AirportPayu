/**
 * 
 */
package com.anamicharry.airport.web.model;

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
@NamedQuery(name="Aeropuerto.findAll", query="SELECT a FROM Aeropuerto a")
public class Aeropuerto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAeropuerto;
	private String nombreAeropuerto;
	
	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="pais_idpais")
	private Pais pais;

	//bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy="aeropuerto1")
	private List<Ruta> rutas1;

	//bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy="aeropuerto2")
	private List<Ruta> rutas2;
	/**
	 * @return the idAeropuerto
	 */
	public Long getIdAeropuerto() {
		return idAeropuerto;
	}
	/**
	 * @param idAeropuerto the idAeropuerto to set
	 */
	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	/**
	 * @return the nombreAeropuerto
	 */
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	/**
	 * @param nombreAeropuerto the nombreAeropuerto to set
	 */
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}	
	
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Ruta> getRutas1() {
		return this.rutas1;
	}

	public void setRutas1(List<Ruta> rutas1) {
		this.rutas1 = rutas1;
	}

	public Ruta addRutas1(Ruta rutas1) {
		getRutas1().add(rutas1);
		rutas1.setAeropuerto1(this);

		return rutas1;
	}

	public Ruta removeRutas1(Ruta rutas1) {
		getRutas1().remove(rutas1);
		rutas1.setAeropuerto1(null);

		return rutas1;
	}

	public List<Ruta> getRutas2() {
		return this.rutas2;
	}

	public void setRutas2(List<Ruta> rutas2) {
		this.rutas2 = rutas2;
	}

	public Ruta addRutas2(Ruta rutas2) {
		getRutas2().add(rutas2);
		rutas2.setAeropuerto2(this);

		return rutas2;
	}

	public Ruta removeRutas2(Ruta rutas2) {
		getRutas2().remove(rutas2);
		rutas2.setAeropuerto2(null);

		return rutas2;
	}
}