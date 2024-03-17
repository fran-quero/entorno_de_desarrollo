package ManejoArchivos;

import java.io.File;
import java.io.IOException;

/*
    Autor FRAN QUERO
*/
public class CrearArchivos {

    public static void main(String[] args) {
        
        File file = new File ("folder\\archivo2.txt");
        
        try{
            
            boolean fileCreated = file.createNewFile();
            
            
            if(fileCreated){
                System.out.println("Archivo creado correctamente");
            }
            else{
                System.out.println("El archivo no se pudo crear");
            }
            
        }catch(IOException e){
            System.out.println("Excepcion: "+ e);
        }


    }

}
