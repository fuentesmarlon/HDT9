
import java.util.HashMap;

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
    public Set<E>Factory(String tipoImplementacion){
            Set<E> implementacion= null;
            if(tipoImplementacion.equals("Hash")){
                implementacion = (Set<E>) new HashMap();
            }
            return implementacion;
    }
}
