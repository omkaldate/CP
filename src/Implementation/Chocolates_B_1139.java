package Implementation;

import java.util.Scanner;

public class Chocolates_B_1139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int prev = Integer.MAX_VALUE;
        long ans = 0;

        for(int i=n-1; i>=0; i--){
            if(prev == 0) break;
            if(arr[i] < prev){
                ans += arr[i];
                prev = arr[i];
            }
            else{
                ans+= prev-1;
                prev --;
            }
        }
        System.out.println(ans);
    }
}
