package Implementation;

import java.util.Scanner;

public class RepeatingCipher_A_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();

        int i=0;
        int prev = 0;
        String ans = "";
        while( prev+i < n){
            ans += str.charAt(prev +i);
            prev = prev+i;
            i++;
        }
        System.out.println(ans);
    }
}
