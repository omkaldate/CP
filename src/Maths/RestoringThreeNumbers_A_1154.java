package Maths;

import java.util.Arrays;
import java.util.Scanner;
public class RestoringThreeNumbers_A_1154 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int[]arr = new int[4];
        for(int i=0; i<4; i++) arr[i] =sc.nextInt();

        Arrays.sort(arr);

        int c = arr[3]-arr[0];
        int b = arr[2]-c;
        int a = arr[0]-b;

        System.out.println(a + " " + b + " " + c);
    }
}
