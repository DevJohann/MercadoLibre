package co.edu.unbosque.mercadolibre;
import co.edu.unbosque.mercadolibre.*;
import java.util.*;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contrase�a: 1234
	
	ArrayList<Categoria> categoriasLista = new ArrayList<Categoria>();
	Scanner scan = new Scanner(System.in);

	
	//M�todos
	
	public void newCategory() {
		System.out.println("Ingrese el nombre de la nueva categor�a: ");
		String nombreCategoriaNueva = scan.nextLine();
		System.out.println("Ingrese el tipo de categor�a: ");
		String tipoCategoriaNueva = scan.nextLine();
		
		categoriasLista.add(new Categoria(nombreCategoriaNueva, tipoCategoriaNueva));
		
		
	}
	public void newDistributor(String nombre) {
		
	}
	public void newProduct(String nombre) { //De pronto el producto lo debe crear el proveedor
		
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
	public void getInventory(Proveedor proveedor) { // En vez de String proveedor, se puso Proveedor proveedor
		
	}
}
