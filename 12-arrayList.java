/*
 * Las listas son mutables, es decir que se incrementan de forma automatica sin redimensionar una lista.
 * La lista te guarda el orden en que los insertas. El SET te guarda el orden natural.
 * No sirven para metodos primitivos.
 */
package curso;

import java.util.ArrayList;

public class l_arrayList {
    public static void main(String[] args) {
         ArrayList<String> names = new ArrayList();
        names.add ("Jamie");
        names.add ("Esteban");
        names.add ("Saul");
        System.out.print(names.size());
        System.out.print(names);
        System.out.println("");
        
        names.add(1,"Ana");
        System.out.print(names.size());
        System.out.print(names);
        System.out.println("");
        
        names.remove("Jamie");
        System.out.print(names.size());
        System.out.println(names);
        System.out.println("");
        
    }
   
}
