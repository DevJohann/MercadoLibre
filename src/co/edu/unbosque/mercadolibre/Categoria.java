package co.edu.unbosque.mercadolibre;

public class Categoria {
	
	//private String nombre; Se eliminó por redundancia
	private String tipo;
	
	
	Categoria(String tipo){
		//this.nombre = nombre; //Se eliminó por redundancia
		this.tipo = tipo;
	}
	
	public void addProduct(Producto product) {
		
	}
	public String getTipoDeCategoria() {
		return this.tipo;
	}
}
