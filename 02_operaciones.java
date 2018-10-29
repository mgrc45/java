package curso;

public class b_operaciones {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Incremento");
        //Pre-orden, Post-orden : Pre-fija, Post-fija
        i = 18; System.out.println(" Post-orden i = " + i + "; i++(" + i++ + "); i = " + i + ";");
        i = 18; System.out.println(" Pre-orden i = " + i + "; ++i(" + ++i + "); i = " + i + ";");
        System.out.println("");
        
        //Orden de las operaciones en java
        System.out.println("Precedencia de operadores");
        System.out.println(" 1. Parentesis");
        System.out.println(" 2. Multiplicación y división");
        System.out.println(" 3. Suma y resta");
        System.out.println("    Evaluando de izquierda a derecha");
        System.out.println("int c = 25 - 5 * 4 / 2 - 10 + 4;");
        System.out.println("    c = 25 -    20 / 2 - 10 + 4;");
        System.out.println("    c = 25 -        10 - 10 + 4;");
        System.out.println("    c =             15 - 10 + 4;");
        System.out.println("    c =                   5 + 4;");
        System.out.println("    c =                       " + 
        (25 - 5 * 4 / 2 - 10 + 4) + ";");
        System.out.println("");
        
        System.out.println("Operaciones");
        System.out.println(" double d =   3 / 2; d = " + (3/2) + ";");
        System.out.println(" double d = 3.0 / 2; d = " + (3.0/2) + ";");
        System.out.println(" La operacion se realiza tomando el valor mas alto de la formula");
        System.out.println("");
    }
    
}
