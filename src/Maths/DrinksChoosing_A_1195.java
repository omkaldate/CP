package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class DrinksChoosing_A_1195 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n =  sc.nextInt();
       int k = sc.nextInt();
       int []arr = new int[n];

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(new int[]{i, 0}); // tuple: {index, count}
        }

       for(int i=0; i<n; i++){
           int val = sc.nextInt();
           arr[i] = val;
           int[]tup = list.get(val %k);
           tup[1]++;

       }

        list.sort((a,b) -> b[1]-a[1]);

       int ans = 0;
       int allowed = (n+1)/2;
       int remaining = 0;

       for(int[]xx : list){
           if(allowed == 0) break;

           int cnt = 0;

           cnt+= xx[1]/2;
           if(xx[1] %2 == 1) remaining++;

           if(allowed >= cnt){
                allowed -= cnt;
                ans+= cnt*2;
           }
           else{
               ans+= allowed *2;
               break;
           }
       }

       ans += allowed;

        System.out.println(ans);
    }
}



