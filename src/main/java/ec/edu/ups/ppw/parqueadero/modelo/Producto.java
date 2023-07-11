package ec.edu.ups.ppw.parqueadero.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue
	@Column(name="pro_codigo")
	private int codigoProducto;
	
	@Column(name="pro_nombre")
	private String nombreProducto;
	
	@Column(name="pro_precio")
	private double precio;
	
	@Column(name="pro_stock")
	private int stock;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
