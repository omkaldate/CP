package Implementation;

import java.util.Scanner;

public class WrongSubtraction_A_977 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0){
            int rem = num%10;

            if(rem == 0) num /= 10;
            else num --;
        }

        System.out.println(num);

        sc.close();
    }
}
