package CP_1000;

import java.util.Scanner;

public class RedVersusBlue_A_1659 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n  = sc.nextInt();
            int r = sc.nextInt();
            int b =  sc.nextInt();

            int gap = r/(b+1);
            int rem = r%(b+1);

            StringBuilder str = new StringBuilder();

            for(int i=0; i<n; i++){
                for (int j = 0; j < ((rem > 0) ? gap + 1 : gap)  && i<n; j++) {
                    str.append('R');
                    i++;
                }
                if(rem > 0) rem--;
                if(i<n) str.append('B');
            }

            System.out.println(str.toString());
        }
    }
}
