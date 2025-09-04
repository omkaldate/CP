package Implementation;

import java.util.Scanner;
public class BearandBigBrother_A_791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b && a == 1){
            System.out.println(a);
        }
        else{
            long limka =(long) a;
            long bob = (long) b;

            int years=0;
            while(limka <= bob){
                limka *= 3;
                bob *= 2;
                years++;
            }
            System.out.println(years);
        }
    }
}
