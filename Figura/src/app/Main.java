package app;

import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo=new Rectangulo();
		Rectangulo rectangulo2=new Rectangulo(20,10);
		
		System.out.println(rectangulo.calcularArea()+"\n"+rectangulo.calcularPerimetro()+"\n"+rectangulo2.calcularArea()
		+"\n"+rectangulo2.calcularPerimetro());
		
		
	}

}
