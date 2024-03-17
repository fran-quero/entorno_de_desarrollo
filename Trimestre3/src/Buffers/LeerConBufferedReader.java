package Buffers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class LeerConBufferedReader {

    public static void main(String[] args) {
        
        
        

        
        
        try {
            BufferedReader leer = new BufferedReader (new FileReader ("C:\\Users\\Fran Quero\\Desktop\\EjercicioBuffer\\Prueba1.txt"));
            
            String line;
            while((line=leer.readLine())!=null)
                System.out.println(line);
            
        } catch (IOException ex) {
            Logger.getLogger(LeerConBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         


    }

}
