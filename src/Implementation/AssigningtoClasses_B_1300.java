package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningtoClasses_B_1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[]arr = new int[n*2];
            for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);
            if(n >= 2){
                System.out.println(Math.abs(arr[n] - arr[n-1]));
            }
            else{
                System.out.println(Math.abs(arr[0] - arr[1]));
            }
        }

        sc.close();
    }
}
