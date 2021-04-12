/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author omar_montiel
 *Clase que contiene los datos de un gerente de restaurante.
 */
public class Gerente {
	/**
	 * Nombre del gerente;
	 */
	private String nombre;
	/**
	 * primer Apellido del gerente;
	 */
	private String primerApellido;
	/**
	 * segundo Apellido del gerente;
	 */
	private String segundoApellido;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

}
