package ManejoArchivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class PracticaMia {

    public static void main(String[] args) {
        
        /*
        File carpeta=new File("H:\\CarpetaPrueba");
        
        boolean creado = carpeta.mkdir();
        
        if(creado){
            System.out.println("Se ha creado carpeta");
        }
        else{
            System.out.println("No se puede");
        }
        */
        
        /*
        File archivoJava = new File ("H:\\CarpetaPrueba\\buenaaas.txt");
        
        
        try {
            boolean a=archivoJava.createNewFile();
            if(a){
                System.out.println("Se creo");
            }
            else{
                System.out.println("Nop");
            }
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */
        
        File hola = new File("H:\\CarpetaPrueba\\pagame.txt");
        
        try {
            boolean aux=hola.createNewFile();
            
            if(aux){
                System.out.println("Creado");
            }
            else{
                System.out.println("No se pudo crear");
            }
            
            FileWriter escribir = new FileWriter (hola);
            escribir.write("Contraseñas:\nhola\n1\n2\n3\n123\nadios");
            escribir.close();
            
            System.out.println("Escrito");
            
            System.out.println(hola.getAbsoluteFile());
            System.out.println(hola.getName());
            
            
            FileReader leer = new FileReader (hola); 
            System.out.println(leer.read());
            System.out.println(leer.getEncoding());
            
            Scanner sc = new Scanner (hola);
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
                
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        

    }

}
