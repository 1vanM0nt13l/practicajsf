/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author omar_montiel
 *Clase controller que se encarga de procesar informacion para la pantalla principal .xhtml
 */
@ManagedBean
@ViewScoped
public class RestauranteController {

	/**
	 * Lista de Restaurante para la tabla.
	 */
	private List<Restaurante> restaurantes;
	/**
	 * Servicio con los metodos que realizan la logica de negocio de restaurante
	 */
	private RestauranteService restauranteService = new RestauranteService();
	
	@PostConstruct
	public void init() {
		ConsultarRestaurantes();
	}
	/**
	 * Metodo que llena la tabla de restaurante.
	 */
	public void ConsultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();
	}
	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}
	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
}
