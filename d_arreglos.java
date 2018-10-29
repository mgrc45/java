package curso;
//El valor maximo del arreglo es n-1
//Los arreglos son tratados como objetos por lo que se envia a la memoria Heap
public class d_arreglos {
    
    public static void main(String[] args) {
        int[] ages = new int[3];
        int[] ages1 = {18,19,20};
        
        StringBuilder[] column = new StringBuilder[2];
        StringBuilder[] column1 = {new StringBuilder(), new StringBuilder()};
        
        StringBuilder[] column2;
        column2 = new StringBuilder[2];
        column2[0] = new StringBuilder(); column2[0].append('A');
        column2[1] = new StringBuilder(); column2[1].append('B');
        
        int[][] intTable;
        intTable = new int[4][3];
        
        int[][] yearSales = new int[5][4];
        int yearSales2[][] = new int[5][4];
        int[] yearSales3[] = new int[5][4];
    }

}