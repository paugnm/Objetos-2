package ar.edu.unlp.info.oo2.fileManager;

import java.time.LocalDate;


public abstract class FileOO2 {

	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate creacion;
	private LocalDate modificacion;
	private String permisos;	
	
	
	public FileOO2(String nombre, String extension, double tamanio, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.permisos = permisos;
		this.creacion = LocalDate.now();
		this.modificacion = LocalDate.now();
	}
	
	public abstract String prettyPrint();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public LocalDate getCreacion() {
		return creacion;
	}

	public LocalDate getModificacion() {
		return modificacion;
	}
	public void setModificacion(LocalDate modificacion) {
		this.modificacion = modificacion;
	}
	public String getPermisos() {
		return permisos;
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	
	
	
}
