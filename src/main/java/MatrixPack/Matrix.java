package MatrixPack;

/**
 * Created by User on 10.06.2017.
 */
public class Matrix {

    private int matrixHeight;
    private int matrixWidth;
    private  int[][] matrix;
    public Matrix(int matrixHeight, int matrixWidth){
        this.matrixHeight = matrixHeight;
        this.matrixWidth = matrixWidth;
        matrix = new int[matrixHeight][matrixWidth];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getMatrixHeight() {
        return matrixHeight;
    }

    public int getMatrixWidth() {
        return matrixWidth;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}
