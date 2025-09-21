package DIV_2.Round1052;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MergingtheSets_B_2146 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<ArrayList<Integer>> larr = new ArrayList<>();

            for(int i=0; i<n; i++){
                ArrayList<Integer>ls = new ArrayList<>();
                int len = sc.nextInt();

                for(int j=0; j<len; j++){
                    ls.add(sc.nextInt());
                }
                larr.add(ls);
            }

            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(ArrayList<Integer> ls : larr){
                for(int x : ls) mpp.put(x, mpp.getOrDefault(x,0)+1);
            }

            if(mpp.size() < m){
                System.out.println("NO");
                continue;
            }

            int cnt = 0;

            for(int xx =0; xx <n; xx++){
                HashMap<Integer,Integer> dumMap = new HashMap<>(mpp);
                cnt += fun(xx,larr, m, dumMap);

                if(cnt == 2) break;
            }

            if(cnt == 2) System.out.println("YES");
            else System.out.println("NO");

        }
    }

    public static int fun(int i, ArrayList<ArrayList<Integer>> ls, int m, HashMap<Integer,Integer> mpp){

        int len = ls.get(i).size();

        for(int x=0; x<len; x++){
            int val = ls.get(i).get(x);

            int cnt = mpp.get(val);
            cnt--;

            if(cnt == 0) return 0;
            mpp.put(val, cnt);
        }
        return 1;
    }
}

