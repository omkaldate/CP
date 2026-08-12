package CP_1000;

import java.util.Scanner;
public class BuyingTorches_A_1418 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();

        while(t -- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            long ans = k;

            long needStick = (1L*k *y)+k-1;
            ans += needStick/(x-1);

            if(needStick % (x-1) != 0) ans++;
            System.out.println(ans);

        }
    }
}
