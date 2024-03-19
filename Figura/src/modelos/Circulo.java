package modelos;
import java.util.*;

/**
 * 
 */
public class Circulo {

    
    private int radio;


    /**
     * Constructor por defecto en radio 1
     */
    public Circulo() {
        this.radio=1;
        
    }

    /**
     * Constructor dandole valor a los atributos
     * @param radio
     */
    public Circulo(int radio) {
        this.radio=radio;
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return this.radio;
    }

    /**
     * @param radio
     */
    public void setRadio(int radio) {
        this.radio=radio;
    }

    /**
     * Devuelve el area del circulo: pi*r^2
     * @return
     */
    public double calcularArea() {
        
        return Math.PI*(Math.pow(this.radio, 2));
    }

    /**
     * Devuelve perimetro del circulo: 2*pi*r
     * @return
     */
    public double calcularPerimetro() {
        
        return 2*Math.PI*this.radio;
    }

}