package Maths;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_A_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b =  sc.nextInt();

            if(a==b){
                System.out.println(0);
                continue;
            }

            if(a < b) System.out.println(nega(a, b));
            else System.out.println(posi(a, b));
        }
    }

    public static int nega(int a , int b){
        int cnt=0;
         b = b-a;

         cnt += b/10;
         if(b%10 !=0) cnt++;

         return cnt;
    }

    public static int posi(int a , int b){
        int cnt=0;
        a = a-b;

        cnt += a/10;
        if(a%10 != 0) cnt++;

        return cnt;
    }
}
