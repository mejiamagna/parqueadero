package ec.edu.ups.ppw.parqueadero.servicios;

import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.Parqueadero;
import ec.edu.ups.ppw.parqueadero.negocio.GestionParqueadero;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("parqueadero")
public class GParqueaderoService {

	@Inject
	private GestionParqueadero gParqueadero;
	
	@GET
	@Path("datosparqueadero")
	@Produces("application/json")
	public Parqueadero datosParqueadero() {
		Parqueadero p = new Parqueadero();
		p.setNombre("Parqueadero Cuenca");
		p.setDireccion("Av. de las Americas y Don Bosco");
		p.setTelefono("0998457530");
		p.setEspacios(40);

		return p;
	}
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarParqueadero(Parqueadero parqueadero) {
		try {
			gParqueadero.guardarParqueadero(parqueadero);
			return Response.status(Response.Status.OK).entity(parqueadero).build();
					
		} catch (Exception e) {
			// TODO: handle exception
			Error error = new Error();
			error.setCodigo(99);
			error.setMensaje("Error al guardar:" + e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}	
	}
	
	@GET
	@Path("/listarParqueadero")
	@Produces("application/json")
	public List<Parqueadero> getAll(){
		
		return gParqueadero.getAll();
	}
	
}
