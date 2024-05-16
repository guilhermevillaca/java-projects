
package br.com.guilhermevillaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author villaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new File("/home/villaca/Documents/aulas-java/java-projects/jogo-forca/src/resources/palavras.txt"));
        
        List<String> palavras = new ArrayList<>();
        
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
    }
    
}
