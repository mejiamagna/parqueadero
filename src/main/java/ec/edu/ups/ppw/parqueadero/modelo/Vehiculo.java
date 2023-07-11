package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Vehiculo implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="id_vehiculo")
	private int idVehiculo;
	
	private String placaVehiculo;
	private String marcaVehiculo;
	private String modeloVehiculo;
	private String colorVehiculo;
	
	/*
	@OneToMany
	@JoinColumn(name="id_vehiculo")
	private List<Ticket> ticket;
	*/
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlacaVehiculo() {
		return placaVehiculo;
	}
	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}
	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}
	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}
	public String getModeloVehiculo() {
		return modeloVehiculo;
	}
	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}
	public String getColorVehiculo() {
		return colorVehiculo;
	}
	public void setColorVehiculo(String colorVehiculo) {
		this.colorVehiculo = colorVehiculo;
	}
	
	
}
