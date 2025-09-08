package Implementation;

import java.util.Scanner;

public class AssigningtoClassesNumbersonWhiteboard_C_1430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(2); // final result

            if (n == 2) {
                System.out.println("2 1");
                continue;
            }

            int cur = n;
            for (int i = n - 1; i >= 2; i--) {
                System.out.println(cur + " " + i);
                cur = (cur + i + 1) / 2; // ceil((cur + i)/2)
            }
            System.out.println(cur + " " + 1);
        }

        sc.close();
    }
}
