package EjercicioFichero.Ej2;

import java.util.Locale;
import java.util.Scanner;

/*
    Autor FRAN QUERO
*/
public class Ejercicio {

    public static void main(String[] args) {
        
        System.out.println("Dime la ruta:");
        Scanner sc=new Scanner(System.in);
        String ruta=sc.next();
        
        System.out.println("Dime el texto pa escribir:");
        String texto=sc.next();
        
        for(int i=0;i<texto.length();i++){
            if(Character.isUpperCase(texto.charAt(i))){
                Character.toUpperCase(texto.charAt(i));
                
            }
            else{
                Character.toLowerCase(texto.charAt(i));
            }
        }
        
        System.out.println(texto);


    }

}
