package ec.edu.ups.ppw.parqueadero.dao;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDAO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cliente cliente) {
		em.persist(cliente);
	}
	
	public void update(Cliente cliente) {
		em.merge(cliente);
	}
	
	public Cliente read(int id) {
		Cliente c = em.find(Cliente.class, id);
		System.out.println("cli " + c);
		return c;
	}
	
	public void delete(int id) {
		Cliente c = em.find(Cliente.class, id);
		em.remove(c);
	}
	
	public List<Cliente> getAll(){
		String jpql = "SELECT c FROM Cliente c";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}
