package structures;
//Una coleccion ordenada de elementos que puede contener duplicados.
//https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
//https://www.tutorialspoint.com/java/util/collections_reverse.htm
//https://www.tutorialspoint.com/java/util/collections_rotate.htm
import java.util.*;

public class list {
    public static void main(String arg[]){
        List<Integer> ls = new ArrayList<Integer>();
        //Agregar datos
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        
        System.out.println("Lista original   : " + ls);
        
        ls.remove(ls.size()-1);
        
        System.out.println("Lista secundaria : " + ls);
        
        //Collections.sort(ls);
        //Collections.reverse(ls);
        Collections.rotate(ls,1);
        
        System.out.println("Lista tercera    : " + ls);
        
        Collections.rotate(ls,-1);
        
        System.out.println("Lista cuarta     : " + ls);
        
        System.out.println("Sublista         : " + ls.subList(ls.size()-1,ls.size()));
        
    }
}
