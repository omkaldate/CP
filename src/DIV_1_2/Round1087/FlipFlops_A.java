package DIV_1_2.Round1087;

import java.util.Arrays;
import java.util.Scanner;

public class FlipFlops_A {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            long c = sc.nextInt();
            long k = sc.nextInt();

            long[]arr = new long[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            long ans = c;

            for(int i=0; i<arr.length; i++){

                if(arr[i] <= c){
                    long dif = c-  arr[i];
                    if(k >= dif){
                        k -= dif;
                        c +=c;
                    }
                    else {
                        c += arr[i]+k;
                        k=0;
                    }
                }
                else break;


            }
            System.out.println(c);

        }
    }

    //10 192 109
    //        1 9 20 9 829 3 87 1 283 7

   // 10 1000000000 1000000000
   //         19 1000000000 1 9 2 3 8 1 2 3
}
