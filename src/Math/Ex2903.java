package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        int r = 2;
        for(int i = 0; i < N; i++) {
            r = (r * 2) - 1;
        }
        System.out.println(r * r);
    }
}
