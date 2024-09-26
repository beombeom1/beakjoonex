package Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);
        int E = Integer.parseInt(s[4]);

        int P1 = (A^2 + B^2 + C^2 + D^2 + E^2) % 10;
        int P2 = (A*A + B*B + C*C + D*D + E*E) % 10;
        System.out.println(P1);
        System.out.println(P2);
    }
}
