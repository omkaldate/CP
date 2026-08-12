package InfosysOA;


import java.util.Arrays;

public class MaximumSubarraySumWithOneDeletionQ2Om {
    public static void main(String[] args){

        int n = 6;
        int[]arr = {2,5,-3,6,-3,4};

 //       int ans = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){            // recursion
//             ans =Math.max(ans, rec(arr, i, 0));
//        }

//        int[][]dp =  new int[n][2];         // memoization
//        for(int[]x : dp) Arrays.fill(x,Integer.MAX_VALUE);
//
//        for(int i=0; i<n; i++){
//             ans =Math.max(ans, memo(dp,arr, i, 0));
//        }

         int ans = tabu(arr);
        System.out.println(ans);
    }



    public static int tabu(int[]arr){
        int n =  arr.length;

        int[][]dp = new int[n+1][2];

        dp[0][0] = 0;
        dp[0][1] = 0;

        for(int ind=1; ind<=n; ind++){
            for(int used =0; used<=1; used++){
                int a = Integer.MIN_VALUE;
                int b = Integer.MIN_VALUE;
                int c = Integer.MIN_VALUE;

                if(used == 1) a = arr[ind-1] + dp[ind-1][1];
                else{
                    b = arr[ind-1] + dp[ind-1][0];
                    c = ~arr[ind-1]+dp[ind-1][1];
                }
                int calls = Math.max(a, Math.max(b,c));
                int curIndex = arr[ind-1];

                dp[ind][used] = Math.max(calls, curIndex);
            }
        }
        return Math.max(dp[n][0] , dp[n][1]);
    }


    public static int memo(int[][]dp,int[]arr, int ind, int used){
        if(ind == -1) return 0;

        if(dp[ind][used] != Integer.MAX_VALUE) return dp[ind][used];
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        if(used == 1){
            a = arr[ind] + memo(dp,arr,ind-1, 1);
        }
        else{
            b = arr[ind] + memo(dp,arr, ind - 1, 0);
            c = ~arr[ind] + memo(dp,arr,ind-1,1);
        }

        int calls=  Math.max(a, Math.max(b,c));
        int curIndex = arr[ind];

        return dp[ind][used] =  Math.max(calls, curIndex);
    }










    public static int rec(int[]arr, int ind, int used){
        if(ind == -1) return 0;

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        if(used == 1){
            a = arr[ind] + rec(arr,ind-1, 1);
        }
        else{
            b = arr[ind] + rec(arr, ind - 1, 0);
            c = ~arr[ind] + rec(arr,ind-1,1);
        }

        int calls=  Math.max(a, Math.max(b,c));
        int curIndex = arr[ind];

        return Math.max(calls, curIndex);
    }
}
