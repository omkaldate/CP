package BinarySearch;

import java.util.Scanner;

public class MagicPowder_1_D1_670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int magic = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int[]have = new int[n];
        for(int i=0; i<n; i++) have[i] = sc.nextInt();

        int l = 0;
        int r = 2000;
        int ans = 0;

        while(l <= r){
            int mid = l+(r-l)/2;

            if(possible(mid, arr, have, magic)){
                l = mid+1;
                ans = Math.max(ans, mid);
            }
            else r = mid-1;
        }

        System.out.println(ans);
    }

    public static boolean possible(int target, int[]arr, int[]have, int magic){
        int n = arr.length;


        for(int i =0; i<n; i++){
            if(arr[i] * target <= have[i]) continue;
            int diff = arr[i]*target - have[i];
            magic -= diff;

            if(magic < 0) return false;
        }

        return true;
    }
}
