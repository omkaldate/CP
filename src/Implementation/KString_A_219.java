package Implementation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class KString_A_219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        String s = sc.next();
        HashMap<Character, Integer> mpp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        }

        int flag = 0;
        String str = "";

        for(Map.Entry<Character, Integer> x : mpp.entrySet()){
            int val = x.getValue();

            if(val%k !=  0){
                flag = 1;
                break;
            }
            int cnt = val/k;
            for(int i=0; i<cnt; i++) str += x.getKey();
        }
        if(flag == 1){
            System.out.println(-1);
            return;
        }

        String ans = "";
        for(int i=0; i<k; i++){
            ans += str;
        }

        System.out.println(ans);
    }
}
