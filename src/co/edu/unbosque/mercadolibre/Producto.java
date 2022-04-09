package co.edu.unbosque.mercadolibre;

public class Producto {
	
	//Atributos de producto
	private String nombre;
	private Proveedor proveedor;
	private double precio; //Valor en d�lares
	private int cantidad;
	
	Producto(String nombre, double precio, int cantidad){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	//M�todos de producto
	public void agregarInventario() {
		
	}
	public void eliminarInventario() {
		
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidad() { //M�todo para recoger la cantidad de producto que hay y mostrarla al lado del nombre del producto
		return this.cantidad;
	}
	

}
