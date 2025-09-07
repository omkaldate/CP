package DIV_3.Round1047;

import java.util.Scanner;

public class MaximumEvenSum_C_2137 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = -1;

            if(b == 1){
                System.out.println(-1);
                continue;
            }

            for (long k = 2; k <= b; k++) {
                if(b%k == 0) {
                    long x = a;
                    long y = b;
                    while( y >= k && y!= 1) {
                        x *= k;
                        y /= k;
                        if ((x + y) % 2 == 0) ans = Math.max(ans, x + y);
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
