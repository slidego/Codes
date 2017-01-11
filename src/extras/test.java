package extras;


import jdk.nashorn.internal.parser.Scanner;

import java.io.*;
import java.util.StringTokenizer;

public class test {
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

        int MOD = 1000000007;
        int n;
        boolean[] V;
        StringBuilder a = new StringBuilder();
        int sum=0;

        public void solve(InputReader scan, PrintWriter out) {
            V = new boolean[n];
            int t=scan.nextInt();
        }

        void subsets(int i) {
            if (i == n) {
                for (int j = 0; j < n; j++)
                    if (V[j])
                        a.append(x);
                if(Integer.parseInt(a.toString())%8==0) sum=(sum+1)%MOD;

            } else {
                V[i] = true;
                subsets(i + 1);
                V[i] = false;
                subsets(i + 1);
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

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}