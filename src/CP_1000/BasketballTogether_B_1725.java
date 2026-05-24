package CP_1000;

import java.util.Arrays;
import java.util.Scanner;
public class BasketballTogether_B_1725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[]arr =  new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;

        int i=0;
        int j = n-1;
        int sum = 0;

        while( i <= j){
            sum = arr[j];
            int val = sum;

            while(i < j && sum <= d){
                sum += val;
                i++;
            }

            if(sum > d) ans++;

            j--;
            sum = 0;
        }
        System.out.println(ans);
    }
}
