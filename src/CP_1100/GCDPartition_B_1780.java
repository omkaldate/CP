//package CP_1100;

import  java.util.Scanner;
public class GCDPartition_B_1780 {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long total =0;

            int[]arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                total += arr[i];
            }



            long  ans = 1;
            long sumTilI = 0;
            for(int i=0; i<n-1; i++){
                 sumTilI += arr[i];
                long remSum = total - sumTilI;

                ans =  Math.max(ans, gcd(sumTilI, remSum));
            }

            System.out.println(ans);
        }
    }

    public static long gcd(long a, long b){
        if( b == 0) return a;

        return gcd(b, a%b);
    }

    public static int gcd1(int a, int b){
        int cpA = a;
        int cpB = b;

        while(a !=0 && b != 0){
            if( a >= b) a %= b;
            else b %= a;
        }

        return (a == 0) ? cpB : cpA;
    }


}
