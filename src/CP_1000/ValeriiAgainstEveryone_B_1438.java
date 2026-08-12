package CP_1000;


import java.util.Scanner;
import java.util.HashSet;
public class ValeriiAgainstEveryone_B_1438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int ans = fun(arr);
            if(ans == 1) System.out.println("yes");
            else System.out.println("no");

        }
    }

    public static int fun(int[]arr){
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])) return 1;
            set.add(arr[i]);
        }
        return 0;
    }
}