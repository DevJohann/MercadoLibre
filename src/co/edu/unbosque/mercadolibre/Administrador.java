package co.edu.unbosque.mercadolibre;
import co.edu.unbosque.mercadolibre.*;
import java.util.*;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contraseña: 1234
	
	ArrayList<Categoria> categoriasLista = new ArrayList<Categoria>();
	Scanner scan = new Scanner(System.in);
	ArrayList<Proveedor> proveedoresLista = new ArrayList<Proveedor>();
	
	//Métodos
	
	public void newCategory() {
		System.out.println("Ingrese el tipo de categoría: ");
		String tipoCategoriaNueva = scan.nextLine();
		
		categoriasLista.add(new Categoria(tipoCategoriaNueva));
		
		
	}
	public void newProveedor() { // nuevo...
		System.out.println("Ingrese el nombre del nuevo Proveedor: ");
		String proveedorNuevoNombre = scan.nextLine();
		System.out.println("Ingrese la dirección: ");
		String proveedorNuevoDireccion = scan.nextLine();
		System.out.println("Ingrese el teléfono: ");
		String proveedorNuevoTelefono = scan.nextLine();
		System.out.println("Que categoría ofrece: ");
		String proveedorNuevoCategoria = scan.nextLine();
		System.out.println("Ingrese la cantidad que tiene disponible: ");
		int proveedorNuevoCantidad = scan.nextInt();
		
		proveedoresLista.add(new Proveedor(proveedorNuevoNombre, proveedorNuevoDireccion, proveedorNuevoTelefono, proveedorNuevoCategoria, proveedorNuevoCantidad));
	
	}
	public void newProduct(String nombre) { //De pronto el producto lo debe crear el proveedor
		
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
	public void getInventory(Proveedor proveedor) { // En vez de String proveedor, se puso Proveedor proveedor
		
	}
	
	public void getCategoriasActuales() {
		for(int i = 0; i < categoriasLista.size(); i++) { //Este bucle recorre el arrayList de categoriasLista, para mostrar las categorías que hayamos añadido hasta el momento
			System.out.println("Las categorías actuales son: " + categoriasLista.get(i).getTipoDeCategoria()); //Este system.out.println muestra el nombre de la categoría
		}
		System.out.println();
	}
	public void getProveedoresActuales() {
		for(int i = 0; i < proveedoresLista.size(); i++) {
			System.out.println("Los proveedores actuales son: " + proveedoresLista.get(i).getNombre());
			
		}
		System.out.println();
	}
}
