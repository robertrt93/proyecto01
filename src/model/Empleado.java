package model;


import java.util.Date;

public class Empleado {
	
	private String nombre;
	private double salario;
	private Date fechaNac;
	
	public Empleado() {
		super();
		// TODO Auto-generdoubleated constructor stub
	}

	public Empleado(String nombre, double salario, Date fechaNac) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public static Empleado dameEmpleado(){
		return new Empleado();
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", fechaNac=" + fechaNac + "]";
	}
	
	
	
	

}
