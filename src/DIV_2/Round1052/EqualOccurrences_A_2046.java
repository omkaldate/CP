package DIV_2.Round1052;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualOccurrences_A_2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(int i=0; i<n; i++){
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            }

            int ans = 0;
            for(int i=1; i<=n; i++){
                ans = Math.max(ans, fun(i,mpp));
            }
            System.out.println(ans);
        }
    }

    public static int fun(int i, HashMap<Integer,Integer>mpp){
        int ans = 0;

        for(Map.Entry<Integer,Integer>mx : mpp.entrySet()){
            if(mx.getValue() >= i) ans += i;
        }
        return ans;
    }
}
