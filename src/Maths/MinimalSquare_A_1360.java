package Maths;

import java.util.Scanner;

public class MinimalSquare_A_1360 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b  = sc.nextInt();

            int l = Math.max(a, b);
            int r = Math.min(a,b);

            if(l == r){
                System.out.println((r*l)*4);
                continue;
            }
            if((r*2) >= l) System.out.println((r*2) * (r*2));
            else System.out.println(l*l);
        }
    }
}
