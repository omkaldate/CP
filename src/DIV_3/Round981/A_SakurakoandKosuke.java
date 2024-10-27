package DIV_3.Round981;

import java.util.Scanner;

public class A_SakurakoandKosuke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int val = sc.nextInt();

            if(val %2 == 0) System.out.println("Sakurako");
            else System.out.println("Kosuke");
        }
    }
}
