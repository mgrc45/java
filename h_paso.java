/*
 * Paso por referencia en otros lenguajes quizas si se puedan pasar los valores por valores
*  Pero en java los valores son pasados por referencia, es decir que cuando se asigna un valor lo que se esta asignando
*  en realidad es una posicion de memoria. Esto aplica para objetos 

Paso por referencia de objeto

 * Algunas variables son inmutables, es decir que si se cambian se altera la referencia.  <----Ojo
 * Es decir que no cambia, si hago un cambio sobre la cadena entonces estoy generando una nueva.
 */

//No existe el paso por referencia en Java: Se llama "paso por referencia de objeto"
//Se llama "paso por valor" por que aqui siempre enviamos una referencia : Pass by Value
//No se llama objeto cuando se pasa se llama variable de referencia
//Con datos nativos se copia el valor.

package curso;


public class h_paso {
    public static void main(String[] args) {
       porValores() ;
       porReferencia();
       
       //Cuando pasamos objetos es por referencia
       Shirt myShirt = new Shirt();
       myShirt.colorCode = 'R';
        porReferencia2(myShirt);
        System.out.println("Shirt color: " + myShirt.colorCode);
    }
    
    public static void porValores() {
         //Creamos valores primitivos
        char myShirtC=' ';
        char yourShirtC=' ';
        
        myShirtC = yourShirtC; //Copiamos el valor
        
        myShirtC = 'R';
        yourShirtC = 'G';
        
        System.out.println("Shirt color: " + myShirtC);
    }
    
    public static void porReferencia(){
        //Creamos 2 objetos
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();
        
        myShirt = yourShirt;  //Copia la referencia
    
        myShirt.colorCode = 'R'; //Apuntamos al objeto myShirt
        yourShirt.colorCode = 'G'; //Apuntamos al objeto myShirt
        
        System.out.println("Shirt color: " + myShirt.colorCode);
        //Fuente : D83527GC10_sg1.pdf - 164 - Reference and Objects in Memory
    }
    
     public static void porReferencia2(Object myShirt ){
        Shirt yourShirt = new Shirt();
        yourShirt.colorCode = 'G'; 
        myShirt  = yourShirt;  //<------ Revisar
    }
    
}
