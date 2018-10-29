/*
 * El unico riezgo es un ciclo infinito
 * do/while se ejecuta almenos una vez
 * break; rompe un solo ciclo. Rompe cualquier bloque de codigo (de apertura y cierre)
 * continue; continua a la siguiente iteracion
 * Complejidad ciclomatica
 */
package curso;

import java.util.Iterator;


public class k_ciclos {

    public static void main(String[] args) {

         
        //For incrementa al terminar el ciclo
        //For(paso 0; paso 1; paso 2)
         int i;
         for (i = 0; i < 3; i++) {
             System.out.println("For: " + i);
         }
         System.out.println("For result: " + i);
         //Es equivalente a while si se incrementa al final
         int counter = 0;
         while  (counter < 3)  {
            System.out.println("While: " + counter);
            counter++;
         }
         System.out.println("While result: " + counter);
         
    }
   
   public static void factorial(int target){
       //Factorial es el numero dado multiplicado por sus anteriores
       
   }
    
}
