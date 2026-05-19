package Maths;

import java.util.Scanner;
public class Heating_A_1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       // System.out.println(4/6 + " " + 4%6);

        for(int i=0; i<n; i++){
            long ans = 0;

            int ci = sc.nextInt();
            int sumi = sc.nextInt();

            int div = sumi / ci;
            int mod = sumi % ci;

            ans += (ci - mod) * (div*div);
            ans += mod * ((div+1)*(div+1));

            System.out.println(ans);

        }

    }
}
