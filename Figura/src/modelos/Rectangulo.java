package modelos;
import java.util.*;

/**
 * 
 */
public class Rectangulo {
 
    
    private int base;
    private int altura;

    /**
     * Constructor por defecto en altura 1 base 1
     */
    public Rectangulo() {
        this.base=1;
        this.altura=1;
    }

    /**
     * @param base 
     * @param altura
     */
    public Rectangulo(int base, int altura) {
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
     * Devuelve el area del rectangulo, segun la formula: area*altura
     * @return
     */
    public int calcularArea() {
        // TODO implement here
        return base*altura;
    }

    /**
     * Devuelve perimetro de rectangulo, segun la formula:  2*area+2*altura
     * @return
     */
    public int calcularPerimetro() {
        // TODO implement here
        return (2*base)+(2*altura);
    }

}