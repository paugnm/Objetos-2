package ar.edu.unlp.info.oo2.decodificador;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class RecomendationStrategy {
	protected List<Pelicula> grilla;
	protected List<Pelicula> peliculasVistas;

	public abstract List<Pelicula> recomendar(List<Pelicula> peliculas);
	
	//Template method
	public List<Pelicula> recomendar(List<Pelicula> grilla, List<Pelicula> peliculasVistas) {
		this.grilla = grilla;
		this.peliculasVistas = peliculasVistas;
		List<Pelicula> noVistas = this.filtrarPeliculasNoVistas(grilla, peliculasVistas);
		return this.recomendar(noVistas);
	}
	
	protected List<Pelicula> filtrarPeliculasNoVistas(List<Pelicula> grilla, List<Pelicula> peliculasVistas) {
		 List<Pelicula> listaPeliculasNuevas =  grilla.stream()
				.filter(p -> !(peliculasVistas.contains(p)))
			    .collect(Collectors.toList());
		 
		 //Retorna la lista de peliculas no vistas ordenadas por año en forma descendente
		 return listaPeliculasNuevas.stream()
				 .sorted(Comparator.comparing(Pelicula::getYear).reversed())
				 .collect(Collectors.toList());
	}
	
	
}
