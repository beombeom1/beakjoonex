package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int nn = s.length();
        int n = Integer.parseInt(s);
        int result = 0;

        for(int i = (n - (nn * 9)); i < n; i++) {
            int sum = 0;
            int j = i;
            while (j != 0) {
                sum += j % 10;
                j /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}