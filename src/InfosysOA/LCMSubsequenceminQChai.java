package InfosysOA;

import java.util.Arrays;

public class LCMSubsequenceminQChai {
    public static void main(String[] args) {
        int n = 3;
        int[]arr = {6,2,3};


        long fullLcm = 1;
        for(int i=0; i<n; i++) fullLcm = findLcm(fullLcm, arr[i]);

        int[]maxCap = new int[15];
        int[]primes =  new int[15];
        int fullMask = makeFirst(fullLcm, maxCap, primes);

        int[]maskedArray =  new int[n];
        for(int i=0; i<n; i++) maskedArray[i] = findMask(arr[i],maxCap,primes);

//        int[][]dp = new int [n][(1<<15)-1];
//        for(int[]x : dp) Arrays.fill(x,-1);
//        long ans = rec(dp,n-1,arr,0, fullMask,maxCap,primes,maskedArray);

        int ans = tabu(arr,fullLcm,fullMask,maxCap,primes,maskedArray);
        System.out.println(ans);
        
    }

    public static int tabu(int[]arr, long fullLcm, int fullMask, int[]maxCap,int[]primes, int[]maskArray){
        int n = arr.length;
        int[][]dp = new int[n+1][(1<< 15)];
        for(int i=0; i< (1<< 15); i++) dp[0][i] = (int)1e9;
        dp[0][fullMask] = 0;

        for(int ind =1; ind<=n; ind++){
            for(int curMask =(1<<15)-1; curMask >=0; curMask--){

                if(curMask == fullMask){
                    dp[ind][curMask] = 0;
                    continue;
                }
                int notPick = dp[ind-1][curMask];
                int temp = maskArray[ind-1];
                int ncm = temp | curMask;
                int pick = 1 + dp[ind-1][ncm];

                 dp[ind][curMask]= Math.min(notPick, pick);
            }
        }

        return dp[n][0];
    }

    public static int rec(int[][]dp,int ind, int[]arr, int curMask, int fullMask, int[]maxCap, int[]primes,int[]maskArray){
        if(curMask == fullMask) return 0;
        if(ind == -1){
            return (int) 1e9;
        }

        if(dp[ind][curMask] != -1) return dp[ind][curMask];

         int notPick = rec(dp,ind-1,arr,curMask,fullMask,maxCap,primes,maskArray);
        int temp = maskArray[ind];
         int ncm = temp | curMask;
         int pick = 1 + rec(dp,ind-1,arr,ncm, fullMask,maxCap,primes,maskArray);

        return dp[ind][curMask]= Math.min(notPick, pick);
    }

    public static int findMask(long val1, int[]capArr, int[]primes){
        int mask = 0;

        for(long i=2; i*i <= val1 ;i++){
            int cnt = 0;

            if(val1 %i ==0){
                while(val1 %i ==0){
                    val1 /= i;
                    cnt++;
                }
                for(int x=0; x<primes.length; x++){
                    if(primes[x] == (int)i){
                        if(capArr[x] <= cnt){
                            mask |= (1 << x);
                            break;
                        }
                    }
                }
            }
        }
        if(val1 > 1){
            for(int x=0; x<primes.length; x++){
                if(primes[x] == (int) val1){
                    if(capArr[x] == 1){
                        mask |= (1 << x);
                        break;
                    }
                }
            }
        }
        return mask;
    }


    public static int makeFirst(long val1,int[]maxCap, int[]primes){

        int ind=0;
        int mask = 0;

        for(int i=2; i*i <= val1 ;i++){
            if(val1 %i ==0){
                primes[ind] = i;
                 mask |= (1 << ind);
                while(val1 %i ==0){
                    val1 /= i;
                    maxCap[ind]++;
                }
                ind++;
            }
        }
        if(val1 > 1){
            maxCap[ind] = 1;
            primes[ind] = (int) val1;
            mask |= (1 << ind);
        }

        return mask;
    }

    public static long findLcm(long a, long b){
        long cpA = a;
        long cpB = b;

        while(a !=0 && b != 0){
            if(a<b) b%=a;
            else a %=b;
        }
        long ans = (a == 0) ? b : a;
        return  (cpA/ans)*cpB;
    }
}
