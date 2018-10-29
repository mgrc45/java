package curso;


public class c_desiciones {
    
    public static void main(String[] args) {
        System.out.println("If-else");
        System.out.println(" if (<condición>) {");
        System.out.println("  Codigo A...");
        System.out.println(" }");
        System.out.println(" else {");
        System.out.println("  Codigo B...");
        System.out.println(" }");
        System.out.println("");
        System.out.println("If-else");
        System.out.println(" boolean a = (<condición>);");
        System.out.println("");
        System.out.println("If-else: Operador ternario");
        System.out.println(" int b = (<condición>)?2:3;");
        System.out.println("");
        //El operador == solo funciona para datos primitivos
        //Para comparar String's usa String.equals("algo")
        System.out.println("Operadores relacionales");
        System.out.println(" (1 == 1) : " + (1 == 1));
        System.out.println(" (0 != 1) : " + (0 != 1));
        System.out.println(" (0 <  1) : " + (0 <  1));
        System.out.println(" (1 <= 2) : " + (1 <= 2));
        System.out.println(" (1 >  0) : " + (1 >  0));
        System.out.println(" (2 => 1) : " + (2 >= 1));
        System.out.println("");
        
        System.out.println("switch(expression) {");
        System.out.println(" case value :");
        System.out.println("  // Statements");
        System.out.println(" break;");
        System.out.println(" case value :");
        System.out.println("  // Statements");
        System.out.println(" break;");
        System.out.println(" default :");
        System.out.println("  // Statements");
        System.out.println(" }");
        System.out.println("");
    }
    
}
