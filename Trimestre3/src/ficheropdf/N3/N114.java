package ficheropdf.N3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N114 {

    public static void main(String[] args) {
        
        try {
            BufferedReader leer = new BufferedReader(new FileReader ("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\datos.txt"));
            
            int i=1;
            String linea;
            
            while((linea=leer.readLine())!=null){
                System.out.println(i+":"+linea);
                i++;
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(N114.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
