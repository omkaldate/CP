package CP_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Monsters_B_1849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){


        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][]arr = new int[n][2];

       for(int i=0; i<n; i++){
           arr[i][0] = sc.nextInt() %k;
           arr[i][1] = i+1;
       }

            Arrays.sort(arr, (a,b)->{
                if(a[0] == b[0]){
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(b[0], a[0]);
            });


            int pivot = n;
            for(int i=n-1; i>=0; i--){
                if(arr[i][0] == 0) pivot = i;
            }

            for(int i=pivot; i<n; i++){
                System.out.print(arr[i][1] + " ");
            }

            for(int i=0; i<pivot; i++){
                System.out.print(arr[i][1] + " ");
            }
        }
    }
}
