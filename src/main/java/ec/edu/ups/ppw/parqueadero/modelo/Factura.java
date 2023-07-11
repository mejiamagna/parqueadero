package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Factura implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="fac_codigo")
	private int idFactura;
	
	@Column(name="fac_numero")
	private String numeroFactura;
	
	@Column(name="fac_fecha")
	private Date fecha;
	private double subtotal;
	private double iva;
	private double total;
	/*
	@OneToMany
	@JoinColumn(name="id_factura")
	private List<DetalleFactura> detalleFactura;
	*/
	@OneToOne
	@JoinColumn(name="cli_cedula")
	private Cliente cliente;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fac_codigo")
	private List<DetalleFactura> detalles;
	
	
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getNumeroFactura() {
		return numeroFactura;
	}


	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<DetalleFactura> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}
	
	public void addDetalle(DetalleFactura detalle) {
		if(detalles == null) {
			detalles = new ArrayList<DetalleFactura>();
		}
		detalles.add(detalle);
		
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numeroFactura=" + numeroFactura + ", fecha=" + fecha
				+ ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente
				+ ", detalles=" + detalles + "]";
	}
	
}
