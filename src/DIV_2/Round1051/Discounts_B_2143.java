package DIV_2.Round1051;

import java.util.Arrays;
import java.util.Scanner;

public class Discounts_B_2143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[]products = new int[n];
            for(int i=0; i<n; i++) products[i] = sc.nextInt();

            int[]voucher = new int[k];
            for(int i=0; i<k; i++) voucher[i] = sc.nextInt();

            Arrays.sort(voucher);
            Arrays.sort(products);

            long cost = 0;
            int vInd = 0;
            int lInd = n-1;
            int i= n-1;
            while(i >=0){
                if(voucher[vInd] > i+1){
                    lInd = i;
                    break;
                }

                for(int x=0; x<voucher[vInd]-1; x++){
                    cost += products[i--];
                }
                i--;
                lInd = i;
                vInd++;

                if(vInd == k)break;
            }

            for(int x=0; x<= lInd; x++) cost += products[x];

            System.out.println(cost);
        }
    }
}
