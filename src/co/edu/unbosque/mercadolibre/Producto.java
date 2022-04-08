package co.edu.unbosque.mercadolibre;

public class Producto {
	
	//Atributos de producto
	private String nombre;
	private Proveedor proveedor;
	private double precio; //Valor en dólares
	private int cantidad;
	
	Producto(String nombre, double precio, int cantidad){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	//Métodos de producto
	public void agregarInventario() {
		
	}
	public void eliminarInventario() {
		
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	

}
