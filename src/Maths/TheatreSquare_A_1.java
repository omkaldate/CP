package Maths;

import java.util.Scanner;

public class TheatreSquare_A_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a =  sc.nextInt();

        long col = 0;
        if(n %a == 0){
            col = n/a;
        }
        else{
            col = n/a;
            col++;
        }

        long row =0;
        if(m %a == 0){
            row = m/a;
        }
        else{
            row = m/a;
            row++;
        }

        System.out.println( col * row);
    }
}
