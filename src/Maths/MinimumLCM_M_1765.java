package Maths;

import java.util.Scanner;

public class MinimumLCM_M_1765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int ax = 0;
            int bx = 0;
            int ans = n;

            int i=1;
            while(i <=n && i*i<=n){
                if(n%i == 0){
                    int val = Math.max(i, n-i);
                    if(val < ans){
                        ans = val;
                        ax = i;
                        bx = n-i;
                    }

                    int j = n/i;
                    int val2 = Math.max(j, n-j);
                    if(val2 < ans){
                        ans = val2;
                        ax= j;
                        bx = n-j;
                    }
                }
                i++;
            }

            System.out.println(ax +" "+ bx);
        }
    }
}
