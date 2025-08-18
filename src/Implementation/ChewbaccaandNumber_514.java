package Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class ChewbaccaandNumber_514 {
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

//                long number = in.nextLong();
//                //long number = 420062703497L;  // for testing
//                long ans = 0;
//
//                while(number > 0){
//                    long digits = (long) Math.log10(number);
//                    long window = (long) Math.pow(10, digits);
//                    long firstDigi =  number / window;
//
//                    if(firstDigi == 9 && ans == 0){
//                        ans +=  firstDigi * window;
//                    }
//                    else{
//                        ans += (long) Math.min(firstDigi, 9-firstDigi) * window;
//                    }
//                    number %= window;
//                }
//             out.print(ans);


            String s = in.nextLine();
            StringBuilder ans = new StringBuilder();

            for (int i=0; i<s.length(); i++) {
                int d = s.charAt(i)-'0';

                if (i == 0 && d == 9) ans.append(9);
                else ans.append(Math.min(d, 9-d));
            }

            out.println(ans.toString());


            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
