package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int m = Integer.parseInt(s);
        int i = 1;
        while (true){
            if(m == 1){
                System.out.println(1);
                break;
            }
            m = m - (6 * i);
            i++;
            if(m <= 1){
                System.out.println(i);
                break;
            }
        }
    }
}
