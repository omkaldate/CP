package InfosysOA;

import java.util.Arrays;

public class biundedCoindChangeQ2Rutuja {
    public static void main(String[] args){
        int t =  10;
        int link = 2;

        int[]block = {2,5};
        int[]max = {3,2};

       // int ans = rec(t,link-1,block,max,first);    // recursion 1st type
        //int ans = rec1(t,link-1,block,max);

//        int[][]dp =  new int[link][t+1];
//        for(int[]x : dp) Arrays.fill(x,-1);
//        int ans = memo(dp,t,link-1,block,max);

        //int ans = tabu(t,block,max);
        int ans = spaceOp(t,block,max);

        if(ans == (int)1e9) System.out.println(-1);
        else System.out.println(ans);
    }



    public static int spaceOp(int t , int[]block, int[]maxCap){
        int n = block.length;

        int[]dp =  new int[t+1];

        for(int i=0; i<=t; i++) dp[i] = (int) 1e9;
        dp[0] = 0;


        for(int ind =1; ind<=n; ind++) {
            int[]cur = new int[t+1];
            cur[t] = 0;

            for(int tar=0; tar<=t; tar++) {
                int ans = (int) 1e9;

                int possible = Math.min(tar / block[ind-1], maxCap[ind-1]);
                for (int x=0; x <= possible; x++) {
                    int newT = tar - (block[ind-1] * x);
                    int cost = (x == 0) ? 0 : block[ind-1] + x;

                    int precentOver = dp[newT];
                    if (precentOver != (int) 1e9) {
                        ans = Math.min(ans, cost + precentOver);
                    }
                }
                cur[tar] = ans;
            }
            dp = cur;
        }
        return dp[t];
    }


    public static int tabu(int t , int[]block, int[]maxCap){
        int n = block.length;

        int[][]dp =  new int[n+1][t+1];

        for(int i=0; i<=t; i++) dp[0][i] = (int) 1e9;
        for(int i=0; i<=n; i++) dp[i][0] = 0;


        for(int ind =1; ind<=n; ind++) {
            for(int tar=0; tar<=t; tar++) {
                int ans = (int) 1e9;

                int possible = Math.min(tar / block[ind-1], maxCap[ind-1]);
                for (int x=0; x <= possible; x++) {
                    int newT = tar - (block[ind-1] * x);
                    int cost = (x == 0) ? 0 : block[ind-1] + x;

                    int precentOver = dp[ind-1][newT];
                    if (precentOver != (int) 1e9) {
                        ans = Math.min(ans, cost + precentOver);
                    }
                }
                 dp[ind][tar] = ans;
            }
        }
        return dp[n][t];
    }


    public static int memo(int[][]dp,int t, int ind, int[]block, int[]maxCap){
        if(t == 0) return 0;
        if(ind < 0) return (int) 1e9;

        if(dp[ind][t] != -1) return dp[ind][t];

        int ans = (int) 1e9;

        int possible = Math.min(t/block[ind] , maxCap[ind]);
        for(int x=0; x<=possible; x++){
            int newT = t - (block[ind]*x);
            int cost =(x==0) ? 0 : block[ind]+x;

            int precentOver = memo(dp,newT,ind-1,block,maxCap);
            if(precentOver != (int)1e9) {
                ans = Math.min(ans, cost + precentOver);
            }
        }
        return dp[ind][t] = ans;
    }



    public static int rec1(int t, int ind, int[]block, int[]maxCap){
        if(t == 0) return 0;
        if(ind < 0) return (int) 1e9;

        int ans = (int) 1e9;

        int possible = Math.min(t/block[ind] , maxCap[ind]);
        for(int x=0; x<=possible; x++){
            int newT = t - (block[ind]*x);
            int cost =(x==0) ? 0 : block[ind]+x;

            int precentOver =  rec1(newT,ind-1,block,maxCap);
            if(precentOver != (int)1e9) {
                ans = Math.min(ans, cost + precentOver);
            }
        }
        return ans;
    }



    public static int rec(int tar, int ind, int[]block, int[]max,int[]first){          // cant memoize it bcs ind, tar, max, first 4 state
        if(tar ==0) return 0;                                                           // so dont suitable for memoize
        if(ind < 0){
            return (int)1e9;
        }

        int notTake = rec(tar,ind-1,block, max,first);

        int take = (int) 1e9;
        if(tar >= block[ind] && max[ind] >0){
            max[ind] -= 1;
            int val = 0;
            if(first[ind] == 0){
                val = block[ind];
                first[ind] = 1;
            }

            take = val+1 +rec(tar-block[ind], ind, block, max, first);
            max[ind]+=1;
            first[ind] = 0;
        }

        return Math.min(notTake,take);
    }
}
