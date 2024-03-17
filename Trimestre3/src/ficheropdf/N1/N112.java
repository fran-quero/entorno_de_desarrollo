package ficheropdf.N1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class N112 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //Pido datos
        System.out.print("Dime tu nombre>> ");
        String nombre=sc.next();
        System.out.print("Dime tu edad>> ");
        int edad=sc.nextInt();
        
        File archivo = new File ("D:\\DAW\\NetBeansProjects\\CarpetasFicheros\\datos.txt");
        
        //Creo fichero
        try {
            
            if(archivo.createNewFile()){
                System.out.println("Se creo el archivo!!");
            }
            else{
                System.out.println("El archivo ya esta creado.");
            }
            
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        //Escribo datos
        try {
            
            BufferedWriter escribir = new BufferedWriter (new FileWriter (archivo,true));
            
            escribir.write(nombre+"\n"+edad+"\n");
            
            escribir.close();
            
            System.out.println("Datos guardados en fichero datos.txt");
            
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
        
        
        
    }

}
