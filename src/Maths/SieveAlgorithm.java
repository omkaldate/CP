package Maths;

import java.util.Arrays;

public class SieveAlgorithm {
    public static void main(String[] args){
        int n = 38;

//        int[]arr = new int[n+1];
//        Arrays.fill(arr, 1);
//        arr[0] = 0;
//        arr[1] = 0;
//
//        for(int i=2; i*i <=n; i++){
//            if(arr[i] ==1){
//                for(int j = i*i; j<=n; j+=i){
//                    arr[j] = 0;
//                }
//            }
//        }
//
//        int c = 0;
//        for(int i=2; i<=n; i++){
//            if(arr[i] == 1) {
//                System.out.print(i + " ");
//                c++;
//            }
//        }
//
//        System.out.println(" total primes from  2 to " + n + "are = " + c );




        for(int i=2; i*i <=n; i++){
            if(n%i ==0){
                System.out.print(i + " ");
                n/=i;
                while(n%i == 0){
                    System.out.print(i + " ");
                    n /=i;
                }

            }
        }
        if(n > 1) System.out.println(n);

    }
}
