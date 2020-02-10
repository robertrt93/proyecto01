package model;

import java.util.Date;

public class Director extends Empleado{
	
	private double incentivo = 10.0d;
	private double incremento = 100.0d;
	private boolean coche = true;
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Director(String nombre, double salario, Date fechaNac) {
		super(nombre, salario, fechaNac);
		// TODO Auto-generated constructor stub
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	public double getIncremento() {
		return incremento;
	}
	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}
	public boolean isCoche() {
		return coche;
	}
	public void setCoche(boolean coche) {
		this.coche = coche;
	}
	
	public void incentivar() {
		double cantidad = getSalario() * (1 +incentivo/100);
		this.setSalario(cantidad);
		System.out.println("Soy director y soy muy incentivado: " +getSalario() );
	}
	
	@Override
	public String toString() {
		return "Director [incentivo=" + incentivo + ", incremento=" + incremento + ", coche=" + coche + "]";
	}
	
	
	

}
