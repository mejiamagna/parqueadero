package ec.edu.ups.ppw.parqueadero.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ticket implements Serializable {
	
	@Id
	@GeneratedValue
	private int idTicket;
	
	private Date fecha;
	private Date horaIngreso;
	private Date horaSalida;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	
}
