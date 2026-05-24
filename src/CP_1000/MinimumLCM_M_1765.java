package CP_1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumLCM_M_1765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();


            if(n%2 == 0){
                System.out.println(n/2 + " " + n/2);
                continue;
            }
            ArrayList<Integer> list= new ArrayList<>();

            func(list, n);
            Collections.sort(list);

            if(list.size() == 0){
                System.out.println(1 + " " + (n-1));
            }
            else{
                int a = list.get(list.size()-1);
                int b = n-a;
                System.out.println(a + " " + b);
            }

        }
    }

    public static void func(ArrayList<Integer> list , int n){

        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                list.add(i);

                if( i != n/i ){
                    list.add(n/i);
                }
            }

        }
    }
}
