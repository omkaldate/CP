package CP_1000;

import java.util.Scanner;

public class DifferentDivisors_B_1474 {

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long nextPrime(long x) {
        while (!isPrime(x)) x++;
        return x;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t =  sc.nextInt();
        while(t-- > 0){

            int d =  sc.nextInt();

            long p = nextPrime(1 + d);
            long q = nextPrime(p + d);

            long ans = Math.min(p * q, p*p*p);

            System.out.println(ans);
            }
    }
}
