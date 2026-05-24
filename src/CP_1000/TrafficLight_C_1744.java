package CP_1000;

import java.util.Scanner;
public class TrafficLight_C_1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String str = sc.next();

            int ans = 0;

            boolean got = false;
            int cnt = 0;

            for(int i=0; i<2*n; i++){
                char cur = str.charAt(i%n);

                if(ch == 'g' && cur == 'g'){
                    ans = 0;
                    break;
                }

                if(got){
                    cnt++;
                }

                if(cur == 'g'){
                    ans = Math.max(ans, cnt);
                    cnt = 0;
                    got = false;
                }

                if(!got && cur == ch){
                    cnt = 0;
                    got = true;
                }
            }
            System.out.println(ans);
        }
    }
}
