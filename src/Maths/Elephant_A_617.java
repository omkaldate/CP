package Maths;

import java.util.Scanner;
public class Elephant_A_617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%5 == 0){
            System.out.println(n/5);
            return;
        }
        System.out.println((n/5)+1);
    }
}
