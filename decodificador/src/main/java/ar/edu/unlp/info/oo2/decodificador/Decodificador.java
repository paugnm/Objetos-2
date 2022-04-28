package ar.edu.unlp.info.oo2.decodificador;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> peliculasVistas;
	private RecomendationStrategy recomendador;
	
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.peliculasVistas = new ArrayList<Pelicula>();
		
		//La estrategia de recomendación por defecto será la novedad
		this.recomendador = new Novedad();
	}
	
	public void addPeliculaNueva (Pelicula nueva) {
		this.grilla.add(nueva);
	}
	
	public void addPeliculaVista (Pelicula vista) {
		this.grilla.add(vista);
	}
	
	
	public List<Pelicula> recomendarPeliculas() {
		return this.recomendador.recomendar(this.grilla, this.peliculasVistas);
	}
}
