package co.edu.unbosque.mercadolibre;

public class Producto {
	
	//Atributos de producto
	private String nombre;
	private Proveedor proveedor;
	private double precio; //Valor en dólares
	private int cantidad;
	private int tiempoDeEntrega;
	
	Producto(String nombre, double precio, int cantidad, int tiempoEntrega){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.tiempoDeEntrega = tiempoEntrega;
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
	
	public int getCantidad() { //Método para recoger la cantidad de producto que hay y mostrarla al lado del nombre del producto
		return this.cantidad;
	}
	public int getTiempoDeEntrega() {
		return this.tiempoDeEntrega;
	}
	public double getPrecio() {
		return this.precio;
	}
}
