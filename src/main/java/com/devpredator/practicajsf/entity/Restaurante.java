/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author omar_montiel
 *Clase que contiene los datos de un restaurante
 */
public class Restaurante {

	/**
	 * Nombre del restaurante.
	 */
	private String nombre;
	/**
	 * Direccion del restaurante.
	 */
	private String direccion;
	/**
	 * Pais del restaurante.
	 */
	private String pais;
	/**
	 * Objeto de tipo gerente del restaurante.
	 */
	private Gerente gerente;

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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the gerente
	 */
	public Gerente getGerente() {
		return gerente;
	}

	/**
	 * @param gerente the gerente to set
	 */
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
}
