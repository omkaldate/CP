package DIV_3.Round1054;

import java.util.Scanner;
import java.util.Arrays;

public class UnconventionalPairs_B_2149 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int[]arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);


            int ans = 0;

            for(int i=0; i<n; i++){
                int val1 = arr[i];
                int val2 = arr[i+1];
                ans = Math.max(ans, Math.abs(val1 - val2));
                i++;
            }

            System.out.println(ans);
        }
    }
}
