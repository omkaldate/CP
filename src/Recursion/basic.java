package Recursion;

import java.util.ArrayList;

public class basic {

    public static void main(String[] args) {
        int[][]mat = new int[4][4];

        int ans =  fun(mat, 0);
        System.out.println(ans);

    }


   public static int fun(int[][]matrix, int row){
        if(row >= matrix.length) return 1;

        int ans =0;
        for(int i=0; i<matrix[0].length; i++){
            if(isSafe(matrix,row,i)) {
                matrix[row][i] = 1;
                ans += fun(matrix, row + 1);
                matrix[row][i] = 0;
            }
        }
        return ans;
   }

   public static boolean isSafe(int[][]mat, int row, int col){

        for(int i=0; i<= row; i++){
            if(mat[i][col] == 1) return false;
        }

        int r = row;
        int c = col;
        while(r >=0 && c >= 0){
            if(mat[r][c] == 1) return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while( r>=0 && c <mat[0].length){
            if(mat[r][c] == 1) return false;
            r--;
            c++;
        }

        return true;

   }




















   public static void swap(int[]arr, int a, int b){
        int v1 =  arr[a];
        arr[a] = arr[b];
        arr[b] = v1;
   }
}
