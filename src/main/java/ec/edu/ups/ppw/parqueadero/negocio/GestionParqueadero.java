package ec.edu.ups.ppw.parqueadero.negocio;

import java.util.List;

import ec.edu.ups.ppw.parqueadero.dao.ParqueaderoDAO;
import ec.edu.ups.ppw.parqueadero.modelo.Parqueadero;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionParqueadero {

	@Inject
	private ParqueaderoDAO daoParqueadero;
	
	
	public void guardarParqueadero(Parqueadero parqueadero) throws Exception {
		
		daoParqueadero.insert(parqueadero);
		
		
	}
	
	
/*
	public void guardarParqueadero(Parqueadero parqueadero) {
		// TODO Auto-generated method stub
		
	}
*/	
	public List<Parqueadero> getAll(){
		return daoParqueadero.getAll();
	}
	
}
