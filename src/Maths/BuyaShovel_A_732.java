package Maths;

import java.util.Scanner;

public class BuyaShovel_A_732 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int l = k%10;
        int ans = 1;
        int xx = l;
        if(xx == 0){
            System.out.println(1);
            return;
        }

        while(xx != r){
           xx += l;
           xx %= 10;
           ans++;

           if(xx == 0) break;
        }

        System.out.println(ans);
    }
}
