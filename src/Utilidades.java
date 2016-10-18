
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Utilidades {
          private ArrayList<String> array = new ArrayList<String>();
          private ArrayList<String> arrayTraducido = new ArrayList<String>();
             
    public ArrayList<String>  lector(String archivo){ 
        try{
            String linea;
            BufferedReader Br = null;
            Br = new BufferedReader(new FileReader(""));
            while((linea = Br.readLine())!= null){
               array.add(linea);
           }
    

        }
    catch(IOException e){
            System.out.println("Archivo no encontrado");
            
        }
        return array;
    }
   
    
    
}

