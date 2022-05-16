/**
 * 
 */
package com.mijasoftcode.proyectojsf.entity;

/**
 * @author wilto
 * Clase que representa entidades de Empleado.
 */
public class Empleado {

	/**
	 * Nombre del empleado.
	 */
	
	private String nombres;
	
	/**
	 * Apellido paterno del empleado.
	 */
	
	private String apellidoPaterno;
	
	/**
	 * Apellido materno del empleado.
	 */
	
	private String apellidoMaterno;
	
	/**
	 * Puesto del empleado.
	 */
	
	private String puesto;
	
	/**
	 * Estado actual del empleado.
	 */
	
	private boolean estatus;

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the estatus
	 */
	public boolean getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
}
