package CP_1000;


import java.util.Scanner;
public class Raspberries_c_1833 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();


            int[]arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            if(k !=4){
                int ans = 5;
                for(int i=0; i<n; i++){
                    if(arr[i] %k == 0){
                        ans = 0;
                        break;
                    }
                    else{
                        ans = Math.min(ans,  k - (arr[i] %k));
                    }
                }
                System.out.println(ans);
            }
            else{
                int evenCnt = 0;
                boolean isDiv = false;
                for(int i=0; i<n; i++){
                    if(arr[i] %2 == 0) evenCnt++;
                    if(arr[i]%k == 0){
                      isDiv = true;
                    }
                }

                if(isDiv || evenCnt >= 2){
                    System.out.println(0);
                    continue;
                }
                if(evenCnt == 1){
                    System.out.println(1);
                }
                else {
                    int ans=2;
                    for(int i=0; i<n; i++){
                        if(arr[i]%k == 3){
                            ans = 1;
                        }
                    }
                    System.out.println(ans);
                }
            }


        }
    }
}
