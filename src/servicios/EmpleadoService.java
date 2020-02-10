package servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dao.EmpleadosDao;
import dao.IEmpleadosDao;
import model.Director;
import model.Empleado;
import model.Gerente;

public class EmpleadoService implements IEmpleadoService{
	
	private IEmpleadosDao datos = new EmpleadosDao();
	
	public void addEmpleado(Empleado emp) {
		datos.addEmpleado(emp);
	}
	
	public void addEmpleado() {
		datos.addEmpleado(Empleado.dameEmpleado());
	}
	
		
	public void listado() {
		datos.listado();
	}
	
	
	



}
