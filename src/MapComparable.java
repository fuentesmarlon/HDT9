/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 9 - Diccionario v2
 * Autores:
 * 		Davis Alvarez -15842
 * 		Osiris Fuentes - 15240
 * 
 * GIT: https://github.com/fuentesmarlon/HDT9.git
*/	
package paquete;

public interface MapComparable <K extends Comparable<K>, V> {
    
    //Inngresa un elemento con llave y valor
    void put(K key, V value);

     //Devuelve el elemento

    V get(K key);

     //Si esta vacio
    boolean isEmpty();
}