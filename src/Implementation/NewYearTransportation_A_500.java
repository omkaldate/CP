package Implementation;

import java.util.Scanner;

public class NewYearTransportation_A_500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[]arr = new int[n-1];
        for(int i=0; i<n-1; i++) arr[i] = sc.nextInt();

        boolean ans = dfs(arr, 0, n-1, target-1);

        if(ans == true) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean dfs(int[]arr, int ind, int n, int target){
        if(ind == target) return true;
        if(ind > target || ind >= arr.length) return false;

        return dfs(arr, ind+arr[ind], n, target);
    }
}
