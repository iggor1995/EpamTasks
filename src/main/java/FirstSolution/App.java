package FirstSolution;

import MatrixAct.MatrixMultiplication;
import MatrixAct.MatrixOperations;
import MatrixConsole.DrawMatrix;
import MatrixGenerator.MatrixGenerator;
import MatrixPack.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        App app = new App();
        int firstMatrixHeight;
        int firstMatrixWidth;
        int secondMatrixHeight;
        int secondMatrixWidth;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input height of the first matrix");
        firstMatrixHeight = Integer.parseInt(reader.readLine());

        System.out.println("Input width of the first matrix");
        firstMatrixWidth = Integer.parseInt(reader.readLine());

        System.out.println("Input height of the second matrix");
        secondMatrixHeight = Integer.parseInt(reader.readLine());

        System.out.println("Input width of the second matrix");
        secondMatrixWidth = Integer.parseInt(reader.readLine());

        if (firstMatrixWidth != secondMatrixHeight) {
            System.out.println("Unable to multiply");
            return;
        }

        Matrix matrix1 = MatrixGenerator.generateMatrix(firstMatrixHeight, firstMatrixWidth);
        Matrix matrix2 = MatrixGenerator.generateMatrix(secondMatrixHeight, secondMatrixWidth);

        if(matrix1 == null || matrix2 == null) return;

        System.out.println("first matrix");
        DrawMatrix.drawMatrix(matrix1);
        System.out.println("second matrix");
        DrawMatrix.drawMatrix(matrix2);
        System.out.println("result matrix");
        MatrixOperations matrixOperations = new MatrixMultiplication();
        DrawMatrix.drawMatrix(matrixOperations.operateMatrix(matrix1, matrix2));


    }
}
    /*public void matrixFill(int[][] matrix1){
        for(int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                double d = Math.random();
                matrix1[i][j] = (int)(d * 10 + 1);
            }
        }
    }*/

   /* public void drawMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.print("|");
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println();
    }*/

   /* public int[][] multiply(int[][] matrix1, int[][] matrix2){

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for(int i = 0; i < result.length; i++) {           //result columns
            for (int j = 0; j < result[0].length; j++) {      //result strings
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {       //matrix1 strings
                    result[i][j] += matrix1[i][k] * matrix2[k][j];   //one cell result
                }
            }
        }

        return result;
    }
}*/
