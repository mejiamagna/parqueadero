package ec.edu.ups.ppw.parqueadero.servicios;

import ec.edu.ups.ppw.parqueadero.modelo.Cliente;
import ec.edu.ups.ppw.parqueadero.modelo.Parqueadero;
import ec.edu.ups.ppw.parqueadero.negocio.GestionClientes;
import ec.edu.ups.ppw.parqueadero.negocio.GestionParqueadero;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("clientes")
public class GClientesService {
	
	@Inject
	private GestionClientes gClientes;
	
	@GET
	@Path("saludo")
	public String saludo() {
		return "Hola mundo";
	}
	
	@GET
	@Path("suma")
	public String suma(@QueryParam("a") int a,
			@QueryParam("b") int b) {
		
		return " R = " + (a + b);
	}
	
	@GET
	@Path("multiplicacion/{a}/{b}")
	public String multiplicacion(@PathParam("a") int a,
			@PathParam("b") int b) {
		
		return " R = " + (a * b);
	}
	
	@GET
	@Path("misdatos")
	@Produces("application/json")
	public Cliente misDatos() {
		Cliente c = new Cliente();
		c.setCedulaCliente("0105334009");
		c.setNombreCliente("Magna");
		c.setApellidosCliente("Mejia");
		c.setDireccionCliente("Cumbe");
		c.setTelefonoCliente("072320006");
		
		return c;
	}
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarCliente(Cliente cliente) {
		try {
			gClientes.guardarClientes(cliente);
			return Response.status(Response.Status.OK).entity(cliente).build();
					
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			Error error = new Error();
			error.setCodigo(99);
			error.setMensaje("Error al guardar:" + e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}	
	}
}
