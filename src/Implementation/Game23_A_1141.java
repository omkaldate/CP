package Implementation;

import java.util.Scanner;

public class Game23_A_1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        int ans = find(n, m, 0);
        if(ans == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);
    }

    public static int find(long n, long m, int cnt){
        if(n == m) return cnt;
        if(n > m) return Integer.MAX_VALUE;

        int val1 = find(n*2, m, cnt+1);
        int val2 = find(n*3, m, cnt+1);

        return Math.min(val1, val2);

    }
}
