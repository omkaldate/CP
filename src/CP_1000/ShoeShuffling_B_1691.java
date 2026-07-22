//package CP_1000;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class ShoeShuffling_B_1691 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[]arr = new int[n];

            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
            }

            int stopFlag = 0;
            for(Map.Entry<Integer,Integer> mx : mpp.entrySet()){
                if(mx.getValue() == 1){
                    System.out.println(-1);
                    stopFlag = 1;
                    break;
                }
            }

            if(stopFlag == 1) continue;

            int[]ans =  new int[n];
            int s = -1;

            for(int i=0; i<n-1; i++){
                if(s == -1){
                    s = i;
                    ans[i] = i+1;
                }

                else if(i+1 < n && arr[i] == arr[i+1]){
                    ans[i] = i+1;
                }
                else{
                    ans[i] = s;
                    s=-1;
                }
            }
            ans[n-1] = s;

          for(int i=0; i<n; i++){
              System.out.print(ans[i]+1 + " ");
          }
            System.out.println();


        }
    }
}
