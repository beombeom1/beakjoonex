package MathNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int a2 = Integer.parseInt(s[1]);
        ArrayList<Integer> r = new ArrayList<>();
        for(int i = 1; i <= a1; i++){
            if(a1 % i ==0){
                r.add(i);
            }
        }
        if(a2 > r.size()){
            System.out.println(0);
        }else{
            System.out.println(r.get(a2-1));
        }
    }
}
