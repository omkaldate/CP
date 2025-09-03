package Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KefaandPark_C_580 {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();


            int n = in.nextInt();
            int m = in.nextInt();

            int[] cats = new int[n];
            for (int i = 0; i < n; i++) {
                cats[i] = in.nextInt();
            }

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) list.add(new ArrayList<>());

            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                list.get(u).add(v);
                list.get(v).add(u);
            }

            int ans = dfs(list, cats, m, 0, -1, cats[0]);
            System.out.println(ans);


            out.close();
        } catch (Exception e) {
            return;
        }
    }

    public static int dfs(ArrayList<ArrayList<Integer>> list, int[] cat, int m, int node, int parent, int consecutive) {
        if (consecutive > m) return 0;

        boolean isLeaf = true;
        int ans = 0;

        for (int nei : list.get(node)) {
            if (nei != parent) {
                isLeaf = false;
                if (cat[nei] == 1) ans += dfs(list, cat, m, nei, node, consecutive + 1);
                else ans += dfs(list, cat, m, nei, node, 0);
            }
        }


        if (isLeaf) return 1;
        return ans;
    }
}
