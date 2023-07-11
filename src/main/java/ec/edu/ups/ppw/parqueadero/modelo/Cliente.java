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
import jakarta.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cli_codigo")
	private int idCliente;
	
	@Column(name="cli_cedula")
	private String cedulaCliente;
	
	@Column(name="cli_nombre")
	private String nombreCliente;
	
	@Column(name="cli_apellido")
	private String apellidosCliente;
	
	@Column(name="cli_direccion")
	private String direccionCliente;
	
	@Column(name="cli_telefono")
	private String telefonoCliente;
	
	/*
	@OneToOne
	@JoinColumn(name="id_cliente")
	private List<Factura> factura;
	*/
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedulaCliente=" + cedulaCliente + ", nombreCliente="
				+ nombreCliente + ", apellidosCliente=" + apellidosCliente + ", direccionCliente=" + direccionCliente
				+ ", telefonoCliente=" + telefonoCliente + "]";
	}
		
}
