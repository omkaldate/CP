package CP_1000;

import java.util.Scanner;

public class ohnnyandAncientComputer_1362 {
    public static void main(String[] aegs){
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a== b){
                System.out.println(0);
                continue;
            }

            if(a < b) System.out.println(fSmall(a,b));
            else System.out.println(fBig(a,b));

        }
    }

    public static int fSmall(long a, long b){
        int ans = 0;

        while(a < b) {
            boolean flag = false;
            if (a*8 <= b) {
                ans++;
                a *= 8;
                flag = true;
            }
            else if(a*4 <= b){
                ans++;
                a*=4;
                flag = true;
            }
            else if(a*2 <= b){
                ans++;
                a*=2;
                flag = true;
            }

            if(flag == false) return -1;
        }
        return ans;
    }



    public static int fBig(long a, long b){
        int ans = 0;

        while(a > b) {
            boolean flag = false;
            if (a/8 >= b && a%8 ==0) {
                ans++;
                a /= 8;
                flag = true;
            }
            else if(a/4 >= b && a%4 ==0){
                ans++;
                a/=4;
                flag = true;
            }
            else if(a/2 >= b && a%2 ==0){
                ans++;
                a/=2;
                flag = true;
            }

            if(flag == false) return -1;
        }
        return ans;
    }
}
