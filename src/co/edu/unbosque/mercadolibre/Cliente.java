package co.edu.unbosque.mercadolibre;

public class Cliente {
	String nombreDeUsuario;
	String productName;
	String productCategory;
	
	
	public void comprarProductos(String productName, String productCategory) {
		this.productName = productName;
		this.productCategory = productCategory;
	}
	public void getHistorial() {
		
	}
}
