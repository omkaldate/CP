package CP_1100;

import java.util.Scanner;

public class LunaticNeverContent_B_1826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();


            int ans = 0;
            for(int i=0; i<n; i++){
                int val =Math.abs(arr[i] - arr[n-i-1]);

                ans = gcd(ans, val);
            }

            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
