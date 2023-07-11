package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TipoVehiculo implements Serializable {
	
	@Id
	@GeneratedValue
	private int idTipoVehiculo;
	private String tipoVehiculo;
	
	
	public TipoVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
