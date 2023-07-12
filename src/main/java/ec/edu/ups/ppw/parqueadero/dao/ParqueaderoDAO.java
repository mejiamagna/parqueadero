package ec.edu.ups.ppw.parqueadero.dao;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.Parqueadero;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ParqueaderoDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Parqueadero parqueadero) {
		em.persist(parqueadero);
	}
	
	public void update(Parqueadero parqueadero) {
		em.merge(parqueadero);
	}
	
	
	public Parqueadero read(int idParqueadero) {
		Parqueadero p = em.find(Parqueadero.class, idParqueadero);
		return p;
	}
	
	public void delete(int idParqueadero) {
		Parqueadero p = em.find(Parqueadero.class, idParqueadero);
		em.remove(p);
	}
	
	
	public List<Parqueadero> getAll(){
		String jpql = "SELECT p FROM Parqueadero p";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}
