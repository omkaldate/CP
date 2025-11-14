package Maths;

import java.util.Scanner;
public class Emotes_B_1117 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int m1 = 0;
        int m2 = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > m1){
                m2 = m1;
                m1 = arr[i];
            }
            else{
                if(arr[i] > m2) m2 = arr[i];
            }
        }

        long ans = 0L;
       // System.out.println(m1 + " " + m2);

         ans += ((long)m/(k+1)) * (((long)m1*k)+m2);
         ans += ((long)m %(k+1)) * (long)m1;

        System.out.println(ans);
    }
}
