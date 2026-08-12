package CP_1100;


import java.util.Scanner;
public class ThousandTonsofTNT_B_1899 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);   // 82265 78961 56708 39846 31071 4913 4769 29092 91348 64119 72421 98405 222 14294

        int t = sc.nextInt();
        while(t-- > 0){
            int n =  sc.nextInt();

        //int[]arr = {60978, 82265, 78961, 56708 ,39846 ,31071, 4913, 4769, 29092, 91348, 64119, 72421, 98405, 222, 14294};
            int[]arr =  new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();


            long[] prefix =  new long[n];
            fillPref(prefix,arr);

            long ans = 0;
            for(int i=1; i<= n/2; i++){
                if(n%i != 0) continue;
                ans = Math.max(ans, fun(arr,prefix,i));
            }

            System.out.println(ans);
        }
    }

    public static long fun(int[]arr, long[]pfx, int i){
        int n = arr.length;
        long big = Long.MIN_VALUE;
        long small = Long.MAX_VALUE;

        for(int ind =i-1; ind <n; ind+=i){
            long s = 0l;
            if(ind == i-1){
                s = pfx[ind];
            }
            else{
                s = pfx[ind] - pfx[ind-i];
            }

            big = Math.max(big, s);
            small = Math.min(small, s);
        }

        if(big == small) return 0;
        return big-small;
    }

    public static void fillPref(long[]pf, int[]arr){

        pf[0] = (long)arr[0];

        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + (long) arr[i];
        }
    }
}
