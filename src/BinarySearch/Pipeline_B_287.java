package BinarySearch;

import java.util.Scanner;
public class Pipeline_B_287 {

    static long sum ( long x, long k){
        return x * (2*k - x-1) / 2;
    }

    public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            long n = sc.nextLong();
            long k = sc.nextLong();

            long need = n - 1;
            long maxGain = k * (k - 1) / 2;

            if (need > maxGain) {
                System.out.println(-1);
                return;
            }

            long lo = 0;
            long hi = k-1;
            long ans = k-1;

            while (lo <= hi) {
                long mid = (lo + hi) / 2;
                if (sum(mid, k) >= need) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            System.out.println(ans);
    }
}
