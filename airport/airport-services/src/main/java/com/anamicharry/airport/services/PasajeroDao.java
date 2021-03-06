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
	
	@Transactional
	public void delete(Long id){		
		//entityManager.remove(Pasajero.class, id);
		Pasajero pasajero = entityManager.find(Pasajero.class, id);		
		entityManager.remove(pasajero);
		
	}

	@SuppressWarnings("unchecked")
	public List<Pasajero> list() {
		return entityManager.createQuery("select t from Pasajero t")
				.getResultList();
	}
	
	public Pasajero getPasajero(Long id) {
		return entityManager.find(Pasajero.class, id);
	}
}
