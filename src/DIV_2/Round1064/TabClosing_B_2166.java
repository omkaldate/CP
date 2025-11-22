package DIV_2.Round1064;

import java.util.Scanner;

public class TabClosing_B_2166 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int t = sc.nextInt();
         while(t-- > 0){

             int a = sc.nextInt();
             int b =sc.nextInt();
             int n = sc.nextInt();

             int ans = 0;
             int curPtr = 0;

             for(int i=0; i<n; i++){
                 int div = a/(n-i);
                 int len = Math.min(b, div);

                 if(len != curPtr){
                     curPtr = len;
                     ans++;
                 }
             }

             System.out.println(ans);
         }
    }
}
