package Implementation;

import java.util.Scanner;

public class StringTask_A_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";

        for(int i=0; i<str.length(); i++){
            if(! isVovel(str.charAt(i))){
                ans += '.';
                ans += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }

    public static boolean isVovel(char c){
        char ch = Character.toLowerCase(c);

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') return true;

        return false;
    }
}
