package trimestre3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    Autor FRAN QUERO
*/
public class Trimestre3 {

    public static void main(String[] args) {
        
        File folder = new File ("folder");
        File file = new File ("folder\\miPrimerArchivo.txt");
        
        try{
            boolean folderCreated = folder.mkdir();
            boolean fileCreated = file.createNewFile();
            
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("AYYY MIGUEL\nHOLAA\nasjdlka\naiusdnjanj\nADIOS");
            fileWriter.close();
            
            if(fileCreated && folderCreated){
                System.out.println("El archivo se crea correctamente");
            }
            else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Excepcion al crear el archivo: " + e);
        }
        
        


    }

}
