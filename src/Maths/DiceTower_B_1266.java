package Maths;

import java.util.Scanner;
public class DiceTower_B_1266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int z=0; z<t; z++) {
            long i = sc.nextLong();

            if(i < 15) System.out.println("NO");
            else {
                boolean ans = fun(i);

                if (ans == true) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

    public static boolean fun(long i){

        if((i%14) >= 1 && (i%14)<=6 ) return true;

        return false;
    }
}
