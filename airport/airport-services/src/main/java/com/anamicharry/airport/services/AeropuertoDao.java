/**
 * 
 */
package com.anamicharry.airport.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.anamicharry.airport.web.model.Ruta;

/**
 * @author Ana Barragán
 *
 */
public class AeropuertoDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Ruta> list() {
		return entityManager.createQuery("select t from Aeropuerto t")
				.getResultList();
	}
}
