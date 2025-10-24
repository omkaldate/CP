package Maths;

import java.util.Scanner;

public class MostUnstableArray_A_1353 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m =sc.nextInt();

            if(n == 1) {
                System.out.println(0);
                continue;
            }
            if(n == 2){
                System.out.println(m);
                continue;
            }
            else{
                System.out.println(m*2);
            }
        }
    }
}
