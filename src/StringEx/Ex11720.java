package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int a = 0;

        String[] s = br.readLine().split("");

        for (int j = 0; j < i; j++) {
            a += Integer.parseInt(s[j]);
        }

        System.out.println(a);
    }
}

