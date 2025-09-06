//package Implementation;

import java.util.Scanner;

public class MaximumIncrease_A_702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int ans = 0;
        int cnt = 0;
        int prev = -1;

        for(int i=0; i<n; i++){
            if(arr[i] > prev){
                cnt++;
                ans = Math.max(ans, cnt);
                prev = arr[i];
            }
            else{
                cnt = 1;
                prev = arr[i];
            }
        }

        System.out.println(ans);

    }
}
