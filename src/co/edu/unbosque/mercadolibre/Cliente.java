package co.edu.unbosque.mercadolibre;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	String nombreDeUsuario;
	String productName;
	String productCategory;
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
	

	public void comprarProductos(String productName, String productCategory) {
		this.productName = productName;
		this.productCategory = productCategory;
	}
	public void crearOrden () { //Este m�todo se utilizar� para el primer punto (conteo y compra de productos)
		/*System.out.println("Digite su nombre: ");
		nombreDeUsuario = scan.nextLine();
		System.out.println("�De qu� categor�a busca su producto?");
		productCategory = scan.nextLine();
		System.out.println("�Qu� producto desea comprar?");
		productName = scan.nextLine();
		clienteList.add(new Cliente());*/
	}
	public void getHistorial() {//Mostrar lo que el usuario compr� buscando en el ArrayList
		/*String buscarHistorial;
		System.out.println("�Cu�l es su nombre?");
		buscarHistorial = scan.nextLine();
		for(int i = 0; i < clienteList.size(); i++) {
			if(buscarHistorial.equals(clienteList.get(i))) {
				System.out.println("");
			}
			
		}*/
	}
	
	public void getCliente (){
		}
}
