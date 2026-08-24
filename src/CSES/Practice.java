package CSES;

import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        int[][]arr = {
                {9,2,7,8},
                {6,4,3,7},
                {5,8,1,8},
                {7,6,9,4}
        };
        int n = arr.length;

        //int ans = rec(n-1,arr,0);
//        int[][]dp = new int[n][(int)Math.pow(2, 30)];
//        for(int[] x : dp) Arrays.fill(x, -1);

       // int ans =  memo(dp ,n-1, arr, 0);

        int ans = tabu(arr);
        System.out.println(ans);
    }


    public static int tabu(int[][] arr) {
        int n = arr.length;
        int px = 1 << n;

        int[][] dp = new int[n][px];

        // Base case: ind = 0
        for (int set = 0; set < px; set++) {
            for (int col = 0; col < n; col++) {
                if ((set & (1 << col)) == 0) {
                    dp[0][set] = arr[0][col];
                    break;
                }
            }
        }

        // ind goes from 1 -> n-1
        for (int ind = 1; ind < n; ind++) {
            for (int set = 0; set < px; set++) {
                int ans = Integer.MAX_VALUE;
                for (int col = 0; col < n; col++) {

                    if ((set & (1 << col)) == 0) {
                        int newSet = set | (1 << col);
                        ans = Math.min(ans, arr[ind][col] + dp[ind - 1][newSet]
                        );
                    }
                }
                dp[ind][set] = ans;
            }
        }
        return dp[n - 1][0];
    }



    

    public static int memo(int[][]dp,int ind, int[][]arr,int set){        // dont work
        if(ind == 0){
            for(int i=0; i<arr.length; i++){
                if((set & (1 << i)) == 0) {
                    return arr[0][i];
                }
            }
        }

        if(dp[ind][set] != -1) return dp[ind][set];

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if((set & (1 << i)) == 0){
                set |= (1 << i);
                ans = Math.min(ans, arr[ind][i]+memo(dp,ind-1, arr, set));
                set ^= (1 << i);
            }
        }
        return dp[ind][set] = ans;
    }


    public static int rec(int ind, int[][]arr,int set){
        if(ind == 0){
            for(int i=0; i<arr.length; i++){
               if((set & (1 << i)) == 0) {
                   return arr[0][i];
               }
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if((set & (1 << i)) == 0){
                set |= (1 << i);
                ans = Math.min(ans, arr[ind][i]+rec(ind-1, arr, set));
                set ^= (1 << i);
            }
        }
        return ans;
    }
}
