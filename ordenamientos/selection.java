package sort;
// Complexity / Worst case: O(n^2)
//Fuente
// https://www.youtube.com/watch?v=f8hXR_Hvybo (CS50)
// https://www.toptal.com/developers/sorting-algorithms/selection-sort
// http://www.java2novice.com/java-sorting-algorithms/selection-sort/
//
// Algoritmo
// 1.-Ordenar en dos listas la ordenada y la desordenada
// 2.-Encontrar el elemento con el valor minimo
// 3.-Colocar el elemento de valor minimo al principio de la lista
// 4.-Repetir el paso 2 y 3 (sin repetir elementos al inicio)
import java.util.*;

public class selection {
    //precondition: x and y are >= 0 and < mylist.size()
    //precondition: mylist is not null
    void swap(int x, int y, List <String> myList) {
        String s = myList.get(x);
        myList.add(x, myList.get(y));
        myList.add(y, s);
    System.out.println(myList);
    } 
    
}
