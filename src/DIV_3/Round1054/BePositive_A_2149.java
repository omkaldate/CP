package DIV_3.Round1054;

import java.util.Scanner;

public class BePositive_A_2149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int minus = 0;
            int zeros = 0;
            int ones = 0;

            for(int i=0; i<n; i++){
                int val = sc.nextInt();

                if(val == -1) minus++;
                if(val == 0) zeros ++;
                else ones++;
            }

            int ans = 0;
            ans += zeros;
            if(minus %2 != 0) ans += 2;

            System.out.println(ans);
        }
    }
}
