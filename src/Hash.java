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

import java.util.HashMap;

public class Hash <K extends Comparable<K>,V> implements MapComparable<K, V>{
	
	private HashMap<K,V> hash;
	
	//Constructor, crea una lista para el hash
	public Hash(){
		hash = new HashMap<K,V>(); 
	}
	
	//Inngresa un elemento con llave y valor
	public void put(K key, V value){ 
		hash.put(key, value); 
	}
	
	//Devuelve el elemento
	public V get(K key){ 
		return hash.get(key); 
	}
	
	//Si esta vacio
	public boolean isEmpty(){ 
		return hash.isEmpty(); 
	}
}
