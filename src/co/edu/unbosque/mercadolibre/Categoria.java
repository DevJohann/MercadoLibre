package co.edu.unbosque.mercadolibre;

public class Categoria {
	
	//private String nombre; Se elimin� por redundancia
	private String tipo;
	
	
	Categoria(String tipo){
		//this.nombre = nombre; //Se elimin� por redundancia
		this.tipo = tipo;
	}
	
	public void addProduct(Producto product) {
		
	}
	public String getTipoDeCategoria() {
		return this.tipo;
	}
}
