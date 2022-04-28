package ar.edu.unlp.info.oo2.decodificador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
	
	private String titulo;
	private int year;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, int anio, double puntaje) {
		super();
		this.titulo = titulo;
		this.year = anio;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void addSimilar(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);		
			pelicula.addSimilar(this);
		}
	}

	public int getYear() {
		return year;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	

}
