package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int i1 = Integer.parseInt(s[0]);
        int i2 = Integer.parseInt(s[1]);
        int i3 = Integer.parseInt(s[2]);
        int i4 = Integer.parseInt(s[3]);
        int i5 = Integer.parseInt(s[4]);
        int i6 = Integer.parseInt(s[5]);

        int x = 0, y = 0;

        for (int n1 = -999; n1 < 1000; n1++) {
            for (int n2 = -999; n2 < 1000; n2++) {
                if ((i1 * n1) + (i2 * n2) == i3 && (i4 * n1) + (i5 * n2) == i6) {
                    x = n1;
                    y = n2;
                    break;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
