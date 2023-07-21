package ec.edu.ups.ppw.parqueadero.servicios;

import java.util.List;

import ec.edu.ups.ppw.parqueadero.modelo.Persona;
import ec.edu.ups.ppw.parqueadero.negocio.GestionPersona;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("personas")
public class GPersonaService {
	
	@Inject
	private GestionPersona gPersonas;
	
	@GET
	@Path("misdatos")
	@Produces("application/json")
	public Persona misDatos() {
		Persona p = new Persona();
		p.setCedula("0105334009");
		p.setNombre("Magna");
		p.setDireccion("Cumbe");
		
		return p;
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarPersona(Persona persona) {

		
		try {
			gPersonas.guardarPersona(persona);
			return Response.status(Response.Status.OK).entity(persona).build();
					
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			Error error = new Error();
			error.setCodigo(99);
			error.setMensaje("Error al guardar:" + e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}	
		
	}
	
	@GET
	@Path("/listarPersonas")
	@Produces("application/json")
	public List<Persona> getAll(){
		
		return gPersonas.getAll();
	}
	
	@DELETE
	@Path("/{cedula}")
	public Response eliminarPersona (@PathParam("cedula")String cedula){
		boolean eliminar = gPersonas.eliminarPersona(cedula);
		if (eliminar) {
			return Response.status(Response.Status.OK).build();
		} else {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}

	}
	
}
