# Guía rápida: Java

## Cuerpo del programa

```java
import java.util.*;

public class Program {
  public static void main(String[] args) {

  }
}
```

## Comentarios

```java
//Un comentario de una linea

/* También puede realizar
 comentarios multilinea */
```

## Constantes

Constantes literales

```java
public final static String str1;
```

> Las variables estaticas son almacenadas en la memoria **Heap**

```java
double pi = Math.PI;
```

```java
System.out.println(Integer.TYPE);
System.out.println(Integer.SIZE);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
```

## Variables

Tipos de datos primitivos

```java
System.out.println(" Enteros  : byte, short, int, long : int");
System.out.println(" Decimal  : float, double          : double");
System.out.println(" Caracter : char                   : char");//16 bits
System.out.println(" Boleano  : boolean                : boolean");
System.out.println(" Son 8 datos primitivos");
```

```java
String s3 = new String("Cat");
```

> Los datos primitivos se almacenan en la memoria **Heap** pero las clases y objetos se almacenan en la memoria **Stack**

Valores por default

```java
String str1;
int int1;
double double1;
boolean bool1;

System.out.println("String  : "+str1); //null
System.out.println("int     : "+int1); //0
System.out.println("double  : "+double1); //0.0
System.out.println("boolean : "+bool1); //false
```

Locales y globales

```java
import java.util.*;

public double global = 5;

public class Program {
  public static void main(String[] args) {
    double local = 10;
  }
}
```

## Entrada/Salida

```java
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int entero = sc.nextInt();
    double doble = sc.nextDouble();
    String linea = sc.nextLine();
    String cadena = sc.next();

    sc.close();
  }
}
```

> En ocasiones se debe usar **sc.next();** para hacer una pausa

```java
Scanner sc = new Scanner(System.in);

String hexadecimal = sc.next();//5f
int hex_decimal = Integer.parseInt(hexadecimal,16);
System.out.println("Hexadecimal a decimal: "+hex_decimal);//95

String octal = sc.next();//20
int oct_decimal = Integer.parseInt(octal,8);
System.out.println("Octal a decimal: "+oct_decimal);//16

String binary = sc.next();//1001
int bin_decimal = Integer.parseInt(binary,2);
System.out.println("Binario a decimal: "+bin_decimal);//9

sc.close();
```

```java
Scanner sc = new Scanner("1 car 2 bike 3 ship");

int a = sc.nextInt();
String a1 = sc.next();
int b = sc.nextInt();
String b1 = sc.next();
int c = sc.nextInt();
String c1 = sc.next();

System.out.println(a+". "+a1);
System.out.println(b+". "+b1);
System.out.println(c+". "+c1);

sc.close();
```

```java
Scanner sc = new Scanner("3 4  5   6");

while(sc.hasNext()) 
{
  System.out.println(sc.nextInt());
}

sc.close();
```

```java
Scanner sc = new Scanner(System.in);

String line;
while((line = sc.nextLine())!= null)
{
  System.out.println(line);
}

sc.close();
```

```java
String str = "hola";
System.out.format("Caracter: %c%n",str.charAt(0));
System.out.format("Cadena: %s%n",str);
System.out.println();

System.out.format("Entero: %d%n",1);
System.out.format("Flotante: %4.2f%n",3.1416);
System.out.format("Flotante sin ceros: %g%n",1.25000);
System.out.format("Flotante con presicion: %4.2f%n",3.1416);
System.out.format("Hexadecimal: %x%n", 93); // 5d
System.out.format("Octal %o%n", 93); // 135
```

## Decisión

```java
int a=5,b=10;
if (a > b) 
  System.out.println("A es mayor que B");
else 
  System.out.println("B es mayor que A");
```

> El operador **==** solo funciona para datos primitivos, para comparar objetos usa String.**equals**("algo")

Condición ternaria

```java
int a=5,b=10;
int c = (a > b)? a: b;
```

## Decisión múltiple

```java
int opc,a=10,b=5;

Scanner scan = new Scanner(System.in);
System.out.println("Elija una opcion");
System.out.println("1) Suma");
System.out.println("2) Resta");
System.out.println("3) Multiplicación");
System.out.println("4) División");
System.out.println("5) Modulo");
System.out.println("Otro) Salida");
String opc = scan.nextLine();
scan.close();

switch(opc)
{
 case 1:
  System.out.println("Suma " + (a+b));
 break;
 case 2:
  System.out.println("Resta " + (a-b));
 break;
 case 3:
  System.out.println("Multiplicación " + (a*b));
 break;
 case 4:
  System.out.println("División " + (a/b));
 break;
 case 5:
  System.out.println("Modulo " + (a%b));
 break;
 default:
  System.out.println("Salida");
}
```

## Ciclos

```java
for (String str: array)
    System.out.println(" " + str.toString());
```

```java
for(int cnt=0; cnt<5; cnt++)
    System.out.println(" " + cnt);
```

```java
int cnt = 0;
while (cnt < 5) { 
 System.out.println(" " + cnt); 
 cnt++; 
}
```

```java
int cnt = 0;
do {
 System.out.println(" " + cnt);
 cnt++;
} while (cnt < 5);
```

## Arreglos

```java
int[] a = new int[3];
int[] b = {0,1,2,3,4};

for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");

System.out.println();
```

```java
char a[] = "Hola mundo!".toCharArray();
System.out.println(a);

String b = "Hello World!";
int j = b.length();
for(int i=0; i<j; i++) System.out.print(b.charAt(i) + " ");

System.out.println();
```

## Cadenas

```c++
public class Program {
  public static void main(String[] args) {
    String str = "Hola Mundo!";

    //Busqueda
    int found = str.indexOf("Mundo");
    if (found == -1) System.out.println("No se encuentra");
    else System.out.println("Encontrado en la posicion "+found); //5

    //Longitud
    System.out.println(str.length()); //11

    //Substring
    System.out.println(str.substring(0, 4)); //Hola

    //Remplazar
    System.out.println(str.replace("Hola", "Hey")); //Hey Mundo!
  }
}
```

```java
public class Program {
  public static void main(String[] args) {
    int i = Integer.parseInt("5");
    double j = Float.parseFloat("4.89");

    System.out.println("i = "+i+" j = "+j); //i = 5 j = 4.89
    System.out.println("i + j = "+(i+j)); //i + j = 9.89
  }
}
```

## Apuntadores

> Java no interactua con la memoria del sistema por lo que no existen apuntadores en Java

## Referencias

Es una variable que apunta hacia otra variable, por lo que si la primera cambia la segunda también

```java
public class Program {
  public static void main(String[] args) {
    //Creamos variables
    String juan = "Juan";
    String pepe = "Pepe";
    //Copiamos el valor
    juan = pepe;
    pepe="Pepe Pecas";
    //Imprimimos
    System.out.println(juan);//Pepe

    //Creamos variables
    Nombre Juan = new Nombre("Juan");
    Nombre Pepe = new Nombre("Pepe");
    //Copiamos la referencia
    Juan = Pepe;
    Pepe.primer = "Pepe Pecas";
    //Imprimimos
    System.out.println(Juan);//Pepe Pecas
  }
}

class Nombre {
  public String primer;
  public Nombre(String primer) { this.primer = primer; }
  public String toString() {return primer;}
}
```

> En Java no existe el paso por referencia, el paso por valor (o por copia) es obligatorio. Sin embargo lo que se almacena en una variable no primitiva no es el objeto en sí sino una dirección o identificador del objeto en el espacio dinámico de memoria.

## Operador Modulo

Con la ayuda de este operador obtenemos el residuo de dos números

```java
public class Program {
  public static void main(String[] args) {
    int i,c[] = {5,6,7,8,9,10};
    System.out.println("Residuo de m=5 c={5,6,7,8,9,10}");
    for(i=0;i<6;i++) System.out.print(c[i]%5+" "); //0 1 2 3 4 0
    System.out.println("");
  }
}
```

## Operadores de bits

```java
public class Program {
  public static void main(String[] args) {
    int i,j;

    //Desplazamiento a la izq
    i = 2  ;  // 000010 = 2 (Dec)
    i = i<<2; // 001000 = 8 (Dec) 
    System.out.format("4 con desplazamiento de 2 bits izq = %d%n",i);

    //Desplazamiento a la der
    i = 8;    // 001000 = 8 (Dec)
    i = i>>1; // 000100 = 4 (Dec)
    System.out.format("8 con desplazamiento de 1 bit der = %d%n",i);

    //Operador & (AND)
    i = 5;   // 0101 = 5 (Dec)
    j = 3;   // 0011 = 3 (Dec)
    //i & j  == 0001 = 1 (Dec)
    System.out.format("5 AND 3 = %d%n",i&j);

    //Operador | (OR)
    i = 5;   // 0101 = 5 (Dec)
    j = 3;   // 0011 = 3 (Dec)
    //i | j  == 0111 = 7 (Dec)
    System.out.format("5 OR 3 = %d%n",i|j);

    //Operador ^ (XOR)
    i = 5;   // 0101 = 5 (Dec)
    j = 3;   // 0011 = 3 (Dec)
    //i ^ j  == 0110 = 6 (Dec)
    System.out.format("5 XOR 3 = %d%n",i^j);
  }
}
```

## Funciones

```java
import java.util.Scanner;

public class prueba2 {
  public static void main(String[] args) {
    int numero,cuadrado;
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un número positivo: ");
    numero = sc.nextInt();

    cuadrado = Potencia(numero);

    System.out.println("Numero: "+numero);
    System.out.println("Cuadrado: "+cuadrado);
    sc.close();
  }

  static int Potencia(int numero)
  {
    return numero*numero;
  }
}
```

## Clases

```java
public class Program {
  public static void main(String[] args) {
    System.out.println("Estudiante Alvaro...");
    Estudiante Alvaro;

    System.out.println("Estudiante pSid = new Estudiante...");
    Estudiante pSid = new Estudiante();

    System.out.println("delete pSid...");
    pSid.finalize();

    System.out.println("Terminando la demostración...");
  }
}

class Estudiante {
  private int boleta;
    
  //Definimos al constructor
  public Estudiante() {
    System.out.println("Llamando al constructor.");
    boleta = 108;
  }
    
  //Definimos el destructor
  public void finalize() {
    System.out.println("Llamando al destructor.");
  }
    
}
```

## Autores

* **Angel González** - [mgrc45](https://github.com/mgrc45)

Vea también la lista de [contribuyentes](CONTRIBUTORS) que participaron en este proyecto.

## Licencia

Este proyecto está licenciado bajo la licencia GNU General Public License v2.0. Consulte el archivo [licencia](LICENSE) para obtener más información.

## Referencias

* OCA Java SE 8 Programmer I Exam Guide (Exams 1Z0-808)

## Notas

Esta guía fue realizada para aprender rápidamente Java, por lo que no se incluyen temas como son Herencia, Encapsulamiento, Polimorfismo, Conversiones entre bases, Casteo u Operaciones matemáticas. Úsese bajo su propio riesgo y nunca en exámenes.
