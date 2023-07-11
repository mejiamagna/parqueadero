package ec.edu.ups.ppw.parqueadero.dao;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.Vehiculo;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class VehiculoDAO implements Serializable{
	
	@PersistenceContext
	private EntityManager em;
	
	public void insertar (Vehiculo vehiculo) {
		em.persist(vehiculo);
	}
	
	public void update (Vehiculo vehiculo) {
		em.merge(vehiculo);
	}
	
	public Vehiculo read(String placa) {
		Vehiculo v = em.find(Vehiculo.class, placa);
		return v;
	}
	
	public void delete (String placa) {
		Vehiculo v = em.find(Vehiculo.class, placa);
		em.remove(v);
	}
	
	public List<Vehiculo> getAll(){
		String jpql = "SELECT v FROM Vehiculo v";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
	
}
