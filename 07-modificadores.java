package curso;
/*
Modificadores de acceso
 - private : Solo es accesible a metodos de la misma clase
 + public : Se puede acceder desde cualquier parte de la solución
 # protected
 N package o default
Overloading Constructors : Encadenamiento de constructores es cuando se vuelven a llamar
*/
public class g_modificadores {

    public static void main(String[] args) {
        f_clases ana = new f_clases(1, "ana");
        double price = 0;
        long a1 = Long.getLong("1000");
        ana.muestra();
        System.out.println("Pago inscripcion: " + f_clases.pagarInscripcion());
    }
    
}
