package MatrixAct;

import MatrixPack.Matrix;

/**
 * Created by User on 10.06.2017.
 */
public class MatrixMultiplication implements MatrixOperations{
    public Matrix operateMatrix(Matrix matrix1, Matrix matrix2) {
        int[][] result = new int[matrix1.getMatrixHeight()][matrix2.getMatrixWidth()];

        for(int i = 0; i < result.length; i++) {           //result columns
            for (int j = 0; j < result[0].length; j++) {      //result strings
                result[i][j] = 0;
                for (int k = 0; k < matrix1.getMatrixWidth(); k++) {       //matrix1 strings
                    result[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];   //one cell result
                }
            }
        }

        Matrix resultMatrix = new Matrix(matrix1.getMatrixHeight(), matrix2.getMatrixWidth());
        resultMatrix.setMatrix(result);

        return resultMatrix;
    }
}
