package co.edu.unbosque.mercadolibre;

import java.util.Scanner;

public class UI {
	
	//Esta clase manejar� toda la l�gica
	//Instanciaci�n de objetos
	
	
	Cliente cliente = new Cliente();
	Administrador admin = new Administrador();
	Scanner scan = new Scanner(System.in);
			
	//Declaraci�n de variables
	int respuestaMenuPrincipal;
			
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
				admin.usrName = scan.nextLine();
				System.out.println("Ingrese su contrase�a:");
				admin.password = scan.nextLine();
				break;
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

}
