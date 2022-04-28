package ar.edu.unlp.info.oo2.decodificador;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends RecomendationStrategy {

	@Override
	public List<Pelicula>recomendar(List<Pelicula> peliculas) {
		HashSet<Pelicula> allSimilars = new HashSet<Pelicula>();
		
		this.peliculasVistas.forEach(peliVista -> peliVista.getSimilares().forEach(simil -> allSimilars.add(simil)));
		
		return peliculas.stream().filter(noVista -> allSimilars.contains(noVista)).limit(3).collect(Collectors.toList());
				
	}



}
