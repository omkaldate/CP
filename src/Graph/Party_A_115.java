package Graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Party_A_115 {
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
            int[]arr = new int[n];
            Arrays.fill(arr, -1);
            int[][]graph = new int[n][2];

            for(int i=0; i<n; i++){
                graph[i][0] = i;
                graph[i][1] = in.nextInt();
            }

            int ans = 0;
            for(int i=0; i<n; i++) {
               ans = Math.max(ans, fun(arr, graph, i));
            }

            out.print(ans);

            out.close();
        } catch (Exception e) {
            return;
        }
    }

    public static int fun(int[]arr, int[][]graph, int i){
        if(arr[i] != -1) return arr[i];
        if(graph[i][1] == -1){
            arr[i] = 1;
            return 1;
        }

        int val = 1+fun(arr, graph, graph[i][1]-1);
        arr[i] = val;
        return arr[i];
    }
}
