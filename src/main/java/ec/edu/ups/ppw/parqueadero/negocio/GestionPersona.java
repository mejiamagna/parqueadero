package ec.edu.ups.ppw.parqueadero.negocio;

import java.util.List;

import ec.edu.ups.ppw.parqueadero.dao.PersonaDAO;
import ec.edu.ups.ppw.parqueadero.modelo.Persona;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionPersona {
	@Inject
	private PersonaDAO daoPersona;
	
	public void guardarPersona(Persona persona) throws Exception {
		
		System.out.println(persona);
		
		if(!this.isCedulaValida(persona.getCedula()))

			throw new Exception("Cedula incorrecta");
		
		if(daoPersona.read(persona.getCedula()) == null) {
			try {
				daoPersona.insert(persona);
			}catch(Exception e) {
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoPersona.update(persona);
			}catch(Exception e) {
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
	
	}
	
	private boolean isCedulaValida(String cedula) {
		return cedula.length() == 10;
	}
	
	public void guardarClientes(String cedula, String nombre, String direccion) {

	}
	
	public List<Persona> getAll(){
		return daoPersona.getAll();
	}
	
	
	public boolean eliminarPersona(String cedula) {
		try {
			daoPersona.delete(cedula);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	/*

	public List<Persona> getPersonas(){
		return daoPersona.getAll();
	}
	/*
	
	
	/*
	public List name getCliente() {
		
	}
	*/
}
