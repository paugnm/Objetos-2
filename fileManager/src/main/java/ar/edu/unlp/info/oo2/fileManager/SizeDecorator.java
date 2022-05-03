package ar.edu.unlp.info.oo2.fileManager;


public class SizeDecorator extends Decorator{

	public SizeDecorator(String nombre, String extension, double tamanio, String permisos) {
		super(nombre, extension, tamanio, permisos);		
	}

	public String prettyPrint() {
		super.prettyPrint();
		return String.valueOf(getTamanio());
	}

	
}
