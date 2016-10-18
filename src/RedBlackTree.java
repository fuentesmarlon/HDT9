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

public class RedBlackTree <K extends Comparable<K>, V> implements MapComparable<K, V> {
    
	private RedBlackBST<K, V> redBlackTree;

    public RedBlackTree(){
    	redBlackTree = new RedBlackBST<K, V>();
    }

    @Override
    public void put(K key, V value) {
    	redBlackTree.put(key, value);
    }

    @Override
    public V get(K key) {
        return redBlackTree.get(key);
    }

    @Override
    public boolean isEmpty() {
        return redBlackTree.isEmpty();
    }
}
