package curso;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        
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
    }
    
    public static void read0() 
    {
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
    }
    
    public static void read1() 
    {
        Scanner sc = new Scanner("3 4  5   6");
        
        while(sc.hasNext()) 
        {
            System.out.println(sc.nextInt());
        }
        
        sc.close();
    }
    
    public static void read2() 
    {
        Scanner sc = new Scanner(System.in);
        
        String line;
        while((line = sc.nextLine())!= null)
        {
            System.out.println(line);
        }
        
        sc.close();
    }
}
