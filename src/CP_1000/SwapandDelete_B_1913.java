package CP_1000;

import java.util.Scanner;
public class SwapandDelete_B_1913 {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();

            int one = 0;
            int zero  = 0;

            for(char ch : s.toCharArray()){
                if( ch == '0') zero++;
                else one++;
            }

           int valid = Math.min(one,zero) * 2;

            int brk = valid;
            for(int i=0; i<s.length(); i++){
                char ch =  s.charAt(i);
                if(ch == '0'){
                    one--;
                }
                else zero--;
                valid--;

                if( one <0 || zero<0 || valid <0){
                    brk = i;
                    break;
                }
            }


            System.out.println(s.length() - brk);
        }
    }
}
