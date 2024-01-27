public class Matrix {
    private final int max = 20;
    private int rows;
    private int columns;
    private int[][] matrix;

    // Constructor
    public Matrix(int rows, int columns){
        if(rows <= max && columns <= max){
            this.rows = rows;
            this.columns = columns;
            matrix = new int[rows][columns];
        } else {
            throw new IllegalArgumentException("Invalid matrix dimension.");
        }
    }
    public Matrix() {
        matrix = new int[3][3];
    }

    // Methods
    public void displayMatrix(Matrix matrix){
        
    }
    public boolean isSquareMatrix(Matrix matrix){
        return this.rows == this.columns;
    }


}