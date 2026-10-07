import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        //Declaración
        int[][] matrix;
        //Intanciación
        matrix = new int[10][10];


        for (int fila = 0; fila < matrix.length; fila++){
            for (int col = 0; col < matrix[0].length; col++){
                matrix[fila][col] = 1;
            }
        }
        matrix[0][4] = 8;
        matrix[2][6] = 8;
        matrix[3][1] = 8;
        matrix[8][6] = 8;
        for (int fila = 0; fila < 10; fila++){
            for (int col = 0; col < 10; col++){
                System.out.print(matrix[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
