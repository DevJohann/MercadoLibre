package co.edu.unbosque.mercadolibre;
import co.edu.unbosque.mercadolibre.*;
import java.util.*;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contraseña: 1234
	
	ArrayList<Categoria> categoriasLista = new ArrayList<Categoria>();
	Scanner scan = new Scanner(System.in);

	
	//Métodos
	
	public void newCategory() {
		System.out.println("Ingrese el nombre de la nueva categoría: ");
		String nombreCategoriaNueva = scan.nextLine();
		System.out.println("Ingrese el tipo de categoría: ");
		String tipoCategoriaNueva = scan.nextLine();
		
		categoriasLista.add(new Categoria(nombreCategoriaNueva, tipoCategoriaNueva));
		
		
	}
	public void newDistributor(String nombre) {
		
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
}
