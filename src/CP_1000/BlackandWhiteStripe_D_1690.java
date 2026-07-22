package CP_1000;

import java.util.Scanner;

public class BlackandWhiteStripe_D_1690 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[]arr =  new int[n];
            String s = sc.next();

            for(int i=0; i<n; i++){
                char c = s.charAt(i);
                if(c == 'B') arr[i] = 1;
            }

            int ones = 0;
            int ans = Integer.MAX_VALUE;

            int i=0;
            int j = 0;

            while(j < n){
                if(j < k){
                    if(arr[j] == 1) ones++;
                }

                else{
                   ans = Math.min(ans, k-ones);
                    if(arr[j] == 1) ones++;
                    if(arr[i] == 1) ones--;
                    i++;
                }
                j++;

            }
            ans = Math.min(ans, k-ones);

            System.out.println(ans);
        }
    }
}
