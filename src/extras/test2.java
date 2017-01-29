package extras;

import java.io.*;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Random;

public class test2 {
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
            int n=scan.nextInt();
            int k=scan.nextInt();
            int count=1;
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            for(int i = (int) (Math.sqrt(n)+1); i>0; i--){
                if(n%i==0){
                    if(!queue.contains(i))queue.add(i);
                    if(!queue.contains(n/i))queue.add(n/i);
                }
            }
            int a=-1;
            while (k!=0){
                try{
                    a=queue.poll();
                }
                catch (NullPointerException x){
                    a=-1;
                }
                k--;
            }
            out.println(a);
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
    }
}