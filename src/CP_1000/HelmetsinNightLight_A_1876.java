package CP_1000;

import java.util.*;

public class HelmetsinNightLight_A_1876 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int p = sc.nextInt();

            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr[i][1] = sc.nextInt();
            }

            Arrays.sort(arr, (a, b) -> {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });

            long score = 0;
            int rem = n;

            for (int i = 0; i < n; i++) {

                int a = arr[i][0];
                int b = arr[i][1];

                // If direct informing is cheaper
                if (b >= p) {
                    break;
                }

                // First person must be informed directly
                if (rem == n) {
                    score += p;
                    rem--;
                }

                int canInform = Math.min(a, rem);

                score += (long) canInform * b;
                rem -= canInform;
            }

            // Remaining people informed directly
            score += (long) rem * p;

            System.out.println(score);
        }
    }
}