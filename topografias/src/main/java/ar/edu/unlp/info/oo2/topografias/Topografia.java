package ar.edu.unlp.info.oo2.topografias;

import java.util.ArrayList;
import java.util.List;

public abstract class Topografia {

	public abstract double calcularProporcionAgua();
	
	public List<Topografia> getComponentes() {
		List<Topografia> componente = new ArrayList<Topografia>();
		componente.add(this);
		return componente;
	}
	
	
	public double calcularProporcionTierra() {
		return 1 - calcularProporcionAgua();
	}

	public boolean equals(Topografia topografia) {
		return topografia.calcularProporcionAgua() == this.calcularProporcionAgua();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.equals((Topografia) obj);
	}
	
	
	
}
