package Implementation;

import java.util.Scanner;

public class cAPSOCK_A_131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int flag1 = 0;
        int flag2 = 1;

        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                flag2 = 0;
                break;
            }
        }

        char c = str.charAt(0);
        if(Character.isUpperCase(c) && flag2 == 1) System.out.println(fun(str , 1));
        else if(flag2 == 1) System.out.println(fun(str,0));
        else System.out.println(str);
    }

    public static String fun(String str, int xx){
        String s = "";

        s+= (xx == 1) ? Character.toLowerCase(str.charAt(0)) : Character.toUpperCase(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            s+= Character.toLowerCase(str.charAt(i));
        }
        return s;
    }
}
