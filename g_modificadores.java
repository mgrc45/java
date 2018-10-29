package curso;
/*
//More on Access Control

Modificadores de acceso
 - private
 # protected
 + public
 N package o default
*/
//Private : Solo es accesible a metodos de la misma clase
//Public : Se puede acceder desde cualquier parte del programa
// Si no se escribe el modificador de acceso se considera :...
//Se puede llamar a un metodo privado, solo si es llamado desde la misma instancia
//En cadenamiento de constructores es cuandos se vuelven a llamar : Overloading Constructors

public class g_modificadores {

    public static void main(String[] args) {
        f_clases ana = new f_clases(1, "ana");
        double price = 0;
        long a1 = Long.getLong("1000");
        ana.muestra();
        System.out.println("Pago inscripcion: " + f_clases.pagarInscripcion());
    }
    
}
