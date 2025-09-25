package DIV_3.Round1054;

import java.util.*;

public class MEXrose_C_2149{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int kCount = 0;
            Set<Integer> set = new HashSet<>();
            boolean hasK = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == k){
                    hasK = true;
                    kCount++;
                }
                set.add(a[i]);
            }

            boolean allPresent = true;
            int absCount = 0;
            for (int i=0; i < k; i++) {
                if (!set.contains(i)) {
                    allPresent = false;
                    absCount++;
                }
            }

            if (allPresent || k == 0) {
                System.out.println(hasK ? kCount : 0);
            } else {
               if(absCount < kCount) System.out.println(absCount + (kCount-absCount));
               else System.out.println(absCount - kCount);
            }
        }
    }
}
