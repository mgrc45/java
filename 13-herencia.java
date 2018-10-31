/*
 * La herencia sirve para reutilzar codigo
 * En una composicion si desaparece un padre el hijo tiene problemas de identidad.
 * Composicion y herencia: s1.x1 , s1.persona.x1
 * Clase papa, super clase, clase heredada.
 * Super es una palabra reservada para acceder a la clase padre.
 * This es una palabra reservada para acceder a los elementos de la clase. Se usa para evitar ambiguedad.
 * Al construir una clase hija se construye la clase padre de manera instantanea.
 * Extends : Es una palabra reservada para heredar.
 * Cuando se hereda la clase padre debera tener un constructor por default escrito explicitamente.
 * La sobre escritura se da cuando heredas. 
 * Al sobre escribir no puede ser mas restrictiva (menos visible)
 * No se puede sobre escribir un metodo privado por que no es accesible.
 * @Override = Notacion no es necesaria pero te permite ubicar que estas sobre escribiendo.
 * El polimorfismo involucra una respuesta diferente al mismo mensaje por parte de la herencia y la sobre escritura.
 * instanceof : es una palabra reservada para validar tipo del objeto.
 * 
 * Las clases abstractas son aquellas clases que son ambiguas por lo que no se pueden instanciar.
 * Una clase abstracta puede contener metodos abstractos y concretos.
 * finally : implica que es una clase hoja es decir que sea la ultima e implicitamente no heredable.
 * 
 * Un pequeño truco es crear un constructor privado.
 */
package curso;

public class m_herencia extends Shirt {
    private int neckSize;

    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int neckSize) {
        this.neckSize = neckSize;
    }
    
}
