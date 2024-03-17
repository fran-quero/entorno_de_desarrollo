package ficheropdf.N4;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N115 {

    public static void main(String[] args) {
        
        try { 
            BufferedReader leer = new BufferedReader (new FileReader ("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\numeros.txt"));
            int num2,numMax=0,numMin=0,contadorMax=0,contadorMin=0;
            int i=0;
            String aux;
            while((aux=leer.readLine())!=null){
                
                if(i==0){
                    numMax=Integer.parseInt(aux);
                    numMin=numMax;
                    i++;
                }
                
                else{
                    num2=Integer.parseInt(aux);
                    
                    if(numMax<num2){
                        numMax=num2;
                        contadorMax=1;
                    }
                    else if(numMax==num2){
                        contadorMax++;
                    }
                    
                    else if(numMin>num2){
                        numMin=num2;
                        contadorMin=1;
                    }
                    else if(numMin==num2){
                        contadorMin++;
                    }
                }
            }
            
            leer.close();
            
            
            
            
            System.out.println("El numero mas alto es: "+numMax+" y aparece "+contadorMax);
            System.out.println("El numero mas pequeño es: "+numMin+" y aparece "+contadorMin);
            
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        


    }

}
