package Maths;

import java.util.Scanner;

public class ParkLighting_A_1358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==1 && m == 1){
                System.out.println(1);
                continue;
            }
            if(n%2 == 0 && m%2 ==0){
                System.out.println((n*m)/2);
                continue;
            }
            if(n%2 ==1 && m%2 ==1){
                System.out.println((((n*m)+1)/2));
                continue;
            }
            if(n%2 == 0 && m%2 == 1){
                System.out.println((n*m)/2);
                continue;
            }
            else{
                System.out.println((n*m)/2);
            }
        }
    }
}
