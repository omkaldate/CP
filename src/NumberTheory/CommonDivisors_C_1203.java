package NumberTheory;

import java.util.Scanner;

public class CommonDivisors_C_1203 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[]arr =  new long[n];

        long gcd = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
            gcd = findGcd(gcd, arr[i]);
        }

        int ans = fun(gcd);
        System.out.println(ans);

    }

    public static int fun(long n){
        int cnt = 0;

        for(long i=1; i*i <= n; i++){
            if(n%i == 0){
                cnt++;

                if(n/i != i) cnt++;
            }
        }
        return cnt;
    }

    public static long findGcd(long a, long b){
        if(b == 0) return a;

        return findGcd(b, a%b);
    }
}
