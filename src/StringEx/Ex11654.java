package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();;
        int a = (int) s.charAt(0);
        System.out.println(a);
    }
}
