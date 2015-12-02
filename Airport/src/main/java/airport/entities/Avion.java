/**
 * 
 */
package main.java.airport.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ana Barragan
 *
 */
@Entity
@Table(name = "Avion")
public class Avion {
	
	/**
	 * Identificador unico del Avion
	 */
	@Id
	private Long idAvion;
	/**
	 * Modelo del Avion
	 */
	private String modelo;
	/**
	 * Fabricante del Avion
	 */
	private String fabricante;
	/**
	 * Capacidad maxima del avion
	 */
	private Integer capacidad;
	
	/**
	 * retorna el identificvador unico del avion
	 * @return Numero de tipo Long con el Id del Avion
	 */	
	public Long getIdAvion() {
		return idAvion;
	}
	
	/**
	 * Modifica el identificador unico del avion
	 * @param idAvion identificador de tipo Long
	 */
	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}

	/**
	 * Constructor de la clase Avion
	 */	
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Constructor de la clase Avion
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Constructor de la clase Avion
	 */
	public String getFabricante() {
		return fabricante;
	}
	
	/**
	 * Constructor de la clase Avion
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	/**
	 * Constructor de la clase Avion
	 */
	public Integer getCapacidad() {
		return capacidad;
	}
	
	/**
	 * Constructor de la clase Avion
	 */
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}		
}
