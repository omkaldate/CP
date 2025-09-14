package Implementation;

import java.util.Scanner;

public class DreamoonandStairs_A_476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // Minimum possible moves (all 2s, and 1 if odd)
        int minMoves = (n + 1) / 2;  // ceil(n/2)
        int result = -1;

        // Find the smallest multiple of m ≥ minMoves and ≤ n
        for (int x = minMoves; x <= n; x++) {
            if (x % m == 0) {
                result = x;
                break;
            }
        }
        System.out.println(result);
    }
}
