package Maths;

import java.util.Scanner;
public class PrintAllDivisors {
    public static void main(String[] aegs){

        Scanner sc = new Scanner(System.in);
        int n = 36;

//        for(int i=1; i<n; i++){
//            if(n %i == 0) System.out.println(i + " ");
//        }

        for(int i=1; i*i <= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");

                if(n/i != i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }
}
