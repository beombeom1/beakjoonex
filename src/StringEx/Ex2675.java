package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        for (int j = 0; j < i; j++) {
            String[] d = br.readLine().split("");
            int c = Integer.parseInt(d[0]);
            for(int l = 0; l < d.length-2; l++){
                for(int k = 0; k < c; k++){
                    System.out.print(d[l+2]);
                }
            }
            System.out.println();
        }
    }
}
