package AccesoFichero;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class PrimerDia {

    public static void main(String[] args) {
        
        /*
        File archivo = new File ("C:\\Users\\Fran Quero\\Desktop\\pruebaFicheros\\Dia1.txt");
        
        try {
            if(archivo.createNewFile()){
                System.out.println("Se ha creado correctamente.");
            }
            else{
                System.out.println("No se ha podido crear.");
            }
        } catch (IOException ex) {
            Logger.getLogger(PrimerDia.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        LeerFichero acceder = new LeerFichero();
        acceder.leer();
        
        EscribirFichero hola = new EscribirFichero();
        
        hola.escribir("\nHOLAAAAAAAAAAAAAA");
        

        acceder.leer();


    }

}
