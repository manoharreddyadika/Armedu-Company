package com.example.armedu.printmatrix;

public class RotateMatrix {
   
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

      
        int layers = n / 2;

        for (int layer = 0; layer < layers; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                
           
                int top = matrix[first][i];

              
                matrix[first][i] = matrix[last - offset][first];

              
                matrix[last - offset][first] = matrix[last][last - offset];

              
                matrix[last][last - offset] = matrix[i][last];

               
                matrix[i][last] = top;
            }
        }
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

  
    public static void main(String[] args) {
        int[][] mat = {
        		
        		{7, 8, 9},
        	
                {4, 5, 6},
                {7, 8, 9}
            
        };

        System.out.println("Input Matrix:");
        printMatrix(mat);

        rotate(mat);

        System.out.println("\nOutput Matrix (after rotating 90 degrees clockwise):");
        printMatrix(mat);
    }
}

