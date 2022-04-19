package ar.edu.unlp.info.oo2.saldos;

public abstract class Empleado {

	public double sueldo() {
		return this.calcularSueldoBasico() + this.calcularSueldoAdicional () - this.calcularDescuento();
	}
	
	public double calcularDescuento() {
		return this.calcularSueldoBasico()*0.13 + this.calcularSueldoAdicional()*0.05;
	}
	
	public abstract double calcularSueldoBasico();
	
	public abstract double calcularSueldoAdicional();
	
	
}
