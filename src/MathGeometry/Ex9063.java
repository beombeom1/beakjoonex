package MathGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = Integer.parseInt(s);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < a; i++){
            String[] ss = br.readLine().split(" ");
            int b = Integer.parseInt(ss[0]);
            int c = Integer.parseInt(ss[1]);
            list.add(b);
            list2.add(c);
        }
        if (a == 1){
            System.out.println(0);
        }else {
            int max = list.get(0);
            int min = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if(max < list.get(i)){
                    max = list.get(i);
                }
                if(min > list.get(i)){
                    min = list.get(i);
                }
            }
            int max2 = list2.get(0);
            int min2 = list2.get(0);
            for(int i = 0; i < list2.size(); i++){
                if(max2 < list2.get(i)){
                    max2 = list2.get(i);
                }
                if(min2 > list2.get(i)){
                    min2 = list2.get(i);
                }
            }
            System.out.println((max - min) * (max2 - min2));
        }
    }
}
