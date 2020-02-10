package model;


import java.util.Date;

public class Gerente extends Empleado{
	
	private double incentivo = 5.0d;

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nombre, double salario, Date fechaNac) {
		super(nombre, salario, fechaNac);
		// TODO Auto-generated constructor stub
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public void incentivar() {
		double cantidad = getSalario() * (1 + incentivo/100);
		this.setSalario(cantidad);
		System.out.println("Soy gerente y soy incentivado: " +getSalario() );
		
	}

	@Override
	public String toString() {
		return "Gerente [incentivo=" + incentivo + "]";
	}
	
	

	
	
	

}
