package co.edu.unbosque.mercadolibre;

import java.util.Scanner;

public class UI {
	
	//Esta clase manejar� toda la l�gica
	//Instanciaci�n de objetos
	Cliente cliente = new Cliente(); //Objeto cliente
	Administrador admin = new Administrador(); //Objeto administrador
	
	//Scanner
	Scanner scan = new Scanner(System.in);
			
	//Declaraci�n de variables
	int respuestaMenuPrincipal;
	int eleccionMenuAdministrador;
	
	public void mostrarMenuPrincipal() {
		do {
			System.out.println("Bienvenido a nuestro Software");
			System.out.println("Con qu� usuario desea ingresar:");
			System.out.println("1. Administrador");
			System.out.println("2. Cliente");
			System.out.println("0. Salir");
			respuestaMenuPrincipal = scan.nextInt();
			
			switch(respuestaMenuPrincipal){
			case 1:
				System.out.println("Ingrese el nombre de administrador:");
				admin.setUsrName(scan.next());
				System.out.println("Ingrese su contrase�a:");
				admin.setPassword(scan.next());
				
				if(admin.getPassword().equals("1234")) {
					//Acceder al sistema
					System.out.println("Bienvenido Administrador!");
				
					do {
						System.out.println("Opciones:");
						System.out.println("1. Agregar categor�a");
						System.out.println("2. Agregar proveedor");
						System.out.println("3. Agregar producto");
						System.out.println("0. Volver");
						eleccionMenuAdministrador = scan.nextInt();
						
						switch(eleccionMenuAdministrador) {
						case 1: 
							admin.newCategory();
							break;
						}
					}while(eleccionMenuAdministrador != 0);
						
					
					//menuAdministrador(); Posible forma de mostrar el menu, mediante el m�todo menuAdministrador() de esta clase
					
					
					break;
				}
				else {
					//No tiene permiso
					System.out.println("Usted quien es");
					break;
				}
			case 2:
				break;
			case 0:
				System.out.println("Ha abandonado nuestro software");
				break;
			default:
				System.out.println("Error, opci�n invalida");
				break;
			
			}
			
		}
		while(respuestaMenuPrincipal != 0);
		
	}
	
//	public void menuAdministrador() { //Posible idea 
		
		

//	}

}
