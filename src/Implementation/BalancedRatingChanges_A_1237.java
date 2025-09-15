package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRatingChanges_A_1237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int flag = 0;

        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                arr[i] = arr[i]/2;
            }
            else{
                arr[i] = (flag==0) ? (int)Math.ceil(arr[i]/2.0) : (int)Math.floor(arr[i]/2.0);
                flag ^= 1;
            }
        }

        for(int i : arr) System.out.println(i);
    }
}
