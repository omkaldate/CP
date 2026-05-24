package CP_1000;

import java.util.Scanner;

public class SkiResort_C_1840 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int temp = sc.nextInt();

            int[]arr =  new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int i=0;
            int j = 0;

            long
                    ans = 0;
            while(j<n){
                if(arr[j] > temp){
                   ans += func(i,j,k);
                    i = j+1;
                }
                j++;
            }

            ans += func(i,j,k);

            System.out.println(ans);
        }


    }

    public static long func(int i, int j, int k){
        long n = j-i+1;
        if(n < k) return 0;

        long total = 1L * n*(n+1)/2;
        long less = 1L * k*(2L*n -k +1)/2;

        return total - less;
    }
}
