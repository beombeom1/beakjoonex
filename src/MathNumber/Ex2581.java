package MathNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2581 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int r = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = s1; i <= s2; i++) {
            list.add(i);
            if(i == 1){
                list.remove(Integer.valueOf(1));
            }
        }
        for (int i = s1; i <= s2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    list.remove(Integer.valueOf(i));
                    break;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            r += list.get(i);
        }
        if(r==0){
            System.out.println(-1);
        }else {
            System.out.println(r);
            System.out.println(list.get(0));
        }
    }
}
