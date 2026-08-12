package CP_1100;

import java.util.Scanner;
import java.util.Arrays;
public class RobinHoodinTown_C_2014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[]arr =  new int[n];

            for(int i=0; i<n; i++) arr[i] =  sc.nextInt();
             Arrays.sort(arr);

            long ans =  fun(arr);
            System.out.println(ans);
        }
    }

    public static long fun(int[]arr){
        int n =  arr.length;

        if(n <= 2) return-1;

        int midNext = n/2;

        int needUnhappy = arr[midNext];

        long x = 1L*(needUnhappy * (1L*n*2))+1;

        long sum =0;
        for(int i=0; i<n; i++) sum += arr[i];

        if(sum >= x) return 0;
        return  x - sum;
    }
}
