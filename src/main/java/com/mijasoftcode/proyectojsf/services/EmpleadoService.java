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
		
		empleadoIBM.setNombres("Wilton Mijael");
		empleadoIBM.setApellidoPaterno("Sullcaray");
		empleadoIBM.setApellidoMaterno("Riveros");
		empleadoIBM.setPuesto("Desarrollador Senior Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombres("Frank Joel");
		empleadoMicrosoft.setApellidoPaterno("Sullcaray");
		empleadoMicrosoft.setApellidoMaterno("Riveros");
		empleadoMicrosoft.setPuesto("Desarrollador Master .Net");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombres("Jack Eberton");
		empleadoApple.setApellidoPaterno("Sullcaray");
		empleadoApple.setApellidoMaterno("Riveros");
		empleadoApple.setPuesto("Desarrollador Junior Oracle");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}
	
}
