package co.edu.unbosque.mercadolibre;

public class Orden {
	// private String numeroDeOrden;
	private static int cont;
	private String nombreProducto;
	private int numeroOrden;
	private boolean ordenCorrecta;
	
	Orden(String nombreProductoNuevo){
		cont++;
		this.numeroOrden = cont;
		this.nombreProducto = nombreProductoNuevo;
	}
	
	public int getIdOrden() {
		return this.numeroOrden;
	}
	
	public String getNombreProducto() {
		return this.nombreProducto;
	}
	
	// public void numeroDeOrden () { //Este método se utilizará para crear el numero de orden)
		//System.out.println("Numero de Orden ");

	//}
}


