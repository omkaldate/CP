package Implementation;

import java.util.Scanner;

public class PresentfromLena_B_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= 2 * n; i++) {
            int level = (i <= n) ? i : 2*n-i;

            // print spaces
            for (int s = 0; s < n-level; s++) {
                System.out.print("  "); // 2 spaces for alignment
            }

            // print increasing numbers
            for (int j = 0; j <= level; j++) {
                System.out.print(j + " ");
            }

            // print decreasing numbers
            for (int j = level-1; j >= 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
