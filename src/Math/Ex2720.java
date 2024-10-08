package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        int q, d, n, p;
        for(int i = 0; i < t; i++) {
            String s1 = br.readLine();
            int t1 = Integer.parseInt(s1);
            q = t1 / 25;
            d = (t1 % 25) / 10;
            n = (t1 - (25 * q) - (10 * d)) / 5;
            p = (t1 % 5);
            System.out.print(q + " ");
            System.out.print(d + " ");
            System.out.print(n + " ");
            System.out.print(p + " ");
            System.out.println();
        }
    }
}
