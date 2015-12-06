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
	public Pasajero save(Pasajero pasajero) {
		Pasajero result = pasajero;
		if (pasajero.getIdentificacion() == null) {
			entityManager.persist(pasajero);
		} else {
			if (!entityManager.contains(pasajero)) {
				result = entityManager.merge(pasajero);
			}
		}
		return result;
	}
	
	public void delete(Pasajero pasajero){
		entityManager.remove(pasajero);
	}

	@SuppressWarnings("unchecked")
	public List<Pasajero> list() {
		return entityManager.createQuery("select t from Pasajero t")
				.getResultList();
	}
	
	public Pasajero getStamp(Long id) {
		return entityManager.find(Pasajero.class, id);
	}
}
