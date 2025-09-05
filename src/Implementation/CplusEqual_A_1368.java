package Implementation;

import java.util.Scanner;

public class CplusEqual_A_1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int cnt = 0;
            while (a <= n && b <= n) {
                if (a < b) a += b;
                else b += a;

                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
