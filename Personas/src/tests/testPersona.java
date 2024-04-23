package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Persona;


class testPersona {
	
	
	/**
	 * Comprueba que al intentar instanciarse una persona con edad negativa se lanza la excepcion esperado
	 */
	@Test
	void constructorPersonaMenosLimite() {
		Exception ex=assertThrows(IllegalArgumentException.class, ()->new Persona ("Robert","Daniela",-1));
		String esperado = "La edad deba estar entre 0 y 130";
		String obtenido =ex.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que al intentar instanciarse una persona con edad mayor a la permitida se lanza la excepcion esperado
	 */
	@Test
	void constructorPersonaMasLimite() {
		Exception ex=assertThrows(IllegalArgumentException.class, ()->new Persona ("Robert","Daniela",131));
		String esperado = "La edad deba estar entre 0 y 130";
		String obtenido =ex.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 0 años se muestra como menor de edad
	 */
	@Test
	void metodoMostrarEdadNumCero() {
		
		Persona p = new Persona("Prueba","Apellido",0);
		String esperado="Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 17 años se muestra como menor de edad
	 */
	@Test
	void metodoMostrarEdadNum17() {
		
		Persona p = new Persona("Prueba","Apellido",17);
		String esperado="Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 18 años se muestra como mayor de edad
	 */
	@Test
	void metodoMostrarEdadNumero18() {
		
		Persona p = new Persona("Prueba","Apellido",18);
		String esperado="Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 65 años se muestra como mayor de edad
	 */
	@Test
	void metodoMostrarEdadNumero65() {
		
		Persona p = new Persona("Prueba","Apellido",65);
		String esperado="Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 66 años se muestra como jubilado
	 */
	@Test
	void metodoMostrarEdadNumero66() {
		
		Persona p = new Persona("Prueba","Apellido",66);
		String esperado="Jubilado";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que una persona de 130 años se muestra como jubilado
	 */
	@Test
	void metodoMostrarEdadNumero130() {
		
		Persona p = new Persona("Prueba","Apellido",130);
		String esperado="Jubilado";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	

}
