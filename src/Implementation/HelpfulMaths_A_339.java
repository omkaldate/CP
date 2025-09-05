package Implementation;


import java.util.Scanner;

public class HelpfulMaths_A_339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int one = 0;
        int two = 0;
        int three = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '1') one++;
            if (ch == '2') two++;
            if (ch == '3') three++;
        }

        String s = "";

        for (int i = 0; i < one; i++){
            s += '1';
            s += '+';
       }
        for (int i = 0; i < two; i++){
            s += '2';
            s += '+';
        }
        for (int i = 0; i < three; i++){
            s += '3';
            s += '+';
        }
        System.out.println(s.substring(0, s.length()-1));
    }
}
