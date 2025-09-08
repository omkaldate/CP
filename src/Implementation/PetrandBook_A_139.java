package Implementation;

import java.util.Scanner;

public class PetrandBook_A_139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]arr = new int[7];
        for(int i=0; i<7; i++) arr[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i<7; i++) sum += arr[i];

        if(n > sum) {
            n %= sum;
            if (n == 0) n = sum;
        }

        int date = 1;
        for (int i = 0; i < 7; i++) {
            n -= arr[i];
            if (n <= 0) break;
            date++;
        }
        System.out.println(date);
    }
}
