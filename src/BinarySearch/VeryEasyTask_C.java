package BinarySearch;

import java.util.Scanner;

public class VeryEasyTask_C {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long s= (long)Math.min(x, y);
        long e =(long)n* Math.min(x, y);

        long ans = 0;
        while(s <= e){
            long m = s+(e-s)/2;
            boolean what = fun(m, x, y, n);

            if(what ==  true){
                e = m-1;
                ans = m;
            }
            else s = m+1;
        }

        System.out.println(ans);
    }

    public static boolean fun(long m, int x, int y, int n){
        long time = m- (long)(Math.min(x, y));
        long copy= 1;

        copy += time/x;
        copy += time/y;

        if( copy >= n) return true;
        return false;
    }
}
