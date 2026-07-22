package Maths;


import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumber {
    public static void main(String[] args){

        int n = 36;


//        for(int i=2; i*i < n; i++){
//            if(n%i == 0){
//                System.out.println(" its not prime  " + i);
//                break;
//            }
//        }
//        System.out.println("its prime ");


        int a = 9;
        int b = 12;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for(int i=1; i*i <=a; i++){
            if(a%i == 0){
                list.get(0).add(i);

                if(a/i != i) list.get(0).add(a/i);
            }
        }

        for(int i=1; i*i <=b; i++){
            if(b%i == 0){
                list.get(1).add(i);

                if(b/i != i) list.get(1).add(b/i);
            }
        }

        Collections.sort(list.get(0));
        Collections.sort(list.get(1));

        System.out.println(list.get(0));
        System.out.println(list.get(1));


        int x=list.get(0).size()-1;
        int y = list.get(1).size()-1;

        while( x>=0  && y >= 0){
            int v1 = list.get(0).get(x);
            int v2 =  list.get(1).get(y);

            if(v1 > v2) x--;
            else if(v2 > v1) y--;
            else{
                System.out.println("GCD is "+ v1);
                break;
            }

        }


    }
}
