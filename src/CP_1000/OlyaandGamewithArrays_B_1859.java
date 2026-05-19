package CP_1000;

import java.util.Scanner;

public class OlyaandGamewithArrays_B_1859 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long minFirst = Long.MAX_VALUE;
            long minSecond = Long.MAX_VALUE;
            long secondSum = 0;

            for (int i = 0; i < n; i++) {

                int len = sc.nextInt();

                long minF = Long.MAX_VALUE;
                long minS = Long.MAX_VALUE;

                for (int j = 0; j < len; j++) {

                    long val = sc.nextLong();

                    if (val < minF) {
                        minS = minF;
                        minF = val;
                    }
                    else if (val < minS) {
                        minS = val;
                    }
                }

                minFirst = Math.min(minFirst, minF);
                minSecond = Math.min(minSecond, minS);
                secondSum += minS;
            }

            long ans = secondSum - minSecond + minFirst;
            System.out.println(ans);
        }

        sc.close();
    }
}