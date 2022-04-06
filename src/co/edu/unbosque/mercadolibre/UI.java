package co.edu.unbosque.mercadolibre;

import java.util.Scanner;

public class UI {
	
	//Esta clase manejará toda la lógica
	//Instanciación de objetos
	
	
	Cliente cliente = new Cliente();
	Administrador admin = new Administrador();
	Scanner scan = new Scanner(System.in);
			
	//Declaración de variables
	int respuestaMenuPrincipal;
			
	public void mostrarMenuPrincipal() {
		do {
			System.out.println("Bienvenido a nuestro Software");
			System.out.println("Con qué usuario desea ingresar:");
			System.out.println("1. Administrador");
			System.out.println("2. Cliente");
			System.out.println("0. Salir");
			respuestaMenuPrincipal = scan.nextInt();
			
			switch(respuestaMenuPrincipal){
			case 1:
				System.out.println("Ingrese el nombre de administrador:");
				admin.usrName = scan.nextLine();
				System.out.println("Ingrese su contraseña:");
				admin.password = scan.nextLine();
				break;
			case 2:
				break;
			case 0:
				System.out.println("Ha abandonado nuestro software");
				break;
			default:
				System.out.println("Error, opción invalida");
				break;
			
			}
			
		}
		while(respuestaMenuPrincipal != 0);
		
	}

}
