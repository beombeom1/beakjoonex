package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = a[0].split("");
        String[] c = a[1].split("");
        int q = Integer.parseInt(b[0]);
        int w = Integer.parseInt(b[1]);
        int e = Integer.parseInt(b[2]);
        int r = Integer.parseInt(c[0]);
        int t = Integer.parseInt(c[1]);
        int y = Integer.parseInt(c[2]);

        int qq = q + 10 * w + 100 * e;
        int ww = r + 10 * t + 100 * y;

        if(qq>ww){
            System.out.println(qq);
        }else {
            System.out.println(ww);
        }
    }
}
