package modelos;
import java.util.*;

/**
 * 
 */
public class Triangulo {

 

    private int base;
    private int altura;

    /**
     * Constructor por defecto en radio 1
     */
    public Triangulo() {
        this.base=1;
        this.altura=1;
    }

    /**
     * Constructor dandole valor a los atributos
     * @param base 
     * @param altura
     */
    public Triangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    /**
     * @return
     */
    public int getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * Devuelve el area del circulo: pi*r^2
     * @return
     */
    public double calcularArea() {
        // TODO implement here
        return (this.base*this.altura)/2;
    }

}