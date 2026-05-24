package CP_1000;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Arraymerging_B_1831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();

            int[]ar1 =  new int[n];
            int[] ar2 =  new int[n];

            for(int i=0; i<n; i++){
                ar1[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                ar2[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> mp1 =  new HashMap<>();
            HashMap<Integer,Integer> mp2 =  new HashMap<>();

            mp1 = fun(ar1);
            mp2 = fun(ar2);

//            for(Map.Entry<Integer,Integer> mx : mp1.entrySet()){
//                System.out.println(mx.getKey() + " " + mx.getValue());
//            }

            int ans = Math.max( maxiAns(mp1,mp2), maxiAns(mp2,mp1) );

            System.out.println(ans);

        }
    }
    public static int maxiAns(HashMap<Integer,Integer>mp1, HashMap<Integer,Integer>mp2){
        int ans = 0;

        for(Map.Entry<Integer,Integer> xx : mp1.entrySet()) {
            int tempAns = 0;

            int map1Key = xx.getKey();
            int map1Val = xx.getValue();
            tempAns = map1Val;

            if(mp2.containsKey(map1Key)){
                int map2val = mp2.get(map1Key);
                tempAns += map2val;
            }
            ans = Math.max(ans, tempAns);
        }
        return ans;
    }

    public static HashMap<Integer, Integer> fun(int[]ar1){
        int n = ar1.length;
        HashMap<Integer,Integer> mp1 =  new HashMap<>();


        int m =0;
        for(int i=0; i<n; i++){
            int val = ar1[i];

            if(!mp1.containsKey(val)){
                mp1.put(val,1);
                m=1;
            }

            if(i > 0) {
                if (val == ar1[i - 1]) {
                    m++;
                    mp1.put(val, Math.max(mp1.get(val), m));
                }
                else {
                    m = 1;
                }
            }
        }
        return mp1;
    }
}
