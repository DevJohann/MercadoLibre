package co.edu.unbosque.mercadolibre;
import co.edu.unbosque.mercadolibre.*;
import java.util.*;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contrase�a: 1234
	private boolean hayProveedores;
	private boolean hayProductos;
	private boolean nombreProveedorCoincide;
	private boolean existeProducto;
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Categoria> categoriasLista = new ArrayList<Categoria>(); //Lista de categor�as
	ArrayList<Proveedor> proveedoresLista = new ArrayList<Proveedor>();
	ArrayList<Producto> productoLista = new ArrayList<Producto>();
	
	//M�todos
	
	public void newCategory() {
		System.out.println("Ingrese el tipo de categor�a: ");
		String tipoCategoriaNueva = scan.nextLine();
		
		categoriasLista.add(new Categoria(tipoCategoriaNueva));
		
		
	}
	public void newProveedor() { // nuevo...
		System.out.println("Ingrese el nombre del nuevo Proveedor: ");
		String proveedorNuevoNombre = scan.next();
		System.out.println("Ingrese la direcci�n: ");
		String proveedorNuevoDireccion = scan.next();
		System.out.println("Ingrese el tel�fono: ");
		String proveedorNuevoTelefono = scan.next();
		System.out.println("Que categor�a ofrece: ");
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
			for(Proveedor proveedor : proveedoresLista) { //Comprobar que el proveedor exista
				if(proveedor.getNombre().toLowerCase().equals(nombreProveedorParaProducto.toLowerCase())) {
					nombreProveedorCoincide = true;
				}
				else {
					nombreProveedorCoincide = false;
				}
			}
			
			if(nombreProveedorCoincide) { //Si el proveedor existe
				System.out.println("Ingrese el nombre del producto: ");
				String nombreProductoNuevo = scan.next();
				System.out.println("Ingrese el precio del producto: ");
				scan.nextLine(); //Se agreg� esto para evitar que se salte el scan anterior
				double precioProductoNuevo = scan.nextDouble();
				System.out.println("Ingrese la cantidad del producto: ");
				scan.nextLine(); //Evitar que se salte el scan anterior
				int cantidadProductoNuevo = scan.nextInt();
				
				productoLista.add(new Producto(nombreProductoNuevo, precioProductoNuevo, cantidadProductoNuevo));
			}
			else if(nombreProveedorCoincide == false) {
				System.out.println("Error, el proveedor no est� registrado");
			}
		}
		
		
		
	}
	public boolean comprobarCredenciales() {
		boolean usuarioCorrecto = false;
		boolean contrase�aCorrecta = false;
		boolean credencialesCorrectas = false;
		if(this.usrName.equals("admin1234")) {
			usuarioCorrecto = true;
		}
		if(this.password.equals("1234")) {
			contrase�aCorrecta = true;
		}
		
		if(usuarioCorrecto && contrase�aCorrecta ) {
			credencialesCorrectas = true;
			return credencialesCorrectas;
		}
		else if(usuarioCorrecto && contrase�aCorrecta == false) {
			System.out.println("Contrase�a incorrecta");
			return credencialesCorrectas;
		}
		else {
			System.out.println("Usuario y contrase�a incorrectos");
			return credencialesCorrectas;
		}
	}

	//Setters
	public void setUsrName(String nombre) {
		this.usrName = nombre;
		
	}
	public void setPassword(String contrase�a) {
		this.password = contrase�a;
		
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
				//System.out.println("Producto: " + productoLista.get(i).getNombre() + "	" + getCantidadProducto(productoLista.get(i).getNombre())); No funciona el getCantidadProducto, primer imprime el valor y luego lo asigna, entonces devuelve 0
				System.out.println("Producto: " + productoLista.get(i).getNombre());
			}
		}
		
		
		System.out.println();
	}

	public void getCategoriasActuales() {
		System.out.println("Las categor�as actuales son: ");
		for(int i = 0; i < categoriasLista.size(); i++) { //Este bucle recorre el arrayList de categoriasLista, para mostrar las categor�as que hayamos a�adido hasta el momento
			System.out.println("Categor�a: " + categoriasLista.get(i).getTipoDeCategoria()); //Este system.out.println muestra el nombre de la categor�a
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
	
	/*
	public int getCantidadProducto(String nombreProductoAConsultar) {
	
		int cantidadProd = 0;
		for(Producto producto : productoLista) {
			if(producto.getNombre().toLowerCase().contains(nombreProductoAConsultar)) {
				cantidadProd = producto.getCantidad();
			}
		}
		
		return cantidadProd; 
	}
	*/
}
