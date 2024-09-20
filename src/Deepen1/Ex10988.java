package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        boolean r = true;

        for (int i = 0; i < s.length / 2; i++) {
            if (!s[i].equals(s[s.length - i - 1])) { // 수정된 인덱스
                r = false;
                break;
            }
        }
        if (r == true){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
