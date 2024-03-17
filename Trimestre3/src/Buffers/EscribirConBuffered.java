package Buffers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class EscribirConBuffered {

    public static void main(String[] args) {
            
        
        try {
            FileWriter a = new FileWriter ("C:\\Users\\Fran Quero\\Desktop\\EjercicioBuffer\\Prueba1.txt", true);
            
        BufferedWriter escribir = new BufferedWriter(a);
        
        for(int i=0;i<20;i++){
            escribir.write("\nRoberto es tonto "+i);
        }
        escribir.close();
        
        } catch (IOException ex) {
            Logger.getLogger(EscribirConBuffered.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
         

    }

}
