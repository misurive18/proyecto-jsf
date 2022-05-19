/**
 * 
 */
package com.mijasoftcode.proyectojsf.services;

import java.util.ArrayList;
import java.util.List;

import com.mijasoftcode.proyectojsf.entity.Empleado;

/**
 * @author wilto
 * Clase que permite realizar la logica de negocio para empleados..
 */
public class EmpleadoService {

	/**
	 * Metodo que permite consultar la lsita de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombres("Wilton");
		empleadoIBM.setApellidoPaterno("Sullcaray");
		empleadoIBM.setApellidoMaterno("Riveros");
		empleadoIBM.setPuesto("Desarrollador Senior Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombres("Frank");
		empleadoMicrosoft.setApellidoPaterno("Sullcaray");
		empleadoMicrosoft.setApellidoMaterno("Riveros");
		empleadoMicrosoft.setPuesto("Desarrollador Master .Net");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombres("Jack");
		empleadoApple.setApellidoPaterno("Sullcaray");
		empleadoApple.setApellidoMaterno("Riveros");
		empleadoApple.setPuesto("Desarrollador Junior Oracle");
		empleadoApple.setEstatus(true);
		
		empleadoNetflix.setNombres("Mijael");
		empleadoNetflix.setApellidoPaterno("Sullcaray");
		empleadoNetflix.setApellidoMaterno("Riveros");
		empleadoNetflix.setPuesto("Desarrollador Senior Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombres("Joel");
		empleadoAmazon.setApellidoPaterno("Sullcaray");
		empleadoAmazon.setApellidoMaterno("Riveros");
		empleadoAmazon.setPuesto("Desarrollador Master .Net");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombres("Eberton");
		empleadoHP.setApellidoPaterno("Sullcaray");
		empleadoHP.setApellidoMaterno("Riveros");
		empleadoHP.setPuesto("Desarrollador Junior Oracle");
		empleadoHP.setEstatus(true);
		
		empleadoDeloitte.setNombres("Ciro");
		empleadoDeloitte.setApellidoPaterno("Sullcaray");
		empleadoDeloitte.setApellidoMaterno("Riveros");
		empleadoDeloitte.setPuesto("Desarrollador Senior Java");
		empleadoDeloitte.setEstatus(true);
		
		empleadoOracle.setNombres("Nelson");
		empleadoOracle.setApellidoPaterno("Sullcaray");
		empleadoOracle.setApellidoMaterno("Riveros");
		empleadoOracle.setPuesto("Desarrollador Master .Net");
		empleadoOracle.setEstatus(true);
		
		empleadoDisney.setNombres("Vladimir");
		empleadoDisney.setApellidoPaterno("Sullcaray");
		empleadoDisney.setApellidoMaterno("Riveros");
		empleadoDisney.setPuesto("Desarrollador Junior Oracle");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
		
	}
	
}
