package CSES;


import java.util.Scanner;
public class ArrayDescriotionme {
    public static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[]arr = new int[n];

//        int n = 3;
//        int m = 5;
//        int[]arr =  {2,0,2};

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        // int ans = rec(m,n-1,arr);  // rec
        int ans = tabu(m,arr);    // tabu
        //int ans =  spaceOp(m,arr);  // spaceOp


        System.out.println(ans % mod);
    }

    public static int spaceOp(int m, int[]arr){
        int n = arr.length;
        int[]dp = new int[m+1];

        if(arr[0] == 0) {
            for(int i = 1; i <= m; i++) dp[i] = 1;
        }
        else dp[arr[0]] = 1;

        for(int ind = 1; ind <= n; ind++) {
            int[]cur = new int[m+1];
            for (int mx = 1; mx <= m; mx++) {

                int a = dp[mx-1];
                int b = dp[mx];
                int c = 0;
                if(mx+1 <= m) c = dp[mx+1];

                if(arr[ind-1] == 0){
                    cur[mx] = (a+b+c)%mod;
                }
                else{
                    if(mx == arr[ind-1]){
                        cur[mx] = (a+b+c)%mod;
                    }
                }
            }
            dp = cur;
        }

        int ans = 0;
        if(arr[n-1] == 0){
            for(int i=0; i<=m; i++){
                ans += dp[i] % mod;
                ans %= mod;
            }
            return ans;
        };
        return dp[arr[n-1]] % mod;
    }




    public static int tabu(int m, int[]arr){
        int n = arr.length;
        int[][]dp = new int[n][m+1];

        if(arr[0] == 0) {
            for(int i = 1; i <= m; i++) dp[0][i] = 1;
        }
        else dp[0][arr[0]] = 1;

        for(int ind = 1; ind < n; ind++) {
            for (int mx = 1; mx <= m; mx++) {

                int a = dp[ind-1][mx-1];
                int b = dp[ind-1][mx];
                int c = 0;
                if(mx+1 <= m) c = dp[ind-1][mx+1];

                if(arr[ind] == 0) dp[ind][mx] =(int) (1L*a+b+c)%mod;
                else{
                    if(mx == arr[ind]){
                        dp[ind][mx] = (int)(1L*a+b+c)%mod;
                    }
                }
            }
        }


        long ans = 0;

        for(int i = 1; i <= m; i++){

            ans += dp[n-1][i];
            ans %= mod;
        }

        return (int)ans;
    }




    public static int rec(int m, int ind, int[]arr){
        if(ind == -1) return 1;

        if(arr[ind] != 0){
            if(ind < arr.length-1) {
                if (Math.abs(arr[ind] - arr[ind + 1]) <= 1) return rec(m, ind - 1, arr)%mod;
                else return 0;
            }

            return rec(m,ind-1,arr)%mod;
        }

        int sum =0;

        for(int i=1; i<=m; i++){
            if(ind +1 < arr.length){
                if(Math.abs(arr[ind+1] - i ) <= 1){
                    arr[ind] = i;
                    sum += rec(m,ind-1,arr)%mod ;
                    arr[ind] = 0;
                    sum %= mod;
                }
            }
            else{
                sum += rec(m,ind-1,arr)%mod;
                sum %= mod;
            }
        }

        return sum%mod;
    }
}
