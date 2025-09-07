package Implementation;

import java.util.Scanner;

public class VanyaandCubes_A_492 {
    public static long find(int num, long prev, long i, long sum){

        if(sum+prev+i > num) return i-1;

        return find(num, prev+i, i+1, sum+prev+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = (int) find(num, 0L, 0L, 0L);
        System.out.println(ans);
    }
}
