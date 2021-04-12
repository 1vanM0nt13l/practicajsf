/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author omar_montiel
 *Clase que contiene los servicios de la clase restaurante
 */
public class RestauranteService {

	public List<Restaurante> consultarRestaurantes(){
		
		List<Restaurante> restaurante = new ArrayList<Restaurante>();		
		
		Restaurante restauranteMcDonalds = new Restaurante();
		Restaurante restauranteLaVidArgentina = new Restaurante();
		Restaurante restauranteLaChilaca = new Restaurante();
		Restaurante restauranteCienega = new Restaurante();
		Restaurante restauranteSocarrat = new Restaurante();
		
		Gerente gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();
		Gerente gerente3 = new Gerente();
		Gerente gerente4 = new Gerente();
		Gerente gerente5 = new Gerente();
		
		gerente1.setNombre("Diego");
		gerente1.setPrimerApellido("Paniagua");
		gerente1.setSegundoApellido("López");
		
		gerente2.setNombre("Erick");
		gerente2.setPrimerApellido("Guerrero");
		gerente2.setSegundoApellido("Gómez");
		
		gerente3.setNombre("Luis Jesús");
		gerente3.setPrimerApellido("López");
		gerente3.setSegundoApellido("Romero");
		
		gerente4.setNombre("Gerardo");
		gerente4.setPrimerApellido("Guerrero");
		gerente4.setSegundoApellido("Gómez");
		
		gerente5.setNombre("Daniel");
		gerente5.setPrimerApellido("López");
		gerente5.setSegundoApellido("Romero");
		
		restauranteMcDonalds.setNombre("McDonalds");
		restauranteMcDonalds.setDireccion("Dirección 1");
		restauranteMcDonalds.setPais("Estados Unidos");
		restauranteMcDonalds.setGerente(gerente1);
		
		restauranteLaVidArgentina.setNombre("La Vid Argentina");
		restauranteLaVidArgentina.setDireccion("Dirección 2");
		restauranteLaVidArgentina.setPais("Argentina");
		restauranteLaVidArgentina.setGerente(gerente2);
		
		restauranteLaChilaca.setNombre("La Chilaca");
		restauranteLaChilaca.setDireccion("Dirección 3");
		restauranteLaChilaca.setPais("Chile");
		restauranteLaChilaca.setGerente(gerente3);
		
		restauranteCienega.setNombre("Cienega");
		restauranteCienega.setDireccion("Dirección 4");
		restauranteCienega.setPais("Colombia");
		restauranteCienega.setGerente(gerente4);
		
		restauranteSocarrat.setNombre("Socarrat");
		restauranteSocarrat.setDireccion("Dirección 5");
		restauranteSocarrat.setPais("España");
		restauranteSocarrat.setGerente(gerente5);
		
		restaurante.add(restauranteMcDonalds);
		restaurante.add(restauranteLaVidArgentina);
		restaurante.add(restauranteLaChilaca);
		restaurante.add(restauranteCienega);
		restaurante.add(restauranteSocarrat);
		
		return restaurante;
	}
}
