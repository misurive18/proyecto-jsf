/**
 * 
 */
package com.mijasoftcode.proyectojsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mijasoftcode.proyectojsf.entity.Empleado;
import com.mijasoftcode.proyectojsf.services.EmpleadoService;

/**
 * @author wilto
 *Clase controller que se encarga de procesar la informacion para la pantalla principal.xhtml.
 */

@ManagedBean  //es un controlador de jsf

@ViewScoped   //permite mantener la informacion hasta el momento de pasar a otra pantallaaaaaa
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla.
	 */
	private List<Empleado> empleados;
	
	/**
	 * Lista de empleados filtrados.
	 */
	private List<Empleado> empleadosFiltrados;
	
	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados..
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que consulta la lista de empleados.
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados..
	 */
	public void consultarEmpleados() {
		
		this.empleados = this.empleadoService.consultarEmpleados();
		
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
