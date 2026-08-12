package CP_1000;

import java.util.Scanner;

public class MEXorMixup_B_1567 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

           int ans = fun(a,b);
            System.out.println(ans);
        }
    }
    public static int fun(int a, int b){
        int uA = a-1;
        int till;

        if (uA % 4 == 0) till= uA;
        else if (uA % 4 == 1) till = 1;
        else if (uA % 4 == 2) till= uA+1;
         else till = 0;

        if(till ==  b) return a;
        if((till ^ a) == b) return a+2;
        else return a+1;

    }
}
