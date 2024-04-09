package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {


	@Test
	void testAlgoritmo() {
		int numEsperado=6;
		int numObtenido=Algoritmos.sumatorio(3);
		assertEquals(numEsperado, numObtenido);
		
	}

}
