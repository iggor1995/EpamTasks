package MatrixConsole;

import MatrixPack.Matrix;

public class DrawMatrix {
    public static void drawMatrix(Matrix matrix){

        for(int i = 0; i < matrix.getMatrixHeight(); i++){
            System.out.print("|");
            for (int j = 0; j < matrix.getMatrixWidth(); j++){
                System.out.print(matrix.getMatrix()[i][j] + "  ");
            }
            System.out.print("|\n");
        }
        System.out.println();
    }
}
