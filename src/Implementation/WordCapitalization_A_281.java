package Implementation;

import java.util.Scanner;
public class WordCapitalization_A_281 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        char ch = str.charAt(0);
        char up = Character.toUpperCase(ch);

        sb.setCharAt(0, up);

        System.out.println(sb.toString());
    }
}
