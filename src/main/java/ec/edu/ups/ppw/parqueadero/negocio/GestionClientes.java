package ec.edu.ups.ppw.parqueadero.negocio;

import java.util.List;

import ec.edu.ups.ppw.parqueadero.dao.ClienteDAO;
import ec.edu.ups.ppw.parqueadero.modelo.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.Query;

@Stateless
public class GestionClientes {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public void guardarClientes(Cliente cliente) throws Exception {
		
		//daoCliente.insert(cliente);
		System.out.println(cliente);
		
		if(!this.isCedulaValida(cliente.getCedulaCliente()))
			throw new Exception("Cedula incorrecta");
		
		if(daoCliente.read(cliente.getIdCliente()) == null) {
			try {
				daoCliente.insert(cliente);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoCliente.update(cliente);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
	}
	
	private boolean isCedulaValida(String cedula) {
		return cedula.length() == 10;
	}
	
	/*
	public void guardarClientes(String cedula, String nombre, String apellidos, String direccion, String telefono) {
		
	}
	*/
	
	public List<Cliente> getAll(){
		return daoCliente.getAll();
	}
	
	/*
	public List name getCliente() {
		
	}
	*/
}
