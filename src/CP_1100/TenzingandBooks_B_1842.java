package CP_1100;


import java.util.Scanner;
public class TenzingandBooks_B_1842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x =  sc.nextInt();

            int[]a = new int[n];
            int[]b = new int[n];
            int[]c = new int[n];

//            int n = 5;
//            int x = 2;
//            int[]a = {3,2,3,4,5};
//            int[]b = {5,4,3,2,1};
//            int[]c = {3,3,5,7,9};

            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            for(int i=0; i<n; i++) b[i] = sc.nextInt();
            for(int i=0; i<n; i++) c[i] = sc.nextInt();

            if(x == 0){
                System.out.println("YES");
                continue;
            }

            String ans = fun(a,b,c,x);

            System.out.println(ans);
        }
    }

    public static String fun(int[]a, int[]b, int[]c , int x){
        int ai =0;
        int bi =0;
        int ci =0;
        int n = a.length;
        boolean ans = false;

        int acan =1;
        int bcan =1;
        int ccan =1;

        int sum =0;

        while(acan ==1 || bcan == 1 || ccan ==1){
            if(acan == 1){
                if((sum | a[ai]|x) == x ){
                    sum |= a[ai++];
                }
                else acan = 0;
            }
            if(ai ==n) acan =0;

            if(bcan == 1){
                if((sum | b[bi]|x) == x ){
                    sum |= b[bi++];
                }
                else bcan = 0;
            }
            if(bi ==n) bcan =0;

            if(ccan == 1){
                if((sum | c[ci]|x) == x ){
                    sum |= c[ci++];
                }
                else ccan = 0;
            }
            if(ci ==n) ccan =0;

            if(sum == x){
                ans = true;
                break;
            }
        }
        return (ans == true) ? "YES" : "NO";
    }
}
