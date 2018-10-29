package curso;

public class e_ciclos {

    public static void main(String[] args) {
        String[] column2 = {"1","2","3"};
        System.out.println("- Enhaced for loop -");
        System.out.println(" for(variable:array) {  }");
	for (String str: column2) 
          System.out.println(" " + str.toString());
        
        System.out.println(" for(inicializacion; condicion; incremento) {  }");
        for (int i = 0; i < column2.length; i++)
          System.out.println(" " + column2[i].toString());
        
        int i = 0;
        System.out.println(" do {  } while(condición);");
        do { System.out.println(" " + column2[i].toString()); i++; } 
        while(i < column2.length);
        
        i = 0;
        System.out.println(" while(condición) {  }");
        while(i < column2.length) 
        { System.out.println(" " + column2[i].toString()); i++; }
    }
    
}
