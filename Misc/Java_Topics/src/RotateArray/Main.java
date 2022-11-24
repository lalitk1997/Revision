package RotateArray;

import java.util.Arrays;

public class Main {
    
    public static int[][] rotateMatrix(int row, int col, int[][] matrix){

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        // Transpose of matrix
        for(int i=0; i<row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse column of matrix
        int fptr = 0;
        int rptr = row-1;
        while(fptr <= rptr){
           for (int i=0; i<col; i++){
               int temp = matrix[fptr][i];
               matrix[fptr][i] = matrix[rptr][i];
               matrix[rptr][i] = temp;
           }
           fptr += 1;
           rptr -= 1;
        }
        // Printing the matrix
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        int temp = 1;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = temp;
                temp += 1;
            }
        }
//        System.out.println(Arrays.deepToString(nums));
//        for(int i=0; i<4; i++){
//            System.out.println(Arrays.toString(nums[i]));
//        }
        rotateMatrix(4, 4, nums);
    }
}
