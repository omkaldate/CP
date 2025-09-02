package Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class AntonandPolyhedrons_A_785 {
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

            long ans = 0L;

            for(int i=0; i<n; i++){
                String shape = in.next();

                if(shape.equals("Tetrahedron")){
                    ans += 4;
                }
                if(shape.equals("Cube")){
                    ans += 6;
                }
                if(shape.equals("Octahedron")){
                    ans += 8;
                }
                if(shape.equals("Dodecahedron")){
                    ans += 12;
                }
                if(shape.equals("Icosahedron")){
                    ans += 20;
                }
            }

            System.out.println(ans);

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
