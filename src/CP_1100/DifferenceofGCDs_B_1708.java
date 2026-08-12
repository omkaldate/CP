package CP_1100;

import java.util.Scanner;

public class DifferenceofGCDs_B_1708 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] ans = new int[n];
            boolean scam = false;

            for (int i = 1; i <= n; i++) {
                int value = find(l, r, i);

                if (value == -1) {
                    scam = true;
                    break;
                }

                ans[i - 1] = value;
            }

            if (scam) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }

    public static int find(int l, int r, int valNo) {

        int rem = l % valNo;

        if (rem == 0)
            return l;

        int need = valNo - rem;

        long ans = (long) l + need;   // use long to avoid overflow

        if (ans <= r)
            return (int) ans;

        return -1;
    }
}