package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class DetalleFactura implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="det_codigo")
	private int idDetalleFactura;
	
	@Column(name="det_cantidad")
	private double cantidad;
	
	@Column(name="det_descripcion")
	private String descripcion;
	
	@Column(name="det_precio")
	private double costoUnitario;
	
	private double costoTotal;
	
	@OneToOne
	@JoinColumn(name="pro_codigo")
	private Producto producto;

	
	public DetalleFactura() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}


	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getCostoUnitario() {
		return costoUnitario;
	}


	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}


	public double getCostoTotal() {
		return costoTotal;
	}


	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", descripcion="
				+ descripcion + ", costoUnitario=" + costoUnitario + ", costoTotal=" + costoTotal + ", producto="
				+ producto + "]";
	}
	
	
}
