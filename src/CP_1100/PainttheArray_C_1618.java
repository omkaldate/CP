package CP_1100;

import java.util.Scanner;
public class PainttheArray_C_1618 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- >  0){
            int n = sc.nextInt();
            long[]arr = new long[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextLong();
            long ans = fun(arr);
            System.out.println(ans);
        }
    }

    public static long fun(long[]arr){
        int n = arr.length;

        long gcdA = findGcd(arr, true); // odd number gcd

        boolean isPossible = true;
        for(int i=0; i<n; i++){
            if(i%2 != 0){
                if(arr[i] % gcdA == 0){
                    isPossible = false;
                    break;
                }
            }
        }
        if(isPossible == true) return gcdA;


        long gcdB = findGcd(arr, false);

        boolean isPossibleB = true;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                if(arr[i] % gcdB == 0){
                    isPossibleB = false;
                    break;
                }
            }
        }
        if(isPossibleB == true) return gcdB;
        return 0;
    }


    public static long findGcd(long[]arr, boolean even){
        int n = arr.length;

        if(even == true){
            long a = arr[0];

            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    a = GCD(a, arr[i]);
                }
            }
            return a;
        }
        else{
            long a = arr[1];

            for(int i=0; i<n; i++){
                if(i%2 != 0){
                    a = GCDX(a, arr[i]);
                }
            }
            return a;
        }
    }

    public static long GCD(long a , long b){
        if(b == 0) return a;

        return GCD(b,a%b);
    }

    public static long GCDX(long a, long b){
        while(a != 0 && b !=0){
            if( a > b) a %= b;
           else b %= a;
        }

        return (a == 0)?b : a;
    }
}
