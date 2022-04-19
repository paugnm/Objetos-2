package ar.edu.unlp.info.oo2.saldos;

public class Planta extends Empleado {
	private int antiguedad;
	private int cantHijos;
	private boolean casado;
	
	
	public Planta(int antiguedad, int cantHijos, boolean casado) {
		this.antiguedad = antiguedad;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	@Override
	public double calcularSueldoBasico() {
		return 50000;
	}

	@Override
	public double calcularSueldoAdicional() {
		if (casado) {
			return 5000 + 2000 * this.cantHijos + 2000 * this.antiguedad;
		}
		return 2000 * this.cantHijos + 2000 * this.antiguedad;
	}
	

}
