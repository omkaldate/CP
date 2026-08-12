package InfosysOA;

import java.util.Arrays;

public class EditDistanceWithAdjacentSwapQ3Om {
    public static void main(String[] args){
        String a = "competitive";
        String b = "cognitive";
        int k = 3;
        int w = 1;

//        int ans = fun(a.length()-1, b.length()-1,a,b, w,k,0);

        int[][][]dp =  new int[a.length()][b.length()][2];
        for(int[][]x : dp){
            for(int[]y : x){
                Arrays.fill(y,-1);
            }
        }

        int ans = memo(dp,a.length()-1, b.length()-1,a,b, w,k,0);

        System.out.println(ans);
    }


    public static int memo(int[][][]dp,int i, int j, String s1, String s2, int w, int k, int isUsed) {
        if (i == -1 && j == -1) return 0;
        if (i == -1) return j + 1;
        if (j == -1) return i + 1;

        if(dp[i][j][isUsed] != -1) return dp[i][j][isUsed];

        int ans = Integer.MAX_VALUE;

        if (s1.charAt(i) == s2.charAt(j)) {
            ans = Math.min(ans, memo(dp,i - 1, j - 1, s1, s2, w, k, isUsed));
        }

        ans = Math.min(ans, 1 + memo(dp,i, j - 1, s1, s2, w, k, isUsed));

        ans = Math.min(ans, 1 + memo(dp,i - 1, j, s1, s2, w, k, isUsed));

        if (isUsed == 0 && i + 1 >= k && j + 1 >= k) {
            ans = Math.min(ans, w + memo(dp,i - k, j - k, s1, s2, w, k, 1));
        }

        return dp[i][j][isUsed] = ans;
    }



    public static int fun(int i, int j, String s1, String s2, int w, int k, int isUsed) {
        if (i == -1 && j == -1) return 0;
        if (i == -1) return j + 1;
        if (j == -1) return i + 1;

        int ans = Integer.MAX_VALUE;

        if (s1.charAt(i) == s2.charAt(j)) {
            ans = Math.min(ans, fun(i - 1, j - 1, s1, s2, w, k, isUsed));
        }

        ans = Math.min(ans, 1 + fun(i, j - 1, s1, s2, w, k, isUsed));

        ans = Math.min(ans, 1 + fun(i - 1, j, s1, s2, w, k, isUsed));

        if (isUsed == 0 && i + 1 >= k && j + 1 >= k) {
            ans = Math.min(ans, w + fun(i - k, j - k, s1, s2, w, k, 1));
        }

        return ans;
    }
}

