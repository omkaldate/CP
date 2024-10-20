package DIV_2.Round980;


import java.util.*;
import java.io.*;

public class A_ProfitableInterestRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>=b) System.out.println(a);
            else{
                int dif = b-a;
                a -= dif;
                if(a>=0) System.out.println(a);
                else System.out.println(0);
            }
        }
    sc.close();
    }
}
