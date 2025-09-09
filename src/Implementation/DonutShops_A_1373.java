package Implementation;

import java.util.Scanner;

public class DonutShops_A_1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long shop1 = (a < c) ? 1 : -1;
            long shop2 = (a * b > c) ? b : -1;

            System.out.println(shop1 + " " + shop2);
        }
        sc.close();
    }
}
