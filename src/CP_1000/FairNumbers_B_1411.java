package CP_1000;

import java.util.Scanner;

public class FairNumbers_B_1411 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            boolean isFound = false;
            while(isFound == false){
                if(isSatisfy(n)){
                    isFound = true;
                    break;
                }
                n++;
            }
            System.out.println(n);
        }
    }

    public static boolean isSatisfy(long n){
        long nCp = n;

        while(n % 10 != n){
            long digit = n%10;
            if(digit != 0 &&  nCp % digit != 0) return false;

            n/= 10;
        }

        if(nCp %n != 0) return false;
        return true;
    }
}
