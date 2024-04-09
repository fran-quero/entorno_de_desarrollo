package modelos;
import java.util.*;

/**
 * @author FranQuero
 * 
 * Clase Rectangulo. Permite crear rectangulos y calcular su area y perimetro
 */
public class Rectangulo extends Figura{
 
    
    private int base;
    private int altura;

    /**
     * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros
     */
    public Rectangulo() {
        this.base=1;
        this.altura=1;
    }

    /**
     * Constructor que crea un rectangulo que recibe la base y la altura especificadas, en metros
     * 
     * @param base 		la base del rectangulo, en metros
     * @param altura 	la altura del rectangulo, en metros
     */
    public Rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    
    public int getBase() {
        // TODO implement here
        return this.base;
    }

    
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    
    public void setBase(int base) {
        this.base=base;
    }

    
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * @see modelos.Figura#area()
     */
    @Override
    public double area() {
        // TODO implement here
        return this.base*this.altura;
    }
    
    /**
     * @see modelos.Figura#perimetro()
     */
    @Override
    public double perimetro() {
        // TODO implement here
        return (2*this.base)+(2*this.altura);
    }

}