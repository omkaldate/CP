package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ErasingZeroes_A_1303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            String str = sc.next();
            int first = str.indexOf("1");      // first occurrence
            int last = str.lastIndexOf("1");   // last occurrence

                int zeros = 0;
                for(int i=first+1; i<last ; i++){
                    if(str.charAt(i) == '0') zeros++;
                }
            System.out.println(zeros);

        }
        sc.close();
    }
}
