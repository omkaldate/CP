package DIV_1_2.Round29;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleConstruction_B_2147 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n * 2];
            Arrays.fill(arr, 1);

            if (n % 2 == 0) findAns(n, arr, true);
            else findAns(n, arr, false);
        }
    }

    public static void findAns(int n, int[]arr, boolean startEnd){
        int i=n;
        if(!startEnd) i = n-1;

        int ind = (2*n)-1;

        while(i > 1){
            while( ind>=0 && arr[ind] != 1) ind--;
            if(arr[ind-i] == 1){
                arr[ind] = i;
                arr[ind-i] = i;
            }
            i -= 2;
        }

        i = n-1;
        if(!startEnd) i= n;

        ind = (2*n)-1;

        while(i > 1){
            while( ind>=0 && arr[ind] != 1) ind--;
            if(arr[ind-i] == 1){
                arr[ind] = i;
                arr[ind-i] = i;
            }
            i -= 2;
        }
        //System.out.println(Arrays.toString(arr));

        for(int x=0; x<arr.length; x++) System.out.print(arr[x] + " ");
        System.out.println();

//        HashMap<Integer, Integer> mpp = new HashMap<>();
//        for(int x=0; x<arr.length; x++){
//            mpp.put(arr[x], mpp.getOrDefault(arr[x],0)+1);
//        }
//
//        for(Map.Entry<Integer, Integer> xx : mpp.entrySet()){
//            System.out.println(xx.getKey()+ " " + xx.getValue());
//            if(xx.getValue() != 2) System.out.println("error");
//        }
    }

}
