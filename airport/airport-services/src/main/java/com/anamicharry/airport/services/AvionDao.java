/**
 * 
 */
package com.anamicharry.airport.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.anamicharry.airport.web.model.Avion;

/**
 * @author Ana Barragán
 *
 */
public class AvionDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Avion save(Avion avion) {
		Avion result = avion;
		if (avion.getIdAvion() == null) {
			entityManager.persist(avion);
		} else {
			if (!entityManager.contains(avion)) {
				result = entityManager.merge(avion);
			}
		}
		return result;
	}
	
	@Transactional
	public void delete(Long id){		
		//entityManager.remove(Pasajero.class, id);
		Avion avion = entityManager.find(Avion.class, id);		
		entityManager.remove(avion);
		
	}

	@SuppressWarnings("unchecked")
	public List<Avion> list() {
		return entityManager.createQuery("select t from Avion t")
				.getResultList();
	}
	
	public Avion findAvion(Long id) {
		return entityManager.find(Avion.class, id);
	}
}
