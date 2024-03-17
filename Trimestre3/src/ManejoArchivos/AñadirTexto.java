package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class AñadirTexto {

    public static void main(String[] args) {
        
        /*
        File hola = new File ("H:\\CarpetaPrueba\\pagame.txt");
        
        
        try {
            
            FileWriter escribir = new FileWriter (hola);
            escribir.write("ESTO SIRVE??\nOLAAA");
            
            Scanner sc=new Scanner(hola);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */
        
        File elruben = new File("H:\\CarpetaPrueba\\elruben");
        
        try {
            
            if(elruben.createNewFile()){
                System.out.println("Creadiño");
            }
            else{
                System.out.println("Nop");
            }
            
        } catch (IOException ex) {
            System.out.println("Eroor: "+ex);
        }
        
        try {
            
            FileWriter escribir = new FileWriter(elruben);
            escribir.write("\nRuben la chupa\nHola");
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        
        try {
            
            Scanner leer = new Scanner (elruben);
            while(leer.hasNextLine()){
                System.out.println(leer.nextLine());
            }
            
            System.out.println(leer.delimiter());
            System.out.println(elruben.getAbsoluteFile());
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error: "+ex);
        }
        
        

    }

}
