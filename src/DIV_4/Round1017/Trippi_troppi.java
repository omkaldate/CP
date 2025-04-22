package DIV_4.Round1017;
import java.util.Scanner;

public class Trippi_troppi {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String str = sc.nextLine();

            String[] s = str.split(" ");
            String ans = "";
            ans += s[0].charAt(0);
            ans += s[1].charAt(0);
            ans += s[2].charAt(0);

            System.out.println(ans);
        }
    }
}
