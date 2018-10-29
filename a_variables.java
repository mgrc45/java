package curso;
// Java es un lenguaje "fuertemente tipado"
// Java es un lenguaje "case sesitive"
public class a_variables {
    public static String str1;
    public static int int1;
    public static double double1;
    public static boolean bool1;
    final public float pi = 3.141592F; //Valor estatico
    
    public static void main(String[] args) {
        System.out.println("Valores por default");
        System.out.println(" String  : "+str1); //null
        System.out.println(" int     : "+int1); //0
        System.out.println(" double  : "+double1); //0.0
        System.out.println(" boolean : "+bool1); //false
        System.out.println("");
        
        System.out.println("Tipos de datos primitivos");
        System.out.println(" Enteros  : byte, short, int, long : int");
        System.out.println(" Decimal  : float, double          : double");
        System.out.println(" Caracter : char                   : char");//16 bits
        System.out.println(" Boleano  : boolean                : boolean");
        System.out.println(" Son 8 datos primitivos");
        System.out.println("");
        
        System.out.println("Declaracion de variables");
        System.out.println(" byte    valBin = 0B10;"); byte valBin = 0B10; //Notacion para binarios
        System.out.println(" int     valHex = 0x1A;"); int valHex = 0x1A; //Notacion para hexadecimal
        System.out.println(" int     valOct = 0x1A;"); int valOct = 0_52; //Notacion para octal
        System.out.println(" int     pi = 3.14_15F;"); float pi = 3.14_15F; //Notacion con guion correcto
        System.out.println(" int     pi2 = 3.14_____15F;"); float pi2 = 3.14_____15F; //Notacion con guion correcto
        //System.out.println(" int     pi3 = 3.14_____15F;"); float pi3 = 3.1415F; //Notacion con guion incorrecto
        System.out.println(" int     a = 2_345_678;"); int a = 2_345_678;
        System.out.println(" long    b = 900L;"); long b = 900L;
        System.out.println(" double  c = 2.1E12;"); double c = 2.1E12;
        System.out.println(" double  d = 75.0D;"); double d = 75.0D;
        System.out.println(" float   e = 75.0F;"); float e = 75.0F;
        System.out.println(" char unicode = '\u2133';"); char unicode = '\u2133';
        //System.out.println(" char unicode = 0x2133;"); char unicode = 0x2133;
        //System.out.println(" char unicode2 = 0x2133;"); char unicode2 = 0b0101;
        //System.out.println(" Test: " + Integer.toOctalString(valOct) + " : " + Integer.toString(valOct,8));
        System.out.println("");
        
        System.out.println("Promoción y casteo");
        System.out.println("Promoción: Incremento de tipo");
        System.out.println(" long intToLong = 5;"); long intToLong = 5;
        System.out.println(" double floatToDouble = 75.0F;"); double floatToDouble = 75.0F;
        System.out.println("Casteo o casting: Disminución de tipo con riezgo de perdida de información");
        System.out.println(" int longToInt = (int)20L;"); int longToInt = (int)20L;
        System.out.println(" float doubleToFloat = (float)3.0D;"); float doubleToFloat = (float)3.0D;
        System.out.println("");
        //Fuente : D83527GC10_sg1.pdf - 285 - Converting Data Values
        
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        System.out.println("s1 == s2 : " + (s1 == s2)); //Es un dato primitivo por lo que ambos estan en Heap
        System.out.println("s1 == s3 : " + (s1 == s3)); //Falso por que es una clase y esta en memoria Stack
        
        int i1 = 10;
        int i2 = 10;
        float f3 = 10.0F;
        System.out.println("i1 == i2 : " + (i1 == i2));
        System.out.println("i1 == i3 : " + (i1 == f3));
    }
    
}
