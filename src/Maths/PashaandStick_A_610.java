package Maths;

import java.util.Scanner;

public class PashaandStick_A_610 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2 == 1 || n<6){
            System.out.println(0);
            return;
        }

        int ans = 0;

        int a = n-2;
        int b = 2;

        while(a > b){
            ans++;
            a -=2;
            b +=2;
        }
        System.out.println(ans);

    }
}
