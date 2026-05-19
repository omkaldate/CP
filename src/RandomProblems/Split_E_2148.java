package RandomProblems;

import java.util.Scanner;

public class Split_E_2148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int[] ocur = new int[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                ocur[arr[i]]++;
            }

            boolean ok = true;
            for (int i = 0; i <= n; i++) {
                if (ocur[i] % k != 0) {
                    ok = false;
                    break;
                }
                ocur[i] /= k;
            }

            if (!ok) {
                System.out.println(0);
                continue;
            }

            int l = 0;
            long res = 0;
            int[] inside = new int[n + 1];

            for (int r = 0; r < n; r++) {
                inside[arr[r]]++;

                while (inside[arr[r]] > ocur[arr[r]]) {
                    inside[arr[l]]--;
                    l++;
                }

                res += (r - l + 1);
            }

            System.out.println(res);
        }
    }
}