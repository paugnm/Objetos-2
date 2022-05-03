package ar.edu.unlp.info.oo2.fileManager;


public class Decorator extends FileOO2{
	
	private FileOO2 component;

	public Decorator(String nombre, String extension, double tamanio, String permisos) {
		super(nombre, extension, tamanio, permisos);
	}

	@Override
	public String prettyPrint() {
		return component.prettyPrint();
	}

}
