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
	Proveedor(String nombre, String direccion, String telefono, String categoriaQueOfrece, int cantidadDisponible){
		//this.nombre = nombre; //Se eliminó por redundancia
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.categoriaQueOfrece = categoriaQueOfrece;
		this.cantidadDisponible = cantidadDisponible;
		//this.producto = producto; //Esto no se puede poner en el constructor
		//this.hayInventario = hayInventario; //Esto no se puede poner en el constructor
	}	
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public void vender() {
		
	}
	
	//Setters
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
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
}
