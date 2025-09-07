package Implementation;

import java.util.Scanner;

public class BoringApartments_A_1433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-- > 0){

            int stop = sc.nextInt();
            int len = Integer.toString(stop).length();
            int vals = stop%10;

            int ans = 0;

            for(int i=1; i<vals; i++){
               ans += 10;
            }

                for(int x =1; x<=len; x++){
                    ans += x;
                }

            System.out.println(ans);
        }
        sc.close();
    }
}
