package CP_1300;

import java.util.Scanner;
public class Shuffle_B_1366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int x =  sc.nextInt();
            int m =  sc.nextInt();
            int[][]query = new int[m][2];
            for(int i=0; i<m; i++){
                query[i][0] =  sc.nextInt();
                query[i][1] = sc.nextInt();
            }

            int pLi = 0;
            int pRi = 0;

            boolean first = true;
            for(int[]q : query){
                int li = q[0];
                int ri = q[1];

                if(first && x >= li && x <=ri){
                    pLi = li;
                    pRi = ri;
                    first = false;
                    continue;
                }

                if(!first && li< pLi && ri > pRi){
                    pLi = li;
                    pRi = ri;
                }
               else if(!first && li < pLi && ri >= pLi){
                    pLi = li;

                }
               else if(!first && li <= pRi && ri > pRi){
                    pRi = ri;
               }

            }

                System.out.println(pRi - pLi +1);


        }
    }
}
