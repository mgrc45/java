package curso;
/*
----------------------------------------
Class: Alumno
----------------------------------------
-boleta:
-nombre:
-pagoInscripcion:int=1000{frozen}
----------------------------------------
+Alumno(boleta:int,nombre:String)
+setBoleta(boleta:int)
+getBoleta():int
+setNombre(nombre:String)
+getNombre():String
+pagarInscripcion():int
+muestra()
----------------------------------------
*/
//this : Es una palabra reservada para evitar ambiguedad
//Una clase posee un constructor por default por lo que podemos usar new sin crear explicitamente un constructor
//La clase que llama a la otra es llamada : caller
//La clase que trabaja para otras es llamada : worker
//scope??? Ambito - Local o global


public class f_clases {
    private int boleta;
    private String nombre;
    private static final int pagoInscripcion = 100;
    
    f_clases(int boleta, String nombre) {
    //En este metodo las variables se pasan "por valores"
        this.boleta = boleta;
        this.nombre = nombre;
    }
    
    public void setBoleta(int boleta) {
        this.boleta=boleta;
    }
    
    public int getBoleta(){
        return boleta;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public static int pagarInscripcion() {
        return pagoInscripcion;
    }
    
    public void muestra() {
        System.out.println("Boleta: "+boleta);
        System.out.println("Nombre: "+nombre);
    }
}
