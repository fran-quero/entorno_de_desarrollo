package app;

import modelos.Circulo;
import modelos.Rectangulo;
import modelos.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo=new Rectangulo();
		Rectangulo rectangulo2=new Rectangulo(20,10);
		
		System.out.println("Area rectangulo: "+rectangulo.calcularArea()+"\nPerimetro rectangulo: "+rectangulo.calcularPerimetro()+
				"\nArea rectangulo 2: "+rectangulo2.calcularArea()
				+"\nPerimetro rectangulo 2: "+rectangulo2.calcularPerimetro());
		System.out.println();
		
		Circulo c1=new Circulo(3);
	
		System.out.println("Area circulo: "+c1.calcularArea()+"\nPerimetro circulo: "+c1.calcularPerimetro());
		System.out.println();
		
		Triangulo r=new Triangulo(10,5);
		
		System.out.println("Area rectangulo: "+r.calcularArea());
		
		
	}

}
