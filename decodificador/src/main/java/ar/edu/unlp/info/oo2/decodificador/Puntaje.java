package ar.edu.unlp.info.oo2.decodificador;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends RecomendationStrategy {

	@Override
	public List<Pelicula> recomendar(List<Pelicula> peliculas) {
		return peliculas.stream()
				.sorted(Comparator.comparing(Pelicula::getPuntaje).reversed().thenComparing(Pelicula::getYear).reversed())
				.limit(3)
				.collect(Collectors.toList());
	}



}
