package Implementation;

import java.util.Scanner;
public class SoldierandBananas_A_546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();


        int x =0;
        long total = 0L;

        while(x++ < w){
            total += (x*k);
        }

        if(n >= total) System.out.println(0);
        else System.out.println(total - n);
    }
}
