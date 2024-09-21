package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int count = 0;
        int countsame = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("c") && i < s.length - 1 && (s[i + 1].equals("=") || s[i + 1].equals("-"))) {
                count++;
                i++;
            } else if (s[i].equals("d") && i < s.length - 2 && s[i + 1].equals("z") && s[i + 2].equals("=")) {
                count++;
                countsame++;
                i += 2;
            } else if (s[i].equals("d") && i < s.length - 1 && s[i + 1].equals("-")) {
                count++;
                i++;
            } else if (s[i].equals("l") && i < s.length - 1 && s[i + 1].equals("j")) {
                count++;
                i++;
            } else if (s[i].equals("n") && i < s.length - 1 && s[i + 1].equals("j")) {
                count++;
                i++;
            } else if (s[i].equals("s") && i < s.length - 1 && s[i + 1].equals("=")) {
                count++;
                i++;
            } else if (s[i].equals("z") && i < s.length - 1 && s[i + 1].equals("=")) {
                count++;
                i++;
            }
        }
        System.out.println(s.length - (count + countsame));
    }
}