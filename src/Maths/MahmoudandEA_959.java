package Maths;

import java.util.Scanner;

public class MahmoudandEA_959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1) == 0) System.out.println("Mahmoud");
        else System.out.println("Ehab");
    }
}
