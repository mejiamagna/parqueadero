package ec.edu.ups.ppw.parqueadero.dao;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.DetalleFactura;
import jakarta.ejb.Stateless;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DetalleFacturaDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(DetalleFactura detalle) {
		em.persist(detalle);
	}
	
	public void update(DetalleFactura detalle) {
		em.merge(detalle);
	}
	
	public DetalleFactura read(int codigo) {
		DetalleFactura d = em.find(DetalleFactura.class, codigo);
		return d;
	}
	
	public void delete(int codigo) {
		DetalleFactura d = em.find(DetalleFactura.class, codigo);
		em.remove(d);
	}
	
	public List<DetalleFactura> getAll(){
		String jpql = "SELECT d FROM DetalleFactura d";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
	
}
