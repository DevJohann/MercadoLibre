package co.edu.unbosque.mercadolibre;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contrase�a: 1234
	
	//No deja poner un if >:(
	
	//M�todos
	
	public void newCategory(String nombre) {
		
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
	public void getInventory(Proveedor proveedor) { // En vez de String proveedor, se puso Proveedor proveedor
		
	}
}
