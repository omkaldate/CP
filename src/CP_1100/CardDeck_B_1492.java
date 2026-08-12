package CP_1100;

import java.util.Scanner;
public class CardDeck_B_1492 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[]arr =  new int[n];

            for(int i=0; i<n; i++) arr[i] =  sc.nextInt();

           fun(arr);

            System.out.println();
        }
    }

    public static void fun(int[]arr) {
        int n = arr.length;

        int[] pfx = new int[n];
        int[] ans = new int[n];

        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                pfx[i] = arr[i];
                maxi = arr[i];
            } else pfx[i] = maxi;
        }

        int r = n - 1;
        int a = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (pfx[i] != pfx[r]) {
                for (int x = i+1; x <= r; x++) ans[a++] = arr[x];
                r = i;
            }

            if (i == 0) {
                for (int x=0; x <= r; x++) ans[a++] = arr[x];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
