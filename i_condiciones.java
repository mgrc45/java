/*
 * Operadores de corto circuito: AND y OR
 * && || Si es doble: es menos extricto evalua almenos una de las dos condiciones (para optimizar)
 * &   | Si es simple: es mas extricto evalua ambas condiciones (aun que no sea necesario)

 * Uso de "equals"
 * Cuando son de tipo primitivo se comparan los valores
 * Entre dos objetos lo que comparamos con "==" es la referencia (en memoria)
 * Entre dos objetos para comparar por valores (contenido)  se usa "equals"
 * Cuando se comparan dos objetos se comparan la direccion en memoria del Heap

 * Switch solo acepta valores: Char, Byte, Short, Int, String
 * Switch es mas rapido que if anidado
 * Switch solo funciona para igualdad no para rangos.
 * En switch si colocamos default al inicio se evaluan todos los casos. No cambia su prioridad.
 * En caso de no usar swicth 
 */

package curso;


public class i_condiciones {
    public static void main(String[] args) {
        comparadores();
         ternary_operator();
         equals();
    }

    private static void comparadores() {
        int e = 99;
         //Al ser un AND y por tabla de verdad sabemos que si uno de los dos casos es FALSO el resultado sera FALSO
         //por lo que && (Doble corto circuito) optimiza evaluando solo 1 de las condiciones si esa condicion fuera FALSO
         
         //Aqui solo evalua 1 de las 2 condiciones por lo que no se incrementa "e"
         if (false && e++<100)  System.out.print("Verdadero"); else  System.out.print("Falso");

         System.out.println(" e = " + e);
         
         //Aqui se evaluaron los 2 aspectos del operador de corto circuito por lo que se incrementa "e"
         if (false & e++<100) System.out.print("Verdadero"); else  System.out.print("Falso");         
         
         System.out.println(" e = " + e);
    }

    private static void ternary_operator() {
        int a = (true) ? 5 : 3;
        System.out.println("a = " + a);
    }

    private static void equals() {
        String name1 = new String("Fred Smith");
        String name2 = new String("Fred Smith");
        //Entre 2 objetos lo que se compara es la referencia
        System.out.print("name1 == name2 : ");
        if (name1 == name2) System.out.println("Verdadero"); else  System.out.println("Falso");  
        //Para comparar valores entre dos objetos se usa el metodo "equals"
        System.out.print("name1.equals(name2) : ");
        if (name1.equals(name2)) System.out.println("Verdadero"); else  System.out.println("Falso");  
        String nm1 = "Fred Smith";
        String nm2 = "Fred Smith";
        //Entre 2 tipos primitivos se comparan los valores y en el caso de Strings se aplica de forma implicita "equals"
        System.out.print("nm1 == nm2 : ");
        if (nm1 == nm2) System.out.println("Verdadero"); else  System.out.println("Falso"); 
        
        //Fuente : D83527GC10_sg2.pdf - 51 - Testing Equality Between String Variables
    }
    
}
