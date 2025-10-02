package Maths;

import java.util.Scanner;

public class EvenArray_B_1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int evCnt = 0;
            int odCnt = 0;
            int evCorrectInd = 0;

            for(int i=0; i<n; i++){
                int val = sc.nextInt();
                if(val%2 == 0){
                    evCnt++;
                    if(i%2 == 0) evCorrectInd++;
                }
                else odCnt++;
            }
       //     System.out.println((n+1)/2);
            if(n%2 == 0){
                 if(odCnt != evCnt){
                     System.out.println(-1);
                     continue;
                 }
                System.out.println((n/2) - evCorrectInd);
            }
            else{
                if(n/2 != odCnt){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(((n+1)/2) - evCorrectInd);
            }

        }
    }
}
