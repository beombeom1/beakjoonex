package MathNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String[] ss = br.readLine().split(" ");
        int r = 0;
        for(int i = 0; i < n; i++){
            int nn = Integer.parseInt(ss[i]);
            if(nn == 1){
                r++;
            }
            for(int j = 2; j < nn; j++){
                if(nn % j == 0){
                    r++;
                    break;
                }
            }
        }
        System.out.println(ss.length - r);
    }
}
