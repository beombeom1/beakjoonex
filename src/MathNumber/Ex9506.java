package MathNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            int a1 = Integer.parseInt(s);
            if(a1 == -1){
                break;
            }
            int a2 = 0;
            int j = 0;
            ArrayList<Integer> r = new ArrayList<>();
            for(int i = 1; i <= a1; i++){
                if(a1 % i ==0){
                    r.add(i);
                }
            }
            for (int i = 0; i < r.size(); i++){
                a2 += r.get(i);
            }
            if(a1 == a2 / 2){
                System.out.print(a1 + " = ");
                while (true){
                    System.out.print(r.get(j));
                    j++;
                    if(j>r.size()-2){
                        System.out.println();
                        break;
                    }
                    System.out.print(" + ");
                }
            }else {
                System.out.println(a1 + " is NOT perfect.");
            }
        }
    }
}
