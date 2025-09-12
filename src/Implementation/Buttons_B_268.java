//package Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class Buttons_B_268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger result;
        if (n == 1) {
            result = BigInteger.ONE;
        } else if (n == 2) {
            result = BigInteger.valueOf(3);
        } else if (n == 3) {
            result = BigInteger.valueOf(7);
        } else {
            result = BigInteger.ONE.shiftLeft(n).subtract(BigInteger.valueOf(2));
        }

        System.out.println(result);
    }
}
