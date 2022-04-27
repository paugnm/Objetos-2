package ar.edu.unlp.info.oo2.decodificador;

import java.util.List;
import java.util.stream.Collectors;

public abstract class RecomendationStrategy {

	public abstract Pelicula recomendar(List<Pelicula> peliculas);
	
	//Template method
	public Pelicula recomendar(List<Pelicula> grilla, List<Pelicula> peliculasVistas) {
		List<Pelicula> noVistas = this.filtrarPeliculasNoVistas(grilla, peliculasVistas);
		return this.recomendar(noVistas);
	}
	
	protected List<Pelicula> filtrarPeliculasNoVistas(List<Pelicula> grilla, List<Pelicula> peliculasVistas) {
		return   grilla.stream()
				.filter(p -> !(peliculasVistas.contains(p)))
			    .collect(Collectors.toList());
	}
	
	
}
