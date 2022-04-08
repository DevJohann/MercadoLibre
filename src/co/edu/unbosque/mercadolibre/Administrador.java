package co.edu.unbosque.mercadolibre;
import co.edu.unbosque.mercadolibre.*;
import java.util.*;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contraseña: 1234
	private boolean hayProveedores;
	private boolean hayProductos;
	private boolean nombreProveedorCoincide;
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Categoria> categoriasLista = new ArrayList<Categoria>(); //Lista de categorías
	ArrayList<Proveedor> proveedoresLista = new ArrayList<Proveedor>();
	ArrayList<Producto> productoLista = new ArrayList<Producto>();
	
	//Métodos
	
	public void newCategory() {
		System.out.println("Ingrese el tipo de categoría: ");
		String tipoCategoriaNueva = scan.nextLine();
		
		categoriasLista.add(new Categoria(tipoCategoriaNueva));
		
		
	}
	public void newProveedor() { // nuevo...
		System.out.println("Ingrese el nombre del nuevo Proveedor: ");
		String proveedorNuevoNombre = scan.next();
		System.out.println("Ingrese la dirección: ");
		String proveedorNuevoDireccion = scan.next();
		System.out.println("Ingrese el teléfono: ");
		String proveedorNuevoTelefono = scan.next();
		System.out.println("Que categoría ofrece: ");
		String proveedorNuevoCategoria = scan.next();
		System.out.println("Ingrese la cantidad que tiene disponible: ");
		int proveedorNuevoCantidad = scan.nextInt();
		
		proveedoresLista.add(new Proveedor(proveedorNuevoNombre, proveedorNuevoDireccion, proveedorNuevoTelefono, proveedorNuevoCategoria, proveedorNuevoCantidad));
	
	}
	public void newProduct() { //De pronto el producto lo debe crear el proveedor
		if(proveedoresLista.size() == 0) {
			System.out.println("No puede crear un producto sin tener proveedores");
		}
		else {
			System.out.println("Ingrese el nombre del proveedor: ");
			String nombreProveedorParaProducto = scan.next();
			for(Proveedor proveedor : proveedoresLista) {
				if(proveedor.getNombre().toLowerCase().equals(nombreProveedorParaProducto.toLowerCase())) {
					nombreProveedorCoincide = true;
				}
				else {
					nombreProveedorCoincide = false;
				}
			}
			
			if(nombreProveedorCoincide) {
				System.out.println("Ingrese el nombre del producto: ");
				String nombreProductoNuevo = scan.next();
				System.out.println("Ingrese el precio del producto: ");
				double precioProductoNuevo = scan.nextDouble();
				System.out.println("Ingrese la cantidad del producto: ");
				int cantidadProductoNuevo = scan.nextInt();
				
				productoLista.add(new Producto(nombreProductoNuevo, precioProductoNuevo, cantidadProductoNuevo));
			}
		}
		
		
		
	}
	public boolean comprobarCredenciales() {
		boolean usuarioCorrecto = false;
		boolean contraseñaCorrecta = false;
		boolean credencialesCorrectas = false;
		if(this.usrName.equals("admin1234")) {
			usuarioCorrecto = true;
		}
		if(this.password.equals("1234")) {
			contraseñaCorrecta = true;
		}
		
		if(usuarioCorrecto && contraseñaCorrecta ) {
			credencialesCorrectas = true;
			return credencialesCorrectas;
		}
		else if(usuarioCorrecto && contraseñaCorrecta == false) {
			System.out.println("Contraseña incorrecta");
			return credencialesCorrectas;
		}
		else {
			System.out.println("Usuario y contraseña incorrectos");
			return credencialesCorrectas;
		}
	}

	//Setters
	public void setUsrName(String nombre) {
		this.usrName = nombre;
		
	}
	public void setPassword(String contraseña) {
		this.password = contraseña;
		
	}
	
	//Getters
	public String getUsrName() {
		return this.usrName;
		
	}
	public String getPassword() {
		return this.password;
	}
	public void getProductosActuales() { // En vez de String proveedor, se puso Proveedor proveedor
		
		if(productoLista.size() == 0) {
			hayProductos = false;
		}
		else {
			hayProductos = true;
			System.out.println("Los productos actuales son: ");
			for(int i = 0; i < productoLista.size(); i++) {
				System.out.println("Producto: " + productoLista.get(i).getNombre());
			}
		}
		
		
		System.out.println();
	}

	public void getCategoriasActuales() {
		System.out.println("Las categorías actuales son: ");
		for(int i = 0; i < categoriasLista.size(); i++) { //Este bucle recorre el arrayList de categoriasLista, para mostrar las categorías que hayamos añadido hasta el momento
			System.out.println("Categoría: " + categoriasLista.get(i).getTipoDeCategoria()); //Este system.out.println muestra el nombre de la categoría
		}
		System.out.println();
	}
	
	public void getProveedoresActuales() {
		
		if(proveedoresLista.size() == 0) {
			
		}
		else {
			System.out.println("Los proveedores actuales son: ");
			
			for(int i = 0; i < proveedoresLista.size(); i++) {
				//System.out.println("Los proveedores actuales son: " + proveedoresLista.get(i).getNombre());
				System.out.println(proveedoresLista.get(i).getNombre());

			}
		}
		
		
		
		
		System.out.println();
	}

	
}
