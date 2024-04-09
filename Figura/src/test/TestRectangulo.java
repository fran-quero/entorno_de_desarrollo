package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelos.Rectangulo;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll 
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(2,3);
	}
	
	@Test
	void area1 () {
		double areaEsperada=1;
		double areaObtenida = r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test 
	void perimetro1 () {
		double perimetroEsperado=4;
		double perimetroObtenido = r1.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	@Test
	void area2 () {
		double areaEsperada = 6;
		double areaObtenida = r2.area();
		assertEquals(areaEsperada, areaObtenida);
		
	}
	
	@Test
	void perimetro2 () {
		double perimetroEsperado=10;
		double perimetroObtenido=r2.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}

}
