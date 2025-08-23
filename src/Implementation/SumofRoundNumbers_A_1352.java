package Implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SumofRoundNumbers_A_1352 {
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
            int testCases = in.nextInt();
            while(testCases-- > 0){

                int n = in.nextInt();

                ArrayList<Integer> ans = new ArrayList<>();

                while(n !=0){
                    int bits = (int) Math.log10(n)+1;
                    int mask = (int) Math.pow(10, bits-1);
                    int firstVal = n/mask;

                    ans.add(firstVal * mask);

                    n %= mask;
                }

                out.println(ans.size());
                for(int i=0; i<ans.size(); i++){
                    out.print(ans.get(i) + " ");
                }
            }

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
