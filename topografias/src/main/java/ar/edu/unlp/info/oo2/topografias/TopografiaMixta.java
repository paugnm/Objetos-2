package ar.edu.unlp.info.oo2.topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {

	private List<Topografia> componentes;
	
	
	
	public TopografiaMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		componentes = new ArrayList<Topografia>();
		componentes.add(t1);
		componentes.add(t2);
		componentes.add(t3);
		componentes.add(t4);
	}

	@Override
	public List<Topografia> getComponentes() {
		return componentes;
	}

	@Override
	public double calcularProporcionAgua() {
		double totalAgua = this.componentes.stream().
			mapToDouble(componente -> componente.calcularProporcionAgua()).sum();
		return totalAgua/componentes.size();
		
	}
	
	@Override
	public boolean equals(Topografia topografia) {
		return this.getComponentes().equals(topografia.getComponentes());
				
	}
}
