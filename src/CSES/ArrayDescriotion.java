package CSES;

import java.util.*;

public class ArrayDescriotion {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][m + 1];

        // First element
        if(arr[0] == 0) {
            for(int mx = 1; mx <= m; mx++) {
                dp[0][mx] = 1;
            }
        } else {
            dp[0][arr[0]] = 1;
        }


        // Remaining elements
        for(int ind = 1; ind <= n; ind++) {
            for(int mx = 1; mx <= m; mx++) {

                long ways = dp[ind - 1][mx];
                if(mx > 1) ways += dp[ind - 1][mx - 1];
                if(mx < m) ways += dp[ind - 1][mx + 1];


                if(arr[ind-1] == 0 || arr[ind-1] == mx) {
                    dp[ind][mx] = (int)(ways % MOD);
                }
            }
        }


        long ans = 0;

        for(int mx = 1; mx <= m; mx++) {

            ans += dp[n][mx];
        }

        System.out.println(ans % MOD);
    }
}