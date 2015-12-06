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
@NamedQuery(name="Vuelo.findAll", query="SELECT v FROM Vuelo v")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idVuelo;
	private Date fechaVuelo;
	private Date HoraInicio;
	private Date Horafin;
	
	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="vuelo")
	private List<Reserva> reservas;
	
	//bi-directional many-to-one association to Ruta
	@ManyToOne	
	@JoinColumn(name="ruta_idruta", referencedColumnName="idruta")	
	private Ruta ruta;

	//bi-directional many-to-one association to Avion
	@ManyToOne
	private Avion avion;
		
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
	
	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setVuelo(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setVuelo(null);

		return reserva;
	}
	
	public Avion getAvion() {
		return this.avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ruta getRuta() {
		return this.ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
}
