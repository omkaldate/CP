//package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins_A_1294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int[]art = {a,b,c};
            Arrays.sort(art);

            int maxi = art[2];
            int midi = art[1];
            int mini = art[0];

            int diff = (maxi-midi) + (maxi - mini);
            n -= diff;
            if(n <0){
                System.out.println("NO");
                continue;
            }

            if(n%3 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
