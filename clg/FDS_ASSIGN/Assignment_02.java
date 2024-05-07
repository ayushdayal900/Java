package clg.FDS_ASSIGN;
import java.util.Scanner;

class TransposeSparseMatrix {
    static SparseMatrix[] convertToSparse(int[][] matrix, int rowCount, int colCount) {
        int nonZeroCount = 0;

        // Counting non-zero elements
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] != 0)
                    nonZeroCount++;
            }
        }

        SparseMatrix[] sparseMatrix = new SparseMatrix[nonZeroCount + 1];
        sparseMatrix[0] = new SparseMatrix(rowCount, colCount, nonZeroCount);

        int k = 1;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] != 0) {
                    sparseMatrix[k] = new SparseMatrix(i, j, matrix[i][j]);
                    k++;
                }
            }
        }

        return sparseMatrix;
    }

    static void printSparseMatrix(SparseMatrix[] sparseMatrix) {
        System.out.println("Sparse Matrix Representation:");
        for (SparseMatrix sparse : sparseMatrix) {
            System.out.println(sparse.row + " " + sparse.col + " " + sparse.value);
        }
    }

    static void simpleTranspose(SparseMatrix[] sparseMatrix) {
        System.out.println("Simple Transpose:");
        for (int i = 1; i < sparseMatrix[0].value + 1; i++) {
            System.out.println(sparseMatrix[i].col + " " + sparseMatrix[i].row + " " + sparseMatrix[i].value);
        }
    }


    static void fastTranspose(SparseMatrix[] sparseMatrix) {
        int rowCount = sparseMatrix[0].row;
        int colCount = sparseMatrix[0].col;
        int termCount = sparseMatrix[0].value;

        int[] rowTerms = new int[colCount];
        int[] startingPos = new int[colCount];

        SparseMatrix[] transposedMatrix = new SparseMatrix[termCount + 1];
        transposedMatrix[0] = new SparseMatrix(colCount, rowCount, termCount);

        if (termCount > 0) {
            for (int i = 0; i < colCount; i++) {
                rowTerms[i] = 0;
            }
            for (int i = 1; i <= termCount; i++) {
                rowTerms[sparseMatrix[i].col]++;
            }
            startingPos[0] = 1;
            for (int i = 1; i < colCount; i++) {
                startingPos[i] = startingPos[i - 1] + rowTerms[i - 1];
            }
            for (int i = 1; i <= termCount; i++) {
                int j = startingPos[sparseMatrix[i].col]++;
                transposedMatrix[j] = new SparseMatrix(sparseMatrix[i].col, sparseMatrix[i].row, sparseMatrix[i].value);
            }
        }
        System.out.println("Fast Transpose:");
        for (SparseMatrix sparse : transposedMatrix) {
            System.out.println(sparse.row + " " + sparse.col + " " + sparse.value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        SparseMatrix[] sparseMatrix = convertToSparse(matrix, rows, columns);
        printSparseMatrix(sparseMatrix);
        simpleTranspose(sparseMatrix);
        fastTranspose(sparseMatrix);
    }
}

class SparseMatrix {
    int row, col, value;

    SparseMatrix(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
}
