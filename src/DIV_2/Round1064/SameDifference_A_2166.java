package DIV_2.Round1064;

import java.util.Scanner;

public class SameDifference_A_2166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s =  sc.next();

            int ans = 0;

            char last = s.charAt(n-1);
            for(int i=n-2; i>=0; i--){
                if(s.charAt(i)!= last) ans++;
            }

            System.out.println(ans);
        }
    }
}
