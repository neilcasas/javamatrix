import java.util.Scanner;
public class Matrix {
    static Scanner scan = new Scanner(System.in);

    private final int max = 20; // maximum row and column value
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

    // Add element to matrix based on row col location
    public void append(int row, int column, int value){
        this.matrix[row][column] = value;
    }

    // Fills up new matrix
    public void fill(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.printf("Enter value for position %d,%d: ", i, j);
                this.matrix[i][j] = scan.nextInt();
            }
        }
    }

    // Display each element of the matrix
    public void display(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.printf("%2d", this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Determine if square matrix or not
    public boolean isSquareMatrix(){
        return this.rows == this.columns;
    }

    // Multiply matrix with scalar quantity
    public void scalarMultiply(int value){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                this.matrix[i][j] *= value;
            }
        }
    }

    // Returns true if two matrices are equal
    public boolean equals(Matrix other){
        if(this.rows != other.rows || this.columns != other.columns){
            return false;
        } else {
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.columns; j++){
                    if (this.matrix[i][j] != other.matrix[i][j]) return false;
                }
            }
        }
        return true;
    }

    // Adds two matrices and stores values in this matrix
    public void add(Matrix other){
        if(this.rows == other.rows && this.columns == other.columns){
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.columns; j++){
                    this.matrix[i][j] += other.matrix[i][j];
                }
            }
        }
    }

    // Subtracts two matrices and stores values in this matrix
    public void subtract(Matrix other){
        if(this.rows == other.rows && this.columns == other.columns){
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.columns; j++){
                    this.matrix[i][j] -= other.matrix[i][j];
                }
            }
        }
    }

    // Creates a transposed matrix
    public Matrix transpose(){
        Matrix transposed = new Matrix(this.columns, this.rows);
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                transposed.matrix[j][i] = this.matrix[i][j];
            }
        }
        return transposed;
    }
    
}