
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Factory<E> {
    public Set<E> makeFactory(String tipoImplementacion){
        Set<E> implementacion=null;
        if(tipoImplementacion.equals("Hashing")){
            implementacion =    new HashSet<E>();
        }
        if(tipoImplementacion.equals("")){
            
        }
        return implementacion;
    }
}
