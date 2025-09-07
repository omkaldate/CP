package Implementation;

import java.util.Scanner;

public class GennadyandaCardGame_A_1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String table = sc.next();

        String[] arr = new String[5];

        for(int i=0; i<5; i++) arr[i] = sc.next();

        boolean isFound = false;
        for(String s : arr){
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(1);

            if(table.charAt(0) == ch1 || table.charAt(1) == ch2){
                isFound = true;
                break;
            }
        }

        if(isFound == false) System.out.println("NO");
        else System.out.println("YES");
    }
}
