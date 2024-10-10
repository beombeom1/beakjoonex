package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int a2 = Integer.parseInt(s[1]);
        int a3 = Integer.parseInt(s[2]);

        int day = (a3 - a2) / (a1 - a2);

        if ((a3 - a2) % (a1 - a2) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
