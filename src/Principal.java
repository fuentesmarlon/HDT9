
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
*
* @author Marlon
*/

public class Principal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido"+"\nElija la implementacion (colocar Hash o ):"+"\n1) Hash"+"\n2) ");
        String operacion = scan.nextLine();
        Factory fabrica = new Factory();
        while(!operacion.equals("1") && !operacion.equals("2") && !operacion.equals("Hash")){
            System.out.println("Bienvenido"+"\nElija la implementacion (colocar Hash o ):"+"\n1) Hash"+"\n2) ");
            operacion = scan.nextLine();
        }
        if(operacion.equals("Hash")||operacion.equals("1")){
           
            
        }
        if(operacion.equals("")|| operacion.equals("2")){
            
        }
       
            
            
        
    
}
}

