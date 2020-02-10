package controller;

import java.util.Date;

import model.Director;
import model.Empleado;
import model.Gerente;
import servicios.EmpleadoService;
import servicios.IEmpleadoService;

public class Controller {
	
	private IEmpleadoService servicios = new EmpleadoService();
	
	
	public void start() {
		
		Empleado e1 = new Empleado("Felix", 1220.0d, new Date());
		Empleado e2 = new Empleado("Alfonso", 1410.0d, new Date());
		Empleado e3 = new Empleado("Artemio", 1000.0d, new Date());
		
		Empleado e4 = new Gerente("Alba", 3220.0d, new Date());
		Empleado e5 = new Director("Diego", 5420.0d, new Date());
		
		Empleado e6 = Empleado.dameEmpleado();
		
		servicios.addEmpleado(e1);
		servicios.addEmpleado(e2);
		servicios.addEmpleado(e3);
		servicios.addEmpleado(e4);
		servicios.addEmpleado(e5);
		
		servicios.listado();
		
		((Gerente)e4).incentivar();
		((Director)e5).incentivar();
		
		
	}
	

}
