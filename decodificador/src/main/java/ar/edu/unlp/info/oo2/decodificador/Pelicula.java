package ar.edu.unlp.info.oo2.decodificador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int anio;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, int anio, double puntaje) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void addSimilar(Pelicula pelicula) {
		this.similares.add(pelicula);		
	}

}
