package co.edu.unbosque.mercadolibre;

public class Proveedor {
	
	//Atributos de proveedor
	
	private String nombre;
	private String direccion;
	private String telefono;
	private String categoriaQueOfrece;
	private int cantidadDisponible;
	private Producto producto;
	private boolean hayInventario;
	
	//métodos de proveedor
	Proveedor(String nombre, String direccion, String telefono, String categoriaQueOfrece, int cantidadDisponible, Producto producto, boolean hayInventario){
		//this.nombre = nombre; //Se eliminó por redundancia
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.categoriaQueOfrece = categoriaQueOfrece;
		this.cantidadDisponible = cantidadDisponible;
		this.producto = producto;
		this.hayInventario = hayInventario;
	}	
	
	public void vender() {
		
	}
	
	public void setNombres(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
		
	}
	public void setcategoriaQueOfrece(String categoriaQueOfrece) {
		this.categoriaQueOfrece = categoriaQueOfrece;
	}
	public void setcantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
}
