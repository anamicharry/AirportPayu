/**
 * 
 */
package com.anamicharry.airport.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;
import com.anamicharry.airport.web.model.Ruta;

/**
 * @author Ana Barragán
 *
 */
public class RutaDao {
	
	@PersistenceContext
	private EntityManager entityManager; 

	@Transactional
	public Ruta save(Ruta ruta) {
		Ruta result = ruta;
		if (ruta.getIdRuta() == null) {
			entityManager.persist(ruta);
		} else {
			if (!entityManager.contains(ruta)) {
				result = entityManager.merge(ruta);
			}
		}
		return result;
	}
	
	@Transactional
	public void delete(Long id){		
		//entityManager.remove(Pasajero.class, id);
		Ruta ruta = entityManager.find(Ruta.class, id);		
		entityManager.remove(ruta);
		
	}

	@SuppressWarnings("unchecked")
	public List<Ruta> list() {
		return entityManager.createQuery("select t from Ruta t")
				.getResultList();
	}
	
	public Ruta getRuta(Long id) {
		return entityManager.find(Ruta.class, id);
	}
}
