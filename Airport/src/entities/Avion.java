/**
 * 
 */
package entities;

/**
 * @author Ana Barragan
 *
 */
public class Avion {
	
	/**
	 * Identificador unico del Avion
	 */
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
	 * Constructor de la clase Avion
	 */
	public Avion() {
		super();
	}

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
