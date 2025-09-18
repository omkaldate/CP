package DIV_2.Round1051;

import java.util.Scanner;

public class AllLengthsSubtraction_A_2143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int[]arr = new int[n];
            int mInd = 0;

            for(int i=0; i<n; i++){
                arr[i] =sc.nextInt();
                if(arr[mInd] < arr[i]) mInd = i;
            }


            int i = mInd-1;
            int j = mInd+1;
            int dif = 1;

            for(int x=0; x<n-1; x++){
                boolean flag = false;
                if(i >=0 && arr[mInd]-arr[i] == dif){
                    i--;
                    flag = true;
                }
                else if(j<n && arr[mInd] - arr[j] == dif){
                    j++;
                    flag = true;
                }
                dif++;
                if(flag == false) break;

            }

            if(i==-1 && j==n) System.out.println("YES");
            else System.out.println("NO");



        }

    }
}
