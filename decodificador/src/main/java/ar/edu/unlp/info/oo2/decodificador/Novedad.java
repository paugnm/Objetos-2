package ar.edu.unlp.info.oo2.decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends RecomendationStrategy {

	@Override
	public List<Pelicula> recomendar(List<Pelicula> peliculas) {
		return peliculas.stream()
		.limit(3)
		.collect(Collectors.toList());
	}

}
