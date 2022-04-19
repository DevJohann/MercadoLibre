package co.edu.unbosque.mercadolibre;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nombreDeUsuario;
	private String productName;
	private String productCategory;
	private String nombreProveedor;
	private boolean ordenCorrecta = false;
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Orden> ordenesList = new ArrayList<Orden>();
	
	public void comprarProductos(String productName, String productCategory) {
		this.productName = productName;
		this.productCategory = productCategory;
	}
	public void crearOrden () { //Este método se utilizará para el primer punto (conteo y compra de productos)
		//Revisar primero que haya inventario, con los getSizeProveedores,... (if getSizeProveedores == 0)
		//ordenCorrecta = false;
		System.out.println("Digite su nombre: ");
		nombreDeUsuario = scan.next();
		System.out.println("¿De qué categoría busca su producto?");
		productCategory = scan.next();
		System.out.println("¿Qué producto desea comprar?");
		productName = scan.next();
		System.out.println("Ingresa el nombre del proveedor: ");
		nombreProveedor = scan.next();
		//ordenesList.add(new Orden(productName));
	}
	public void comprobarOrdenCorrecta() {
		if(ordenCorrecta) {
			ordenesList.add(new Orden(productName));
		}
		else {
			System.out.println("Orden no añadida al historial");
		}
	}
	
	
	//Setters
	public void setOrdenCorrecta(boolean value) {
		this.ordenCorrecta = value;
	}
	
	//Getters
	public void getHistorial() {//Mostrar lo que el usuario compró buscando en el ArrayList
		
		for(Orden orden : ordenesList) {
			System.out.println("Orden número: " + orden.getIdOrden());
			System.out.println("Nombre del producto adquirido: " + orden.getNombreProducto());
			System.out.println();
		}
	
	}
	public String getNombreProductoCliente() {
		return this.productName;
	}
	public String getNombreProveedorCliente() {
		return this.nombreProveedor;
	}
	
	public void getCliente (){
	
	}
	public String getNombre () {
		return this.productName;
	}
	public boolean getOrdenCorrecta() {
		return this.ordenCorrecta;
	}
}
