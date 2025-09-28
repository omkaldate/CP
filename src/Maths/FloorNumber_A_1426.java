package Maths;

import java.util.Scanner;

public class FloorNumber_A_1426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int x = sc.nextInt();


            int ans = 1;
            int start = 1;
            int end = 2;
            if(n <= end && n>=1){
                System.out.println(1);
                continue;
            }

            while(ans < n){
                 start = end+1;
                 end = (ans*x) +2;

                if(n <= end && n>=1){
                    System.out.println(ans+1);
                    break;
                }
                ans++;
            }
        }
    }
}
