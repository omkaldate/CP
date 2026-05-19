package DIV_2.Round190;

import java.util.Scanner;

public class OptimalPurchase_A_2230 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            long n = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();

            long ans1 =  Long.MAX_VALUE;
            ans1 = Math.min(ans1, a*n);
            ans1 = Math.min(ans1,  b*n);


            if(n%3 == 0){
                ans1 = Math.min(ans1, (n/3)*b);
            }
            else {
                long x = (n / 3) * b;
                long rem = n % 3;
                x += a*rem;

                ans1 = Math.min(ans1, x);

                long y = (n/3)*b;
                long rx = n%3;
                y += b;

                ans1 = Math.min(ans1, y);
            }

            System.out.println(ans1);
        }

    }
}
