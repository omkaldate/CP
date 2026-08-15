package CP_1100;

import java.util.Scanner;

public class LiHuaandPattern_B_1797 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][]arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

//            int n = 5;
//            int k = 4;
//            int[][]arr = {
//                    {0,0,0,0,0},
//                    {0,1,1,1,1},
//                    {0,1,0,0,0},
//                    {1,1,1,1,1},
//                    {0,0,0,0,0}
//            };

            int cnt =0;
            for(int i=0; i<n; i++){
                for(int j =0; j<n; j++){
                    if(arr[i][j] == -1 && arr[n-i-1][n-j-1] == -1) continue;
                    if(arr[i][j] != arr[n-i-1][n-j-1]) cnt++;
                    arr[i][j] = -1;
                    arr[n-i-1][n-j-1] = -1;
                }
            }

            if(cnt > k) System.out.println("NO");
            else if((k-cnt) %2 ==0 )System.out.println("YES");
            else if(n%2 ==1 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
