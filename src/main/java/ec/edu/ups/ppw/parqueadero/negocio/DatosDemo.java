package ec.edu.ups.ppw.parqueadero.negocio;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.parqueadero.dao.ClienteDAO;
import ec.edu.ups.ppw.parqueadero.dao.DetalleFacturaDAO;
import ec.edu.ups.ppw.parqueadero.dao.FacturaDAO;
import ec.edu.ups.ppw.parqueadero.dao.ParqueaderoDAO;
import ec.edu.ups.ppw.parqueadero.dao.ProductoDAO;
import ec.edu.ups.ppw.parqueadero.dao.VehiculoDAO;
import ec.edu.ups.ppw.parqueadero.modelo.Cliente;
import ec.edu.ups.ppw.parqueadero.modelo.DetalleFactura;
import ec.edu.ups.ppw.parqueadero.modelo.Factura;
import ec.edu.ups.ppw.parqueadero.modelo.Producto;
import ec.edu.ups.ppw.parqueadero.modelo.Vehiculo;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class DatosDemo {
	
	@Inject
	private ParqueaderoDAO daoParqueadero;
	
	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private ProductoDAO daoProducto;
	
	@Inject
	private FacturaDAO daoFactura;
	
	@Inject
	private DetalleFacturaDAO daoDetalle;
	
	/*
	@PostConstruct
	public void init() {
		System.out.println("Hola UPS");
		
		Cliente c = new Cliente();
		c.setCedulaCliente("0105698153");
		c.setNombreCliente("Valentina");
		c.setApellidosCliente("Otavalo");
		c.setDireccionCliente("Baños");
		c.setTelefonoCliente("0963458755");
		daoCliente.insert(c);
		
		Producto pro1 = new Producto();
		pro1.setNombreProducto("TV Sony");
		pro1.setPrecio(450.00);
		pro1.setStock(10);
		daoProducto.insert(pro1);
		
		Producto pro2 = new Producto();
		pro2.setNombreProducto("Lavadora Mabe");
		pro2.setPrecio(400.00);
		pro2.setStock(10);
		daoProducto.insert(pro2);
		
		Producto pro3 = new Producto();
		pro3.setNombreProducto("Licuadora Oster");
		pro3.setPrecio(40.00);
		pro3.setStock(20);
		daoProducto.insert(pro3);
		
		Factura fac = new Factura();
		fac.setNumeroFactura("001-001-000001");
		fac.setFecha(new Date());
		fac.setCliente(c);
		
		DetalleFactura det1 = new DetalleFactura();
		det1.setProducto(pro1);
		det1.setCantidad(2);
		det1.setCostoUnitario(450);
		det1.setCostoTotal(900);
		
		//daoDetalle.insert(det1);
		
		fac.addDetalle(det1);
		
		DetalleFactura det2 = new DetalleFactura();
		det2.setProducto(pro3);
		det2.setCantidad(2);
		det2.setCostoUnitario(400);
		det2.setCostoTotal(800);
		//daoDetalle.insert(det2);
		
		fac.addDetalle(det2);
		
		daoFactura.insert(fac);
		
		List<Producto> productos = daoProducto.getAll();
		for(Producto pro: productos) {
			System.out.println(pro);
		}
		
		List<Factura> facturas = daoFactura.getAll();
		for(Factura fact: facturas) {
			System.out.println(fact.getIdFactura() + ": " + fact.getNumeroFactura() + "- " + fac.getCliente().getNombreCliente() + 
					" total productos: " + fac.getDetalles().size());
		}
		
	}
	
	*/
	
	
	
	/*
	@Inject
	private VehiculoDAO daoVehiculo;
	
	@PostConstruct
	public void init() {
		System.out.println("Hola UPS");
		System.out.println("Hola PPW");
		
		Vehiculo v = new Vehiculo();
		v.setPlacaVehiculo("PDA-8976");
		v.setMarcaVehiculo("Chevrolet");
		v.setModeloVehiculo("Aveo");
		v.setColorVehiculo("Plomo");
		
		daoVehiculo.insertar(v);
		
		Vehiculo v1 = new Vehiculo();
		v1.setPlacaVehiculo("PCM-2244");
		v1.setMarcaVehiculo("Chevrolet");
		v1.setModeloVehiculo("Vitara");
		v1.setColorVehiculo("Blanco");
		
		daoVehiculo.insertar(v1);
		
		Vehiculo v2 = new Vehiculo();
		v2.setPlacaVehiculo("ABE-5696");
		v2.setMarcaVehiculo("Chevrolet");
		v2.setModeloVehiculo("Aveo");
		v2.setColorVehiculo("Rojo");
		
		daoVehiculo.insertar(v2);
		
		daoVehiculo.getAll();
	}
	*/
}
