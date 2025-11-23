//package Maths;

import java.util.Scanner;

public class Digitalroot_B1107 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            long k = sc.nextLong();
            int x = sc.nextInt();

            long mul = 9* (k-1);
            System.out.println(x+mul);
        }
    }
}
