package Implementation;

import java.util.Scanner;

public class FixYou_B_1391 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][]mat = new char[n][m];
            for (int i = 0; i < n; i++) {
                mat[i] = sc.next().toCharArray();
            }

            int ans =0;
            for(int i= 0; i<m-1; i++){
                if(mat[n-1][i] != 'R') ans++;
            }

            for(int i=0; i<n-1; i++){
                if(mat[i][m-1] != 'D') ans++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
