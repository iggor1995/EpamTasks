package MatrixGenerator;

import MatrixPack.Matrix;

/**
 * Created by User on 10.06.2017.
 */
public class MatrixGenerator {
    public static Matrix generateMatrix(int matrixHeight, int matrixWidth){

        if(matrixHeight < 0 || matrixWidth < 0){
            System.out.println("unable to generate matrix due to negative dim");
            return null;
        }

        Matrix generatedMatrix = new Matrix(matrixHeight, matrixWidth);
        for(int i = 0; i < matrixHeight; i++){
            for (int j = 0; j < matrixWidth; j++){
                double d = Math.random();
                generatedMatrix.getMatrix()[i][j] = (int)(d * 20 - 10);
            }
        }

        return generatedMatrix;
    }
}
