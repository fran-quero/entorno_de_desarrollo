package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class LeerHola {

    public static void main(String[] args) {
        
        File ruben = new File ("C:\\Users\\Carmen\\Desktop\\shrekSendScript.js");
        File copiaShrek = new File("H:\\CarpetaPrueba\\CopiaShrek");
        
        try {
            if(copiaShrek.createNewFile()){
                System.out.println("Creado");
            }
            else{
                System.out.println("Ya existe");
            }
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        
        
        try {
            FileWriter copia = new FileWriter (copiaShrek);
            copia.write(leer(ruben));
        } catch (IOException  ex) {
            System.out.println(ex);
        }
            
        
        
       
        
        try {
            System.out.println(leer(copiaShrek));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerHola.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        


    }
    
    public static String leer(File ruben) throws FileNotFoundException {
        
        Scanner leer = new Scanner (ruben);
        String cadena="";
            while(leer.hasNextLine()){
                cadena+=leer.nextLine()+"\n";
            }
            
        return cadena;
    }

}
