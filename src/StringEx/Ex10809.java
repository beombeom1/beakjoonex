package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int[26];
        for(int j = 0; j<26; j++){
            a[j] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiValue = (int) ch;

            if (asciiValue >= 97 && asciiValue <= 122) {
                int index = asciiValue - 97;
                if (a[index] == -1) {
                    a[index] = i;
                }
            }
        }
        for(int k = 0; k < 26; k++){
            System.out.print(a[k] + " ");
        }
    }
}
