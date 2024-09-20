package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        while (i < 100){
            String r = br.readLine();
            if(r == null){
                break;
            }
            System.out.println(r);
            i++;
        }

    }
}
