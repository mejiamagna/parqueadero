package ec.edu.ups.ppw.parqueadero.negocio;

import ec.edu.ups.ppw.parqueadero.dao.ClienteDAO;
import ec.edu.ups.ppw.parqueadero.modelo.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public void guardarClientes(Cliente cliente) throws Exception {
		if(!this.isCedulaValida(cliente.getCedulaCliente()))
			throw new Exception("Cedula incorrecta");
		
		if(daoCliente.read(cliente.getCedulaCliente()) == null) {
			try {
				daoCliente.insert(cliente);
			}catch(Exception e) {
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoCliente.update(cliente);
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
	
}
