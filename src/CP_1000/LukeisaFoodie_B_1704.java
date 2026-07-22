package CP_1000;

import java.util.Scanner;
public class LukeisaFoodie_B_1704 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[]arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

             int gap = x*2;
             int ch = 0;

             int xl = arr[0];
             int u = 0;
             int l = 0;

             for(int i=1; i<n; i++){
                 int val = arr[i];

                 if(xl != -1){
                     if(Math.abs(val-xl) <= gap){
                         if(val < xl){
                             u = xl;
                             l = val;
                         } else{
                             u = val;
                             l = xl;
                         }
                         xl = -1;
                     } else{
                         ch++;
                         xl = val;
                     }
                 }else{
                     if(val > u){
                         if(Math.abs(val- l) <= gap) u=val;
                         else{
                             ch++;
                             xl = val;
                             l=0;
                             u=0;
                         }
                     } else if(val < l){
                         if(Math.abs(u- val) <= gap) l=val;
                         else{
                             ch++;
                             xl = val;
                             l=0;
                             u=0;
                         }
                     }
                 }

             }
            System.out.println(ch);
        }

    }
}
