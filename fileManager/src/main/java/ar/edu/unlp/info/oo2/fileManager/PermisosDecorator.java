package ar.edu.unlp.info.oo2.fileManager;


public class PermisosDecorator extends Decorator{

	public PermisosDecorator(String nombre, String extension, double tamanio, String permisos) {
		super(nombre, extension, tamanio, permisos);		
	}

	public String prettyPrint() {
		super.prettyPrint();
		return this.getPermisos();
	}

	
}
