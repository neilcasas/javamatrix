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
            this.matrix = new int[rows][columns];
        } else {
            throw new IllegalArgumentException("Invalid matrix dimension.");
        }
    }
    public Matrix() {
        this.matrix = new int[3][3];
    }

    // Methods
    public void display(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.printf("%2d", this.matrix[i][j]);
            }
            System.out.println();
        }
    }
    public boolean isSquareMatrix(){
        return this.rows == this.columns;
    }
    public void append(int row, int column, int value){
        this.matrix[row][column] = value;
    }

}