import java.util.Scanner;

public class Prakruti {

    public static void main(String[] args) {

        int a = 923456;

        int last = a % 10;
        

        int first = a / 100000;

        int mid = a % 100000;
        mid -= a % 10;
        mid += (last * 100000 );
        //mid *= 10;
        mid += first;

        System.out.println(mid);



    }
}











