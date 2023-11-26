package com.example.armedu.matrixmultiplication;

public class MatrixMultiplication {
    
    public static void main(String[] args) {
        int[][] A = generateMatrix(250, 250);
        int[][] B = generateMatrix(250, 250);

        long startTime, endTime;

        // Naive Method
        startTime = System.currentTimeMillis();
        int[][] resultNaive = multiplyMatricesNaive(A, B);
        endTime = System.currentTimeMillis();
        long naiveTime = endTime - startTime;
        System.out.println("Naive time: " + (naiveTime / 1000.0) + "s");

        // Strassen's Method
        startTime = System.currentTimeMillis();
        int[][] resultStrassen = multiplyMatricesStrassen(A, B);
        endTime = System.currentTimeMillis();
        long strassenTime = endTime - startTime;
        System.out.println("Strassen's time: " + (strassenTime / 1000.0) + "s");
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        // For simplicity, fill matrix with some values (e.g., 1)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatricesNaive(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static int[][] multiplyMatricesStrassen(int[][] A, int[][] B) {
        
        return null; 
    }
}


