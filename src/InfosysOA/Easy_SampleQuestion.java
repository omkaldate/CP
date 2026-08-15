package InfosysOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Easy_SampleQuestion {
    public static void main(String[] args){
        int n = 5;
        int[] arr =  {0,1,1,2,2};
        int[] val = {2,3,6,12,27};

        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();

        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++){
            list.get(arr[i]).add(i+1);
        }

        int[]valBit = new int[n+1];
        HashMap<Integer,Integer> trackBitMap = new HashMap<>();
        makebitsTrack(val,trackBitMap);

        findOdd(trackBitMap,valBit, val);
        HashMap<Integer,Integer>ans = fun(list,arr,valBit,0);

        for(Map.Entry<Integer,Integer> x : ans.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }


    public static HashMap<Integer,Integer> fun(ArrayList<ArrayList<Integer>>list,int[]arr, int[]valBit, int ind){
            if(list.get(ind).size() == 0){
                HashMap<Integer,Integer> leafMap = new HashMap<>();
                leafMap.put(-1,0);
                leafMap.put(valBit[ind],1);

                return leafMap;
            }

        if(ind == 0 && list.get(ind).size() == 1){
            return fun(list, arr, valBit, list.get(ind).get(0));
        }
           int childL = list.get(ind).get(0);
           int childR = list.get(ind).get(1);

            HashMap<Integer,Integer>mpL =  fun(list,arr,valBit,childL);
            HashMap<Integer,Integer> mpR =  fun(list,arr,valBit,childR);

            int ans = 0;

         int curSign = valBit[ind];

         if(mpL.containsKey(curSign)) ans += mpL.get(curSign);
        if(mpR.containsKey(curSign)) ans += mpR.get(curSign);


        if(mpL.size() <= mpR.size()){
            int[]axx =  new int[1];
            mpL = mergeMaps(axx,mpL, mpR);
            ans += axx[0];
        }
        else{
            int[] axx = new int[1];
            mpL = mergeMaps(axx,mpR, mpL);
            ans += axx[0];
        }
        mpL.put(curSign, mpL.getOrDefault(curSign, 0) + 1);

        mpL.put(-1, mpL.get(-1)+ans);

        return mpL;

    }

    public static void makebitsTrack(int[] arr, HashMap<Integer, Integer> mp) {
        int bit = 0;

        for(int x : arr) {
            int val = x;
            for(int j = 2; j * j <= val; j++) {

                if(val % j == 0) {
                    if(!mp.containsKey(j)) {
                        mp.put(j, bit++);
                    }
                    while(val % j == 0) {
                        val /= j;
                    }
                }
            }

            if(val > 1) {
                if(!mp.containsKey(val)) {
                    mp.put(val, bit++);
                }
            }
        }
    }

    public static HashMap<Integer,Integer> mergeMaps(int[] cross, HashMap<Integer,Integer> mp1, HashMap<Integer,Integer> mp2) {
        int totalAns = mp1.get(-1) + mp2.get(-1);

        for(Map.Entry<Integer,Integer> e : mp1.entrySet()) {
            int signature = e.getKey();
            int count1 = e.getValue();

            if(signature == -1) continue;

            if(mp2.containsKey(signature)) {
                int count2 = mp2.get(signature);
                cross[0] += count1 * count2;
                mp2.put(signature, count1 + count2);
            } else {
                mp2.put(signature, count1);
            }
        }
        mp2.put(-1, totalAns);

        return mp2;
    }

    public static void findOdd(HashMap<Integer,Integer> mx , int[]valBit,int[]arr ){
         for(int i=0; i<arr.length; i++){
             int val = arr[i];
             int mask = 0;

             for(int j=2; j*j <= val; j++){
                 if(val %j == 0){
                     int cnt =0;
                     while(val%j ==0){
                         val /= j;
                         cnt ++;
                     }
                     if(cnt %2 == 1){
                         int shift = mx.get(j);
                         mask |= (1 << shift);
                     }
                 }
             }

             if(val >1){
                 int shift = mx.get(val);
                 mask |= (1 << shift);
             }

             valBit[i+1] = mask; //////////////////
         }
    }
}
