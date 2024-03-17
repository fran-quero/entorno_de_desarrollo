package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor FRAN QUERO
*/
public class ScannerAlgo {

    public static void main(String[] args) {
        
        File file = new File ("folder\\miPrimerArchivo.txt");
        
        try {
            Scanner sc=new Scanner (file);
            
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir el archivo" + e);
        }

    }

}
