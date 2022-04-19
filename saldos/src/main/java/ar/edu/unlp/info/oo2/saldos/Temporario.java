package ar.edu.unlp.info.oo2.saldos;

public class Temporario extends Empleado {
	private int horasTrabajadas;
	private int cantHijos; 
	private boolean casado;
	
	
	public Temporario(int horasTrabajadas, int cantHijos, boolean casado) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	@Override
	public double calcularSueldoBasico() {
		return 20000 + this.horasTrabajadas * 300;
	}

	@Override
	public double calcularSueldoAdicional() {		
		
		if (casado) {
			return 5000 + 2000 * this.cantHijos;
		}
		return 2000 * this.cantHijos;
		
	}
	
	
}
