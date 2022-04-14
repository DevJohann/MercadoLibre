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
			System.out.print("Elija: ");
			respuestaMenuPrincipal = scan.nextInt();
			
			switch(respuestaMenuPrincipal){
			case 1:
				System.out.println("Ingrese el usuario de administrador:");
				admin.setUsrName(scan.next());
				System.out.println("Ingrese su contrase�a:");
				admin.setPassword(scan.next());
				
				if(admin.getPassword().equals("1234") && admin.getUsrName().equals("admin1234")) {
					//Acceder al sistema
					System.out.println("Bienvenido Administrador!");
					System.out.println();
				
					do {
						System.out.println("Opciones:");
						System.out.println("1. Agregar categor�a");
						System.out.println("2. Agregar proveedor"); //Mostrar las opciones de este menu
						System.out.println("3. Agregar producto");
						System.out.println("4. Consultas");
						System.out.println("0. Volver");
						System.out.print("Elija: ");
						eleccionMenuAdministrador = scan.nextInt(); //Recoger la opci�n que elija el usuario
						
						switch(eleccionMenuAdministrador) {
						case 1: 
							admin.newCategory();
							admin.getCategoriasActuales();
							break;
						case 2:
							admin.newProveedor();
							admin.getProveedoresActuales();
							break;
						case 3: 
							admin.newProduct();
							admin.getProductosActuales();
							break;//
						case 4:
							admin.buscarProveedorProductos(); //M�todo para buscar proveedores y mostrar sus productos
							
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
				System.out.println("Ha abandonado nuestro software, los datos no se guardar�n");
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
