package ManejoArchivos;

import java.io.File;

/*
    Autor FRAN QUERO
*/
public class BorrarArchivo {

    public static void main(String[] args) {
        
        File file=new File("archivo.txt");
        
        if(file.delete()){
            System.out.println("Se borro");
        }
        else{
            System.out.println("No se pudo");
        }


    }

}
