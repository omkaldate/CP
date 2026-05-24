package CP_1000;

import java.util.Scanner;
public class BeautifulArray_B_1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            long n = sc.nextLong();
            long k = sc.nextLong();
            long b   = sc.nextLong();
            long s = sc.nextLong();

            long minLimit =  k*b;
            long maxLimit =  (k*(b+1)) -1;

            if(s <= maxLimit && s >= minLimit ){
                System.out.print(s + " ");
                for(int i=1; i<n; i++){
                    System.out.print(0 + " ");
                }
                System.out.println();
                continue;
            }
            if(s < k*b){
                System.out.print(-1);
                System.out.println();
                continue;
            }
            if(k==1){
                if(b == s){
                    System.out.print(s+ " ");
                    for(int i=1; i<n; i++){
                        System.out.print(0 + " ");
                    }
                    continue;
                }
                System.out.println(-1);
                continue;

            }

            long[]arr =  new long[(int)n];
            long sum = s;


                arr[0] = maxLimit;
                sum -= maxLimit;

                 long full = sum/(k-1);
                 long mod = sum%(k-1);
                 if(mod == 0) {
                     if (full + 1 > n) {
                         System.out.print(-1);
                         System.out.println();
                         continue;
                     }
                     for(int i = 1; i <full+1; i++){
                         arr[i] = k-1;
                     }
                 }
                 else{
                     if(full+2 > n){
                         System.out.print(-1);
                         System.out.println();
                         continue;
                     }
                     for(int i = 1; i <full+2; i++){
                         arr[i] = k-1;
                         if(i == full+1) arr[i] = sum%(k-1);
                     }
                 }


                 for(int i=0; i<n; i++){
                     System.out.print(arr[i] + " ");
                 }
            System.out.println();

        }
    }
}
