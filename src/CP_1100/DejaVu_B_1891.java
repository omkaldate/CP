package CP_1100;


import java.util.Scanner;
public class DejaVu_B_1891 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
       while(t-- > 0) {
           int n = sc.nextInt();
           int q = sc.nextInt();

           int[] arr1 = new int[n];
           int[] arr2 = new int[q];

           for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
           for (int i = 0; i < q; i++) arr2[i] = sc.nextInt();
           int[] track =  new int[31];

           for (int i = 0; i < q; i++) {
               int qVal = arr2[i];
               int div = (int) Math.pow(2, qVal);
               int add = (int) Math.pow(2, qVal- 1);

               if(track[qVal] == 1) continue;
               process(arr1,div,add);

               track[qVal] = 1;
           }

           for (int i = 0; i < n; i++) {
               System.out.print(arr1[i] + " ");
           }
           System.out.println();
       }
    }

    public static void process(int[]nums, int div, int add){
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % div == 0) nums[j] += add;
        }
    }
}
