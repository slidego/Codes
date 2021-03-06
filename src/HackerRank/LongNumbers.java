package HackerRank;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Random;

public class LongNumbers {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        public void solve(InputReader scan, PrintWriter out) {
            int t=scan.nextInt();
            long x;
            for (int i = 0; i < t; i++) {
                x=scan.nextLong();
                if(x%7==0||x%7==4||x%4==0||(x%7==1&&x!=1)){
                    out.println("Yes");
                }
                else out.println("No");
            }
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong(){return Long.parseLong(next());}
    }
}