package Maths;

import java.util.Scanner;

public class DivisibilityProblem_A_1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%b == 0){
                System.out.println(0);
                continue;
            }
            if( a>b){
                System.out.println(b - (a%b));
                continue;
            }
            System.out.println(b-a);
        }
    }
}
