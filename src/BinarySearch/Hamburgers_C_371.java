package BinarySearch;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Hamburgers_C_371 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = sc.next();
        long b =0;
        long s =0;
        long c =0;

            for(char ch : str.toCharArray()){
                if(ch == 'B')b++;
                if(ch == 'S') s++;
                if(ch == 'C') c++;
            }

        long nb = sc.nextLong();
        long ns = sc.nextLong();
        long nc = sc.nextLong();


        long pb = sc.nextLong();
        long ps = sc.nextLong();
        long pc = sc.nextLong();

        long money = sc.nextLong();

        long l = 0;
        long r = (long) 1e13;
        long ans = 0;

            while(l <= r){
                long mid = l+(r-l)/2;

                if(possible(mid, b, s, c, nb, ns, nc, pb, ps, pc, money)){
                    l = mid+1;
                    ans = mid;
                }
                else r = mid-1;
            }

            System.out.println(ans);

            sc.close();
    }
    public static boolean possible(long n, long b, long s, long c,
                                   long nb, long ns, long nc,
                                   long pb, long ps, long pc,
                                   long money) {
        long needB = Math.max(0, n*b - nb);
        long needS = Math.max(0, n*s - ns);
        long needC = Math.max(0, n*c - nc);

        long totalCost = needB * pb + needS * ps + needC * pc;
        return totalCost <= money;
    }

}
