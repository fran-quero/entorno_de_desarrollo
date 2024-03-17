package ficheropdf.N2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N113 {

    public static void main(String[] args) {
        
        String frase;
        
        try {
            
            Scanner sc=new Scanner (System.in);
            
            BufferedWriter escribir = new BufferedWriter(new FileWriter ("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\datos.txt", true));
            
            System.out.println("Dime la frase: ");

            
            while(((frase=sc.nextLine()).isEmpty())==false){
                
                escribir.write(frase);
                escribir.newLine();

                System.out.println("Dime la frase: ");
            
            }
            
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        

    }

}
