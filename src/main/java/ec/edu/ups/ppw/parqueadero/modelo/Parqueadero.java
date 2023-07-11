package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Parqueadero implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	@Column(name="id_parqueadero")
	private int idParqueadero;
	
	private String nombre;
	private String direccion;
	private String telefono;
	private int espacios;
	
	/*
	@OneToMany
	@JoinColumn(name="id_parqueadero")
	private List<Cliente> cliente;
	*/
	public Parqueadero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getIdParqueadero() {
		return idParqueadero;
	}
	public void setIdParqueadero(int idParqueadero) {
		this.idParqueadero = idParqueadero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEspacios() {
		return espacios;
	}
	public void setEspacios(int espacios) {
		this.espacios = espacios;
	}
	
}
