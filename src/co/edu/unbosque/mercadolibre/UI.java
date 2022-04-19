package co.edu.unbosque.mercadolibre;

import java.util.Scanner;

public class UI {
	
	//Esta clase manejará toda la lógica
	//Instanciación de objetos
	Cliente cliente = new Cliente(); //Objeto cliente
	Administrador admin = new Administrador(); //Objeto administrador
	
	//Scanner
	Scanner scan = new Scanner(System.in);
			
	//Declaración de variables
	int respuestaMenuPrincipal;
	int eleccionMenuAdministrador;
	int eleccionMenuCliente;
	
	public void mostrarMenuPrincipal() {
		do {
			System.out.println("Bienvenido a nuestro Software");
			System.out.println("Con qué usuario desea ingresar:");
			System.out.println("1. Administrador");
			System.out.println("2. Cliente");
			System.out.println("0. Salir");
			System.out.print("Elija: ");
			respuestaMenuPrincipal = scan.nextInt();
			
			switch(respuestaMenuPrincipal){
			case 1:
				System.out.println("Ingrese el usuario de administrador:");
				admin.setUsrName(scan.next()); //admin.usrName = scan.next()
				System.out.println("Ingrese su contraseña:");
				admin.setPassword(scan.next());
				
				if(admin.getPassword().equals("1234") && admin.getUsrName().equals("admin1234")) {
					//Acceder al sistema
					System.out.println("Bienvenido Administrador!");
					System.out.println();
				
					do {
						System.out.println("Opciones:");
						System.out.println("1. Agregar categoría");
						System.out.println("2. Agregar proveedor"); //Mostrar las opciones de este menu
						System.out.println("3. Agregar producto");
						System.out.println("4. Consultas");
						System.out.println("0. Volver");
						System.out.print("Elija: ");
						eleccionMenuAdministrador = scan.nextInt(); //Recoger la opción que elija el usuario
						
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
							
							int eleccionConsulta = 0;
							do {
								System.out.println("1. Consultar proveedor");
								System.out.println("2. Consultar producto");
								System.out.println("0. Volver");
								eleccionConsulta = scan.nextInt();
								
								switch(eleccionConsulta) {
								case 1:
									admin.buscarProveedorProductos();
									break;
								case 2:
									System.out.println("Cuál es el nombre que desea buscar: ");
									String nombreProductoBuscar = scan.next();
									admin.buscarProductos(nombreProductoBuscar);
									break;
								case 0:
									break;
								
								default:
									System.out.println("Error, opción inválida");
									break;
								}
							
								
							}	while(eleccionConsulta != 0);
							
						break;
						}
					}while(eleccionMenuAdministrador != 0);
						
					
					//menuAdministrador(); Posible forma de mostrar el menu, mediante el método menuAdministrador() de esta clase
					
					
					break;
				}
				else {
					//No tiene permiso
					System.out.println("Usted quien es");
					break;
				}
			case 2:
				System.out.println("¡Bienvenido a nuestra tienda!");
				System.out.println();
				
				do {
					System.out.println("Opciones: ");
					System.out.println("1. Crear orden de compra");
					System.out.println("2. Ver el historial");
					System.out.println("0. Volver al menú principal");
					System.out.println("Escoja: ");
					eleccionMenuCliente = scan.nextInt();
					
					switch(eleccionMenuCliente) {
					case 1:
						if (admin.getProveedoresSize() == 0 ) {
							// no va a hacer orden
							System.out.println("Error la tienda está vacía");
						}
						else {
							// si se va a hacer orden
							cliente.crearOrden();
							if(admin.comprobarExistenciaProducto(cliente.getNombre())) {
								System.out.println("Orden realizada correctamente");
								admin.disminuirCantidadProducto(cliente.getNombreProveedorCliente());
								cliente.setOrdenCorrecta(true);
							}
							else {
								System.out.println("Error el producto no existe");
								cliente.setOrdenCorrecta(false);
							}
						}
						
						
						//Método para comprar
						break;
					case 2:
						cliente.getHistorial();
						//Método para mostrar el historial
						break;
					case 0:
						System.out.println("Acaba de abandonar el menú de cliente");
						System.out.println();
						break;
					default:
						System.out.println("Digite una opción válida");
					}
				}
				while (eleccionMenuCliente != 0);
				break;
			case 0:
				System.out.println("Ha abandonado nuestro software, los datos no se guardarán");
				break;
			default:
				System.out.println("Error, opción invalida");
				break;
			
			}
			
		}
		while(respuestaMenuPrincipal != 0);
		
	}
	
//	public void menuAdministrador() { //Posible idea 
		
		

//	}

}
