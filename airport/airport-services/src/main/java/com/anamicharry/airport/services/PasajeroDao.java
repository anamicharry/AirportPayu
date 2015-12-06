/**
 * 
 */
package com.anamicharry.airport.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.anamicharry.airport.web.model.Pasajero;
import com.anamicharry.airport.web.model.Task;

/**
 * @author Ana Barragán
 *
 */
@Component
public class PasajeroDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(Pasajero pasajero) {
		entityManager.persist(pasajero);
	}

	@SuppressWarnings("unchecked")
	public List<Pasajero> list() {
		return entityManager.createQuery("select t from Pasajero t")
				.getResultList();
	}
}
