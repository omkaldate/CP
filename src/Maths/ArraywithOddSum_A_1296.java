package Maths;

import java.util.Scanner;

public class ArraywithOddSum_A_1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int n =sc.nextInt();
            int isOdd = 0;
            int isEven = 0;

            for(int i=0; i<n; i++){
                int val =sc.nextInt();
                if((val&1)== 1) isOdd++;
                else isEven++;
            }

            if((isOdd&1) == 1) System.out.println("YES");
            else if(isOdd >0 && isEven>0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
