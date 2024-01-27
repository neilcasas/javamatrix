public class Matrix {
    private final int max = 20;
    private int rows;
    private int columns;
    private int[][] matrix;

    // Constructor
    public Matrix(int rows, int columns){
        if(rows <= max && columns <= max){
            matrix = new int[rows][columns];
        } else {
            throw new IllegalArgumentException("Invalid matrix dimension.");
        }
    }
    public Matrix() {
        matrix = new int[3][3];
    }

    
}