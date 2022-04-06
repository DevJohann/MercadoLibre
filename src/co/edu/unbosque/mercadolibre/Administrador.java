package co.edu.unbosque.mercadolibre;

public class Administrador {

	private String usrName; //Usuario: admin1234
	private String password; //Contraseña: 1234
	
	//No deja poner un if >:(
	
	//Métodos
	
	public void newCategory(String nombre) {
		
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
	public void getInventory(Proveedor proveedor) { // En vez de String proveedor, se puso Proveedor proveedor
		
	}
}
