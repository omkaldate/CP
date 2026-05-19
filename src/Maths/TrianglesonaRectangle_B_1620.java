package Maths;
import java.io.*;
import java.util.*;

public class TrianglesonaRectangle_B_1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long w = Long.parseLong(st.nextToken());
            long h = Long.parseLong(st.nextToken());

            long ans = 0;

            // bottom side
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            long[] a = new long[k];
            for (int i = 0; i < k; i++) a[i] = Long.parseLong(st.nextToken());
            ans = Math.max(ans, (a[k - 1] - a[0]) * h);

            // top side
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            a = new long[k];
            for (int i = 0; i < k; i++) a[i] = Long.parseLong(st.nextToken());
            ans = Math.max(ans, (a[k - 1] - a[0]) * h);

            // left side
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            a = new long[k];
            for (int i = 0; i < k; i++) a[i] = Long.parseLong(st.nextToken());
            ans = Math.max(ans, (a[k - 1] - a[0]) * w);

            // right side
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            a = new long[k];
            for (int i = 0; i < k; i++) a[i] = Long.parseLong(st.nextToken());
            ans = Math.max(ans, (a[k - 1] - a[0]) * w);

            System.out.println(ans);
        }
    }
}
