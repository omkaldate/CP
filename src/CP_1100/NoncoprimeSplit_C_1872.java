package CP_1100;

import java.util.Scanner;
public class NoncoprimeSplit_C_1872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            boolean found = false;

            for(int i=l; i<= r; i++){
                if(isPrime(i)) continue;


               for(int x =2; x*x<=i; x++){
                   if(i%x == 0){
                       System.out.println( (i-x)+ " " + x);
                       found = true;
                       break;
                   }
               }
                if(found == true) break;
            }
            if(found == false) System.out.println(-1);
        }
    }

    public static boolean isPrime(int val){

        for(int i=2; i*i <= val; i++){
            if(val %i == 0) return false;
        }

        return true;
    }
}
