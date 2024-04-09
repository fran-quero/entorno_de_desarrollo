package app;

import modelos.Triangulo;
import modelos.Circulo;

public class UsoDepurador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo triangulo = new Triangulo(1,2);
		double areaTriangulo1=triangulo.calcularArea();
		System.out.println("Area del triangulo 1:"+areaTriangulo1);
		
		triangulo.setBase(2);
		double areaTriangulo2=triangulo.calcularArea();
		System.out.println("Area del triangulo 2:"+areaTriangulo2);
		
		Circulo circulo=new Circulo(2);
		double areaCirculo=circulo.calcularArea();
		
		circulo.setRadio(3);
		double perimetroCirculo=circulo.calcularPerimetro();
		System.out.println("Perimetro del circulo:"+perimetroCirculo);
		
		
		
	}

}
