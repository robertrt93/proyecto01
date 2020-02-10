package dao;

import java.util.ArrayList;
import java.util.List;

import model.Empleado;

public class EmpleadosDao implements IEmpleadosDao{
	
	private List<Empleado> lista = new ArrayList<>();
	
	public void addEmpleado(Empleado emp) {
		lista.add(emp);
	}
	
	public void listado() {
		for (Empleado emp: lista) {
			System.out.println(emp.getNombre());
		}
	}

}
