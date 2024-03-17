package ficheropdf.N5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N116 {

    public static void main(String[] args) {
        
        try {
            
            BufferedReader leer = new BufferedReader(new FileReader("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\datos.txt"));
            String linea;
            String larga[]=new String[10];
            larga[0]="";
            int a=1;
            
            while((linea=leer.readLine())!=null){
                if(larga[0].length()<linea.length()){
                    larga[0]=linea;
                    a=1;
                }
                else if(larga[0].length()==linea.length()){
                    larga[a]=linea;
                    a++;
                }
            }
            
            leer.close();
            
            if(a>1){
                
                System.out.println("A:\n"+larga[0]);
                System.out.println("B:\n"+larga[a-1]); 
                System.out.println("C:");
                
                for(int i=0;i<a;i++){
                    System.out.println(larga[i]);
                }
            }
            else{
                System.out.println("La frase mas larga es:\n"+larga[0]);
            }
                
            
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }


    }

}
