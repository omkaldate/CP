package BinarySearch;

import java.util.Scanner;

public class PackingRectangles_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h =  sc.nextInt();
        int n = sc.nextInt();

        long s = (long)Math.max(w,h);
        long e = (long)n*s;

        long ans = 0;

        while(s <= e){
            long m = s+(e-s)/2;

            boolean what = fun(m, w, h, n);
            if(what ==  true){
                ans = m;
                e = m-1;
            }
            else s= m+1;
        }

        System.out.println(ans);
    }

    public static boolean fun(long m, int w, int h, int n) {
        long hori = m / w;
        long ver = m / h;

        return hori >= (n + ver - 1L) / ver;
    }
}
