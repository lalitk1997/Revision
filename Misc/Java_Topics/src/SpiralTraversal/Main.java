package SpiralTraversal;

import java.util.Arrays;

public class Main {

    public static void iterateSpiral(int row, int col, int[][] arr){
        int dir = 1;
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;

        while(left <= right && top <= bottom){

            // Top to down (i=0<->row-1, j=0)
            if(dir == 1){
                for(int i=top; i<=bottom; i++){
                     System.out.print(arr[i][left]+" ");
                     // System.out.println(i+" "+left);
                }
                left += 1;
                dir = 2;
            }

            // Left to right (i=row-1, j=0<->col-1)
            if(dir == 2){
                for(int i=left; i<=right; i++){
                     System.out.print(arr[bottom][i]+" ");
                    // System.out.println(bottom+" "+i);
                }
                bottom -= 1;
                dir = 3;
            }

            // Bottom to top
            if(dir == 3){
                for(int i=bottom; i>=top; i--){
                     System.out.print(arr[i][right]+" ");
                    // System.out.println(i+" "+right);
                }
                right -= 1;
                dir = 4;
            }

            // Right to left
            if(dir == 4){
                for(int i=right; i>=left; i--){
                     System.out.print(arr[top][i]+" ");
                    // System.out.println(i+" "+top);
                }
                top += 1;
                dir = 1;
            }
        }
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
        for(int i=0; i<4; i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        iterateSpiral(4, 4, nums);
    }
}
