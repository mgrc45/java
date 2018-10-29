package structures;
//http://tutorials.jenkov.com/java-collections/set.html
//https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
//https://docs.oracle.com/javase/tutorial/collections/interfaces/sorted-set.html
import java.util.*;

public class set {
    
    static void set_a() {
        //Eliminar duplicados
        Set setA = new HashSet();
        //Agrego datos
        setA.add(1);
        setA.add(2);
        setA.add(2);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        
        System.out.println("Lista original : " + setA);
    }
   
    static void set_b() {
        //Agregar ordenado y sin duplicados
        SortedSet setA = new TreeSet();
        //Agrego datos
        setA.add(1);
        setA.add(2);
        setA.add(4);
        setA.add(2);
        setA.add(3);
        
        System.out.println("Lista ordenada : " + setA);
    }
    
    public static void main(String args[]){
        //set_a();
        set_b();
    }

}
