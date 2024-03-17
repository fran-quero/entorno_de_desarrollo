package AccesoFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/

public class EscribirFichero {
    
    public void escribir(String texto){
        File file = new File("C:\\Users\\Fran Quero\\Desktop\\pruebaFicheros\\Dia1.txt");
        
        try {
            
            FileWriter escribir = new FileWriter(file,true);
            escribir.write(texto);
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println(ex);;
        }
        
    }

}
