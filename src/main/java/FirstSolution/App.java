package FirstSolution;

import MatrixAct.MatrixMultiplication;
import MatrixAct.MatrixOperations;
import MatrixConsole.DrawMatrix;
import MatrixGenerator.MatrixGenerator;
import MatrixPack.Matrix;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        int firstMatrixHeight;
        int firstMatrixWidth;
        int secondMatrixHeight;
        int secondMatrixWidth;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input height of the first matrix"); //******enter dimensions*****
        firstMatrixHeight = Integer.parseInt(reader.readLine());

        System.out.println("Input width of the first matrix");
        firstMatrixWidth = Integer.parseInt(reader.readLine());

        System.out.println("Input height of the second matrix");
        secondMatrixHeight = Integer.parseInt(reader.readLine());

        System.out.println("Input width of the second matrix");
        secondMatrixWidth = Integer.parseInt(reader.readLine());
                                                                    //*****check matrix
        if (firstMatrixWidth != secondMatrixHeight) {
            System.out.println("Unable to multiply");
            return;
        }
//************

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
