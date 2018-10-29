package structures;
//Map/Mapa: Almacena una matriz con los campos key y values
//HashMap: No almacena orden de los elementos
//TreeMap: Almacena elementos de manera ordenada
//
//Fuentes
//http://tutorials.jenkov.com/java-collections/map.html
//https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
import java.util.*;

public class map {
    public static void main(String args[]) {
         Map<String, Integer> m = new HashMap<String, Integer>();
         //Agregar datos
         m.put("A", 1);
         m.put("B", 2);
         m.put("C", 3);
         
        System.out.println("Lista : " + m);
        
        System.out.println("Existe el valor 2 : " + m.containsValue(2));
        
        System.out.print("Lista : ");
        for(Object key : m.keySet()) {
            Object value = m.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
        
        System.out.print("Lista : ");
        for (Map.Entry<String,Integer> entry : m.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.print(val + " ");
        }
        System.out.println();    
        
    }
}
