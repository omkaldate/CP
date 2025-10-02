package Maths;

import java.util.Scanner;

public class RequiredRemainder_A_1374 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

//            while(nCpy >=0){
//                if(nCpy%x == y){
//                    System.out.println(nCpy);
//                    break;
//                }
//                nCpy--;
//            }

            int val = n- (n%x)+y;
            if(val  <=n) System.out.println(val);
            else System.out.println(val-x);

        }
    }
}
