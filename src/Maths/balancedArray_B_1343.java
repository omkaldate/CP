package Maths;

import java.util.Scanner;

public class balancedArray_B_1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if ((n / 2) % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            int[] arr = new int[n];
            int i = 0;
            int j = n / 2;
            int odSum = 0;
            int evSum = 0;

            // first half: evens
            for (int x = 2; x <= n; x += 2) {
                evSum += x;
                arr[i++] = x;
            }

            // second half: (n/2 - 1) odds
            for (int x = 1; x < n / 2; x += 2) {
                odSum += x;
                arr[j++] = x;
            }

            // last odd to balance
            int lastOdd = evSum - odSum;
            arr[n - 1] = lastOdd;

            for (int z = 0; z < n; z++) System.out.print(arr[z] + " ");
            System.out.println();
        }
    }
}
