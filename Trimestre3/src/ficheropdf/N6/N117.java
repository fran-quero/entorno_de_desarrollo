package ficheropdf.N6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N117 {

    public static void main(String[] args) {
        try {
            
            File file=new File("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\datos.txt");
            FileReader read = new FileReader(file);
            BufferedReader leer = new BufferedReader (read);
            
            int numC=0, numP=0;
            
            String texto;
            while((texto=leer.readLine())!=null){
                numC+=texto.length();
                
            }
            System.out.println("Numero de caracteres: "+numC);
            System.out.println("Numero de palabras: "+numP);
            
            
        
        } catch (IOException ex) {
            Logger.getLogger(N117.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
