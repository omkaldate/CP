package CP_1000;

import java.util.Scanner;

public class DistinctSplit_D_1791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            String str = sc.next();

            int[]arr = new int[26];
            for(char ch : str.toCharArray()){
                int val =  ch-'a';
                arr[val]++;
            }

            int[] ar2 = new int[26];
            int ans = 0;

            for(int i=0; i<n; i++){
                char ch = str.charAt(i);
                int val = ch-'a';

                arr[val] --;
                ar2[val]++;
                int temp = 0;

                for(int j=0; j<26; j++){
                    if(arr[j] >0 && ar2[j]>0) temp+=2;
                    else if(arr[j]>0) temp++;
                    else if(ar2[j]>0)temp++;

                }
                ans =Math.max(ans, temp);

            }
            System.out.println(ans);
        }
    }
}
