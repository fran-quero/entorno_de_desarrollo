package AccesoFichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/

public class LeerFichero {
    
    public void leer(){
        
        try {
            
            FileReader entrada = new FileReader ("C:\\Users\\Fran Quero\\Desktop\\pruebaFicheros\\Dia1.txt");
            
            int c = entrada.read();
             
            while(c!=-1){
                System.out.print((char)c);
                c = entrada.read();
            }
            
            entrada.close();
            
        } catch ( IOException ex) {
            System.out.println(ex);
        }
        
    }

    
    
    

    
    
    

}
