package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        for (int j = 0; j < i; j++){
            String s = br.readLine();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        }

    }
}
