package Maths;

import java.util.Scanner;

public class ThreePairwiseMaximums_A_1385 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x == y && y == z){
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
                continue;
            }

            if(x == z && y <x){
                System.out.println("YES");
                System.out.println(x + " " + y + " "+ y);
                continue;
            }
            if(y == z &&  y>x){
                System.out.println("YES");
                System.out.println(y + " " + x + " "+ x);
                continue;
            }
            if(x==y && x>z){
                System.out.println("YES");
                System.out.println(x + " " + z + " "+ z);
                continue;
            }

            System.out.println("NO");
        }
    }
}
