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
		
		//daoParqueadero.insert(parqueadero);
		
		
		if(daoParqueadero.read(parqueadero.getIdParqueadero()) == null) {
			try {
				daoParqueadero.insert(parqueadero);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoParqueadero.update(parqueadero);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
		
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
