package ar.edu.unlp.info.oo2.saldos;

public class Pasante extends Empleado {
	private int examenesRendidos;
	
	public Pasante(int examenesRendidos) {
		super();
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public double calcularSueldoBasico() {
		return 20000;
	}

	@Override
	public double calcularSueldoAdicional() {
		return 2000 * this.examenesRendidos;
	}
	

}
