/**
 * 
 */
package com.mijasoftcode.proyectojsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author wilto
 * Clase que se encarga de cerrar la sesion del usuario.
 */
@ManagedBean
public class SessionClosedController {

	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión...");
	}
	
	/**
	 * Metodo que permite cerrar la sesion del usuario y regresar a la pantalla del login.
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que permite redireccionar auna pantalla.
	 * @param pagina {@link String} pagina a redireccionarse.
	 * @throws IOException Excepcion en caso de error al encontrar la pagina.
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
}
