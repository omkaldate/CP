package RandomProblems;

import java.util.Scanner;

public class AGiftFromOrangutan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[]a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;

            for(int i=0; i<n; i++) {
                if(a[i] < mini) mini = a[i];
                if(a[i] > maxi) maxi = a[i];
            }

            int sum = 0;
            for(int i=1; i<n; i++){
                sum += maxi-mini;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
