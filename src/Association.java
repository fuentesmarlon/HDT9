/*
public class Association<K,V>
*/
/**
 * A class implementing a key-value pair.  This class associates an 
 * immutable key with a mutable value.  Used in many other structures.
 * <P>
 * Example Usage:
 * <P>
 * To store the number of classes a student has taken from five different
 * professors and to output this information, we could use the following.
 * <P>
 * <pre>
 * public static void main(String[] argv){
 *      //store the number of classes taken by the student in an array of associations
 *      {@link Association} [] classesTaken = new Association[5];
 *      classesTaken[0] = new {@link #Association(Object,Object) Association("Andrea", new Integer(5))};
 *      classesTaken[1] = new Association("Barbara", new Integer(1));
 *      classesTaken[2] = new Association("Bill", new Integer(3));
 *      classesTaken[3] = new Association("Duane", new Integer(2));
 *      classesTaken[4] = new Association("Tom", new Integer(1));
 *
 *      //print out each item in the array
 *      for (int i = 0; i< classesTaken.length; i++){
 *          System.out.println("This Student has taken " + classesTaken[i].{@link #getValue()} +
 *                             " classes from " + classesTaken[i].{@link #getKey()}+ ".");
 *      }
 * }
 * </pre>
 * @version $Id: Association.java 34 2007-08-09 14:43:44Z bailey $
 * @author, 2001 duane a. bailey
 */


/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 9 - Diccionario v2
 * Autores:
 * 		Davis Alvarez -15842
 * 		Osiris Fuentes - 15240
 * 
 * GIT: 
*/	

package paquete;

import java.util.Map;

public class Association <K, V> implements Map.Entry<K, V> {
	
	protected K key;
	protected V value;
	

	public Association(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public Association(K key){ 
		this(key,null); 
	}

	public boolean equals(Object otro){
		Association otraAssoc = (Association)otro;
		return getKey().equals(otraAssoc.getKey());
	}

	public int hashCode(){ 
		return getKey().hashCode(); 
	}
	

	public V getValue(){ 
		return this.value; 
	}
	
	public K getKey(){ 
		return this.key; 
	}


	public V setValue(V value)
    {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
	
	public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }


}
