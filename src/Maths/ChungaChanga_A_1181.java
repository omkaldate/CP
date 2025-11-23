package Maths;


import java.util.Scanner;

public class ChungaChanga_A_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        long total = (x + y) / z;
        long separate = x / z + y / z;

        if (total == separate) {
            System.out.println(total + " " + 0);
        } else {
            long remX = x % z;
            long remY = y % z;
            long needX = z - remX; // how much needed to top up x to next coconut
            long needY = z - remY; // how much needed to top up y to next coconut
            long debt = Math.min(needX, needY);
            System.out.println(total + " " + debt);
        }
    }
}
