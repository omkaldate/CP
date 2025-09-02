package Implementation;

import java.io.*;
import java.util.*;

public class AmrandMusic_A_507 {
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
            int q = in.nextInt();

            int[]arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = in.nextInt();

            PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
            for(int i=0; i<n; i++){
                pq.offer(new int[]{arr[i], i+1});
            }

            ArrayList<Integer>list = new ArrayList<>();
            int ans =0;
            for(int i=0; i<n; i++){
                int[]x = pq.remove();
                if(q - x[0] >= 0){
                    q -= x[0];
                    ans++;
                    list.add(x[1]);
                }
                else break;
            }

            System.out.println(ans);
            for(int i=0; i<ans; i++) System.out.print(list.get(i) + " ");

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
