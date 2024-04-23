package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {


	@Test
	void testSumatorio() {
		int numEsperado=6;
		int numObtenido=Algoritmos.sumatorio(3);
		assertEquals(numEsperado, numObtenido);
		
	}
	
	@Test
	void testFactorial() {
		int numEsperado=24;
		int numObtenido= Algoritmos.factorial(4);
		assertEquals(numEsperado, numObtenido);
	}
	
	@Test
	void sumatorioParamIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,() -> Algoritmos.sumatorio(-2));
		
		String esperado="El numero debe ser igual o superior a 0";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
