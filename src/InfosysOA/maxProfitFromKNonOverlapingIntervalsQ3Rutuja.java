package InfosysOA;

import java.util.Arrays;

public class maxProfitFromKNonOverlapingIntervalsQ3Rutuja {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int m = 3;

        int[][]arr = {
                {1,4,10},
                {5,7,20},
                {10,12,35},
                {11,15,40}
        };

        Arrays.sort(arr , (a, b) ->{
            return Integer.compare(a[0],b[0]);
        });

        //int ans = rec(arr,n-1, k,m,n);
       // int ans = rec1(arr,n, k, m);

//        int[][]dp = new int[n+1][k+1];
//        for(int[]x : dp) Arrays.fill(x,-1);
//        int ans = memo(dp,arr,n,k,m);

        //int ans = tabu(arr,k,m);




      //  int ans = opti(arr,k,m);       // need optimization bcz this code is N*N*k
        //System.out.println(ans);
    }





    public static int tabu(int[][] arr, int K, int m) {
        int n = arr.length;

        int[][] dp = new int[n + 1][K + 1];
        for (int last = 0; last <= n; last++) dp[last][0] = 0;

        for (int last = 0; last <= n; last++) {
            for (int cnt = 1; cnt <= K; cnt++) {

                int take = Integer.MIN_VALUE;

                for (int ind = last - 1; ind >= 0; ind--) {
                    if (last == n || (arr[ind][1] <= arr[last][0] && (arr[last][0] - arr[ind][1]) % m == 0)) {
                        int x = arr[ind][2] + dp[ind][cnt - 1];
                        take = Math.max(take, x);
                    }
                }
                dp[last][cnt] = take;
            }
        }
        return dp[n][K];
    }


    public static int memo(int[][]dp,int[][]arr,int last, int k, int m){
        if(k ==0) return 0;
        if(dp[last][k] != -1) return dp[last][k];

        int take = Integer.MIN_VALUE;
        for(int ind = last-1; ind >=0; ind-- ){
            if(last == arr.length || (arr[ind][1] <= arr[last][0]  &&  (arr[last][0] - arr[ind][1]) %m == 0)){
                int x = arr[ind][2] + memo(dp,arr,ind,k-1,m);
                take = Math.max(take, x);
            }
        }
        return dp[last][k] =  take;
    }



    public static int rec1(int[][]arr,int last, int k, int m){
        if(k ==0) return 0;

        int take = Integer.MIN_VALUE;
        for(int ind = last-1; ind >=0; ind-- ){
            if(last == arr.length || (arr[ind][1] <= arr[last][0]  &&  (arr[last][0] - arr[ind][1]) %m == 0)){
                int x = arr[ind][2] + rec1(arr,ind,k-1,m);
                take = Math.max(take, x);
            }
        }
        return take;
    }



    public static int rec(int[][]arr,int ind, int k, int m,int lastInd){
        if(k == 0) return 0;
        if(ind == -1) return Integer.MIN_VALUE;

        int notTake = rec(arr,ind-1,k,m,lastInd);
        int take = Integer.MIN_VALUE;

        if(lastInd == arr.length || (arr[lastInd][0]-arr[ind][1]) %m ==0 ){
            take =arr[ind][2]+ rec(arr,ind-1,k-1,m,ind);
        }
        return Math.max(take,notTake);
    }
}
